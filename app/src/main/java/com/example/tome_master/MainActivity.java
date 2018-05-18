package com.example.tome_master;

import android.content.Intent;
import android.database.Cursor;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tome_master.base.BaseActivity;
import com.example.tome_master.bean.music.Music;
import com.example.tome_master.greendao.MusicDaoManager;
import com.example.tome_master.ui.activity.ChangeSkinActivity;
import com.example.tome_master.ui.activity.MovieDisplayActivity;
import com.example.tome_master.ui.activity.MusicMainActivity;
import com.example.tome_master.ui.activity.OtherActivity;
import com.example.tome_master.ui.activity.PictureActivity;
import com.example.tome_master.utils.ConfigureUtil;
import com.example.tome_master.utils.StatusBarSetting;

import java.io.File;
import java.util.LinkedList;

import butterknife.BindView;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends BaseActivity implements NavigationView.OnNavigationItemSelectedListener {


    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.rv_content)
    TextView rvContent;
    @BindView(R.id.rg_root)
    CoordinatorLayout rgRoot;
    @BindView(R.id.navigation)
    NavigationView mNavigation;
    @BindView(R.id.drawer_layout)
    DrawerLayout mDrawerLayout;

    private MusicDaoManager musicDao;


    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        StatusBarSetting.setDrawerLayout(this, mDrawerLayout);
        setToolBar();
        setNavigationView();
        getDate();
    }


    /**
     * 初始化加载数据
     */
    private void getDate() {
        musicDao = new MusicDaoManager();
        Observable.create(new ObservableOnSubscribe<LinkedList<Music>>() {
            @Override
            public void subscribe(@NonNull ObservableEmitter<LinkedList<Music>> e) throws Exception {

                // 更新本地音乐数据
                musicDao.update();

                Cursor cursor = getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, null, null, null, null);
                if (cursor != null) {
                    cursor.moveToFirst();
                }
                while (!cursor.isAfterLast()) {
                    // 歌曲ID
                    int musicId = cursor.getInt(cursor.getColumnIndex(MediaStore.Audio.Media._ID));
                    // 歌曲的名称
                    String title = cursor.getString(cursor.getColumnIndex(MediaStore.Audio.Media.TITLE));
                    // 歌曲的专辑名
                    String album = cursor.getString(cursor.getColumnIndex(MediaStore.Audio.Media.ALBUM));
                    // 歌曲的歌手名
                    String singer = cursor.getString(cursor.getColumnIndex(MediaStore.Audio.Media.ARTIST));
                    // 歌曲文件的名称
                    String name = cursor.getString(cursor.getColumnIndex(MediaStore.Audio.Media.DISPLAY_NAME));
                    // 歌曲文件的发行日期
                    String year = cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.YEAR));
                    // 歌曲的总播放时长
                    long time = cursor.getLong(cursor.getColumnIndex(MediaStore.Audio.Media.DURATION));
                    // 歌曲文件的大小
                    long size = cursor.getLong(cursor.getColumnIndex(MediaStore.Audio.Media.SIZE));
                    // 歌曲文件的全路径
                    String url = cursor.getString(cursor.getColumnIndex(MediaStore.Audio.Media.DATA));

                    if (name.contains("-")) {
                        singer = name.substring(0, name.indexOf("-"));
                        name = name.substring(name.indexOf("-") + 1, name.length());
                    }
                    if (!url.endsWith(".ogg") && new File(url).exists()) {
                        Music m = new Music();
                        m.setSong_id(musicId + "");
                        m.setAlbum_title(album);
                        m.setTitle(name);
                        m.setDuration((int) time);
                        m.setSize(size);
                        m.setSong_path(url);
                        m.setAuthor(singer);
                        m.setType(1);
                        m.setPlay_list(0);
                        m.setIsPlay(0);
                        musicDao.insert(m);
                    }
                    cursor.moveToNext();
                }
                cursor.close();
            }

        }).subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<LinkedList<Music>>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull LinkedList<Music> musics) {
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    private void setToolBar() {
        setToolbarStatus(toolbar);
        toolbar.setTitle("首页");
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        //菜单按钮可用
        actionBar.setHomeButtonEnabled(true);
        //回退按钮可用
        actionBar.setDisplayHomeAsUpEnabled(true);

        //将drawlayout与toolbar绑定在一起
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar, R.string.app_name, R.string.app_name);
        //初始化状态
        toggle.syncState();
        //设置drawlayout的监听事件 打开/关闭
        mDrawerLayout.addDrawerListener(toggle);

        //actionbar中的内容进行初始化
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));


    }

    private ImageView mIv_photo;
    private TextView mMTv_login;

    private void setNavigationView() {
        //NavigationView初始化
        mNavigation.setItemIconTintList(null);
        View headerView = mNavigation.getHeaderView(0);
        mIv_photo = (ImageView) headerView.findViewById(R.id.iv_user_photo);
        mMTv_login = (TextView) headerView.findViewById(R.id.tv_login);
        mNavigation.setNavigationItemSelectedListener(this);
    }


    @Override
    public void onBackPressed() {
        if (mDrawerLayout.isDrawerOpen(mNavigation))
            mDrawerLayout.closeDrawers();
        else
            super.onBackPressed();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        switch (itemId) {
            case R.id.mn_home: {
                //不需要做
                break;
            }
            case R.id.mn_movie: {
                Intent intent = new Intent(context, MovieDisplayActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.mn_music: {
                ConfigureUtil.isSwitchHttp = true;
                ConfigureUtil.BASE_URL = ConfigureUtil.BASE_URL_MUSIC;
                Intent intent = new Intent(context, MusicMainActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.mn_switch_theme: {
                Intent intent = new Intent(context, ChangeSkinActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.mn_picture: {
                ConfigureUtil.isSwitchHttp = true;
                ConfigureUtil.BASE_URL = ConfigureUtil.BASE_URL_PICTURE;
                Intent intent = new Intent(context, PictureActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.mn_guess: {
                Intent intent = new Intent(context, OtherActivity.class);
                startActivity(intent);
                break;
            }
        }
        return false;
    }
}
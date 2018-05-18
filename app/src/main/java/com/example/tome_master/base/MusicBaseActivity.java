package com.example.tome_master.base;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.support.annotation.LayoutRes;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tome_master.R;
import com.example.tome_master.bean.music.Music;
import com.example.tome_master.bean.music.MusicDetails;
import com.example.tome_master.common.Flag;
import com.example.tome_master.greendao.MusicDaoManager;
import com.example.tome_master.network.BaseObserver;
import com.example.tome_master.network.RetrofitFactory;
import com.example.tome_master.service.MusicPlayService;
import com.example.tome_master.utils.CommonUtil;
import com.example.tome_master.utils.ConfigureUtil;
import com.example.tome_master.utils.GlideUtils;
import com.example.tome_master.utils.Util;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * 时间 ：2017/11/22  17:44
 * 作者 ：陈奇
 * 作用 ：
 */
public class MusicBaseActivity extends BaseActivity implements View.OnClickListener, SeekBar.OnSeekBarChangeListener {
    @BindView(R.id.main_songer_photo)
    ImageView imageToLyric;
    @BindView(R.id.main_seekbar)
    SeekBar seekBar;
    @BindView(R.id.main_text_song_name)
    TextView text_song;
    @BindView(R.id.main_text_songer_name)
    TextView text_songer;
    @BindView(R.id.main_btn_stop)
    Button bt_play;
    @BindView(R.id.main_btn_next)
    Button bt_next;
    @BindView(R.id.main_btn_meum)
    Button bt_meum;
    private RelativeLayout parentRelativeLayout;//把父类activity和子类activity的view都add到这里


    public ServiceConnection connection;
    private MusicPlayService.MyBinder myBinder;//自定义的binder，用来与service交互
    private Intent intentService;//打开service的intent
    public MyBroadcast myBroadcast;
    public MusicDaoManager daoManager;


    @Override
    public int getLayoutId() {
        return 0;
    }

    @Override
    public void initPresenter() {
    }

    @Override
    public void initView() {
        daoManager = new MusicDaoManager();
    }

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        initContentView(R.layout.bottom_base);
        View view = LayoutInflater.from(this).inflate(layoutResID, null);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT);
        params.addRule(RelativeLayout.ABOVE, R.id.base_bottom);
        parentRelativeLayout.addView(view, params);
    }

    private void initContentView(int layoutResID) {
        ViewGroup viewGroup = (ViewGroup) findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        parentRelativeLayout = new RelativeLayout(this);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        params.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);//这个就是添加其他属性的，这个是在父元素的底部。
        viewGroup.addView(parentRelativeLayout);
        View view = LayoutInflater.from(this).inflate(layoutResID, null);
        view.setLayoutParams(params);
        view.setId(R.id.base_bottom);
        parentRelativeLayout.addView(view, params);
    }

    @Override
    protected void onResume() {
        super.onResume();
        init();
        setBasePlayMusicInfo();
        bindView();
        seekBar.setOnSeekBarChangeListener(this);
    }

    private void init() {
        context = getApplicationContext();
        text_song = (TextView) findViewById(R.id.main_text_song_name);
        text_songer = (TextView) findViewById(R.id.main_text_songer_name);
        imageToLyric = (ImageView) findViewById(R.id.main_songer_photo);
        bt_play = (Button) findViewById(R.id.main_btn_stop);
        bt_next = (Button) findViewById(R.id.main_btn_next);
        bt_meum = (Button) findViewById(R.id.main_btn_meum);
        seekBar = (SeekBar) findViewById(R.id.main_seekbar);
        imageToLyric.setOnClickListener(this);
        bt_play.setOnClickListener(this);
        bt_next.setOnClickListener(this);
        bt_meum.setOnClickListener(this);
    }

    /**
     * 开启播放器的服务并且动态注册广播
     */
    private void bindView() {
        connection = new ServiceConnection() {
            @Override
            public void onServiceConnected(ComponentName name, IBinder service) {
                myBinder = (MusicPlayService.MyBinder) service;
                myBinder.setOnServiceCon(new MusicPlayService.OnServiceListener() {
                    @Override
                    public void onNext() {
                        bMusicNext();
                    }

                    @Override
                    public void startOrPause(boolean isPlay) {
                        Music m = daoManager.queryPlayIngMusic();
                        if (m == null)
                            m = daoManager.queryPlayMusic();
                        if (isPlay) {
                            m.setCurrentPosition(0);
                            bt_play.setBackgroundResource(R.drawable.music_stop);
                        } else {
                            m.setCurrentPosition(myBinder.getPlayProgress());
                            bt_play.setBackgroundResource(R.drawable.music_play);
                        }
                        daoManager.update(m);
                    }
                });
            }

            @Override
            public void onServiceDisconnected(ComponentName name) {
            }
        };
        intentService = new Intent(context, MusicPlayService.class);
        intentService.setAction("com.example.tome_master.service");
        intentService.setPackage("com.example.tome_master.service");
        bindService(intentService, connection, BIND_AUTO_CREATE);//打开播放服务并绑定

        myBroadcast = new MyBroadcast();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(Flag.BROADCAST_ACTION_DISC);
        registerReceiver(myBroadcast, intentFilter, Flag.BROADCAST_PERMISSION_DISC, null);//开启广播

    }

    public class MyBroadcast extends BroadcastReceiver {//自定义广播更新进度条

        @Override
        public void onReceive(Context context, Intent intent) {
            int progress = intent.getIntExtra("progress", 0);
            seekBar.setProgress(progress);
        }
    }

    @Override
    public void onClick(View v) {
        if (daoManager.isEnlded()) {
            if (v.getId() == R.id.main_btn_stop) {//暂停和播放
                bMusicPlay();
            } else if (v.getId() == R.id.main_btn_next) {//下一首
                bMusicNext();
            } else if (v.getId() == R.id.main_btn_meum) {//打开播放菜单
                bMusicMenu();
            } else if (v.getId() == R.id.main_songer_photo) {//打开音乐播放详情页
                bMusicDetail();
            }
        }
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        if (b && myBinder != null) {
            // 改变播放器中的播放进度
            myBinder.updatePlayProgress(i);
            // 修改数据库中记录的播放进度（当暂停时或者第一次进来）
            if (!myBinder.isPlaying()) {
                Music music = daoManager.queryPlayIngMusic();
                if (music == null)
                    music = daoManager.queryPlayMusic();
                music.setCurrentPosition(i);
                daoManager.update(music);
            }
        }
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    protected void setBasePlayMusicInfo() {
        Music music = daoManager.queryPlayIngMusic();
        if (music == null)
            music = daoManager.queryPlayMusic();
        if (music != null) {
            text_song.setText(music.getTitle());
            text_songer.setText(music.getAuthor());
            if (myBinder != null && myBinder.isPlaying()) {
                music.setCurrentPosition(myBinder.getPlayProgress());
                daoManager.update(music);
            }
            GlideUtils.loadImageView(context, music.getPic_small(), imageToLyric);
            seekBar.setMax(music.getDuration());
            seekBar.setProgress(music.getCurrentPosition());
        }
    }


    /**
     * 暂停和播放
     */
    int id = 0;

    public void onNetPlayClick(int position) {
        daoManager.OnBeforePlayClickNet();
        Util.ALL_MUSIC_PLAY.clear();
        Util.ALL_MUSIC_PLAY.addAll(Util.ALL_LOCAL_MUSIC_LIST);
        for (int i = 0; i < Util.ALL_MUSIC_PLAY.size(); i++) {
            Util.ALL_MUSIC_PLAY.get(i).setPlay_list(1);
            Util.ALL_MUSIC_PLAY.get(i).setListId(i);
            if (i == position)
                Util.ALL_MUSIC_PLAY.get(i).setIsPlay(2);
            else
                Util.ALL_MUSIC_PLAY.get(i).setIsPlay(0);
            daoManager.insert(Util.ALL_MUSIC_PLAY.get(i));
        }
        daoManager.OnPlayClick(position);
        bMusicNext();
    }

    public void bMusicPlay() {
        if (daoManager.queryPlayMusic() != null)
            id = daoManager.queryPlayMusic().getListId();
        if (Util.ALL_MUSIC_PLAY.size() == 0) {
            Util.ALL_MUSIC_PLAY = daoManager.queryPlayList(1);
        }
        if (Util.ALL_MUSIC_PLAY.size() == 0) {
            ToastShow("没有播放列表");
            return;
        }
        Music music = daoManager.queryPlayMusic();
        id = music.getListId();
        if (music.getType() == 2 && CommonUtil.isEmpty(music.getSong_path())) {
            ConfigureUtil.isSwitchHttp = true;
            ConfigureUtil.BASE_URL = ConfigureUtil.BASE_URL_MUSIC_KUGOU;
            RetrofitFactory.getInstance().API().getMusicDetails("play/getdata", Util.ALL_MUSIC_PLAY.get(id).getSong_id())
                    .compose(this.<MusicDetails>setThread())
                    .subscribe(new BaseObserver<MusicDetails>() {
                        @Override
                        protected void onSuccess(MusicDetails musicDetails) throws Exception {
                            Util.ALL_MUSIC_PLAY.get(id).setPic_small(musicDetails.getData().getImg());
                            Util.ALL_MUSIC_PLAY.get(id).setPic_big(musicDetails.getData().getImg());
                            Util.ALL_MUSIC_PLAY.get(id).setSong_path(musicDetails.getData().getPlay_url());
                            Util.ALL_MUSIC_PLAY.get(id).setAuthor_id(musicDetails.getData().getAuthor_id());
                            daoManager.update(Util.ALL_MUSIC_PLAY.get(id));
                            if (myBinder.playBtn(id)) {
                                daoManager.playPlan();
                            }
                        }

                        @Override
                        protected void onFailure(Throwable e, boolean isNetWorkError) throws Exception {
                        }
                    });
        } else {
            if (myBinder.playBtn(id)) {
                daoManager.playPlan();
            }
        }
        setBasePlayMusicInfo();
    }

    /**
     * 下一首
     */
    public void bMusicNext() {

        Music music = daoManager.queryPlayMusic();
        id = music.getListId();
        if (music.getType() == 2 && CommonUtil.isEmpty(music.getSong_path())) {
            ConfigureUtil.isSwitchHttp = true;
            ConfigureUtil.BASE_URL = ConfigureUtil.BASE_URL_MUSIC_KUGOU;
            RetrofitFactory.getInstance().API().getMusicDetails("play/getdata", Util.ALL_MUSIC_PLAY.get(id).getSong_id())
                    .compose(this.<MusicDetails>setThread())
                    .subscribe(new BaseObserver<MusicDetails>() {
                        @Override
                        protected void onSuccess(MusicDetails musicDetails) throws Exception {
                            Util.ALL_MUSIC_PLAY.get(id).setPic_small(musicDetails.getData().getImg());
                            Util.ALL_MUSIC_PLAY.get(id).setPic_big(musicDetails.getData().getImg());
                            Util.ALL_MUSIC_PLAY.get(id).setSong_path(musicDetails.getData().getPlay_url());
                            Util.ALL_MUSIC_PLAY.get(id).setAuthor_id(musicDetails.getData().getAuthor_id());
                            daoManager.update(Util.ALL_MUSIC_PLAY.get(id));
                            myBinder.nextBtn(daoManager.queryPlayMusic().getListId());
                            daoManager.playPlan();
                            setBasePlayMusicInfo();
                        }

                        @Override
                        protected void onFailure(Throwable e, boolean isNetWorkError) throws Exception {
                        }
                    });
        } else {
            myBinder.nextBtn(daoManager.queryPlayMusic().getListId());
            daoManager.playPlan();
            setBasePlayMusicInfo();
        }
    }

    /**
     * /打开音乐播放菜单页
     */
    public void bMusicMenu() {
    }

    /**
     * /打开音乐播放详情页
     */
    public void bMusicDetail() {
    }
}

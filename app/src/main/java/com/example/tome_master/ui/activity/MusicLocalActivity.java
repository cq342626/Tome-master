package com.example.tome_master.ui.activity;

import android.database.Cursor;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.tome_master.MusicDao;
import com.example.tome_master.R;
import com.example.tome_master.base.MusicBaseActivity;
import com.example.tome_master.bean.music.Music;
import com.example.tome_master.greendao.EntityManager;
import com.example.tome_master.greendao.MusicDaoManager;
import com.example.tome_master.ui.adapter.MusicLocalAdapter;
import com.example.tome_master.ui.adapter.MusicRLDetailsAdapter;
import com.example.tome_master.utils.CommonUtil;
import com.example.tome_master.utils.Util;

import java.io.File;
import java.util.LinkedList;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * 时间 ：2017/11/23  10:18
 * 作者 ：陈奇
 * 作用 ：
 */
public class MusicLocalActivity extends MusicBaseActivity implements MusicLocalAdapter.OnClickRecyclerViewItemListener {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.local_main_recyclerview)
    RecyclerView recyclerview;


    private MusicLocalAdapter adapter;
    private MusicDaoManager musicDao;


    @Override
    public int getLayoutId() {
        return R.layout.activity_local_main;
    }

    @Override
    public void initView() {
        super.initView();
        toolbar.setTitle("返回");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);// 显示左边的箭头
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        musicDao = new MusicDaoManager();
        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerview.setLayoutManager(manager);
        adapter = new MusicLocalAdapter(Util.ALL_LOCAL_MUSIC_LIST, MusicLocalActivity.this);
        recyclerview.setAdapter(adapter);
        adapter.setListener(this);
        getData();
    }

    /**
     * 从多媒体数据库中获取音乐的信息
     */
    private void getData() {
        Util.ALL_LOCAL_MUSIC_LIST = musicDao.queryType(1);
        adapter.refresh(Util.ALL_LOCAL_MUSIC_LIST);

//        musicDao.getPlayingList();
//        Music music = musicDao.queryPlayIngMusic();
//        if (music == null) {
//            Util.ALL_MUSIC_PLAY.get(0).setIsPlay(2);
//            musicDao.update(Util.ALL_MUSIC_PLAY.get(0));
//        }
        setBasePlayMusicInfo();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Util.ALL_LOCAL_MUSIC_LIST.clear();
    }

    @Override
    public void onClick(int position) {
        if (musicDao.queryPlayIngMusic() != null && musicDao.queryPlayIngMusic().getListId() == position) {
            ToastShow("当前音乐正在播放");
        } else {
            musicDao.OnBeforePlayClickLocal();
            musicDao.OnPlayClick(position);
            Util.ALL_MUSIC_PLAY = musicDao.queryType(1);
            adapter.refresh(Util.ALL_MUSIC_PLAY);
            bMusicNext();
        }
    }
}
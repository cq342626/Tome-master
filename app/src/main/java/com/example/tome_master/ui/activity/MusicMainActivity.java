package com.example.tome_master.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.tome_master.R;
import com.example.tome_master.base.MusicBaseActivity;
import com.example.tome_master.service.MusicPlayService;
import com.example.tome_master.utils.Util;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 时间 ：2017/11/23  9:41
 * 作者 ：陈奇
 * 作用 ：
 */
public class MusicMainActivity extends MusicBaseActivity {


    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @Override
    public int getLayoutId() {
        return R.layout.activity_music_mina;
    }

    @Override
    public void initView() {
        super.initView();
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        setToolbarStatus(toolbar);
        daoManager.initPlayMusic();
        Util.ALL_MUSIC_PLAY = daoManager.queryPlayList(1);
    }

    @OnClick({R.id.local, R.id.netword})
    public void onClick(View view) {
        super.onClick(view);
        switch (view.getId()) {
            case R.id.local:
                startActivity(new Intent(MusicMainActivity.this, MusicLocalActivity.class));
                break;
            case R.id.netword:
                startActivity(new Intent(MusicMainActivity.this, MusicNetWorkActivity.class));
                break;
        }
    }

    @Override
    protected void onDestroy() {
        bMusicPlay();
        daoManager.onDestroy();
        unregisterReceiver(myBroadcast);
        unbindService(connection);
        Intent intentStop = new Intent(context, MusicPlayService.class);
        intentStop.setAction("com.example.tome_master.service");
        intentStop.setPackage("com.example.tome_master.service");
        stopService(intentStop);
        super.onDestroy();
    }
}

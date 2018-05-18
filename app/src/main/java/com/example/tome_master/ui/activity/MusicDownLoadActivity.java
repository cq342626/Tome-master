package com.example.tome_master.ui.activity;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.example.tome_master.R;
import com.example.tome_master.base.BaseActivity;
import com.example.tome_master.ui.adapter.MusicDownLoadAdapter;
import com.example.tome_master.utils.Util;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * 时间 ：2017/12/15  14:30
 * 作者 ：陈奇
 * 作用 ：
 */
public class MusicDownLoadActivity extends BaseActivity {


    @BindView(R.id.activity_music_download_close)
    TextView tv_close;
    @BindView(R.id.activity_music_download_title)
    TextView tv_title;
    @BindView(R.id.activity_music_download_choose_All)
    TextView tv_choose_All;
    @BindView(R.id.activity_music_download_bottom)
    TextView tv_down;
    private MusicDownLoadAdapter adapter;

    //    1：下载；2、多选
    private String type = "1";

    @Override
    public int getLayoutId() {
        return R.layout.activity_music_download;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        Intent intent = getIntent();
        if (intent.hasExtra("type")) {
            type = intent.getStringExtra("type");
        }
        if (type.equals("1")) {
            for (int i = 0; i < Util.ALL_LOCAL_MUSIC_LIST.size(); i++)
                Util.ALL_LOCAL_MUSIC_LIST.get(i).setChoose(true);
        }
    }


    @OnClick({R.id.activity_music_download_close, R.id.activity_music_download_choose_All, R.id.activity_music_download_bottom})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.activity_music_download_close:
                finish();
                break;
            case R.id.activity_music_download_choose_All:
                break;
            case R.id.activity_music_download_bottom:
                break;
        }
    }

}

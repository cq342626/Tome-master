package com.example.tome_master.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tome_master.R;
import com.example.tome_master.base.MusicBaseActivity;
import com.example.tome_master.bean.music.Music;
import com.example.tome_master.bean.music.MusicSheetDetails;
import com.example.tome_master.bean.music.MusicSheetList;
import com.example.tome_master.network.BaseObserver;
import com.example.tome_master.network.RetrofitFactory;
import com.example.tome_master.ui.adapter.MusicRLDetailsAdapter;
import com.example.tome_master.utils.CommonUtil;
import com.example.tome_master.utils.ConfigureUtil;
import com.example.tome_master.utils.GlideUtils;
import com.example.tome_master.utils.Util;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 时间 ：2017/12/7  17:32
 * 作者 ：陈奇
 * 作用 ：歌单详情页
 */
public class MusicSSDetailsActivity extends MusicBaseActivity implements MusicRLDetailsAdapter.OnClickRecyclerViewItemListener {

    @BindView(R.id.activity_music_ss_details_header_showImage)
    ImageView image_main;
    @BindView(R.id.activity_music_ss_details_header_title)
    TextView text_title;
    @BindView(R.id.activity_music_ss_details_header_user_image)
    ImageView image_user;
    @BindView(R.id.activity_music_ss_details_header_user_name)
    TextView text_user;
    @BindView(R.id.activity_music_ss_details_header_bn)
    TextView text_dl;
    @BindView(R.id.activity_music_ss_details_recyclerview)
    RecyclerView recyclerview;
    @BindView(R.id.activity_music_ss_details_header_count_collect)
    TextView text_CountCollect;
    @BindView(R.id.activity_music_ss_details_header_count_play)
    TextView text_CountPlay;
    @BindView(R.id.activity_music_ss_details_header_shape)
    TextView text_Shape;
    @BindView(R.id.activity_music_ss_details_toolbar)
    Toolbar toolbar;
    @BindView(R.id.activity_music_ss_details_play_size)
    TextView text_playSize;
    private int specialid;
    private Intent intent;
    private MusicRLDetailsAdapter adapter;

    @Override
    public int getLayoutId() {
        return R.layout.activity_music_ss_details;
    }

    @Override
    public void initView() {
        super.initView();
        super.initView();
        intent = getIntent();
        if (intent.hasExtra("specialid"))
            specialid = intent.getIntExtra("specialid", 0);

        setSupportActionBar(toolbar);

        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerview.setLayoutManager(manager);
        Util.ALL_LOCAL_MUSIC_LIST.clear();
        adapter = new MusicRLDetailsAdapter(Util.ALL_LOCAL_MUSIC_LIST, this);
        recyclerview.setAdapter(adapter);
        adapter.setListener(this);
        getDate();
    }

    private void getDate() {
        ConfigureUtil.isSwitchHttp = true;
        ConfigureUtil.BASE_URL = ConfigureUtil.BASE_URL_MUSIC_MKUGOU;
        RetrofitFactory.getInstance().API().getMusicSheetDetails(specialid)
                .compose(this.<MusicSheetDetails>setThread())
                .subscribe(new BaseObserver<MusicSheetDetails>() {
                    @Override
                    protected void onSuccess(MusicSheetDetails musicSheetList) throws Exception {
                        Log.e("----------", "----------onSuccess");
                        text_title.setText(musicSheetList.getInfo().getList().getSpecialname());
                        GlideUtils.loadImageView(context, musicSheetList.getInfo().getList().getImgurl(), image_main);
                        text_user.setText(musicSheetList.getInfo().getList().getNickname());
                        text_dl.setText(musicSheetList.getInfo().getList().getIntro());
                        text_CountPlay.setText(CommonUtil.getEndNumber(musicSheetList.getInfo().getList().getPlaycount()));
                        text_CountCollect.setText(CommonUtil.getEndNumber(musicSheetList.getInfo().getList().getCollectcount()));
                    }

                    @Override
                    protected void onFailure(Throwable e, boolean isNetWorkError) throws Exception {
                        Log.e("----------", "----------onFailure");
                    }
                });
        ConfigureUtil.BASE_URL = ConfigureUtil.BASE_URL_MUSIC;
        RetrofitFactory.getInstance().API().getMusicSheetDetails(specialid, 0, 1, -1, 8352, 1)
                .compose(this.<MusicSheetList>setThread())
                .subscribe(new BaseObserver<MusicSheetList>() {
                    @Override
                    protected void onSuccess(MusicSheetList musicSheetList) throws Exception {
                        List<MusicSheetList.DataBean.InfoBean> info = musicSheetList.getData().getInfo();
                        Music music;
                        for (int i = 0; i < info.size(); i++) {
                            music = new Music();
                            music.setCurrentPosition(0);
                            music.setDuration(info.get(i).getDuration() * 1000);
                            music.setAlbum_id(info.get(i).getAlbum_id());
                            music.setAlbum_title(info.get(i).getRemark());
                            music.setTitle(CommonUtil.getSongName(info.get(i).getFilename()));
                            music.setAuthor(CommonUtil.getSongerName(info.get(i).getFilename()));
                            music.setSize(info.get(i).getFilesize());
                            music.setSong_id(info.get(i).getHash());

                            music.setType(2);
                            music.setIsPlay(0);
                            music.setPlay_list(0);
                            music.setListId(i);
                            Util.ALL_LOCAL_MUSIC_LIST.add(music);
                        }
                        adapter.refresh(Util.ALL_LOCAL_MUSIC_LIST);
                        text_playSize.setText("共" + Util.ALL_LOCAL_MUSIC_LIST.size() + "首");
                    }

                    @Override
                    protected void onFailure(Throwable e, boolean isNetWorkError) throws Exception {
                        Log.e("----------", "----------onFailure");
                    }
                });
    }

    @Override
    public void onClickItem(int position) {
        onNetPlayClick(position + 1);
    }

    @OnClick({R.id.activity_music_ss_details_play_choose, R.id.activity_music_ss_details_play_download})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.activity_music_ss_details_play_choose:
                break;
            case R.id.activity_music_ss_details_play_download:
                break;
        }
    }
}
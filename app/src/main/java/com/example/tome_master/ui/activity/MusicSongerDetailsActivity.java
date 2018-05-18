package com.example.tome_master.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.library.xrecyclerview.XRecyclerView;
import com.example.tome_master.R;
import com.example.tome_master.base.MusicBaseActivity;
import com.example.tome_master.bean.music.Music;
import com.example.tome_master.bean.music.MusicSongerList;
import com.example.tome_master.network.BaseObserver;
import com.example.tome_master.network.RetrofitFactory;
import com.example.tome_master.ui.adapter.MusicSDetailsAdapter;
import com.example.tome_master.utils.ConfigureUtil;
import com.example.tome_master.utils.GlideUtils;
import com.example.tome_master.utils.Util;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 时间 ：2017/12/13  11:22
 * 作者 ：陈奇
 * 作用 ：歌手详情页
 */
public class MusicSongerDetailsActivity extends MusicBaseActivity implements MusicSDetailsAdapter.OnClickRecyclerViewItemListener {
    private static final String TAG = "MusicSongerDetailsActivity";
    @BindView(R.id.activity_msd_image)
    ImageView image;
    @BindView(R.id.activity_msd_fs)
    TextView fs;
    @BindView(R.id.activity_msd_name)
    TextView name;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.activity_msd_xrecyclerview)
    XRecyclerView xRecyclerview;
    @BindView(R.id.activity_msd_CollapsingToolbarLayout)
    CollapsingToolbarLayout collapsingToolbarLayout;
    @BindView(R.id.activity_msd_AppBarLayout)
    AppBarLayout appBarLayout;
    @BindView(R.id.activity_msd_ConstraintLayout)
    ConstraintLayout constraintLayout;


    private int sortType = 2;
    private int page = 1;
    private int pageSize = 20;

    private Intent intent;

    private MusicSDetailsAdapter adapter;

    private int songerId;
    private String imageUrl;
    private String songerName;
    @Override
    public int getLayoutId() {
        return R.layout.activity_music_songer_details;
    }

    @Override
    public void initView() {
        super.initView();
        intent = getIntent();
        if (intent.hasExtra("songerId"))
            songerId = intent.getIntExtra("songerId", -1);
        if (intent.hasExtra("imageUrl"))
            imageUrl = intent.getStringExtra("imageUrl");
        if (intent.hasExtra("songerName"))
            songerName = intent.getStringExtra("songerName");
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        GlideUtils.loadImageView(this, imageUrl, image);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        Util.ALL_LOCAL_MUSIC_LIST.clear();
        xRecyclerview.setLayoutManager(layoutManager);
        adapter = new MusicSDetailsAdapter(Util.ALL_LOCAL_MUSIC_LIST, this);
        xRecyclerview.setAdapter(adapter);
        adapter.setListener(this);
        xRecyclerview.setPullRefreshEnabled(false);
        xRecyclerview.setLoadingListener(new XRecyclerView.LoadingListener() {
            @Override
            public void onRefresh() {

            }

            @Override
            public void onLoadMore() {
                page++;
                getDate();
            }
        });
        setTitleToCollapsingToolbarLayout();
        getDate();
    }

    private void getDate() {
        ConfigureUtil.BASE_URL = ConfigureUtil.BASE_URL_MUSIC;
        RetrofitFactory.getInstance().API().getMusicSongerMusicList(0, 8352, 1, songerId, sortType, page, pageSize)
                .compose(this.<MusicSongerList>setThread())
                .subscribe(new BaseObserver<MusicSongerList>() {
                    @Override
                    protected void onSuccess(MusicSongerList musicSongerList) throws Exception {
                        List<MusicSongerList.DataBean.InfoBean> list = new ArrayList<>();
                        list.addAll(musicSongerList.getData().getInfo());
                        Music music;
                        for (int i = 0; i < list.size(); i++) {
                            music = new Music();
                            music.setCurrentPosition(0);
                            music.setDuration(list.get(i).getDuration() * 1000);
                            music.setAlbum_id(list.get(i).getAlbum_id());
                            music.setAlbum_title(list.get(i).getRemark());
                            music.setTitle(list.get(i).getRemark());
                            music.setAuthor(list.get(i).getFilename());
                            music.setSize(list.get(i).getFilesize());
                            music.setSong_id(list.get(i).getHash());

                            music.setType(2);
                            music.setIsPlay(0);
                            music.setPlay_list(0);
                            music.setListId(i);
                            Util.ALL_LOCAL_MUSIC_LIST.add(music);
                        }
                        adapter.refresh(Util.ALL_LOCAL_MUSIC_LIST);
                    }

                    @Override
                    protected void onFailure(Throwable e, boolean isNetWorkError) throws Exception {

                    }

                    @Override
                    protected void onRequestEnd() {
                        super.onRequestEnd();
                        if (xRecyclerview.isLoadinging)
                            xRecyclerview.loadMoreComplete();
                    }
                });
    }

    /**
     * 使用CollapsingToolbarLayout必须把title设置到CollapsingToolbarLayout上，
     * 设置到Toolbar上则不会显示
     */
    private void setTitleToCollapsingToolbarLayout() {
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if (verticalOffset <= -constraintLayout.getHeight() / 2) {
                    collapsingToolbarLayout.setTitle(songerName);
                    //使用下面两个CollapsingToolbarLayout的方法设置展开透明->折叠时你想要的颜色
                    collapsingToolbarLayout.setExpandedTitleColor(getResources().getColor(android.R.color.transparent));
                    collapsingToolbarLayout.setCollapsedTitleTextColor(getResources().getColor(R.color.colorAccent));
                } else {
                    collapsingToolbarLayout.setTitle("");
                }
            }
        });
    }

    @Override
    public void onClick(int position) {
        onNetPlayClick(position);
    }

}

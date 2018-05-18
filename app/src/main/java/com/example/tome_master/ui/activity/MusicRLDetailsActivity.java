package com.example.tome_master.ui.activity;

import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.example.library.xrecyclerview.XRecyclerView;
import com.example.tome_master.R;
import com.example.tome_master.base.MusicBaseActivity;
import com.example.tome_master.bean.music.Music;
import com.example.tome_master.bean.music.MusicRLDBean;
import com.example.tome_master.network.BaseObserver;
import com.example.tome_master.network.RetrofitFactory;
import com.example.tome_master.ui.adapter.MusicRLDetailsAdapter;
import com.example.tome_master.utils.CommonUtil;
import com.example.tome_master.utils.ConfigureUtil;
import com.example.tome_master.utils.GlideUtils;
import com.example.tome_master.utils.Util;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * 时间 ：2017/11/22  9:23
 * 作者 ：陈奇
 * 作用 ：酷狗排行榜详情页
 */
public class MusicRLDetailsActivity extends MusicBaseActivity implements MusicRLDetailsAdapter.OnClickRecyclerViewItemListener {
    private static final String TAG = "MusicRLDetailsActivity";
    @BindView(R.id.activity_mrld_image)
    ImageView image;
    @BindView(R.id.activity_mrld_toolbar)
    Toolbar toolbar;
    @BindView(R.id.activity_mrld_RecyclerView)
    XRecyclerView recyclerView;

    private Intent intent;
    private int rankId;
    private int rankType;
    private String banner7url;
    private String rankName;

    private int page = 1;
    private int pageSize = 20;

    private MusicRLDetailsAdapter adapter;

    @Override
    public int getLayoutId() {
        return R.layout.activity_music_rl_details;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        super.initView();
        intent = getIntent();
        if (intent.hasExtra("rankId"))
            rankId = intent.getIntExtra("rankId", 0);
        if (intent.hasExtra("rankType"))
            rankType = intent.getIntExtra("rankType", 0);
        if (intent.hasExtra("banner7url"))
            banner7url = intent.getStringExtra("banner7url");
        if (intent.hasExtra("rankName"))
            rankName = intent.getStringExtra("rankName");

        if (banner7url.contains("/{size}"))
            banner7url = banner7url.replace("/{size}", "");

        toolbar.setTitle(rankName);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        GlideUtils.loadImageView(this, banner7url, image);

        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        Util.ALL_LOCAL_MUSIC_LIST.clear();
        adapter = new MusicRLDetailsAdapter(Util.ALL_LOCAL_MUSIC_LIST, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setPullRefreshEnabled(false);
        recyclerView.setLoadingListener(new XRecyclerView.LoadingListener() {
            @Override
            public void onRefresh() {

            }

            @Override
            public void onLoadMore() {
                page++;
                getDate();
            }
        });
        adapter.setListener(this);
        getDate();
    }

    private void getDate() {
        ConfigureUtil.isSwitchHttp = true;
        ConfigureUtil.BASE_URL = ConfigureUtil.BASE_URL_MUSIC;
        RetrofitFactory.getInstance().API()
                .getMusicRLDBean(rankType, rankId, page, pageSize, 0, 8352, 1)
                .compose(this.<MusicRLDBean>setThread())
                .subscribe(new BaseObserver<MusicRLDBean>() {
                    @Override
                    protected void onSuccess(MusicRLDBean musicRLDBean) throws Exception {
                        Log.e(TAG, "==========" + musicRLDBean.getStatus());
                        List<MusicRLDBean.DataBean.InfoBean> list = new ArrayList<>();
                        list.addAll(musicRLDBean.getData().getInfo());
                        Music music;
                        for (int i = 0; i < list.size(); i++) {
                            music = new Music();
                            music.setCurrentPosition(0);
                            music.setDuration(list.get(i).getDuration() * 1000);
                            music.setAlbum_id(list.get(i).getAlbum_id());
                            music.setAlbum_title(list.get(i).getRemark());
                            music.setTitle(CommonUtil.getSongName(list.get(i).getFilename()));
                            music.setAuthor(CommonUtil.getSongerName(list.get(i).getFilename()));
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
                        Log.e(TAG, "==========" + e.getMessage());
                    }

                    @Override
                    protected void onRequestEnd() {
                        super.onRequestEnd();
                        if (recyclerView.isLoadinging)
                            recyclerView.loadMoreComplete();
                    }
                });
    }


//    @Override
//    public void onClick(int position) {
//
//    }

    @Override
    public void onClickItem(int position) {
        onNetPlayClick(position);
    }
}
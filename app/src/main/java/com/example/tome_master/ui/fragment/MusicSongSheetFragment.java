package com.example.tome_master.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.library.xrecyclerview.ProgressStyle;
import com.example.library.xrecyclerview.XRecyclerView;
import com.example.tome_master.R;
import com.example.tome_master.base.BaseFragment;
import com.example.tome_master.bean.music.MusicSheet;
import com.example.tome_master.network.BaseObserver;
import com.example.tome_master.network.RetrofitFactory;
import com.example.tome_master.ui.adapter.MusicSongSheetAdapter;
import com.example.tome_master.utils.ConfigureUtil;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 时间 ：2017/11/20  15:15
 * 作者 ：陈奇
 * 作用 ：歌单界面
 */
public class MusicSongSheetFragment extends BaseFragment {

    private static final String ARG_POSITION = "MusicSongSheetFragment";
    @BindView(R.id.music_rl_XRecyclerView)
    XRecyclerView xRecyclerView;

    private int page = 1;
    private int pageSize = 20;
    private int type = 0;// 0：正常；1、刷新；2、加载
    private List<MusicSheet.DataBean.InfoBean> list;
    private MusicSongSheetAdapter adapter;

    public static Fragment newInstance(String title) {
        MusicSongSheetFragment f = new MusicSongSheetFragment();
        Bundle b = new Bundle();
        b.putString(ARG_POSITION, title);
        f.setArguments(b);
        return f;
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.fragment_music_rl;
    }

    @Override
    protected void initView() {
        list = new ArrayList<>();
        adapter = new MusicSongSheetAdapter(list, getActivity());
        GridLayoutManager manager = new GridLayoutManager(getActivity(), 2);
        xRecyclerView.setRefreshProgressStyle(ProgressStyle.BallSpinFadeLoader);
        xRecyclerView.setLoadingMoreProgressStyle(ProgressStyle.BallRotate);
        xRecyclerView.setArrowImageView(R.mipmap.iconfont_downgrey);
        xRecyclerView.setPullRefreshEnabled(true);
        xRecyclerView.setLoadingMoreEnabled(true);
        xRecyclerView.setLayoutManager(manager);
        xRecyclerView.setAdapter(adapter);
        getDate();
        type = 0;
        xRecyclerView.setLoadingListener(new XRecyclerView.LoadingListener() {
            @Override
            public void onRefresh() {
                page = 1;
                type = 1;
                getDate();
            }

            @Override
            public void onLoadMore() {
                page++;
                type = 2;
                getDate();
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    private void getDate() {
        ConfigureUtil.isSwitchHttp = true;
        ConfigureUtil.BASE_URL = ConfigureUtil.BASE_URL_MUSIC;
        RetrofitFactory.getInstance().API().getMusicSheet(1, 3, 0, 1, 0, page, pageSize)
                .compose(this.<MusicSheet>setThread())
                .subscribe(new BaseObserver<MusicSheet>() {
                    @Override
                    protected void onSuccess(MusicSheet musicSheet) throws Exception {
                        if (musicSheet.getStatus() == 1) {
                            if (type == 0 || type == 1)
                                list = musicSheet.getData().getInfo();
                            else
                                list.addAll(musicSheet.getData().getInfo());
                            adapter.refresh(list);
                            Log.e(ARG_POSITION, "----onSuccess:" + list.size());
                        }
                    }

                    @Override
                    protected void onFailure(Throwable e, boolean isNetWorkError) throws Exception {
                        Log.e(ARG_POSITION, "----onFailure:" + e.getMessage());
                    }

                    @Override
                    protected void onRequestEnd() {
                        super.onRequestEnd();
                        if (type == 1)
                            xRecyclerView.refreshComplete();
                        else if (type == 2)
                            xRecyclerView.loadMoreComplete();
                    }
                });

    }

}

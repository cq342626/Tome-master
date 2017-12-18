package com.example.tome_master.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.example.library.xrecyclerview.ProgressStyle;
import com.example.library.xrecyclerview.XRecyclerView;
import com.example.tome_master.R;
import com.example.tome_master.base.BaseFragment;
import com.example.tome_master.bean.music.MusicBean;
import com.example.tome_master.network.ApiService;
import com.example.tome_master.network.BaseObserver;
import com.example.tome_master.network.RetrofitFactory;
import com.example.tome_master.ui.adapter.MusicRLFAdapter;
import com.example.tome_master.utils.CommonUtil;
import com.example.tome_master.utils.ConfigureUtil;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * 时间 ：2017/11/20  15:15
 * 作者 ：陈奇
 * 作用 ：排行榜界面
 */
public class MusicRankingListFragment extends BaseFragment {

    private static final String ARG_POSITION = "MUSIC";
    @BindView(R.id.music_rl_XRecyclerView)
    XRecyclerView xRecyclerView;

    List<MusicBean.DataBean.InfoBean> list;

    private MusicRLFAdapter adapter;

    public static Fragment newInstance(String title) {
        MusicRankingListFragment f = new MusicRankingListFragment();
        Bundle b = new Bundle();
        b.putString(ARG_POSITION, title);
        f.setArguments(b);
        return f;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.fragment_music_rl;
    }

    //    http://mobilecdn.kugou.com/api/v3/rank/list?
// apiver=4&withsong=1&showtype=2&plat=0&parentid=0&version=8352&with_res_tag=1
    @Override
    protected void initView() {

        list = new ArrayList<>();
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        xRecyclerView.setRefreshProgressStyle(ProgressStyle.BallSpinFadeLoader);
        xRecyclerView.setLoadingMoreProgressStyle(ProgressStyle.BallRotate);
        xRecyclerView.setArrowImageView(R.mipmap.iconfont_downgrey);
        xRecyclerView.setLayoutManager(layoutManager);
        adapter = new MusicRLFAdapter(list, getActivity());
        xRecyclerView.setAdapter(adapter);
        xRecyclerView.setLoadingMoreEnabled(false);
        xRecyclerView.setPullRefreshEnabled(false);
        getDate();
    }

    private void getDate() {
        ConfigureUtil.isSwitchHttp = true;
        ConfigureUtil.BASE_URL = ConfigureUtil.BASE_URL_MUSIC;
        RetrofitFactory.getInstance().API().getRankingList().
                compose(this.<MusicBean>setThread())
                .subscribe(new BaseObserver<MusicBean>() {
                    @Override
                    protected void onSuccess(MusicBean musicRLDataBeanBodyBean) throws Exception {
                        list = musicRLDataBeanBodyBean.getData().getInfo();
                        adapter.refresh(list);
                    }

                    @Override
                    protected void onFailure(Throwable e, boolean isNetWorkError) throws Exception {
                        Log.e("------------", e.getMessage());
                    }
                });


    }

}

package com.example.tome_master.ui.fragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tome_master.R;
import com.example.tome_master.base.BaseFragment;
import com.example.tome_master.bean.music.MusicSonger;
import com.example.tome_master.network.BaseObserver;
import com.example.tome_master.network.RetrofitFactory;
import com.example.tome_master.ui.adapter.MusicSongerListFAdapter;
import com.example.tome_master.utils.ConfigureUtil;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 时间 ：2017/12/12  16:15
 * 作者 ：陈奇
 * 作用 ：分类歌手列表页
 */
public class MusicSongerListFragment extends BaseFragment {
    private static final String ARG_POSITION = "MusicSongerListFragment";
    @BindView(R.id.fragment_music_songer_list_recyclerView)
    RecyclerView recyclerView;
    private MusicSongerListFAdapter adapter;
    private List<MusicSonger.SingersBean.ListBean.InfoBean> list;
    private int classId;

    public static MusicSongerListFragment newInstance(int classId) {
        MusicSongerListFragment f = new MusicSongerListFragment();
        Bundle b = new Bundle();
        b.putInt(ARG_POSITION, classId);
        f.setArguments(b);
        return f;
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.fragment_music_songer_list;
    }

    @Override
    protected void initView() {
        Bundle bundle = getArguments();
        if (bundle.getInt(ARG_POSITION) != 0)
            classId = bundle.getInt(ARG_POSITION);
        list = new ArrayList<>();
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new MusicSongerListFAdapter(list, getContext());
        recyclerView.setAdapter(adapter);
        getDate();
    }

    public void getDate() {
        ConfigureUtil.isSwitchHttp = true;
        ConfigureUtil.BASE_URL = ConfigureUtil.BASE_URL_MUSIC_MKUGOU;
        RetrofitFactory.getInstance().API().getMusicSongerList(classId)
                .compose(this.<MusicSonger>setThread())
                .subscribe(new BaseObserver<MusicSonger>() {
                    @Override
                    protected void onSuccess(MusicSonger musicSonger) throws Exception {
                        list = musicSonger.getSingers().getList().getInfo();
                        adapter.setRefresh(list);
                    }

                    @Override
                    protected void onFailure(Throwable e, boolean isNetWorkError) throws Exception {
                        Log.e("------onFailure", "-----------");
                    }
                });
    }
}

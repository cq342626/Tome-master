package com.example.tome_master.ui.fragment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import com.example.tome_master.R;
import com.example.tome_master.base.BaseFragment;
import com.example.tome_master.bean.music.MusicSongerType;
import com.example.tome_master.network.BaseObserver;
import com.example.tome_master.network.RetrofitFactory;
import com.example.tome_master.ui.adapter.MusicSFPagerAdapter;
import com.example.tome_master.utils.ConfigureUtil;

import butterknife.BindView;

/**
 * 时间 ：2017/11/20  15:15
 * 作者 ：陈奇
 * 作用 ：歌手界面
 */
public class MusicSongerFragment extends BaseFragment {

    private static final String ARG_POSITION = "MUSIC";
    @BindView(R.id.fragment_music_songer_TabLayout)
    TabLayout tabLayout;
    @BindView(R.id.fragment_music_songer_ViewPager)
    ViewPager viewPager;
    private MusicSFPagerAdapter adapter;

    public static Fragment newInstance(String title) {
        MusicSongerFragment f = new MusicSongerFragment();
        Bundle b = new Bundle();
        b.putString(ARG_POSITION, title);
        f.setArguments(b);
        return f;
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.fragment_music_songer;
    }

    @Override
    protected void initView() {
        getDate();
    }

    public void getDate() {
        ConfigureUtil.BASE_URL = ConfigureUtil.BASE_URL_MUSIC_MKUGOU;
        RetrofitFactory.getInstance().API().getMusicSongerType()
                .compose(this.<MusicSongerType>setThread())
                .subscribe(new BaseObserver<MusicSongerType>() {
                    @Override
                    protected void onSuccess(MusicSongerType musicSongerType) throws Exception {
                        adapter = new MusicSFPagerAdapter(musicSongerType.getList(), getFragmentManager());
                        viewPager.setAdapter(adapter);
                        tabLayout.setupWithViewPager(viewPager);
                    }

                    @Override
                    protected void onFailure(Throwable e, boolean isNetWorkError) throws Exception {

                    }
                });
    }

}

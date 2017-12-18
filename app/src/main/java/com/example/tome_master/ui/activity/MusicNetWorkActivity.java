package com.example.tome_master.ui.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.tome_master.R;
import com.example.tome_master.base.BaseActivity;
import com.example.tome_master.base.MusicBaseActivity;
import com.example.tome_master.ui.adapter.MusicPagerAdapter;
import com.example.tome_master.utils.ConfigureUtil;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 时间 ：2017/11/9  10:31
 * 作者 ：陈奇
 * 作用 ：
 */
public class MusicNetWorkActivity extends MusicBaseActivity {


    @BindView(R.id.music_toolbar)
    Toolbar toolbar;
    @BindView(R.id.music_toolbar_tab)
    TabLayout tabLayout;
    @BindView(R.id.music_main_vp_container)
    ViewPager viewPager;

    @Override
    public int getLayoutId() {
        return R.layout.activity_music;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        super.initView();
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        dynamicAddSkinEnableView(toolbar, "background", R.color.colorPrimary);
        MusicPagerAdapter adapter = new MusicPagerAdapter(getSupportFragmentManager(), this);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ConfigureUtil.isSwitchHttp = false;
    }
}

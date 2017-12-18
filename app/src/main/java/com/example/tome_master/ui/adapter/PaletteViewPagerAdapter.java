package com.example.tome_master.ui.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.tome_master.ui.fragment.PaletteFragment;


public class PaletteViewPagerAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 5;
    private String tabTitles[];
    private Context context;

    public PaletteViewPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
        tabTitles = new String[]{"主页", "分享", "收藏", "关注", "微博"};
    }

    public PaletteViewPagerAdapter(FragmentManager fm, String[] tabTitles, Context context) {
        super(fm);
        this.tabTitles = tabTitles;
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        return PaletteFragment.newInstance(position);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
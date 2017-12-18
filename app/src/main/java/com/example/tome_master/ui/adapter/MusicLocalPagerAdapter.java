package com.example.tome_master.ui.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.tome_master.ui.fragment.MusicRankingListFragment;
import com.example.tome_master.ui.fragment.MusicSongSheetFragment;
import com.example.tome_master.ui.fragment.MusicSongerFragment;


public class MusicLocalPagerAdapter extends FragmentPagerAdapter {

    private Context context;
    private String[] date = new String[]{"单曲", "歌手", "专辑", "文件夹"};
    public MusicLocalPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return MusicRankingListFragment.newInstance(date[position]);
        } else if (position == 1) {
            return MusicSongSheetFragment.newInstance(date[position]);
        } else {
            return MusicSongerFragment.newInstance(date[position]);
        }

    }

    @Override
    public int getCount() {
            return date.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return date[position];
    }
}
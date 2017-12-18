package com.example.tome_master.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.tome_master.bean.music.MusicSongerType;
import com.example.tome_master.ui.fragment.MusicSongerListFragment;

import java.util.List;

/**
 * 时间 ：2017/12/12  16:11
 * 作者 ：陈奇
 * 作用 ：歌手tab+viewpager的适配器
 */
public class MusicSFPagerAdapter extends FragmentPagerAdapter {

    private List<MusicSongerType.ListBean> list;

    public MusicSFPagerAdapter(List<MusicSongerType.ListBean> list, FragmentManager fm) {
        super(fm);
        this.list = list;
    }

    @Override
    public Fragment getItem(int position) {
        return MusicSongerListFragment.newInstance(list.get(position).getClassid());
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return list.get(position).getClassname();
    }
}

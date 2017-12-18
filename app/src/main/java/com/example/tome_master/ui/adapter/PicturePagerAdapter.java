package com.example.tome_master.ui.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.tome_master.bean.picture.PictureType;
import com.example.tome_master.ui.fragment.PictureFragment;

import java.util.List;


public class PicturePagerAdapter extends FragmentPagerAdapter {

    private List<PictureType> list;
    private Context context;

    public PicturePagerAdapter(FragmentManager fm, List<PictureType> list, Context context) {
        super(fm);
        this.list = list;
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        return PictureFragment.newInstance(list.get(position).getId());
    }

    @Override
    public int getCount() {
        if (list != null && list.size() != 0)
            return list.size();
        else
            return 0;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return list.get(position).getTitle();
    }
}
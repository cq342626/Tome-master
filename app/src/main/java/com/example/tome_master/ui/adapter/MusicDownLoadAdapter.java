package com.example.tome_master.ui.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * 时间 ：2018/1/25  17:32
 * 作者 ：陈奇
 * 作用 ：
 */
public class MusicDownLoadAdapter extends RecyclerView.Adapter<MusicDownLoadAdapter.ViewHodler> {

    @Override
    public ViewHodler onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHodler holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ViewHodler extends RecyclerView.ViewHolder {
        public ViewHodler(View itemView) {
            super(itemView);
        }
    }

}

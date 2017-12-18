package com.example.tome_master.ui.adapter;

import android.content.Context;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tome_master.R;
import com.example.tome_master.bean.music.MusicBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 时间 ：2017/11/21  16:47
 * 作者 ：陈奇
 * 作用 ：
 */
public class MusicRLFAAdapter extends RecyclerView.Adapter<MusicRLFAAdapter.Holder> {


    private List<MusicBean.DataBean.InfoBean.SonginfoBean> list;
    private Context context;

    public MusicRLFAAdapter(List<MusicBean.DataBean.InfoBean.SonginfoBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_music_frla, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        if (position == 0) {
            holder.button.setBackgroundColor(ContextCompat.getColor(context, R.color.md_red_500));
        } else if (position == 1) {
            holder.button.setBackgroundColor(ContextCompat.getColor(context, R.color.md_red_400));
        } else if (position == 2) {
            holder.button.setBackgroundColor(ContextCompat.getColor(context, R.color.md_red_300));
        }
        holder.text.setText(list.get(position).getSongname());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class Holder extends RecyclerView.ViewHolder {

        @BindView(R.id.music_frlaa_FloatingActionButton)
        FloatingActionButton button;

        @BindView(R.id.music_frlaa_TextView)
        TextView text;

        public Holder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

}
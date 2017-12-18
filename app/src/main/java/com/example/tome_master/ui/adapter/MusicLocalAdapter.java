package com.example.tome_master.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tome_master.R;
import com.example.tome_master.bean.music.Music;
import com.example.tome_master.bean.music.MusicRLDBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 时间 ：2017/11/22  14:13
 * 作者 ：陈奇
 * 作用 ：
 */
public class MusicLocalAdapter extends RecyclerView.Adapter<MusicLocalAdapter.Holder> {


    private List<Music> list;
    private Context context;

    public MusicLocalAdapter(List<Music> list, Context context) {
        this.list = list;
        this.context = context;
    }

    public void refresh(List<Music> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_music_d, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        Log.e("==============", "position = " + position);
        String name = list.get(position).getTitle();
        name = name.substring(0, name.lastIndexOf("."));
        holder.textSongName.setText(name);
        holder.textSongerName.setText(list.get(position).getAuthor());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class Holder extends RecyclerView.ViewHolder {

        @BindView(R.id.adapter_music_details_add)
        ImageView imageAdd;
        @BindView(R.id.adapter_music_details_ranking)
        ImageView imageRanking;
        @BindView(R.id.adapter_music_details_more)
        ImageView imageMore;
        @BindView(R.id.adapter_music_details_songer_name)
        TextView textSongerName;
        @BindView(R.id.adapter_music_details_song_name)
        TextView textSongName;

        public Holder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (listener != null)
                        listener.onClick(getAdapterPosition());
                }
            });
        }
    }

    public interface OnClickRecyclerViewItemListener {
        void onClick(int position);
    }

    private OnClickRecyclerViewItemListener listener;

    public void setListener(OnClickRecyclerViewItemListener listener) {
        this.listener = listener;
    }
}

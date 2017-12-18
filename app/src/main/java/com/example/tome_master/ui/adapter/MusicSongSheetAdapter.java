package com.example.tome_master.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tome_master.R;
import com.example.tome_master.bean.music.MusicSheet;
import com.example.tome_master.ui.activity.MusicSSDetailsActivity;
import com.example.tome_master.utils.CommonUtil;
import com.example.tome_master.utils.GlideUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 时间 ：2017/11/30  11:11
 * 作者 ：陈奇
 * 作用 ：
 */
public class MusicSongSheetAdapter extends RecyclerView.Adapter<MusicSongSheetAdapter.ViewHolders> {

    private List<MusicSheet.DataBean.InfoBean> list;
    private Context context;

    public MusicSongSheetAdapter(List<MusicSheet.DataBean.InfoBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    public void refresh(List<MusicSheet.DataBean.InfoBean> list){
        this.list = list;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.adaper_music_songsheet2, parent, false);
        return new ViewHolders(view);
    }

    @Override
    public void onBindViewHolder(ViewHolders holder, int position) {
        GlideUtils.loadImageViewAgain(context, list.get(position).getImgurl(), holder.image_backgrounp);
        GlideUtils.loadImageViewCircle(context, list.get(position).getUser_avatar(), holder.image_user);
        holder.text_count.setText(CommonUtil.getEndNumber(list.get(position).getPlaycount()));
        holder.text_user.setText(list.get(position).getUsername());
        holder.text_explain.setText(list.get(position).getSpecialname());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolders extends RecyclerView.ViewHolder {
        @BindView(R.id.adapter_music_song_sheet_background)
        ImageView image_backgrounp;
        @BindView(R.id.adapter_music_song_sheet_playCount)
        TextView text_count;
        @BindView(R.id.adapter_music_song_sheet_user_image)
        ImageView image_user;
        @BindView(R.id.adapter_music_song_sheet_user_name)
        TextView text_user;
        @BindView(R.id.adapter_music_song_sheet_play)
        ImageView image_play;
        @BindView(R.id.adapter_music_song_sheet_explain)
        TextView text_explain;
        public ViewHolders(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, MusicSSDetailsActivity.class);
                    intent.putExtra("specialid", list.get(getAdapterPosition() - 1).getSpecialid());
                    context.startActivity(intent);
                }
            });
        }
    }
}
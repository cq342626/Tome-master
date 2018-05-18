package com.example.tome_master.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tome_master.R;
import com.example.tome_master.bean.music.MusicBean;
import com.example.tome_master.ui.activity.MusicRLDetailsActivity;
import com.example.tome_master.utils.GlideUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 时间 ：2017/11/20  16:49
 * 作者 ：陈奇
 * 作用 ：排行榜适配器
 */
public class MusicRLFAdapter extends RecyclerView.Adapter<MusicRLFAdapter.MyHolder> {


    private List<MusicBean.DataBean.InfoBean> list;
    private Context context;

    public MusicRLFAdapter(List<MusicBean.DataBean.InfoBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    public void refresh(List<MusicBean.DataBean.InfoBean> list){
        this.list = list;
        notifyDataSetChanged();
    }

    class MyHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.music_frl_image)
        ImageView imageView;
        @BindView(R.id.music_frl_TextView)
        TextView textView;
        @BindView(R.id.music_frl_RecyclerView)
        RecyclerView recyclerView;
        public MyHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition() - 1;
                    Intent intent = new Intent(context, MusicRLDetailsActivity.class);
                    intent.putExtra("rankId", list.get(position).getRankid());
                    intent.putExtra("rankType", list.get(position).getRanktype());
                    intent.putExtra("banner7url", list.get(position).getBanner7url());
                    intent.putExtra("rankName", list.get(position).getRankname());
                    context.startActivity(intent);
                }
            });
        }
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_music_frl, parent, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        holder.textView.setText(list.get(position).getRankname());
        String imageUrl = list.get(position).getImgurl();
        if (imageUrl.contains("/{size}"))
            imageUrl = imageUrl.replace("/{size}", "");
        GlideUtils.loadImageView(context, imageUrl, holder.imageView);
        LinearLayoutManager manager = new LinearLayoutManager(context);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        MusicRLFAAdapter adapter = new MusicRLFAAdapter(list.get(position).getSonginfo(), context);
        holder.recyclerView.setLayoutManager(manager);
        holder.recyclerView.setAdapter(adapter);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


}

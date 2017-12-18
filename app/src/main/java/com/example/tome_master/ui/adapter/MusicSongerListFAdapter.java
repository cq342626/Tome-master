package com.example.tome_master.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tome_master.R;
import com.example.tome_master.bean.music.MusicSonger;
import com.example.tome_master.ui.activity.MusicSongerDetailsActivity;
import com.example.tome_master.utils.GlideUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 时间 ：2017/12/12  16:44
 * 作者 ：陈奇
 * 作用 ：
 */
public class MusicSongerListFAdapter extends RecyclerView.Adapter<MusicSongerListFAdapter.MyHolder> {

    private List<MusicSonger.SingersBean.ListBean.InfoBean> list;
    private Context context;

    public MusicSongerListFAdapter(List<MusicSonger.SingersBean.ListBean.InfoBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    public void setRefresh(List<MusicSonger.SingersBean.ListBean.InfoBean> list){
        this.list = list;
        notifyDataSetChanged();
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_music_songer_list_item, parent, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        holder.name.setText(list.get(position).getSingername());
        GlideUtils.loadImageViewCircle(context, list.get(position).getImgurl(), holder.image);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.adapter_music_songer_list_item_image)
        ImageView image;
        @BindView(R.id.adapter_music_songer_list_item_name)
        TextView name;
        public MyHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, MusicSongerDetailsActivity.class);
                    intent.putExtra("songerId", list.get(getAdapterPosition()).getSingerid());
                    intent.putExtra("songerName", list.get(getAdapterPosition()).getSingername());
                    intent.putExtra("imageUrl", list.get(getAdapterPosition()).getImgurl());
                    context.startActivity(intent);
                }
            });
        }
    }
}

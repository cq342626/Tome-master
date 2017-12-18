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
import com.example.tome_master.bean.picture.PictureList;
import com.example.tome_master.ui.activity.PictureListActivity;
import com.example.tome_master.ui.activity.PictureListShowActivity;
import com.example.tome_master.utils.GlideUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 时间 ：2017/11/16  10:46
 * 作者 ：陈奇
 * 作用 ：
 */
public class PictureListAdapter extends RecyclerView.Adapter<PictureListAdapter.MyHolder> {


    private List<String> list;
    private Context context;

    public PictureListAdapter(List<String> list, Context context) {
        this.list = list;
        this.context = context;
    }

    public void refresh(List<String> list){
        this.list = list;
        notifyDataSetChanged();
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_picture_list, parent, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        GlideUtils.loadImageViewAgain(context, list.get(position), holder.image);
    }

    @Override
    public int getItemCount() {
        if (list != null && list.size() != 0)
            return list.size();
        return 0;
    }

    class MyHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.adapter_pl_image)
        ImageView image;
        public MyHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, PictureListShowActivity.class);
                    intent.putStringArrayListExtra("list", (ArrayList<String>) list);
                    context.startActivity(intent);
                }
            });
        }
    }
}
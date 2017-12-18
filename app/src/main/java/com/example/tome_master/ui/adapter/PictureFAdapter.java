package com.example.tome_master.ui.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.tome_master.R;
import com.example.tome_master.bean.picture.PictureList;
import com.example.tome_master.ui.activity.PictureListActivity;
import com.example.tome_master.utils.GlideUtils;
import com.example.tome_master.utils.ScreenUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 时间 ：2017/11/16  10:46
 * 作者 ：陈奇
 * 作用 ：
 */
public class PictureFAdapter extends RecyclerView.Adapter<PictureFAdapter.MyHolder> {


    private List<PictureList> list;
    private Context context;

    public PictureFAdapter(List<PictureList> list, Context context) {
        this.list = list;
        this.context = context;
    }

    public void refresh(List<PictureList> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_picture_f, parent, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(final MyHolder holder, int position) {
//        GlideUtils.loadImageView(context, list.get(position).getImgurl(), holder.image);
//        Log.e("========33333", "holder.image  宽度：" + (ScreenUtils.getScreenWight((Activity) context) - 8 * 3) / 2);
        holder.text.setText(list.get(position).getTitle());
        GlideUtils.loadImageViewAgain(context, list.get(position).getImgurl(), holder.image);

    }

    @Override
    public int getItemCount() {
        if (list != null && list.size() != 0)
            return list.size();
        return 0;
    }

    class MyHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.adapter_pf_image)
        ImageView image;
        @BindView(R.id.adapter_pf_text)
        TextView text;

        public MyHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, PictureListActivity.class);
                    intent.putExtra("title", list.get(getAdapterPosition() - 1).getTitle());
                    intent.putExtra("id", list.get(getAdapterPosition() - 1).getId());
                    intent.putExtra("url", list.get(getAdapterPosition() - 1).getImgurl());
                    Log.e("-------", "getAdapterPosition = " + (getAdapterPosition() - 1));
                    context.startActivity(intent);
                }
            });
        }
    }
}
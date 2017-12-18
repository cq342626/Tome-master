package com.example.tome_master.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.alexvasilkov.android.commons.adapters.ItemsAdapter;
import com.alexvasilkov.android.commons.ui.Views;
import com.example.tome_master.R;
import com.example.tome_master.utils.GlideUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 时间 ：2017/11/17  15:19
 * 作者 ：陈奇
 * 作用 ：
 */
public class PictureListShowAdapter extends ItemsAdapter<String, PictureListShowAdapter.ViewHolder> {


    private Context context;

    public PictureListShowAdapter(Context context, List<String> list) {
        this.context = context;
        setItemsList(list);
    }

    @Override
    protected ViewHolder onCreateHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_picture_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    protected void onBindHolder(ViewHolder viewHolder, int position) {
        GlideUtils.loadImageView(context, getItem(position), viewHolder.image);
    }

    class ViewHolder extends ItemsAdapter.ViewHolder {
        @BindView(R.id.adapter_pl_image)
        ImageView image;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}

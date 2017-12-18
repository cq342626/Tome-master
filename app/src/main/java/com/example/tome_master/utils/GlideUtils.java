package com.example.tome_master.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;
import com.example.tome_master.R;

/**
 * 时间 ：2017/11/16  11:25
 * 作者 ：陈奇
 * 作用 ：
 */
public class GlideUtils {

    public static void loadImageView(Context mContext, String path, ImageView mImageView) {
        Glide.with(mContext).load(CommonUtil.getRealImagePath(path, 480)).into(mImageView);
    }

    public static void loadImageView(Context mContext, String path, int wight, int height, ImageView mImageView) {
        Glide.with(mContext).load(CommonUtil.getRealImagePath(path, 480)).override(wight, height).into(mImageView);
    }

    public static void loadImageViewAgain(final Context mContext, final String path, final ImageView mImageView) {
        Glide.with(mContext)
                .load(CommonUtil.getRealImagePath(path, 480))
                .asBitmap()
                .into(new SimpleTarget<Bitmap>() {
                    @Override
                    public void onResourceReady(Bitmap resource, GlideAnimation<? super Bitmap> glideAnimation) {
                        int mWight = (ScreenUtils.getScreenWight((Activity) mContext) - PxUtils.dp2px(mContext, 15)) / 2;
                        Log.e("----------" + mWight / resource.getWidth(), "-------" + mWight % resource.getWidth());
                        int mHeight = (int) (CommonUtil.getDivision(mWight,resource.getWidth()) * resource.getHeight());
                        resource.recycle();
                        loadImageView(mContext, path, mWight, mHeight, mImageView);
                    }
                });
    }

    public static void loadImageViewCircle(Context mContext, String path, ImageView mImageView){
        Glide.with(mContext).load(CommonUtil.getRealImagePath(path, 480)).transform(new GlideCircleTransform(mContext)).into(mImageView);
    }
}

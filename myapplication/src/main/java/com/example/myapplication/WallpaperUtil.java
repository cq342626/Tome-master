package com.example.myapplication;

import android.app.Activity;
import android.app.WallpaperManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

import com.example.myapplication.widgets.SnowingPaperService;

/**
 * 时间 ：2017/12/7  13:56
 * 作者 ：陈奇
 * 作用 ：
 */
public class WallpaperUtil { /**
 * 跳转到系统设置壁纸界面
 *
 * @param context
 * @param paramActivity
 */
public static void setLiveWallpaper(Context context, Activity paramActivity, int requestCode) {
    try {
        Intent localIntent = new Intent();
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1) {//ICE_CREAM_SANDWICH_MR1  15
            localIntent.setAction(WallpaperManager.ACTION_CHANGE_LIVE_WALLPAPER);//android.service.wallpaper.CHANGE_LIVE_WALLPAPER
            //android.service.wallpaper.extra.LIVE_WALLPAPER_COMPONENT
            localIntent.putExtra(WallpaperManager.EXTRA_LIVE_WALLPAPER_COMPONENT
                    , new ComponentName(context.getApplicationContext().getPackageName()
                            , SnowingPaperService.class.getCanonicalName()));
        } else {
            localIntent.setAction(WallpaperManager.ACTION_LIVE_WALLPAPER_CHOOSER);//android.service.wallpaper.LIVE_WALLPAPER_CHOOSER
        }
        paramActivity.startActivityForResult(localIntent, requestCode);
    } catch (Exception localException) {
        localException.printStackTrace();
    }
}
}

package com.example.tome_master.utils;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.WindowManager;

/**
 * 时间 ：2017/11/17  11:42
 * 作者 ：陈奇
 * 作用 ：
 */
public class ScreenUtils {

    public static int getScreenWight(Activity activity) {
        DisplayMetrics metrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(metrics);
        return metrics.widthPixels;
    }


}

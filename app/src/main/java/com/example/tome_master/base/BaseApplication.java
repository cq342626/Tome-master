package com.example.tome_master.base;

import android.content.Context;
import android.support.multidex.MultiDex;

import com.example.library.skinloader.base.SkinBaseApplication;
import com.facebook.stetho.Stetho;

/**
 * 时间 ：2017/11/9  11:27
 * 作者 ：陈奇
 * 作用 ：
 */
public class BaseApplication extends SkinBaseApplication {
    private static BaseApplication mInstance;
    private static Context mContext;
    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        mContext = getApplicationContext();
        Stetho.initializeWithDefaults(this);
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    public static BaseApplication getInstance() {
        return mInstance;
    }
    public static Context getContext() {
        return mContext;
    }
}

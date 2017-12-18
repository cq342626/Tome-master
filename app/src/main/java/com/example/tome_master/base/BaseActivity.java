package com.example.tome_master.base;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.library.skinloader.base.SkinBaseActivity;
import com.example.tome_master.R;
import com.example.tome_master.utils.StatusBarSetting;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * 时间 ：2017/11/8  15:35
 * 作者 ：陈奇
 * 作用 ：封装的activity
 */
public abstract class BaseActivity extends SkinBaseActivity {

    public Context context;
    private Unbinder mUnbinder;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        doBeforeSetcontentView();
        setContentView(getLayoutId());
        mUnbinder = ButterKnife.bind(this);
        context = this;
        this.initPresenter();
        this.initView();
    }

    /**
     * 设置toolbar的高度
     * @param mToolbar
     */
    public void setToolbarStatus(Toolbar mToolbar) {
        //设置toolbar高度和内边距
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            mToolbar.getLayoutParams().height = getAppBarHeight();
            mToolbar.setPadding(mToolbar.getPaddingLeft(),
                    getStatusBarHeight(),
                    mToolbar.getPaddingRight(),
                    mToolbar.getPaddingBottom());
        }
        dynamicAddSkinEnableView(mToolbar, "background", R.color.colorPrimary);
    }

    public void setToolbarBackgrounpTransparent(Toolbar mToolbar){
        mToolbar.setBackgroundColor(ContextCompat.getColor(context, R.color.transparent));
    }

    private int getAppBarHeight() {
        return dip2px(56) + getStatusBarHeight();
    }

    private int getStatusBarHeight() {
        int result = 0;
        int resourceId = getResources().getIdentifier("status_bar_height", "dimen", "android");

        if (resourceId > 0) {
            result = getResources().getDimensionPixelSize(resourceId);
        }
        return result;
    }

    private int dip2px(float dipValue) {
        final float scale = getResources().getDisplayMetrics().density;
        return (int) (dipValue * scale + 0.5f);
    }


    /**
     * 设置layout前配置
     */
    private void doBeforeSetcontentView() {
        // 把actvity放到application栈中管理
        AppManager.getAppManager().addActivity(this);
        // 无标题
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        // 设置竖屏
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    /*********************
     * 子类实现
     *****************************/
    //获取布局文件
    public abstract int getLayoutId();

    //简单页面无需mvp就不用管此方法即可,完美兼容各种实际场景的变通
    public abstract void initPresenter();

    //初始化view
    public abstract void initView();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mUnbinder.unbind();
        AppManager.getAppManager().finishActivity(this);
    }

    public <T> ObservableTransformer<T, T> setThread() {
        return new ObservableTransformer<T, T>() {
            @Override
            public ObservableSource<T> apply(Observable<T> upstream) {
                return upstream.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
            }
        };
    }

    public void ToastShow(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}

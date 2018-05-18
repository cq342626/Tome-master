package com.example.tome_master.base;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

import com.example.library.skinloader.base.SkinBaseActivity;
import com.example.tome_master.R;

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
    private View view;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        doBeforeSetcontentView();
        setContentView(getLayoutId());
        mUnbinder = ButterKnife.bind(this);
        view = getWindow().getDecorView();
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

    //询问获取手机状态权限的参数
    protected final int REQUEST_PHONE_CODE = 1000;
    //询问获取拨打电话权限的参数
    protected final int REQUEST_CALL_PHONE_CODE = 1001;
    //询问打开手机系统相机的参数
    protected final int REQUEST_PHOTO_CAMEAR_CODE = 1002;
    //询问打开手机系统相册的参数
    protected final int REQUEST_PHONE_ALBUM_CODE = 1003;
    //询问打开手机外部储存权限的参数
    protected final int REQUEST_PHONE_WRITE_CODE = 1004;

    /**
     * 打开权限询问
     *
     * @param permission
     */
    protected void requestPermission(String permission, int position) {
        if (lacksPermission(permission)) {
            //进入到这里代表没有权限.
            requestThisPermission(permission, position);
        }
    }

    //判断是否需要添加需要权限
    protected boolean lacksPermission(String permission) {
        if (Build.VERSION.SDK_INT >= 23) {
            return ContextCompat.checkSelfPermission(BaseActivity.this, permission) ==
                    PackageManager.PERMISSION_DENIED;
        } else {
            return false;
        }
    }

    /**
     * 询问是否打开权限
     */
    public void requestThisPermission(final String permission, final int position) {
        if (ActivityCompat.shouldShowRequestPermissionRationale(BaseActivity.this, permission)) {
            Snackbar.make(view, "没有此权限，请开启权限", Snackbar.LENGTH_INDEFINITE).
                    setAction("好的", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ActivityCompat.requestPermissions(BaseActivity.this, new String[]{permission}, position);
                        }
                    }).show();
        } else {
            ActivityCompat.requestPermissions(BaseActivity.this, new String[]{permission}, position);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            //用户同意授权
            requestPermissionsResultSuccess(requestCode);
        } else {
            requestPermissionsResultFail(requestCode);
        }
    }

    /**
     * 用户同意该权限后调用的方法
     */
    protected void requestPermissionsResultSuccess(int position) {}

    protected void requestPermissionsResultFail(int position) {}
}

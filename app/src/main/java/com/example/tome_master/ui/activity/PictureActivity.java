package com.example.tome_master.ui.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.example.tome_master.R;
import com.example.tome_master.base.BaseActivity;
import com.example.tome_master.bean.picture.BasePicEntity;
import com.example.tome_master.bean.picture.BodyBean;
import com.example.tome_master.bean.picture.PictureType;
import com.example.tome_master.network.BaseObserver;
import com.example.tome_master.network.RetrofitFactory;
import com.example.tome_master.ui.adapter.PicturePagerAdapter;
import com.example.tome_master.utils.CommonUtil;
import com.example.tome_master.utils.ConfigureUtil;

import butterknife.BindView;

/**
 * 时间 ：2017/11/15  16:46
 * 作者 ：陈奇
 * 作用 ：图片界面
 */
public class PictureActivity extends BaseActivity {
    @BindView(R.id.picture_toolbar)
    Toolbar toolbar;
    @BindView(R.id.picture_toolbar_tab)
    TabLayout toolbarTab;
    @BindView(R.id.picture_main_vp_container)
    ViewPager mainVpContainer;

    @Override
    public int getLayoutId() {
        return R.layout.activity_picture;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        dynamicAddSkinEnableView(toolbar, "background", R.color.colorPrimary);
        String time = System.currentTimeMillis() + "";
        String str = "showapi_appid" + ConfigureUtil.APP_ID +
                "showapi_test_draft" + "false" +
                "showapi_timestamp" + time +
                ConfigureUtil.APP_SECRET;
        String sign = CommonUtil.StringToMd5(str);
        RetrofitFactory.getInstance().API()
                .getPictureType(ConfigureUtil.APP_ID, false, time, sign)
                .compose(this.<BasePicEntity<BodyBean<PictureType>>>setThread())
                .subscribe(new BaseObserver<BasePicEntity<BodyBean<PictureType>>>() {
                    @Override
                    protected void onSuccess(BasePicEntity<BodyBean<PictureType>> pictureBean) throws Exception {
                        Log.e(",,", pictureBean.toString());
                        if (pictureBean.getShowapi_res_code() == 0 && pictureBean.getShowapi_res_body().getRet_code() == 0) {
                            PicturePagerAdapter adapter = new PicturePagerAdapter(getSupportFragmentManager(),
                                    pictureBean.getShowapi_res_body().getData(), getBaseContext());
                            mainVpContainer.setAdapter(adapter);
                            toolbarTab.setupWithViewPager(mainVpContainer);
                        }
                    }

                    @Override
                    protected void onFailure(Throwable e, boolean isNetWorkError) throws Exception {
                        Log.e(",,", e.toString());
                    }
                });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ConfigureUtil.isSwitchHttp = false;
    }
}

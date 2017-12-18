package com.example.tome_master.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.library.foldablelayout.UnfoldableView;
import com.example.tome_master.R;
import com.example.tome_master.base.BaseActivity;
import com.example.tome_master.bean.picture.BasePicEntity;
import com.example.tome_master.bean.picture.BodyBean;
import com.example.tome_master.network.BaseObserver;
import com.example.tome_master.network.RetrofitFactory;
import com.example.tome_master.ui.adapter.PictureFAdapter;
import com.example.tome_master.ui.adapter.PictureListAdapter;
import com.example.tome_master.utils.CommonUtil;
import com.example.tome_master.utils.ConfigureUtil;
import com.example.tome_master.utils.GlideUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 时间 ：2017/11/16  15:00
 * 作者 ：陈奇
 * 作用 ：
 */
public class PictureListActivity extends BaseActivity {


    @BindView(R.id.apl_image)
    ImageView aplImage;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.apl_RecyclerView)
    RecyclerView recyclerView;

    private List<String> list;
    private PictureListAdapter adapter;

    private Intent intent;

    private String title;
    private int id;
    private String url;

    @Override
    public int getLayoutId() {
        return R.layout.activity_picture_list;
    }

    @Override
    public void initPresenter() {

    }


    @Override
    public void initView() {
        intent = getIntent();
        if (intent.hasExtra("title"))
            title = intent.getStringExtra("title");
        if (intent.hasExtra("id"))
            id = intent.getIntExtra("id", 1);
        if (intent.hasExtra("url"))
            url = intent.getStringExtra("url");
        if (CommonUtil.isNotEmpty(title))
            toolbar.setTitle(title);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        setToolbarStatus(toolbar);
        setToolbarBackgrounpTransparent(toolbar);
        list = new ArrayList<>();
        GlideUtils.loadImageView(this, url, aplImage);
        adapter = new PictureListAdapter(list, PictureListActivity.this);
        StaggeredGridLayoutManager gridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);
        getDate();
    }

    /**
     * https://route.showapi.com/1208-3?
     * id=13826&
     * showapi_appid=49817&
     * showapi_test_draft=false&
     * showapi_timestamp=20171116145446&
     * showapi_sign=fc54a22db10d5e4a6c8c37abad7f8ee2
     */
    private void getDate() {
        String time = System.currentTimeMillis() + "";
        String str = "id" + id +
                "showapi_appid" + ConfigureUtil.APP_ID +
                "showapi_test_draft" + false +
                "showapi_timestamp" + time + ConfigureUtil.APP_SECRET;
        String sign = CommonUtil.StringToMd5(str);
        RetrofitFactory.getInstance().API().getPictureUrls(id, ConfigureUtil.APP_ID, false, time, sign)
                .compose(this.<BasePicEntity<BodyBean<String>>>setThread())
                .subscribe(new BaseObserver<BasePicEntity<BodyBean<String>>>() {
                    @Override
                    protected void onSuccess(BasePicEntity<BodyBean<String>> bodyBeanBasePicEntity) throws Exception {
                        adapter.refresh(bodyBeanBasePicEntity.getShowapi_res_body().getData());
                    }

                    @Override
                    protected void onFailure(Throwable e, boolean isNetWorkError) throws Exception {
                        Log.e("onFailure", "--------------" + e.getMessage());
                    }
                });

    }

}

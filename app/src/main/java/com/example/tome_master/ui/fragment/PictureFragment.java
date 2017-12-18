package com.example.tome_master.ui.fragment;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.library.xrecyclerview.ProgressStyle;
import com.example.library.xrecyclerview.XRecyclerView;
import com.example.tome_master.R;
import com.example.tome_master.base.BaseFragment;
import com.example.tome_master.bean.picture.BasePicEntity;
import com.example.tome_master.bean.picture.BodyBean;
import com.example.tome_master.bean.picture.PictureList;
import com.example.tome_master.network.BaseObserver;
import com.example.tome_master.network.RetrofitFactory;
import com.example.tome_master.ui.adapter.PictureFAdapter;
import com.example.tome_master.utils.CommonUtil;
import com.example.tome_master.utils.ConfigureUtil;
import com.example.tome_master.utils.SpacesItemDecoration;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 时间 ：2017/11/15  16:56
 * 作者 ：陈奇
 * 作用 ：
 */
public class PictureFragment extends BaseFragment {

    private static final String ARG_POSITION = "position";
    @BindView(R.id.fp_XRecyclerView)
    XRecyclerView xRecyclerView;

    private List<PictureList> list;
    private PictureFAdapter adapter;

    private int page = 1;
    private int rows = 20;
    private int type;

    public static PictureFragment newInstance(int position) {
        PictureFragment f = new PictureFragment();
        Bundle b = new Bundle();
        b.putInt(ARG_POSITION, position);
        f.setArguments(b);
        return f;
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.fragment_picture;
    }

    @Override
    protected void initView() {
        list = new ArrayList<>();
        type = getArguments().getInt(ARG_POSITION);


        xRecyclerView.setRefreshProgressStyle(ProgressStyle.BallSpinFadeLoader);
        xRecyclerView.setLoadingMoreProgressStyle(ProgressStyle.BallRotate);
        xRecyclerView.setArrowImageView(R.mipmap.iconfont_downgrey);
        SpacesItemDecoration itemDecoration = new SpacesItemDecoration(8);

        xRecyclerView.setLoadingListener(new XRecyclerView.LoadingListener() {
            @Override
            public void onRefresh() {
                page = 1;
                getDate();
            }

            @Override
            public void onLoadMore() {
                page++;
                getDate();
            }
        });

        adapter = new PictureFAdapter(list, getActivity());
        StaggeredGridLayoutManager gridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        gridLayoutManager.setGapStrategy(StaggeredGridLayoutManager.GAP_HANDLING_NONE);
        gridLayoutManager.setAutoMeasureEnabled(true);
        xRecyclerView.addItemDecoration(new SpacesItemDecoration(8));
        xRecyclerView.setLayoutManager(gridLayoutManager);
        xRecyclerView.setAdapter(adapter);

        getDate();
    }

    private void getDate(){
        String time = System.currentTimeMillis() + "";
        String str = "page" + page + "rows" + rows + "showapi_appid" + ConfigureUtil.APP_ID
                + "showapi_test_draft" + "false" + "showapi_timestamp" + time + "type" + type
                + ConfigureUtil.APP_SECRET;
        String sign = CommonUtil.StringToMd5(str);
        RetrofitFactory.getInstance().API()
                .getPictrueList(page, rows, ConfigureUtil.APP_ID, false, time, type, sign)
                .compose(this.<BasePicEntity<BodyBean<PictureList>>>setThread())
                .subscribe(new BaseObserver<BasePicEntity<BodyBean<PictureList>>>() {
                    @Override
                    protected void onSuccess(BasePicEntity<BodyBean<PictureList>> bodyBeanBasePicEntity) throws Exception {
                        if (xRecyclerView.isRefreshing)
                            list = bodyBeanBasePicEntity.getShowapi_res_body().getData();
                        else if (xRecyclerView.isLoadinging)
                            list.addAll(bodyBeanBasePicEntity.getShowapi_res_body().getData());
                        else
                            list = bodyBeanBasePicEntity.getShowapi_res_body().getData();
                        adapter.refresh(list);
                    }

                    @Override
                    protected void onFailure(Throwable e, boolean isNetWorkError) throws Exception {
                        Log.e("-------------", "Throwable = " + e.getMessage());
                    }

                    @Override
                    protected void onRequestStart() {
                        super.onRequestStart();
                    }

                    @Override
                    protected void onRequestEnd() {
                        super.onRequestEnd();
                        if (xRecyclerView.isRefreshing)
                            xRecyclerView.refreshComplete();
                        else if (xRecyclerView.isLoadinging)
                            xRecyclerView.loadMoreComplete();
                    }
                });

    }

}
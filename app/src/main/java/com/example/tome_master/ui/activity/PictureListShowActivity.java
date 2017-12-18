package com.example.tome_master.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.library.foldablelayout.FoldableListLayout;
import com.example.tome_master.R;
import com.example.tome_master.base.BaseActivity;
import com.example.tome_master.ui.adapter.PictureListShowAdapter;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 时间 ：2017/11/17  15:17
 * 作者 ：陈奇
 * 作用 ：
 */
public class PictureListShowActivity extends BaseActivity {
    @BindView(R.id.foldable_list)
    FoldableListLayout foldableList;

    private Intent intent;
    private List<String> list;

    @Override
    public int getLayoutId() {
        return R.layout.activity_picture_list_show;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        intent = getIntent();
        if (intent.hasExtra("list"))
            list = intent.getStringArrayListExtra("list");
        foldableList.setAdapter(new PictureListShowAdapter(this, list));
    }

}

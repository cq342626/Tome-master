package com.example.tome_master.ui.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.library.skinloader.listener.ILoaderListener;
import com.example.library.skinloader.load.SkinManager;
import com.example.tome_master.R;
import com.example.tome_master.base.BaseActivity;
import com.example.tome_master.utils.FileUtils;

import java.io.File;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 时间 ：2017/11/9  11:01
 * 作者 ：陈奇
 * 作用 ：主题换肤界面
 */
public class ChangeSkinActivity extends BaseActivity {
    private static String TAG = "ChangeSkinActivity";
    private static String SKIN_BROWN_NAME = "skin_brown.skin";
    private static String SKIN_BLACK_NAME = "skin_black.skin";
    private static String SKIN_DIR;
    @BindView(R.id.ll_green)
    LinearLayout llGreen;
    @BindView(R.id.ll_brown)
    LinearLayout llBrown;
    @BindView(R.id.ll_black)
    LinearLayout llBlack;

    @Override
    public int getLayoutId() {
        return R.layout.activity_chang_skin;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        SKIN_DIR = FileUtils.getSkinDirPath(context);
    }

    @OnClick({R.id.ll_green, R.id.ll_brown, R.id.ll_black})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ll_green:
                SkinManager.getInstance().restoreDefaultTheme();
                break;
            case R.id.ll_brown:
                String skinFullName = SKIN_DIR + File.separator + "skin_brown.skin";
                FileUtils.moveRawToDir(context, "skin_brown.skin", skinFullName);
                File skin = new File(skinFullName);
                if (!skin.exists()) {
                    Toast.makeText(context, "请检查" + skinFullName + "是否存在", Toast.LENGTH_SHORT).show();
                    return;
                }
                SkinManager.getInstance().load(skin.getAbsolutePath(),
                        new ILoaderListener() {
                            @Override
                            public void onStart() {
                                Log.e(TAG, "loadSkinStart");
                            }

                            @Override
                            public void onSuccess() {
                                Log.i(TAG, "loadSkinSuccess");
                                Toast.makeText(context, "切换成功", Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onFailed() {
                                Log.i(TAG, "loadSkinFail");
                                Toast.makeText(context, "切换失败", Toast.LENGTH_SHORT).show();
                            }
                        });
                break;
            case R.id.ll_black:
                String skinFullName1 = SKIN_DIR + File.separator + "skin_black.skin";
                FileUtils.moveRawToDir(context, "skin_black.skin", skinFullName1);
                File skin1 = new File(skinFullName1);
                if (!skin1.exists()) {
                    Toast.makeText(context, "请检查" + skinFullName1 + "是否存在", Toast.LENGTH_SHORT).show();
                    return;
                }
                SkinManager.getInstance().load(skin1.getAbsolutePath(),
                        new ILoaderListener() {
                            @Override
                            public void onStart() {
                                Log.e(TAG, "loadSkinStart");
                            }

                            @Override
                            public void onSuccess() {
                                Log.e(TAG, "loadSkinSuccess");
                                Toast.makeText(context, "切换成功", Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onFailed() {
                                Log.e(TAG, "loadSkinFail");
                                Toast.makeText(context, "切换失败", Toast.LENGTH_SHORT).show();
                            }
                        });
                break;
        }
    }
}

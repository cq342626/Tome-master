package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private final static int REQUEST_CODE_SET_WALLPAPER = 0x001;

    public void onPlaying(View view) {
        WallpaperUtil.setLiveWallpaper(this.getApplicationContext(), MainActivity.this, MainActivity.REQUEST_CODE_SET_WALLPAPER);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE_SET_WALLPAPER) {
            if (resultCode == RESULT_OK) {
                // TODO: 2017/3/13 设置动态壁纸成功
            } else {
                // TODO: 2017/3/13 取消设置动态壁纸
            }
        }
    }
}

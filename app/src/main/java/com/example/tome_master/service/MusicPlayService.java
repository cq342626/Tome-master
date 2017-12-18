package com.example.tome_master.service;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.util.Log;

import com.example.tome_master.bean.music.Music;
import com.example.tome_master.common.Flag;
import com.example.tome_master.utils.Util;

import java.io.IOException;

/**
 * 播放音乐的service
 */
public class MusicPlayService extends Service {

    private MediaPlayer player;// 定义一个播放控件
    private MyBinder myBinder = new MyBinder();// 定义一个binder，用于绑定服务
    private Intent intentProgress = new Intent();// 定义一个intent
    private Handler handler;// 用于接收消息然后发送广播
    private boolean isOnceToPlay = true;// 是否是第一次播放（主要用于点击播放按钮）


    @Override
    public void onCreate() {
        super.onCreate();
        player = new MediaPlayer();
        handler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                if (player != null && player.isPlaying()) {
                    intentProgress.putExtra("progress", player.getCurrentPosition());
                    intentProgress.setAction(Flag.BROADCAST_ACTION_DISC);
                    sendBroadcast(intentProgress, Flag.BROADCAST_PERMISSION_DISC);// 发送广播通知进度条更新
                    handler.sendEmptyMessageDelayed(1, 1000);// 循环handler消息
                }
            }
        };
    }

    @Override
    public void onDestroy() {
        Log.e("------MusicPlayService", "------onDestroy");
        if (player != null) {
            player.stop();
            player.release();
            player = null;
        }
        super.onDestroy();
    }

    public class MyBinder extends Binder implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener {
        private int play_id;

        public int getPlayProgress() {
            return player.getCurrentPosition();
        }

        /**
         * 播放
         */
        public void playMusic(int play_id) {// file
            isOnceToPlay = false;
            // 本地或者网络音乐地址；isLocal：true是本地音乐，false是网络音乐
            this.play_id = play_id;
            player.reset();// 重用处于Error错误状态的MediaPlayer对象，可以通过调用reset()方法，使其恢复到idle空闲状态。
            try {
                player.setDataSource(Util.ALL_MUSIC_PLAY.get(play_id).getSong_path());// 播放路径
                if (Util.ALL_MUSIC_PLAY.get(play_id).getType() == 1) {
                    player.prepare();// 准备好本地音乐就播放
                } else if (Util.ALL_MUSIC_PLAY.get(play_id).getType() == 2) {
                    player.prepareAsync();
                }
//                player.seekTo(Util.ALL_MUSIC_PLAY.get(play_id).getCurrentPosition());
                player.setOnPreparedListener(this);// 播放前调用
                player.setOnCompletionListener(this);// 播放完成后调用
                player.setOnErrorListener(this);// 播放发生错误时调用
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /**
         * 播放下一首
         */
        public void nextBtn(int play_id) {
            playMusic(play_id);
        }

        /**
         * 是否正在播放
         *
         * @return
         */
        public boolean isPlaying() {
            return player.isPlaying();
        }

        /**
         * 暂停和播放
         */
        public boolean playBtn(int play_id) {
            if (isOnceToPlay) {// 如果进入应用未播放，这时候第一次点击播放按钮时处理
                playMusic(play_id);
                return true;
            }
            if (player.isPlaying()) {
                player.pause();
            } else {
                player.start();
                handler.sendEmptyMessageDelayed(1, 1000);
            }
            onServiceCon.startOrPause(player.isPlaying());
            return false;
        }

        /**
         * 拖动进度条快进快退
         */
        public void updatePlayProgress(int progress) {
            try {
                if (isOnceToPlay) {
                    try {
                        player.reset();
                        player.setDataSource(Util.ALL_MUSIC_PLAY.get(play_id).getSong_path());
                    } catch (IllegalStateException | IOException e) {
                        e.printStackTrace();
                    }
                }
                player.seekTo(progress);
            } catch (IllegalStateException e) {
                e.printStackTrace();
            }
        }

        @Override
        public boolean onError(MediaPlayer mp, int what, int extra) {
            return false;
        }

        @Override
        public void onCompletion(MediaPlayer mp) {
            if (onServiceCon != null)
                onServiceCon.onNext();
        }

        @Override
        public void onPrepared(MediaPlayer mp) {
            player.seekTo(Util.ALL_MUSIC_PLAY.get(play_id).getCurrentPosition());
            player.start();
            Log.e("-----", "预加载音乐文件完成");
            Log.e("-----", "即将播放:文件名" + Util.ALL_MUSIC_PLAY.get(play_id).getTitle());
            Log.e("-----", "即将播放:进度" + Util.ALL_MUSIC_PLAY.get(play_id).getCurrentPosition());

            onServiceCon.startOrPause(true);
            handler.sendEmptyMessageDelayed(1, 1000);
        }

        private OnServiceListener onServiceCon;

        public void setOnServiceCon(OnServiceListener onServiceCon) {
            this.onServiceCon = onServiceCon;
        }


    }


    @Override
    public IBinder onBind(Intent intent) {
        if (myBinder == null)
            myBinder = new MyBinder();
        return myBinder;
    }

    public interface OnServiceListener {
        void onNext();

        void startOrPause(boolean isPlay);
    }
}
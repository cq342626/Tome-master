package com.example.tome_master.greendao;

import com.example.tome_master.MusicDao;
import com.example.tome_master.bean.music.Music;
import com.example.tome_master.utils.CommonUtil;
import com.example.tome_master.utils.Util;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 时间 ：2017/11/24  9:27
 * 作者 ：陈奇
 * 作用 ：
 */
public class MusicDaoManager {
    private MusicDao musicDao;

    public MusicDaoManager() {
        musicDao = EntityManager.getIntance().getMusicDao();
    }

    /**
     * 新增数据
     *
     * @param music
     */
    public void insert(Music music) {
        Music m = musicDao.queryBuilder().where(MusicDao.Properties.Song_id.eq(music.getSong_id())).build().unique();
        if (musicDao.queryBuilder().where(MusicDao.Properties.Song_id.eq(music.getSong_id())).build().unique() == null) {
            musicDao.insert(music);
        } else {
            music.setId(m.getId());
            update(music);
        }
    }

    /**
     * 删除所有数据
     */
    public void deleteAll() {
        musicDao.deleteAll();
    }

    /**
     * 删除指定数据
     */
    public void deleteByKey(Long key) {
        musicDao.deleteByKey(key);
    }

    /**
     * 更新数据
     *
     * @param music
     */
    public void update(Music music) {
        musicDao.update(music);
    }

    /**
     * 更新数据，删除本地已经不存在的数据
     */
    public void update() {
        List<Music> list = queryType(1);
        if (list != null && list.size() != 0) {
            for (int i = 0; i < list.size(); i++) {
                if (!new File(list.get(i).getSong_id()).exists()) {
                    deleteByKey(list.get(i).getId());
                }
            }
        }
    }

    /**
     *
     */
    public void delete(int play_list, int type) {
        List<Music> list = queryType(play_list, type);
        if (list != null && list.size() != 0) {
            for (int i = 0; i < list.size(); i++) {
                musicDao.delete(list.get(i));
            }
        }
    }

    /**
     * 查询所有音乐
     *
     * @return
     */
    public List<Music> queryAll() {
        return musicDao.loadAll();
    }

    /**
     * 查询音乐
     *
     * @param type
     * @return
     */
    public List<Music> queryType(int type) {
        return musicDao.queryBuilder().where(MusicDao.Properties.Type.eq(type)).build().list();
    }

    public List<Music> queryType(int play_list, int type) {
        return musicDao.queryBuilder().where(MusicDao.Properties.Type.eq(type),
                MusicDao.Properties.Play_list.eq(play_list)).build().list();
    }

    /**
     * 查询正在播放的列表
     *
     * @param play_list
     * @return
     */
    public List<Music> queryPlayList(int play_list) {
        return musicDao.queryBuilder().where(MusicDao.Properties.Play_list.eq(play_list)).build().list();
    }


    /**
     * 以上是数据库表的基本功能，下面则是对应的实际应用的方法
     * **********************************************************************************************
     */


    /**
     * 判断数据库有没有值
     * @return
     */
    public boolean isEnlded(){
        return CommonUtil.isNotListEmpty(queryAll());
    }

    /**
     * 初始化本地数据库的值
     */
    public void initPlayMusic() {
        // 获取正在播放的列表
        List<Music> list = queryPlayList(1);
        // 如果列表为空，则把本地
        if (CommonUtil.isListEmpty(list)) {
            list = queryType(1);
        }
        if (CommonUtil.isNotListEmpty(list)) {
            for (int i = 0; i < list.size(); i++) {
                list.get(i).setPlay_list(1);
                list.get(i).setListId(i);
                update(list.get(i));
            }
            Music music = musicDao.queryBuilder().where(MusicDao.Properties.Play_list.eq(1), MusicDao.Properties.IsPlay.eq(2)).build().unique();
            if (music == null) {
                music = musicDao.queryBuilder().where(MusicDao.Properties.Play_list.eq(1), MusicDao.Properties.ListId.eq(0)).build().unique();
                music.setIsPlay(2);
                update(music);
            }
        }
    }

    /**
     * 获取正在播放列表
     */
    public void getPlayingList() {
        Util.ALL_MUSIC_PLAY = queryPlayList(2);
        if (Util.ALL_MUSIC_PLAY == null || Util.ALL_MUSIC_PLAY.size() == 0) {
            Util.ALL_MUSIC_PLAY = queryType(1);
            for (int i = 0; i < Util.ALL_MUSIC_PLAY.size(); i++) {
                Util.ALL_MUSIC_PLAY.get(i).setPlay_list(1);
                Util.ALL_MUSIC_PLAY.get(i).setListId(i);
                update(Util.ALL_MUSIC_PLAY.get(i));
            }
        }
    }

    /**
     * 查询正在准备的音乐的id（自定义的）
     *
     * @return
     */
    public Music queryPlayMusic() {
        return musicDao.queryBuilder().where(MusicDao.Properties.Play_list.eq(1), MusicDao.Properties.IsPlay.eq(2)).build().unique();
    }

    /**
     * 查询正在播放的音乐
     *
     * @return
     */
    public Music queryPlayIngMusic() {
        return musicDao.queryBuilder().where(MusicDao.Properties.Play_list.eq(1), MusicDao.Properties.IsPlay.eq(1)).build().unique();
    }

    /**
     * 开始播放的时候
     * <p>
     * 准备播放的播放的音乐改成正在播放的音乐，后面一曲改成准备播放，原来正在播放的音乐改成默认值
     */
    public void playPlan() {
        Music musicPlay = queryPlayIngMusic();
        Music musicPlan = queryPlayMusic();
        if (musicPlay != null) {
            musicPlay.setIsPlay(0);
            musicPlay.setCurrentPosition(0);
            musicPlay.setCurrentPosition(0);
        }
        musicPlan.setIsPlay(1);
        int size = musicPlan.getListId();
        size++;
        if (size == Util.ALL_MUSIC_PLAY.size())
            size = 0;
        Music music = musicDao.queryBuilder().where(MusicDao.Properties.Play_list.eq(1),
                MusicDao.Properties.ListId.eq(size)).unique();
        music.setIsPlay(2);
        if (musicPlay != null)
            update(musicPlay);
        update(musicPlan);
        update(music);
    }

    /**
     * 点击item时数据变化
     */
    public void OnPlayClick(int position) {
        Music musicPlay = queryPlayIngMusic();
        Music musicPlan = queryPlayMusic();
        if (musicPlay != null) {
            musicPlay.setIsPlay(0);
            musicPlay.setCurrentPosition(0);
            musicPlay.setCurrentPosition(0);
        }
        if (musicPlan == null) {
            Music music = musicDao.queryBuilder().where(MusicDao.Properties.Play_list.eq(1),
                    MusicDao.Properties.ListId.eq(position)).unique();
            music.setIsPlay(2);
            update(music);
        } else {
            if (musicPlan.getListId() == position)
                musicPlan.setIsPlay(2);
            else {
                musicPlan.setIsPlay(0);
                Music music = musicDao.queryBuilder().where(MusicDao.Properties.Play_list.eq(1),
                        MusicDao.Properties.ListId.eq(position)).unique();
                music.setIsPlay(2);
                update(music);
            }
        }
        if (musicPlay != null)
            update(musicPlay);
        if (musicPlan != null)
            update(musicPlan);
    }

    /**
     * 播放网络音乐前清理数据库数据
     */
    public void OnBeforePlayClickNet() {
        // 清除正在播放列表中的网络音乐（因为没有下载，这个只是缓存而已）
        delete(1, 2);
        // 将正在播放列表中的本地音乐改成默认列表对
        List<Music> list = musicDao.queryBuilder().where(MusicDao.Properties.Play_list.eq(1),
                MusicDao.Properties.Type.eq(1)).list();
        if (CommonUtil.isNotListEmpty(list)) {
            for (int i = 0; i < list.size(); i++) {
                list.get(i).setPlay_list(0);
                list.get(i).setIsPlay(0);
                update(list.get(i));
            }
        }
    }

    /**
     * 将本地音乐列表设置成正在播放列表
     */
    public void OnBeforePlayClickLocal() {
        // 清除正在播放列表中的网络音乐（因为没有下载，这个只是缓存而已）
        delete(1, 2);
        List<Music> list = queryType(1);
        if (CommonUtil.isNotListEmpty(list)) {
            for (int i = 0; i < list.size(); i++) {
                list.get(i).setPlay_list(1);
                update(list.get(i));
            }
        }
    }

    public void onDestroy() {
        Music music1 = queryPlayMusic();
        if (music1 != null) {
            music1.setIsPlay(0);
            update(music1);
        }
        Music music2 = queryPlayIngMusic();
        if (music2 != null) {
            music2.setIsPlay(2);
            update(music2);
        }
    }
}
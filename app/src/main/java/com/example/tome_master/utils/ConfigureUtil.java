package com.example.tome_master.utils;

/**
 * 配置
 */
public class ConfigureUtil {

    // 易网应用id
    public static final String APP_ID = "49817";
    // 应用的secret值
    public static final String APP_SECRET = "d9baed833c224ce4ac5f6ef840593423";
    public static String BASE_URL = "";
    public static String BASE_URL_MUSIC = "http://mobilecdn.kugou.com/";
    public static String BASE_URL_MUSIC_KUGOU = "http://www.kugou.com/";
    public static String BASE_URL_MUSIC_MKUGOU = "http://m.kugou.com/";
    public static String BASE_URL_PICTURE = "https://route.showapi.com/";
    public static long TIME_OUT = 1024 * 30;

    public static boolean isSwitchHttp = false;

    // 缓存的根文件夹
    public static String FILE_ROOT = "tome/";
    // 缓存的图片文件夹
    public static String FILE_PICTURE = FILE_ROOT + "picture/";
    // 缓存的音乐文件夹
    public static String FILE_MUSIC = FILE_ROOT + "music/";
    // 缓存的歌词文件夹
    public static String FILE_LYRIC = FILE_ROOT + "lyric/";

}

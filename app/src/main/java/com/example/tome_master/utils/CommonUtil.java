package com.example.tome_master.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.List;

/**
 * 时间 ：2017/9/22  15:21
 * 作者 ：陈奇
 * 作用 ：公共类方法
 */
public class CommonUtil {

    /**
     * 判断字符串是否为空
     */
    public static boolean isEmpty(String str) {
        if (str != null && !str.equals("") && !str.equals("null"))
            return false;
        else
            return true;
    }

    /**
     * 判断字符串是否不为空
     */
    public static boolean isNotEmpty(String str) {
        if (str != null && !str.equals(""))
            return true;
        else
            return false;
    }

    public static boolean isListEmpty(List<?> list) {
        if (list != null && list.size() != 0)
            return false;
        else
            return true;
    }

    public static boolean isNotListEmpty(List<?> list) {
        return !isListEmpty(list);
    }

    /**
     * 将图片url转化成真正的url
     *
     * @param path
     * @return
     */
    public static String getRealImagePath(String path) {
        if (isEmpty(path))
            return "";
        else if (path.contains("/{size}")) {
            return path.replace("/{size}", "");
        }
        return path;
    }

    /**
     * 将图片url转化成真正的url（控制图片大小）
     *
     * @param path 原图片url
     * @param size 图片大小
     * @return
     */
    public static String getRealImagePath(String path, int size) {
        if (isEmpty(path))
            return "";
        else if (path.contains("{size}")) {
            return path.replace("{size}", String.valueOf(size));
        }
        return path;
    }

    /**
     * 判断网络是否连接
     *
     * @param context
     * @return
     */
    public static boolean isConnected(Context context) {
        NetworkInfo info = ((ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE)).getActiveNetworkInfo();
        return info != null && info.isConnected();
    }

    /**
     * 获得手机端版本描述
     */
    public static String getVersionName(Context context) {
        String verName = "-1";
        try {
            verName = context.getPackageManager().getPackageInfo("com.bestnet.weiqun.android", 0).versionName;
        } catch (Exception e) {
            System.out.println("版本号获取异常:" + e.getMessage());
        }
        return verName;
    }

    public static String StringToMd5(String psw) {
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(psw.getBytes("UTF-8"));
            byte[] encryption = md5.digest();

            StringBuffer strBuf = new StringBuffer();
            for (int i = 0; i < encryption.length; i++) {
                if (Integer.toHexString(0xff & encryption[i]).length() == 1) {
                    strBuf.append("0").append(Integer.toHexString(0xff & encryption[i]));
                } else {
                    strBuf.append(Integer.toHexString(0xff & encryption[i]));
                }
            }

            return strBuf.toString();
        } catch (NoSuchAlgorithmException e) {
            return "";
        } catch (UnsupportedEncodingException e) {
            return "";
        }
    }


    /**
     * @param divisor  除数
     * @param dividend 被除数
     * @return 计算出带小数点的除法结果
     */
    public static float getDivision(float divisor, float dividend) {
        return divisor / dividend;
    }

    /**
     * 判断service服务是否正在运行
     *
     * @param mContext
     * @param className
     * @return
     */
    public static boolean isServiceRunning(Context mContext, String className) {
        boolean isRunning = false;
        try {
            ActivityManager activityManager = (ActivityManager) mContext.getSystemService(Context.ACTIVITY_SERVICE);
            List<ActivityManager.RunningServiceInfo> serviceList = activityManager.getRunningServices(30);
            if (!(serviceList.size() > 0)) {
                return false;
            }
            for (int i = 0; i < serviceList.size(); i++) {
                if (serviceList.get(i).service.getClassName().equals(className) == true) {
                    isRunning = true;
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isRunning;
    }

    /**
     * 返回以万或者亿为单位的数值，不足的直接返回
     *
     * @return
     */
    public static String getEndNumber(int count) {
        double number = count;
        DecimalFormat df = new DecimalFormat("#.0");
        number = count / 10000.00;
        if (number < 1)
            return String.valueOf(count);
        if (number < 10000)
            return df.format(number) + "万";
        number = number / 10000.00;
        return df.format(number) + "亿";
    }

    /**
     * 分解获取歌名
     * @param path
     * @return
     */
    public static String getSongName(String path) {
        return path.split("(-)+")[1];
    }
    /**
     * 分解获取歌手名
     * @param path
     * @return
     */
    public static String getSongerName(String path) {
        return path.split("(-)+")[0];
    }

}

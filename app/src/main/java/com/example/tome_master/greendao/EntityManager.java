package com.example.tome_master.greendao;


import com.example.tome_master.MusicDao;

/**
 * 时间 ：2017/11/23  16:09
 * 作者 ：陈奇
 * 作用 ：
 */
public class EntityManager {

    private static EntityManager manager;

    public static EntityManager getIntance() {
        if (manager == null) {
            synchronized (EntityManager.class) {
                manager = new EntityManager();
            }
        }
        return manager;
    }

    public MusicDao getMusicDao() {
        return DaoManager.getInstance().getSession().getMusicDao();
    }

}

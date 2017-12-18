package com.example.tome_master.greendao;

import com.example.tome_master.DaoMaster;
import com.example.tome_master.DaoSession;
import com.example.tome_master.base.BaseApplication;

/**
 * 时间 ：2017/11/23  16:02
 * 作者 ：陈奇
 * 作用 ：
 */
public class DaoManager {

    private static DaoManager mInstance;

    public static DaoManager getInstance(){
        if (mInstance == null) {
            synchronized (DaoManager.class) {
                if (mInstance == null) {
                    mInstance = new DaoManager();
                }
            }
        }
        return mInstance;
    }

    private DaoMaster mDaoMaster;

    private DaoSession mDaoSession;

    public DaoManager() {
        DaoMaster.DevOpenHelper devOpenHelper = new DaoMaster.DevOpenHelper(BaseApplication.getContext(), "demo", null);
        DaoMaster daoMaster = new DaoMaster(devOpenHelper.getWritableDatabase());
        mDaoSession = daoMaster.newSession();
    }

    public DaoMaster getMaster() {
        return mDaoMaster;
    }

    public DaoSession getSession() {
        return mDaoSession;
    }


}

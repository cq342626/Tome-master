package com.example.tome_master;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.example.tome_master.bean.music.Music;

import com.example.tome_master.MusicDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig musicDaoConfig;

    private final MusicDao musicDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        musicDaoConfig = daoConfigMap.get(MusicDao.class).clone();
        musicDaoConfig.initIdentityScope(type);

        musicDao = new MusicDao(musicDaoConfig, this);

        registerDao(Music.class, musicDao);
    }
    
    public void clear() {
        musicDaoConfig.getIdentityScope().clear();
    }

    public MusicDao getMusicDao() {
        return musicDao;
    }

}

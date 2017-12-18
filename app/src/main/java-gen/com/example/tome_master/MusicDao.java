package com.example.tome_master;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.tome_master.bean.music.Music;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "MUSIC".
*/
public class MusicDao extends AbstractDao<Music, Long> {

    public static final String TABLENAME = "MUSIC";

    /**
     * Properties of entity Music.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Song_id = new Property(1, String.class, "song_id", false, "SONG_ID");
        public final static Property Title = new Property(2, String.class, "title", false, "TITLE");
        public final static Property Author = new Property(3, String.class, "author", false, "AUTHOR");
        public final static Property Author_id = new Property(4, String.class, "author_id", false, "AUTHOR_ID");
        public final static Property Lrclink = new Property(5, String.class, "lrclink", false, "LRCLINK");
        public final static Property Album_id = new Property(6, String.class, "album_id", false, "ALBUM_ID");
        public final static Property Album_title = new Property(7, String.class, "album_title", false, "ALBUM_TITLE");
        public final static Property Pic_small = new Property(8, String.class, "pic_small", false, "PIC_SMALL");
        public final static Property Pic_big = new Property(9, String.class, "pic_big", false, "PIC_BIG");
        public final static Property Song_path = new Property(10, String.class, "song_path", false, "SONG_PATH");
        public final static Property File_extension = new Property(11, String.class, "file_extension", false, "FILE_EXTENSION");
        public final static Property Duration = new Property(12, int.class, "duration", false, "DURATION");
        public final static Property CurrentPosition = new Property(13, int.class, "currentPosition", false, "CURRENT_POSITION");
        public final static Property Size = new Property(14, long.class, "size", false, "SIZE");
        public final static Property Type = new Property(15, int.class, "type", false, "TYPE");
        public final static Property Play_list = new Property(16, int.class, "play_list", false, "PLAY_LIST");
        public final static Property ListId = new Property(17, int.class, "listId", false, "LIST_ID");
        public final static Property IsPlay = new Property(18, int.class, "isPlay", false, "IS_PLAY");
    };


    public MusicDao(DaoConfig config) {
        super(config);
    }
    
    public MusicDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"MUSIC\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"SONG_ID\" TEXT," + // 1: song_id
                "\"TITLE\" TEXT," + // 2: title
                "\"AUTHOR\" TEXT," + // 3: author
                "\"AUTHOR_ID\" TEXT," + // 4: author_id
                "\"LRCLINK\" TEXT," + // 5: lrclink
                "\"ALBUM_ID\" TEXT," + // 6: album_id
                "\"ALBUM_TITLE\" TEXT," + // 7: album_title
                "\"PIC_SMALL\" TEXT," + // 8: pic_small
                "\"PIC_BIG\" TEXT," + // 9: pic_big
                "\"SONG_PATH\" TEXT," + // 10: song_path
                "\"FILE_EXTENSION\" TEXT," + // 11: file_extension
                "\"DURATION\" INTEGER NOT NULL ," + // 12: duration
                "\"CURRENT_POSITION\" INTEGER NOT NULL ," + // 13: currentPosition
                "\"SIZE\" INTEGER NOT NULL ," + // 14: size
                "\"TYPE\" INTEGER NOT NULL ," + // 15: type
                "\"PLAY_LIST\" INTEGER NOT NULL ," + // 16: play_list
                "\"LIST_ID\" INTEGER NOT NULL ," + // 17: listId
                "\"IS_PLAY\" INTEGER NOT NULL );"); // 18: isPlay
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"MUSIC\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Music entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String song_id = entity.getSong_id();
        if (song_id != null) {
            stmt.bindString(2, song_id);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(3, title);
        }
 
        String author = entity.getAuthor();
        if (author != null) {
            stmt.bindString(4, author);
        }
 
        String author_id = entity.getAuthor_id();
        if (author_id != null) {
            stmt.bindString(5, author_id);
        }
 
        String lrclink = entity.getLrclink();
        if (lrclink != null) {
            stmt.bindString(6, lrclink);
        }
 
        String album_id = entity.getAlbum_id();
        if (album_id != null) {
            stmt.bindString(7, album_id);
        }
 
        String album_title = entity.getAlbum_title();
        if (album_title != null) {
            stmt.bindString(8, album_title);
        }
 
        String pic_small = entity.getPic_small();
        if (pic_small != null) {
            stmt.bindString(9, pic_small);
        }
 
        String pic_big = entity.getPic_big();
        if (pic_big != null) {
            stmt.bindString(10, pic_big);
        }
 
        String song_path = entity.getSong_path();
        if (song_path != null) {
            stmt.bindString(11, song_path);
        }
 
        String file_extension = entity.getFile_extension();
        if (file_extension != null) {
            stmt.bindString(12, file_extension);
        }
        stmt.bindLong(13, entity.getDuration());
        stmt.bindLong(14, entity.getCurrentPosition());
        stmt.bindLong(15, entity.getSize());
        stmt.bindLong(16, entity.getType());
        stmt.bindLong(17, entity.getPlay_list());
        stmt.bindLong(18, entity.getListId());
        stmt.bindLong(19, entity.getIsPlay());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Music entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String song_id = entity.getSong_id();
        if (song_id != null) {
            stmt.bindString(2, song_id);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(3, title);
        }
 
        String author = entity.getAuthor();
        if (author != null) {
            stmt.bindString(4, author);
        }
 
        String author_id = entity.getAuthor_id();
        if (author_id != null) {
            stmt.bindString(5, author_id);
        }
 
        String lrclink = entity.getLrclink();
        if (lrclink != null) {
            stmt.bindString(6, lrclink);
        }
 
        String album_id = entity.getAlbum_id();
        if (album_id != null) {
            stmt.bindString(7, album_id);
        }
 
        String album_title = entity.getAlbum_title();
        if (album_title != null) {
            stmt.bindString(8, album_title);
        }
 
        String pic_small = entity.getPic_small();
        if (pic_small != null) {
            stmt.bindString(9, pic_small);
        }
 
        String pic_big = entity.getPic_big();
        if (pic_big != null) {
            stmt.bindString(10, pic_big);
        }
 
        String song_path = entity.getSong_path();
        if (song_path != null) {
            stmt.bindString(11, song_path);
        }
 
        String file_extension = entity.getFile_extension();
        if (file_extension != null) {
            stmt.bindString(12, file_extension);
        }
        stmt.bindLong(13, entity.getDuration());
        stmt.bindLong(14, entity.getCurrentPosition());
        stmt.bindLong(15, entity.getSize());
        stmt.bindLong(16, entity.getType());
        stmt.bindLong(17, entity.getPlay_list());
        stmt.bindLong(18, entity.getListId());
        stmt.bindLong(19, entity.getIsPlay());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Music readEntity(Cursor cursor, int offset) {
        Music entity = new Music( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // song_id
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // title
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // author
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // author_id
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // lrclink
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // album_id
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // album_title
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // pic_small
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // pic_big
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // song_path
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // file_extension
            cursor.getInt(offset + 12), // duration
            cursor.getInt(offset + 13), // currentPosition
            cursor.getLong(offset + 14), // size
            cursor.getInt(offset + 15), // type
            cursor.getInt(offset + 16), // play_list
            cursor.getInt(offset + 17), // listId
            cursor.getInt(offset + 18) // isPlay
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Music entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setSong_id(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setTitle(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setAuthor(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setAuthor_id(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setLrclink(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setAlbum_id(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setAlbum_title(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setPic_small(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setPic_big(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setSong_path(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setFile_extension(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setDuration(cursor.getInt(offset + 12));
        entity.setCurrentPosition(cursor.getInt(offset + 13));
        entity.setSize(cursor.getLong(offset + 14));
        entity.setType(cursor.getInt(offset + 15));
        entity.setPlay_list(cursor.getInt(offset + 16));
        entity.setListId(cursor.getInt(offset + 17));
        entity.setIsPlay(cursor.getInt(offset + 18));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Music entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Music entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}

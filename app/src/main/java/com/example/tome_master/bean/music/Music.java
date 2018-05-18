package com.example.tome_master.bean.music;

import android.annotation.TargetApi;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

import java.io.Serializable;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

/**
 * 音乐的实体类（包括本地和网络）,音乐不会自动下载
 *
 * @author Administrator
 *
 */
@Entity
public class Music implements Serializable {
	@Id
	private Long id;
	private String song_id; // 歌曲id
	private String title;// 歌名
	private String author; // 歌手
	private String author_id;//歌手id
	private String lrclink;// 歌词
	private String album_id;// 专辑ID
	private String album_title;// 专辑名称
	private String pic_small;// 小图
	private String pic_big;// 大图
	private String song_path;// 歌曲路径
	private String file_extension; // 歌曲类型
	private int duration;// 歌曲的总播放时长
	private int currentPosition;//  歌曲的播放进度
	private long size;// 歌曲文件的大小

	private int type;// 1、本地音乐；2、网络音乐
	private int play_list;// 播放列表：0、默认值；1、正在播放列表(如果没有正在播放的列表，则默认本地音乐列表为正在播放列表)
	private int listId;// 本地音乐的下标
	private int isPlay = 0;// 是否是正在播放:0、默认值；1、正在播放的歌曲；2、准备播放的歌曲（如果不存在则默认播放列表中的第一首为预放歌曲）

	@Transient
	private String hash;

	@Transient
	private boolean choose = false;

	public String getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(String author_id) {
		this.author_id = author_id;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public int getIsPlay() {
		return this.isPlay;
	}
	public void setIsPlay(int isPlay) {
		this.isPlay = isPlay;
	}
	public int getListId() {
		return this.listId;
	}
	public void setListId(int listId) {
		this.listId = listId;
	}
	public int getPlay_list() {
		return this.play_list;
	}
	public void setPlay_list(int play_list) {
		this.play_list = play_list;
	}
	public int getType() {
		return this.type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public long getSize() {
		return this.size;
	}
	public void setSize(long size) {
		this.size = size;
	}
	public int getCurrentPosition() {
		return this.currentPosition;
	}
	public void setCurrentPosition(int currentPosition) {
		this.currentPosition = currentPosition;
	}
	public int getDuration() {
		return this.duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getFile_extension() {
		return this.file_extension;
	}
	public void setFile_extension(String file_extension) {
		this.file_extension = file_extension;
	}
	public String getSong_path() {
		return this.song_path;
	}
	public void setSong_path(String song_path) {
		this.song_path = song_path;
	}
	public String getPic_big() {
		return this.pic_big;
	}
	public void setPic_big(String pic_big) {
		this.pic_big = pic_big;
	}
	public String getPic_small() {
		return this.pic_small;
	}
	public void setPic_small(String pic_small) {
		this.pic_small = pic_small;
	}
	public String getAlbum_title() {
		return this.album_title;
	}
	public void setAlbum_title(String album_title) {
		this.album_title = album_title;
	}
	public String getAlbum_id() {
		return this.album_id;
	}
	public void setAlbum_id(String album_id) {
		this.album_id = album_id;
	}
	public String getLrclink() {
		return this.lrclink;
	}
	public void setLrclink(String lrclink) {
		this.lrclink = lrclink;
	}
	public String getAuthor() {
		return this.author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSong_id() {
		return this.song_id;
	}
	public void setSong_id(String song_id) {
		this.song_id = song_id;
	}
	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public boolean isChoose() {
		return choose;
	}

	public void setChoose(boolean choose) {
		this.choose = choose;
	}

	@Generated(hash = 1291306183)
	public Music(Long id, String song_id, String title, String author,
			String author_id, String lrclink, String album_id, String album_title,
			String pic_small, String pic_big, String song_path, String file_extension,
			int duration, int currentPosition, long size, int type, int play_list,
			int listId, int isPlay) {
		this.id = id;
		this.song_id = song_id;
		this.title = title;
		this.author = author;
		this.author_id = author_id;
		this.lrclink = lrclink;
		this.album_id = album_id;
		this.album_title = album_title;
		this.pic_small = pic_small;
		this.pic_big = pic_big;
		this.song_path = song_path;
		this.file_extension = file_extension;
		this.duration = duration;
		this.currentPosition = currentPosition;
		this.size = size;
		this.type = type;
		this.play_list = play_list;
		this.listId = listId;
		this.isPlay = isPlay;
	}

	@Generated(hash = 1263212761)
	public Music() {
	}

	@Override
	public String toString() {
		return "Music{" +
				"id=" + id +
				", song_id='" + song_id + '\'' +
				", title='" + title + '\'' +
				", author='" + author + '\'' +
				", author_id='" + author_id + '\'' +
				", lrclink='" + lrclink + '\'' +
				", album_id='" + album_id + '\'' +
				", album_title='" + album_title + '\'' +
				", pic_small='" + pic_small + '\'' +
				", pic_big='" + pic_big + '\'' +
				", song_path='" + song_path + '\'' +
				", file_extension='" + file_extension + '\'' +
				", duration=" + duration +
				", currentPosition=" + currentPosition +
				", size=" + size +
				", type=" + type +
				", play_list=" + play_list +
				", listId=" + listId +
				", isPlay=" + isPlay +
				", hash='" + hash + '\'' +
				", choose=" + choose +
				'}';
	}
}

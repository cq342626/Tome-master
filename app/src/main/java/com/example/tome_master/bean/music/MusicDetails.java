package com.example.tome_master.bean.music;

import java.util.List;

/**
 * 时间 ：2017/11/28  11:30
 * 作者 ：陈奇
 * 作用 ：
 */
public class MusicDetails {

    /**
     * status : 1
     * err_code : 0
     * data : {"hash":"7D5448D9F7E336850C92F3E78AE2854C","timelength":249000,"filesize":3987333,"audio_name":"王源 - 一块红布 - X-Roy生日演唱会Live版","have_album":0,"album_name":"未知专辑","album_id":0,"img":"http://singerimg.kugou.com/uploadpic/softhead/400/20170707/20170707175607679.jpg","have_mv":0,"video_id":0,"author_name":"王源","song_name":"一块红布 - X-Roy生日演唱会Live版","lyrics":"[00:00.31]王源 - 一块红布(X-Roy生日演唱会Live版)\r\n[00:02.73]作词：崔健\r\n[00:03.48]作曲：崔健\r\n[00:27.64]那天是你用一块红布\r\n[00:32.88]蒙住我双眼也蒙住了天\r\n[00:38.06]你问我看见了什么\r\n[00:43.10]我说我看见了幸福\r\n[00:48.69]这个感觉真让我舒服\r\n[00:53.78]它让我忘掉我没地儿住\r\n[00:59.10]你问我还要去何方\r\n[01:04.25]我说要上了你的路\r\n[01:13.76]看不见你也看不见路\r\n[01:18.19]我的手也被你攥住\r\n[01:22.72]你问我还在想什么\r\n[01:27.20]我说我要让你做主\r\n[01:31.44]我感觉你不是铁\r\n[01:36.33]却像那铁一样的强和烈\r\n[01:40.49]我感觉你身上有血\r\n[01:45.29]因为你的手是热呼呼\r\n[01:49.91]这个感觉真让我舒服\r\n[01:54.34]它让我忘掉我没地儿住\r\n[01:58.97]你问我还要去何方\r\n[02:03.41]我说要上了你的路\r\n[02:25.93]我感觉这不是荒野\r\n[02:30.51]却看不见这土地已经干裂\r\n[02:34.88]我感觉我要喝点水\r\n[02:39.62]可你的嘴将我的嘴堵住\r\n[02:43.89]我感觉这不是荒野\r\n[02:48.62]却看不见这土地已经干裂\r\n[02:53.01]我感觉我要喝点水\r\n[02:57.80]可你的嘴将我的嘴堵住\r\n[03:02.35]我不能走我也不能哭\r\n[03:06.76]因为我的身体现在已经干枯\r\n[03:11.37]我要永远这样陪伴着你\r\n[03:15.80]因为我最知道你的痛苦\r\n[03:20.40]我不能走我也不能哭\r\n[03:24.96]因为我的身体现在已经干枯\r\n[03:29.49]我要永远这样陪伴着你\r\n[03:33.87]因为我最知道你的痛苦\r\n[03:41.03]那天是你用一块红布\r\n[03:45.74]蒙住我双眼也蒙住了天\r\n[03:50.63]你问我看见了什么\r\n[03:55.73]我说我看见了幸福\r\n","author_id":"157295","privilege":8,"privilege2":"1000","play_url":"http://fs.w.kugou.com/201711281055/68d2d4cdf053907318ce02d54efe8510/G119/M0B/00/03/F4cBAFoaSw6ABI38ADzXhWrUmvw000.mp3","authors":[{"is_publish":"1","author_id":"157295","avatar":"20170707175607679.jpg","author_name":"王源"}],"bitrate":127}
     */

    private int status;
    private int err_code;
    /**
     * hash : 7D5448D9F7E336850C92F3E78AE2854C
     * timelength : 249000
     * filesize : 3987333
     * audio_name : 王源 - 一块红布 - X-Roy生日演唱会Live版
     * have_album : 0
     * album_name : 未知专辑
     * album_id : 0
     * img : http://singerimg.kugou.com/uploadpic/softhead/400/20170707/20170707175607679.jpg
     * have_mv : 0
     * video_id : 0
     * author_name : 王源
     * song_name : 一块红布 - X-Roy生日演唱会Live版
     * lyrics : [00:00.31]王源 - 一块红布(X-Roy生日演唱会Live版)
     [00:02.73]作词：崔健
     [00:03.48]作曲：崔健
     [00:27.64]那天是你用一块红布
     [00:32.88]蒙住我双眼也蒙住了天
     [00:38.06]你问我看见了什么
     [00:43.10]我说我看见了幸福
     [00:48.69]这个感觉真让我舒服
     [00:53.78]它让我忘掉我没地儿住
     [00:59.10]你问我还要去何方
     [01:04.25]我说要上了你的路
     [01:13.76]看不见你也看不见路
     [01:18.19]我的手也被你攥住
     [01:22.72]你问我还在想什么
     [01:27.20]我说我要让你做主
     [01:31.44]我感觉你不是铁
     [01:36.33]却像那铁一样的强和烈
     [01:40.49]我感觉你身上有血
     [01:45.29]因为你的手是热呼呼
     [01:49.91]这个感觉真让我舒服
     [01:54.34]它让我忘掉我没地儿住
     [01:58.97]你问我还要去何方
     [02:03.41]我说要上了你的路
     [02:25.93]我感觉这不是荒野
     [02:30.51]却看不见这土地已经干裂
     [02:34.88]我感觉我要喝点水
     [02:39.62]可你的嘴将我的嘴堵住
     [02:43.89]我感觉这不是荒野
     [02:48.62]却看不见这土地已经干裂
     [02:53.01]我感觉我要喝点水
     [02:57.80]可你的嘴将我的嘴堵住
     [03:02.35]我不能走我也不能哭
     [03:06.76]因为我的身体现在已经干枯
     [03:11.37]我要永远这样陪伴着你
     [03:15.80]因为我最知道你的痛苦
     [03:20.40]我不能走我也不能哭
     [03:24.96]因为我的身体现在已经干枯
     [03:29.49]我要永远这样陪伴着你
     [03:33.87]因为我最知道你的痛苦
     [03:41.03]那天是你用一块红布
     [03:45.74]蒙住我双眼也蒙住了天
     [03:50.63]你问我看见了什么
     [03:55.73]我说我看见了幸福

     * author_id : 157295
     * privilege : 8
     * privilege2 : 1000
     * play_url : http://fs.w.kugou.com/201711281055/68d2d4cdf053907318ce02d54efe8510/G119/M0B/00/03/F4cBAFoaSw6ABI38ADzXhWrUmvw000.mp3
     * authors : [{"is_publish":"1","author_id":"157295","avatar":"20170707175607679.jpg","author_name":"王源"}]
     * bitrate : 127
     */

    private DataBean data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getErr_code() {
        return err_code;
    }

    public void setErr_code(int err_code) {
        this.err_code = err_code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private String hash;
        private int timelength;
        private int filesize;
        private String audio_name;
        private int have_album;
        private String album_name;
        private int album_id;
        private String img;
        private int have_mv;
        private int video_id;
        private String author_name;
        private String song_name;
        private String lyrics;
        private String author_id;
        private int privilege;
        private String privilege2;
        private String play_url;
        private int bitrate;
        /**
         * is_publish : 1
         * author_id : 157295
         * avatar : 20170707175607679.jpg
         * author_name : 王源
         */

        private List<AuthorsBean> authors;

        public String getHash() {
            return hash;
        }

        public void setHash(String hash) {
            this.hash = hash;
        }

        public int getTimelength() {
            return timelength;
        }

        public void setTimelength(int timelength) {
            this.timelength = timelength;
        }

        public int getFilesize() {
            return filesize;
        }

        public void setFilesize(int filesize) {
            this.filesize = filesize;
        }

        public String getAudio_name() {
            return audio_name;
        }

        public void setAudio_name(String audio_name) {
            this.audio_name = audio_name;
        }

        public int getHave_album() {
            return have_album;
        }

        public void setHave_album(int have_album) {
            this.have_album = have_album;
        }

        public String getAlbum_name() {
            return album_name;
        }

        public void setAlbum_name(String album_name) {
            this.album_name = album_name;
        }

        public int getAlbum_id() {
            return album_id;
        }

        public void setAlbum_id(int album_id) {
            this.album_id = album_id;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public int getHave_mv() {
            return have_mv;
        }

        public void setHave_mv(int have_mv) {
            this.have_mv = have_mv;
        }

        public int getVideo_id() {
            return video_id;
        }

        public void setVideo_id(int video_id) {
            this.video_id = video_id;
        }

        public String getAuthor_name() {
            return author_name;
        }

        public void setAuthor_name(String author_name) {
            this.author_name = author_name;
        }

        public String getSong_name() {
            return song_name;
        }

        public void setSong_name(String song_name) {
            this.song_name = song_name;
        }

        public String getLyrics() {
            return lyrics;
        }

        public void setLyrics(String lyrics) {
            this.lyrics = lyrics;
        }

        public String getAuthor_id() {
            return author_id;
        }

        public void setAuthor_id(String author_id) {
            this.author_id = author_id;
        }

        public int getPrivilege() {
            return privilege;
        }

        public void setPrivilege(int privilege) {
            this.privilege = privilege;
        }

        public String getPrivilege2() {
            return privilege2;
        }

        public void setPrivilege2(String privilege2) {
            this.privilege2 = privilege2;
        }

        public String getPlay_url() {
            return play_url;
        }

        public void setPlay_url(String play_url) {
            this.play_url = play_url;
        }

        public int getBitrate() {
            return bitrate;
        }

        public void setBitrate(int bitrate) {
            this.bitrate = bitrate;
        }

        public List<AuthorsBean> getAuthors() {
            return authors;
        }

        public void setAuthors(List<AuthorsBean> authors) {
            this.authors = authors;
        }

        public static class AuthorsBean {
            private String is_publish;
            private String author_id;
            private String avatar;
            private String author_name;

            public String getIs_publish() {
                return is_publish;
            }

            public void setIs_publish(String is_publish) {
                this.is_publish = is_publish;
            }

            public String getAuthor_id() {
                return author_id;
            }

            public void setAuthor_id(String author_id) {
                this.author_id = author_id;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }
        }
    }
}

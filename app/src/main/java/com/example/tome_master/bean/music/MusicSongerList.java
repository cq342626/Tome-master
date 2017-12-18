package com.example.tome_master.bean.music;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 时间 ：2017/12/13  11:27
 * 作者 ：陈奇
 * 作用 ：歌手所有歌曲
 */
public class MusicSongerList {

    private int status;
    private String error;
    private DataBean data;
    private int errcode;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getErrcode() {
        return errcode;
    }

    public void setErrcode(int errcode) {
        this.errcode = errcode;
    }

    public static class DataBean {
        private int timestamp;
        private int total;
        /**
         * pay_type_320 : 0
         * m4afilesize : 0
         * price_sq : 0
         * filesize : 4179360
         * bitrate : 128
         * price : 0
         * inlist : 1
         * old_cpy : 1
         * pkg_price_sq : 0
         * pay_type : 0
         * topic_url :
         * fail_process_320 : 0
         * pkg_price : 0
         * feetype : 0
         * filename : 薛之谦 - 演员
         * price_320 : 0
         * extname : mp3
         * hash : 57B83EAF673D77EE21009CBD8FD05BD6
         * mvhash : 4F5DAE4814BFAF9C556ABCD91EBF7FC5
         * privilege : 0
         * album_id : 548822
         * album_audio_id : 28016808
         * rp_type : audio
         * audio_id : 15327235
         * 320filesize : 10448979
         * rp_publish : 1
         * duration : 261
         * topic_url_sq :
         * pkg_price_320 : 0
         * remark : 绅士
         * sqhash : 403048691D6A5BBDD5D1D056C5BA5C8F
         * 320privilege : 0
         * fail_process : 0
         * fail_process_sq : 0
         * has_accompany : 1
         * pay_type_sq : 0
         * 320hash : C94B2DCB83CECE392DBD0F5366E8EC9C
         * sqprivilege : 0
         * topic_url_320 :
         * sqfilesize : 25495240
         */

        private List<InfoBean> info;

        public int getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(int timestamp) {
            this.timestamp = timestamp;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<InfoBean> getInfo() {
            return info;
        }

        public void setInfo(List<InfoBean> info) {
            this.info = info;
        }

        public static class InfoBean {
            private int pay_type_320;
            private int m4afilesize;
            private int price_sq;
            private int filesize;
            private int bitrate;
            private int price;
            private int inlist;
            private int old_cpy;
            private int pkg_price_sq;
            private int pay_type;
            private String topic_url;
            private int fail_process_320;
            private int pkg_price;
            private int feetype;
            private String filename;
            private int price_320;
            private String extname;
            private String hash;
            private String mvhash;
            private int privilege;
            private String album_id;
            private int album_audio_id;
            private String rp_type;
            private int audio_id;
            @SerializedName("320filesize")
            private int value320filesize;
            private int rp_publish;
            private int duration;
            private String topic_url_sq;
            private int pkg_price_320;
            private String remark;
            private String sqhash;
            @SerializedName("320privilege")
            private int value320privilege;
            private int fail_process;
            private int fail_process_sq;
            private int has_accompany;
            private int pay_type_sq;
            @SerializedName("320hash")
            private String value320hash;
            private int sqprivilege;
            private String topic_url_320;
            private int sqfilesize;

            public int getPay_type_320() {
                return pay_type_320;
            }

            public void setPay_type_320(int pay_type_320) {
                this.pay_type_320 = pay_type_320;
            }

            public int getM4afilesize() {
                return m4afilesize;
            }

            public void setM4afilesize(int m4afilesize) {
                this.m4afilesize = m4afilesize;
            }

            public int getPrice_sq() {
                return price_sq;
            }

            public void setPrice_sq(int price_sq) {
                this.price_sq = price_sq;
            }

            public int getFilesize() {
                return filesize;
            }

            public void setFilesize(int filesize) {
                this.filesize = filesize;
            }

            public int getBitrate() {
                return bitrate;
            }

            public void setBitrate(int bitrate) {
                this.bitrate = bitrate;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }

            public int getInlist() {
                return inlist;
            }

            public void setInlist(int inlist) {
                this.inlist = inlist;
            }

            public int getOld_cpy() {
                return old_cpy;
            }

            public void setOld_cpy(int old_cpy) {
                this.old_cpy = old_cpy;
            }

            public int getPkg_price_sq() {
                return pkg_price_sq;
            }

            public void setPkg_price_sq(int pkg_price_sq) {
                this.pkg_price_sq = pkg_price_sq;
            }

            public int getPay_type() {
                return pay_type;
            }

            public void setPay_type(int pay_type) {
                this.pay_type = pay_type;
            }

            public String getTopic_url() {
                return topic_url;
            }

            public void setTopic_url(String topic_url) {
                this.topic_url = topic_url;
            }

            public int getFail_process_320() {
                return fail_process_320;
            }

            public void setFail_process_320(int fail_process_320) {
                this.fail_process_320 = fail_process_320;
            }

            public int getPkg_price() {
                return pkg_price;
            }

            public void setPkg_price(int pkg_price) {
                this.pkg_price = pkg_price;
            }

            public int getFeetype() {
                return feetype;
            }

            public void setFeetype(int feetype) {
                this.feetype = feetype;
            }

            public String getFilename() {
                return filename;
            }

            public void setFilename(String filename) {
                this.filename = filename;
            }

            public int getPrice_320() {
                return price_320;
            }

            public void setPrice_320(int price_320) {
                this.price_320 = price_320;
            }

            public String getExtname() {
                return extname;
            }

            public void setExtname(String extname) {
                this.extname = extname;
            }

            public String getHash() {
                return hash;
            }

            public void setHash(String hash) {
                this.hash = hash;
            }

            public String getMvhash() {
                return mvhash;
            }

            public void setMvhash(String mvhash) {
                this.mvhash = mvhash;
            }

            public int getPrivilege() {
                return privilege;
            }

            public void setPrivilege(int privilege) {
                this.privilege = privilege;
            }

            public String getAlbum_id() {
                return album_id;
            }

            public void setAlbum_id(String album_id) {
                this.album_id = album_id;
            }

            public int getAlbum_audio_id() {
                return album_audio_id;
            }

            public void setAlbum_audio_id(int album_audio_id) {
                this.album_audio_id = album_audio_id;
            }

            public String getRp_type() {
                return rp_type;
            }

            public void setRp_type(String rp_type) {
                this.rp_type = rp_type;
            }

            public int getAudio_id() {
                return audio_id;
            }

            public void setAudio_id(int audio_id) {
                this.audio_id = audio_id;
            }

            public int getValue320filesize() {
                return value320filesize;
            }

            public void setValue320filesize(int value320filesize) {
                this.value320filesize = value320filesize;
            }

            public int getRp_publish() {
                return rp_publish;
            }

            public void setRp_publish(int rp_publish) {
                this.rp_publish = rp_publish;
            }

            public int getDuration() {
                return duration;
            }

            public void setDuration(int duration) {
                this.duration = duration;
            }

            public String getTopic_url_sq() {
                return topic_url_sq;
            }

            public void setTopic_url_sq(String topic_url_sq) {
                this.topic_url_sq = topic_url_sq;
            }

            public int getPkg_price_320() {
                return pkg_price_320;
            }

            public void setPkg_price_320(int pkg_price_320) {
                this.pkg_price_320 = pkg_price_320;
            }

            public String getRemark() {
                return remark;
            }

            public void setRemark(String remark) {
                this.remark = remark;
            }

            public String getSqhash() {
                return sqhash;
            }

            public void setSqhash(String sqhash) {
                this.sqhash = sqhash;
            }

            public int getValue320privilege() {
                return value320privilege;
            }

            public void setValue320privilege(int value320privilege) {
                this.value320privilege = value320privilege;
            }

            public int getFail_process() {
                return fail_process;
            }

            public void setFail_process(int fail_process) {
                this.fail_process = fail_process;
            }

            public int getFail_process_sq() {
                return fail_process_sq;
            }

            public void setFail_process_sq(int fail_process_sq) {
                this.fail_process_sq = fail_process_sq;
            }

            public int getHas_accompany() {
                return has_accompany;
            }

            public void setHas_accompany(int has_accompany) {
                this.has_accompany = has_accompany;
            }

            public int getPay_type_sq() {
                return pay_type_sq;
            }

            public void setPay_type_sq(int pay_type_sq) {
                this.pay_type_sq = pay_type_sq;
            }

            public String getValue320hash() {
                return value320hash;
            }

            public void setValue320hash(String value320hash) {
                this.value320hash = value320hash;
            }

            public int getSqprivilege() {
                return sqprivilege;
            }

            public void setSqprivilege(int sqprivilege) {
                this.sqprivilege = sqprivilege;
            }

            public String getTopic_url_320() {
                return topic_url_320;
            }

            public void setTopic_url_320(String topic_url_320) {
                this.topic_url_320 = topic_url_320;
            }

            public int getSqfilesize() {
                return sqfilesize;
            }

            public void setSqfilesize(int sqfilesize) {
                this.sqfilesize = sqfilesize;
            }
        }
    }
}

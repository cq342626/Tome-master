package com.example.tome_master.bean.music;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 时间 ：2017/11/22  11:31
 * 作者 ：陈奇
 * 作用 ：
 */
public class MusicRLDBean {

    /**
     * status : 1
     * error :
     * data : {"timestamp":1511321453,"info":[{"pay_type_320":0,"m4afilesize":0,"price_sq":0,"first":0,"filesize":3015727,"bitrate":128,"price":0,"inlist":1,"old_cpy":1,"pkg_price_sq":0,"pay_type":0,"topic_url":"","rp_type":"audio","pkg_price":0,"recommend_reason":"","filename":"GAI - 菜商卡头和车手【巨额来电电影主题曲】","price_320":0,"extname":"mp3","hash":"A32C1B4CEE3B49086024E5A0887F3BA8","audio_id":34723446,"privilege":0,"topic_url_320":"","addtime":"2017-11-22 09:55:02","pkg_price_320":0,"sqfilesize":0,"fail_process_320":0,"duration":188,"feetype":0,"320filesize":7538880,"rp_publish":1,"has_accompany":0,"topic_url_sq":"","remark":"《巨额来电》电影主题曲","isfirst":0,"sqhash":"","320privilege":0,"320hash":"1FC32C7833F8ECA14FF1E6A702D85E02","fail_process":0,"album_id":"7544892","pay_type_sq":0,"mvhash":"","sqprivilege":0,"album_audio_id":101825820,"fail_process_sq":0},{"pay_type_320":0,"m4afilesize":0,"price_sq":0,"first":0,"filesize":3165203,"bitrate":128,"price":0,"inlist":1,"old_cpy":1,"pkg_price_sq":0,"pay_type":0,"topic_url":"","rp_type":"audio","pkg_price":0,"recommend_reason":"","filename":"蓝梦 - 爱火","price_320":0,"extname":"mp3","hash":"A5FF87CA51EC51548F3FA02CB7BD971E","audio_id":20615176,"privilege":0,"topic_url_320":"","addtime":"2017-11-22 09:55:02","pkg_price_320":0,"sqfilesize":0,"fail_process_320":0,"duration":198,"feetype":0,"320filesize":7911302,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","remark":"爱火","isfirst":0,"sqhash":"","320privilege":0,"320hash":"2435CFE39DDA592CC011EC8CA2CB1AF5","fail_process":0,"album_id":"1543055","pay_type_sq":0,"mvhash":"","sqprivilege":0,"album_audio_id":37836425,"fail_process_sq":0},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"first":0,"filesize":4057903,"bitrate":128,"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","rp_type":"audio","pkg_price":1,"recommend_reason":"","filename":"王源 - 骄傲","price_320":200,"extname":"mp3","hash":"910A12734FB197B96FFFB4B55E3719E0","audio_id":34532063,"privilege":8,"topic_url_320":"","addtime":"2017-11-22 09:55:02","pkg_price_320":1,"sqfilesize":24875819,"fail_process_320":4,"duration":253,"feetype":0,"320filesize":10144320,"rp_publish":1,"has_accompany":0,"topic_url_sq":"","remark":"骄傲","isfirst":0,"sqhash":"7FEDD8FAA1763E255953A02F15B26F8F","320privilege":10,"320hash":"B6749B36E365F2AC9AE1A419FFC64810","fail_process":4,"album_id":"7439082","pay_type_sq":3,"mvhash":"","sqprivilege":10,"album_audio_id":101383238,"fail_process_sq":4}],"total":100}
     * errcode : 0
     */

    private int status;
    private String error;
    /**
     * timestamp : 1511321453
     * info : [{"pay_type_320":0,"m4afilesize":0,"price_sq":0,"first":0,"filesize":3015727,"bitrate":128,"price":0,"inlist":1,"old_cpy":1,"pkg_price_sq":0,"pay_type":0,"topic_url":"","rp_type":"audio","pkg_price":0,"recommend_reason":"","filename":"GAI - 菜商卡头和车手【巨额来电电影主题曲】","price_320":0,"extname":"mp3","hash":"A32C1B4CEE3B49086024E5A0887F3BA8","audio_id":34723446,"privilege":0,"topic_url_320":"","addtime":"2017-11-22 09:55:02","pkg_price_320":0,"sqfilesize":0,"fail_process_320":0,"duration":188,"feetype":0,"320filesize":7538880,"rp_publish":1,"has_accompany":0,"topic_url_sq":"","remark":"《巨额来电》电影主题曲","isfirst":0,"sqhash":"","320privilege":0,"320hash":"1FC32C7833F8ECA14FF1E6A702D85E02","fail_process":0,"album_id":"7544892","pay_type_sq":0,"mvhash":"","sqprivilege":0,"album_audio_id":101825820,"fail_process_sq":0},{"pay_type_320":0,"m4afilesize":0,"price_sq":0,"first":0,"filesize":3165203,"bitrate":128,"price":0,"inlist":1,"old_cpy":1,"pkg_price_sq":0,"pay_type":0,"topic_url":"","rp_type":"audio","pkg_price":0,"recommend_reason":"","filename":"蓝梦 - 爱火","price_320":0,"extname":"mp3","hash":"A5FF87CA51EC51548F3FA02CB7BD971E","audio_id":20615176,"privilege":0,"topic_url_320":"","addtime":"2017-11-22 09:55:02","pkg_price_320":0,"sqfilesize":0,"fail_process_320":0,"duration":198,"feetype":0,"320filesize":7911302,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","remark":"爱火","isfirst":0,"sqhash":"","320privilege":0,"320hash":"2435CFE39DDA592CC011EC8CA2CB1AF5","fail_process":0,"album_id":"1543055","pay_type_sq":0,"mvhash":"","sqprivilege":0,"album_audio_id":37836425,"fail_process_sq":0},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"first":0,"filesize":4057903,"bitrate":128,"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","rp_type":"audio","pkg_price":1,"recommend_reason":"","filename":"王源 - 骄傲","price_320":200,"extname":"mp3","hash":"910A12734FB197B96FFFB4B55E3719E0","audio_id":34532063,"privilege":8,"topic_url_320":"","addtime":"2017-11-22 09:55:02","pkg_price_320":1,"sqfilesize":24875819,"fail_process_320":4,"duration":253,"feetype":0,"320filesize":10144320,"rp_publish":1,"has_accompany":0,"topic_url_sq":"","remark":"骄傲","isfirst":0,"sqhash":"7FEDD8FAA1763E255953A02F15B26F8F","320privilege":10,"320hash":"B6749B36E365F2AC9AE1A419FFC64810","fail_process":4,"album_id":"7439082","pay_type_sq":3,"mvhash":"","sqprivilege":10,"album_audio_id":101383238,"fail_process_sq":4}]
     * total : 100
     */

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
         * first : 0
         * filesize : 3015727
         * bitrate : 128
         * price : 0
         * inlist : 1
         * old_cpy : 1
         * pkg_price_sq : 0
         * pay_type : 0
         * topic_url :
         * rp_type : audio
         * pkg_price : 0
         * recommend_reason :
         * filename : GAI - 菜商卡头和车手【巨额来电电影主题曲】
         * price_320 : 0
         * extname : mp3
         * hash : A32C1B4CEE3B49086024E5A0887F3BA8
         * audio_id : 34723446
         * privilege : 0
         * topic_url_320 :
         * addtime : 2017-11-22 09:55:02
         * pkg_price_320 : 0
         * sqfilesize : 0
         * fail_process_320 : 0
         * duration : 188
         * feetype : 0
         * 320filesize : 7538880
         * rp_publish : 1
         * has_accompany : 0
         * topic_url_sq :
         * remark : 《巨额来电》电影主题曲
         * isfirst : 0
         * sqhash :
         * 320privilege : 0
         * 320hash : 1FC32C7833F8ECA14FF1E6A702D85E02
         * fail_process : 0
         * album_id : 7544892
         * pay_type_sq : 0
         * mvhash :
         * sqprivilege : 0
         * album_audio_id : 101825820
         * fail_process_sq : 0
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
            private int first;
            private int filesize;
            private int bitrate;
            private int price;
            private int inlist;
            private int old_cpy;
            private int pkg_price_sq;
            private int pay_type;
            private String topic_url;
            private String rp_type;
            private int pkg_price;
            private String recommend_reason;
            private String filename;
            private int price_320;
            private String extname;
            private String hash;
            private int audio_id;
            private int privilege;
            private String topic_url_320;
            private String addtime;
            private int pkg_price_320;
            private int sqfilesize;
            private int fail_process_320;
            private int duration;
            private int feetype;
            @SerializedName("320filesize")
            private int value320filesize;
            private int rp_publish;
            private int has_accompany;
            private String topic_url_sq;
            private String remark;
            private int isfirst;
            private String sqhash;
            @SerializedName("320privilege")
            private int value320privilege;
            @SerializedName("320hash")
            private String value320hash;
            private int fail_process;
            private String album_id;
            private int pay_type_sq;
            private String mvhash;
            private int sqprivilege;
            private int album_audio_id;
            private int fail_process_sq;

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

            public int getFirst() {
                return first;
            }

            public void setFirst(int first) {
                this.first = first;
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

            public String getRp_type() {
                return rp_type;
            }

            public void setRp_type(String rp_type) {
                this.rp_type = rp_type;
            }

            public int getPkg_price() {
                return pkg_price;
            }

            public void setPkg_price(int pkg_price) {
                this.pkg_price = pkg_price;
            }

            public String getRecommend_reason() {
                return recommend_reason;
            }

            public void setRecommend_reason(String recommend_reason) {
                this.recommend_reason = recommend_reason;
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

            public int getAudio_id() {
                return audio_id;
            }

            public void setAudio_id(int audio_id) {
                this.audio_id = audio_id;
            }

            public int getPrivilege() {
                return privilege;
            }

            public void setPrivilege(int privilege) {
                this.privilege = privilege;
            }

            public String getTopic_url_320() {
                return topic_url_320;
            }

            public void setTopic_url_320(String topic_url_320) {
                this.topic_url_320 = topic_url_320;
            }

            public String getAddtime() {
                return addtime;
            }

            public void setAddtime(String addtime) {
                this.addtime = addtime;
            }

            public int getPkg_price_320() {
                return pkg_price_320;
            }

            public void setPkg_price_320(int pkg_price_320) {
                this.pkg_price_320 = pkg_price_320;
            }

            public int getSqfilesize() {
                return sqfilesize;
            }

            public void setSqfilesize(int sqfilesize) {
                this.sqfilesize = sqfilesize;
            }

            public int getFail_process_320() {
                return fail_process_320;
            }

            public void setFail_process_320(int fail_process_320) {
                this.fail_process_320 = fail_process_320;
            }

            public int getDuration() {
                return duration;
            }

            public void setDuration(int duration) {
                this.duration = duration;
            }

            public int getFeetype() {
                return feetype;
            }

            public void setFeetype(int feetype) {
                this.feetype = feetype;
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

            public int getHas_accompany() {
                return has_accompany;
            }

            public void setHas_accompany(int has_accompany) {
                this.has_accompany = has_accompany;
            }

            public String getTopic_url_sq() {
                return topic_url_sq;
            }

            public void setTopic_url_sq(String topic_url_sq) {
                this.topic_url_sq = topic_url_sq;
            }

            public String getRemark() {
                return remark;
            }

            public void setRemark(String remark) {
                this.remark = remark;
            }

            public int getIsfirst() {
                return isfirst;
            }

            public void setIsfirst(int isfirst) {
                this.isfirst = isfirst;
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

            public String getValue320hash() {
                return value320hash;
            }

            public void setValue320hash(String value320hash) {
                this.value320hash = value320hash;
            }

            public int getFail_process() {
                return fail_process;
            }

            public void setFail_process(int fail_process) {
                this.fail_process = fail_process;
            }

            public String getAlbum_id() {
                return album_id;
            }

            public void setAlbum_id(String album_id) {
                this.album_id = album_id;
            }

            public int getPay_type_sq() {
                return pay_type_sq;
            }

            public void setPay_type_sq(int pay_type_sq) {
                this.pay_type_sq = pay_type_sq;
            }

            public String getMvhash() {
                return mvhash;
            }

            public void setMvhash(String mvhash) {
                this.mvhash = mvhash;
            }

            public int getSqprivilege() {
                return sqprivilege;
            }

            public void setSqprivilege(int sqprivilege) {
                this.sqprivilege = sqprivilege;
            }

            public int getAlbum_audio_id() {
                return album_audio_id;
            }

            public void setAlbum_audio_id(int album_audio_id) {
                this.album_audio_id = album_audio_id;
            }

            public int getFail_process_sq() {
                return fail_process_sq;
            }

            public void setFail_process_sq(int fail_process_sq) {
                this.fail_process_sq = fail_process_sq;
            }
        }
    }
}

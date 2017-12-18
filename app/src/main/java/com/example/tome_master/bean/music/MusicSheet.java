package com.example.tome_master.bean.music;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 时间 ：2017/11/29  17:38
 * 作者 ：陈奇
 * 作用 ：
 */
public class MusicSheet {

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
            private int recommendfirst;
            private String specialname; // 歌单的简介
            private String intro;
            private int suid;
            private int is_selected;
            private String selected_reason;
            private int slid;
            private String publishtime; // 刷新的时间
            private String singername;
            private int verified;
            private int songcount;
            private String user_avatar;// 上传歌单用户的头像
            private int user_type;
            private String imgurl; // 歌单封面图片
            private int specialid; // 歌单id
            private String username;// 上传歌单的用户名
            private int collectcount;
            private int playcount;// 听过的次数
            private List<SongsBean> songs;

            public int getRecommendfirst() {
                return recommendfirst;
            }

            public void setRecommendfirst(int recommendfirst) {
                this.recommendfirst = recommendfirst;
            }

            public String getSpecialname() {
                return specialname;
            }

            public void setSpecialname(String specialname) {
                this.specialname = specialname;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public int getSuid() {
                return suid;
            }

            public void setSuid(int suid) {
                this.suid = suid;
            }

            public int getIs_selected() {
                return is_selected;
            }

            public void setIs_selected(int is_selected) {
                this.is_selected = is_selected;
            }

            public String getSelected_reason() {
                return selected_reason;
            }

            public void setSelected_reason(String selected_reason) {
                this.selected_reason = selected_reason;
            }

            public int getSlid() {
                return slid;
            }

            public void setSlid(int slid) {
                this.slid = slid;
            }

            public String getPublishtime() {
                return publishtime;
            }

            public void setPublishtime(String publishtime) {
                this.publishtime = publishtime;
            }

            public String getSingername() {
                return singername;
            }

            public void setSingername(String singername) {
                this.singername = singername;
            }

            public int getVerified() {
                return verified;
            }

            public void setVerified(int verified) {
                this.verified = verified;
            }

            public int getSongcount() {
                return songcount;
            }

            public void setSongcount(int songcount) {
                this.songcount = songcount;
            }

            public String getUser_avatar() {
                return user_avatar;
            }

            public void setUser_avatar(String user_avatar) {
                this.user_avatar = user_avatar;
            }

            public int getUser_type() {
                return user_type;
            }

            public void setUser_type(int user_type) {
                this.user_type = user_type;
            }

            public String getImgurl() {
                return imgurl;
            }

            public void setImgurl(String imgurl) {
                this.imgurl = imgurl;
            }

            public int getSpecialid() {
                return specialid;
            }

            public void setSpecialid(int specialid) {
                this.specialid = specialid;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public int getCollectcount() {
                return collectcount;
            }

            public void setCollectcount(int collectcount) {
                this.collectcount = collectcount;
            }

            public int getPlaycount() {
                return playcount;
            }

            public void setPlaycount(int playcount) {
                this.playcount = playcount;
            }

            public List<SongsBean> getSongs() {
                return songs;
            }

            public void setSongs(List<SongsBean> songs) {
                this.songs = songs;
            }

            public static class SongsBean {
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
                private int album_audio_id;
                @SerializedName("320hash")
                private String value320hash;
                private int sqfilesize;
                private String album_id;
                @SerializedName("320filesize")
                private int value320filesize;
                private int rp_publish;
                private int duration;
                private String topic_url_sq;
                private int audio_id;
                private String remark;
                private String topic_url_320;
                @SerializedName("320privilege")
                private int value320privilege;
                private int has_accompany;
                private int fail_process_sq;
                private int fail_process;
                private int pay_type_sq;
                private String rp_type;
                private int sqprivilege;
                private String sqhash;
                private int pkg_price_320;

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

                public int getAlbum_audio_id() {
                    return album_audio_id;
                }

                public void setAlbum_audio_id(int album_audio_id) {
                    this.album_audio_id = album_audio_id;
                }

                public String getValue320hash() {
                    return value320hash;
                }

                public void setValue320hash(String value320hash) {
                    this.value320hash = value320hash;
                }

                public int getSqfilesize() {
                    return sqfilesize;
                }

                public void setSqfilesize(int sqfilesize) {
                    this.sqfilesize = sqfilesize;
                }

                public String getAlbum_id() {
                    return album_id;
                }

                public void setAlbum_id(String album_id) {
                    this.album_id = album_id;
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

                public int getAudio_id() {
                    return audio_id;
                }

                public void setAudio_id(int audio_id) {
                    this.audio_id = audio_id;
                }

                public String getRemark() {
                    return remark;
                }

                public void setRemark(String remark) {
                    this.remark = remark;
                }

                public String getTopic_url_320() {
                    return topic_url_320;
                }

                public void setTopic_url_320(String topic_url_320) {
                    this.topic_url_320 = topic_url_320;
                }

                public int getValue320privilege() {
                    return value320privilege;
                }

                public void setValue320privilege(int value320privilege) {
                    this.value320privilege = value320privilege;
                }

                public int getHas_accompany() {
                    return has_accompany;
                }

                public void setHas_accompany(int has_accompany) {
                    this.has_accompany = has_accompany;
                }

                public int getFail_process_sq() {
                    return fail_process_sq;
                }

                public void setFail_process_sq(int fail_process_sq) {
                    this.fail_process_sq = fail_process_sq;
                }

                public int getFail_process() {
                    return fail_process;
                }

                public void setFail_process(int fail_process) {
                    this.fail_process = fail_process;
                }

                public int getPay_type_sq() {
                    return pay_type_sq;
                }

                public void setPay_type_sq(int pay_type_sq) {
                    this.pay_type_sq = pay_type_sq;
                }

                public String getRp_type() {
                    return rp_type;
                }

                public void setRp_type(String rp_type) {
                    this.rp_type = rp_type;
                }

                public int getSqprivilege() {
                    return sqprivilege;
                }

                public void setSqprivilege(int sqprivilege) {
                    this.sqprivilege = sqprivilege;
                }

                public String getSqhash() {
                    return sqhash;
                }

                public void setSqhash(String sqhash) {
                    this.sqhash = sqhash;
                }

                public int getPkg_price_320() {
                    return pkg_price_320;
                }

                public void setPkg_price_320(int pkg_price_320) {
                    this.pkg_price_320 = pkg_price_320;
                }
            }
        }
    }
}

package com.example.tome_master.bean.music;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 时间 ：2017/12/8  9:39
 * 作者 ：陈奇
 * 作用 ：歌单信息
 */
public class MusicSheetDetails {

    private int JS_CSS_DATE;
    private String kg_domain;
    private String src;
    private Object fr;
    private String ver;
    private ListBean list;
    private InfoBean info;
    private int pagesize;
    private String __Tpl;

    public int getJS_CSS_DATE() {
        return JS_CSS_DATE;
    }

    public void setJS_CSS_DATE(int JS_CSS_DATE) {
        this.JS_CSS_DATE = JS_CSS_DATE;
    }

    public String getKg_domain() {
        return kg_domain;
    }

    public void setKg_domain(String kg_domain) {
        this.kg_domain = kg_domain;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public Object getFr() {
        return fr;
    }

    public void setFr(Object fr) {
        this.fr = fr;
    }

    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }

    public ListBean getList() {
        return list;
    }

    public void setList(ListBean list) {
        this.list = list;
    }

    public InfoBean getInfo() {
        return info;
    }

    public void setInfo(InfoBean info) {
        this.info = info;
    }

    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }

    public String get__Tpl() {
        return __Tpl;
    }

    public void set__Tpl(String __Tpl) {
        this.__Tpl = __Tpl;
    }

    public static class ListBean {

        private LListBean list;
        private int pagesize;
        private int page;

        public LListBean getList() {
            return list;
        }

        public void setList(LListBean list) {
            this.list = list;
        }

        public int getPagesize() {
            return pagesize;
        }

        public void setPagesize(int pagesize) {
            this.pagesize = pagesize;
        }

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public static class LListBean {
            private int timestamp;
            private int total;
            private List<MessageInfo> info;

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

            public List<MessageInfo> getInfo() {
                return info;
            }

            public void setInfo(List<MessageInfo> info) {
                this.info = info;
            }

            public static class MessageInfo{

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

    public static class InfoBean {
        /**
         * specialname : 跨界也疯狂 合辑
         * nickname : 被美貌耽误的大咖
         * publishtime : 2017-11-16 00:00:00
         * singername :
         * intro : 11月16日起每周四19：00，全网首档cos直播综艺秀《跨界也疯狂》全新上线，主持人郭涛，刘维、洪辰、王文博、李斯丹妮担任明星队长，脑洞大开带队素人首度挑战cosplay玩出另类音乐真人秀，并翻玩当红综艺节目，选手经历重重音乐考验，最终冠军将获得酷狗独家打造的专属EP及超百万推广资源。
         * songcount : 43
         * imgurl : http://imge.kugou.com/soft/collection/{size}/20171122/20171122141635436125.jpg
         * tags : [{"tagname":"流行","tagid":9},{"tagname":"综艺","tagid":80},{"tagname":"国语","tagid":84}]
         * suid : 915407539
         * specialid : 204626
         * playcount : 1598771
         * collectcount : 7652
         * slid : 5
         */

        private InfoListBean list;

        public InfoListBean getList() {
            return list;
        }

        public void setList(InfoListBean list) {
            this.list = list;
        }

        public static class InfoListBean {
            private String specialname;
            private String nickname;
            private String publishtime;
            private String singername;
            private String intro;
            private int songcount;
            private String imgurl;
            private int suid;
            private int specialid;
            private int playcount;
            private int collectcount;
            private int slid;
            /**
             * tagname : 流行
             * tagid : 9
             */

            private List<TagsBean> tags;

            public String getSpecialname() {
                return specialname;
            }

            public void setSpecialname(String specialname) {
                this.specialname = specialname;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
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

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public int getSongcount() {
                return songcount;
            }

            public void setSongcount(int songcount) {
                this.songcount = songcount;
            }

            public String getImgurl() {
                return imgurl;
            }

            public void setImgurl(String imgurl) {
                this.imgurl = imgurl;
            }

            public int getSuid() {
                return suid;
            }

            public void setSuid(int suid) {
                this.suid = suid;
            }

            public int getSpecialid() {
                return specialid;
            }

            public void setSpecialid(int specialid) {
                this.specialid = specialid;
            }

            public int getPlaycount() {
                return playcount;
            }

            public void setPlaycount(int playcount) {
                this.playcount = playcount;
            }

            public int getCollectcount() {
                return collectcount;
            }

            public void setCollectcount(int collectcount) {
                this.collectcount = collectcount;
            }

            public int getSlid() {
                return slid;
            }

            public void setSlid(int slid) {
                this.slid = slid;
            }

            public List<TagsBean> getTags() {
                return tags;
            }

            public void setTags(List<TagsBean> tags) {
                this.tags = tags;
            }

            public static class TagsBean {
                private String tagname;
                private int tagid;

                public String getTagname() {
                    return tagname;
                }

                public void setTagname(String tagname) {
                    this.tagname = tagname;
                }

                public int getTagid() {
                    return tagid;
                }

                public void setTagid(int tagid) {
                    this.tagid = tagid;
                }
            }
        }
    }
}

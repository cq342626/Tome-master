package com.example.tome_master.bean.music;

import java.util.List;

/**
 * 时间 ：2017/12/12  14:49
 * 作者 ：陈奇
 * 作用 ：歌手类型
 */
public class MusicSongerType {

    private int JS_CSS_DATE;
    private String kg_domain;
    private String src;
    private Object fr;
    private String ver;
    private String __Tpl;
    /**
     * classid : 88
     * classname : 热门歌手
     * imgurl : http://mobileimg.kugou.com/billImage/150/26-11.jpg
     */

    private List<ListBean> list;

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

    public String get__Tpl() {
        return __Tpl;
    }

    public void set__Tpl(String __Tpl) {
        this.__Tpl = __Tpl;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        private int classid;
        private String classname;
        private String imgurl;

        public int getClassid() {
            return classid;
        }

        public void setClassid(int classid) {
            this.classid = classid;
        }

        public String getClassname() {
            return classname;
        }

        public void setClassname(String classname) {
            this.classname = classname;
        }

        public String getImgurl() {
            return imgurl;
        }

        public void setImgurl(String imgurl) {
            this.imgurl = imgurl;
        }
    }
}

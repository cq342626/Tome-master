package com.example.tome_master.bean.picture;

/**
 * 时间 ：2017/11/16  10:35
 * 作者 ：陈奇
 * 作用 ：
 */
public class PictureList {

    /**
     * id : 13826
     * title : 【强强人像】角落里的聆听，寻找那些过往
     * ctime : 0
     * imgcount : 14
     * imgurl : http://images.seqier.com/2017032918/58db8f501ca19.jpg?imageView2/2/w/240/q/75|imageslim
     */

    private int id;
    private String title;
    private int ctime;
    private int imgcount;
    private String imgurl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCtime() {
        return ctime;
    }

    public void setCtime(int ctime) {
        this.ctime = ctime;
    }

    public int getImgcount() {
        return imgcount;
    }

    public void setImgcount(int imgcount) {
        this.imgcount = imgcount;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }
}

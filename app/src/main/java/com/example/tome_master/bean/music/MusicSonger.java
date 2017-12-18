package com.example.tome_master.bean.music;

import java.util.List;

/**
 * 时间 ：2017/12/12  17:14
 * 作者 ：陈奇
 * 作用 ：分类下的歌手
 */
public class MusicSonger {

    /**
     * JS_CSS_DATE : 20130320
     * kg_domain : http://m.kugou.com
     * src : http://downmobile.kugou.com/promote/package/download/channel=6
     * fr : null
     * ver : v3
     * classid : 88
     * classname : 热门歌手
     * singers : {"total":50,"list":{"total":50,"info":[{"singerid":3060,"singername":"薛之谦","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170713/20170713161536456.jpg"},{"singerid":3520,"singername":"周杰伦","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20171026/20171026100450393.jpg"},{"singerid":1574,"singername":"林俊杰","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20161209/20161209164303152140.jpg"},{"singerid":3521,"singername":"张学友","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20140527/20140527095042283066.jpg"},{"singerid":722869,"singername":"毛不易","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170810/20170810163234456.jpg"},{"singerid":730,"singername":"刀郎","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20140520/20140520101227819989.jpg"},{"singerid":93723,"singername":"TFBOYS","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170810/20170810103307128.jpg"},{"singerid":3539,"singername":"张杰","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170111/20170111104600449.jpg"},{"singerid":1573,"singername":"刘德华","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20140218/20140218175057634765.jpg"},{"singerid":86281,"singername":"庄心妍","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170908/20170908135504172.jpg"},{"singerid":420,"singername":"陈奕迅","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170807/20170807145802238.jpg"},{"singerid":173452,"singername":"鹿晗","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170712/20170712163421624.jpg"},{"singerid":1383,"singername":"黄家驹","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20140219/20140219104100727871.jpg"},{"singerid":3538,"singername":"郑源","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160418/20160418100508296.jpg"},{"singerid":1900,"singername":"冷漠","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160422/20160422165257968614.jpg"},{"singerid":7633,"singername":"凤凰传奇","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170602/20170602084928427.jpg"},{"singerid":7249,"singername":"Beyond","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160418/20160418100531196.jpg"},{"singerid":2725,"singername":"王杰","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160910/20160910145826790.jpg"},{"singerid":5838,"singername":"孙露","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170221/20170221154248275887.jpg"},{"singerid":90875,"singername":"华晨宇","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20161107/20161107114457862.jpg"},{"singerid":174915,"singername":"MC天佑","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170417/20170417153759796.jpg"},{"singerid":4490,"singername":"G.E.M.邓紫棋","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20161206/20161206150644553.jpg"},{"singerid":6809,"singername":"张惠妹","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20161228/20161228122748908272.jpg"},{"singerid":93475,"singername":"李荣浩","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20171113/20171113194022279.jpg"},{"singerid":2726,"singername":"汪峰","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170331/20170331235553531.jpg"},{"singerid":3537,"singername":"张宇","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20140409/20140409111100508089.jpg"},{"singerid":2724,"singername":"王力宏","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170602/20170602104911895.jpg"},{"singerid":169966,"singername":"张碧晨","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170106/20170106171217388.jpg"},{"singerid":761096,"singername":"花姐","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20171128/20171128003758522.jpg"},{"singerid":6808,"singername":"张靓颖","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170628/20170628110356447.jpg"},{"singerid":3047,"singername":"许嵩","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20150108/20150108174616117572.jpg"},{"singerid":1960,"singername":"六哲","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170918/20170918155846723754.jpg"},{"singerid":84746,"singername":"祁隆","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160908/20160908122327220.jpg"},{"singerid":4484,"singername":"邓丽君","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20140118/20140118112603422807.jpg"},{"singerid":3523,"singername":"张国荣","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160909/20160909203241500.jpg"},{"singerid":3525,"singername":"张信哲","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160627/20160627151133261295.jpg"},{"singerid":1485,"singername":"汪苏泷","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170412/20170412162146478.jpg"},{"singerid":2627,"singername":"谭咏麟","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20161206/20161206191326535303.jpg"},{"singerid":6076,"singername":"王菲","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170807/20170807153108239.jpg"},{"singerid":6847,"singername":"卓依婷","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20171106/20171106184316860.jpg"},{"singerid":84161,"singername":"BIGBANG","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170704/20170704172442730.jpg"},{"singerid":724766,"singername":"缝纫机乐队","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170928/20170928233712987.jpg"},{"singerid":86899,"singername":"戴荃","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160408/20160408160520202665.jpg"},{"singerid":284905,"singername":"7妹","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160721/20160721155122819019.jpg"},{"singerid":4260,"singername":"陈瑞","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170718/20170718115144244177.jpg"},{"singerid":5086,"singername":"刘若英","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160418/20160418100516109.jpg"},{"singerid":2404,"singername":"任贤齐","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20161121/20161121143819177813.jpg"},{"singerid":168003,"singername":"易烊千玺","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170711/20170711120436898.jpg"},{"singerid":91839,"singername":"张艺兴","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160711/20160711155338814080.jpg"},{"singerid":5095,"singername":"降央卓玛","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160717/20160717170539668181.jpg"}]},"pagesize":50,"page":1}
     * pagesize : 30
     * __Tpl : singer/list.html
     */

    private int JS_CSS_DATE;
    private String kg_domain;
    private String src;
    private Object fr;
    private String ver;
    private int classid;
    private String classname;
    /**
     * total : 50
     * list : {"total":50,"info":[{"singerid":3060,"singername":"薛之谦","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170713/20170713161536456.jpg"},{"singerid":3520,"singername":"周杰伦","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20171026/20171026100450393.jpg"},{"singerid":1574,"singername":"林俊杰","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20161209/20161209164303152140.jpg"},{"singerid":3521,"singername":"张学友","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20140527/20140527095042283066.jpg"},{"singerid":722869,"singername":"毛不易","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170810/20170810163234456.jpg"},{"singerid":730,"singername":"刀郎","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20140520/20140520101227819989.jpg"},{"singerid":93723,"singername":"TFBOYS","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170810/20170810103307128.jpg"},{"singerid":3539,"singername":"张杰","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170111/20170111104600449.jpg"},{"singerid":1573,"singername":"刘德华","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20140218/20140218175057634765.jpg"},{"singerid":86281,"singername":"庄心妍","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170908/20170908135504172.jpg"},{"singerid":420,"singername":"陈奕迅","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170807/20170807145802238.jpg"},{"singerid":173452,"singername":"鹿晗","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170712/20170712163421624.jpg"},{"singerid":1383,"singername":"黄家驹","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20140219/20140219104100727871.jpg"},{"singerid":3538,"singername":"郑源","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160418/20160418100508296.jpg"},{"singerid":1900,"singername":"冷漠","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160422/20160422165257968614.jpg"},{"singerid":7633,"singername":"凤凰传奇","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170602/20170602084928427.jpg"},{"singerid":7249,"singername":"Beyond","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160418/20160418100531196.jpg"},{"singerid":2725,"singername":"王杰","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160910/20160910145826790.jpg"},{"singerid":5838,"singername":"孙露","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170221/20170221154248275887.jpg"},{"singerid":90875,"singername":"华晨宇","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20161107/20161107114457862.jpg"},{"singerid":174915,"singername":"MC天佑","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170417/20170417153759796.jpg"},{"singerid":4490,"singername":"G.E.M.邓紫棋","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20161206/20161206150644553.jpg"},{"singerid":6809,"singername":"张惠妹","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20161228/20161228122748908272.jpg"},{"singerid":93475,"singername":"李荣浩","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20171113/20171113194022279.jpg"},{"singerid":2726,"singername":"汪峰","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170331/20170331235553531.jpg"},{"singerid":3537,"singername":"张宇","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20140409/20140409111100508089.jpg"},{"singerid":2724,"singername":"王力宏","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170602/20170602104911895.jpg"},{"singerid":169966,"singername":"张碧晨","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170106/20170106171217388.jpg"},{"singerid":761096,"singername":"花姐","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20171128/20171128003758522.jpg"},{"singerid":6808,"singername":"张靓颖","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170628/20170628110356447.jpg"},{"singerid":3047,"singername":"许嵩","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20150108/20150108174616117572.jpg"},{"singerid":1960,"singername":"六哲","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170918/20170918155846723754.jpg"},{"singerid":84746,"singername":"祁隆","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160908/20160908122327220.jpg"},{"singerid":4484,"singername":"邓丽君","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20140118/20140118112603422807.jpg"},{"singerid":3523,"singername":"张国荣","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160909/20160909203241500.jpg"},{"singerid":3525,"singername":"张信哲","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160627/20160627151133261295.jpg"},{"singerid":1485,"singername":"汪苏泷","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170412/20170412162146478.jpg"},{"singerid":2627,"singername":"谭咏麟","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20161206/20161206191326535303.jpg"},{"singerid":6076,"singername":"王菲","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170807/20170807153108239.jpg"},{"singerid":6847,"singername":"卓依婷","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20171106/20171106184316860.jpg"},{"singerid":84161,"singername":"BIGBANG","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170704/20170704172442730.jpg"},{"singerid":724766,"singername":"缝纫机乐队","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170928/20170928233712987.jpg"},{"singerid":86899,"singername":"戴荃","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160408/20160408160520202665.jpg"},{"singerid":284905,"singername":"7妹","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160721/20160721155122819019.jpg"},{"singerid":4260,"singername":"陈瑞","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170718/20170718115144244177.jpg"},{"singerid":5086,"singername":"刘若英","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160418/20160418100516109.jpg"},{"singerid":2404,"singername":"任贤齐","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20161121/20161121143819177813.jpg"},{"singerid":168003,"singername":"易烊千玺","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170711/20170711120436898.jpg"},{"singerid":91839,"singername":"张艺兴","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160711/20160711155338814080.jpg"},{"singerid":5095,"singername":"降央卓玛","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160717/20160717170539668181.jpg"}]}
     * pagesize : 50
     * page : 1
     */

    private SingersBean singers;
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

    public SingersBean getSingers() {
        return singers;
    }

    public void setSingers(SingersBean singers) {
        this.singers = singers;
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

    public static class SingersBean {
        private int total;
        /**
         * total : 50
         * info : [{"singerid":3060,"singername":"薛之谦","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170713/20170713161536456.jpg"},{"singerid":3520,"singername":"周杰伦","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20171026/20171026100450393.jpg"},{"singerid":1574,"singername":"林俊杰","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20161209/20161209164303152140.jpg"},{"singerid":3521,"singername":"张学友","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20140527/20140527095042283066.jpg"},{"singerid":722869,"singername":"毛不易","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170810/20170810163234456.jpg"},{"singerid":730,"singername":"刀郎","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20140520/20140520101227819989.jpg"},{"singerid":93723,"singername":"TFBOYS","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170810/20170810103307128.jpg"},{"singerid":3539,"singername":"张杰","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170111/20170111104600449.jpg"},{"singerid":1573,"singername":"刘德华","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20140218/20140218175057634765.jpg"},{"singerid":86281,"singername":"庄心妍","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170908/20170908135504172.jpg"},{"singerid":420,"singername":"陈奕迅","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170807/20170807145802238.jpg"},{"singerid":173452,"singername":"鹿晗","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170712/20170712163421624.jpg"},{"singerid":1383,"singername":"黄家驹","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20140219/20140219104100727871.jpg"},{"singerid":3538,"singername":"郑源","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160418/20160418100508296.jpg"},{"singerid":1900,"singername":"冷漠","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160422/20160422165257968614.jpg"},{"singerid":7633,"singername":"凤凰传奇","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170602/20170602084928427.jpg"},{"singerid":7249,"singername":"Beyond","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160418/20160418100531196.jpg"},{"singerid":2725,"singername":"王杰","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160910/20160910145826790.jpg"},{"singerid":5838,"singername":"孙露","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170221/20170221154248275887.jpg"},{"singerid":90875,"singername":"华晨宇","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20161107/20161107114457862.jpg"},{"singerid":174915,"singername":"MC天佑","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170417/20170417153759796.jpg"},{"singerid":4490,"singername":"G.E.M.邓紫棋","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20161206/20161206150644553.jpg"},{"singerid":6809,"singername":"张惠妹","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20161228/20161228122748908272.jpg"},{"singerid":93475,"singername":"李荣浩","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20171113/20171113194022279.jpg"},{"singerid":2726,"singername":"汪峰","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170331/20170331235553531.jpg"},{"singerid":3537,"singername":"张宇","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20140409/20140409111100508089.jpg"},{"singerid":2724,"singername":"王力宏","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170602/20170602104911895.jpg"},{"singerid":169966,"singername":"张碧晨","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170106/20170106171217388.jpg"},{"singerid":761096,"singername":"花姐","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20171128/20171128003758522.jpg"},{"singerid":6808,"singername":"张靓颖","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170628/20170628110356447.jpg"},{"singerid":3047,"singername":"许嵩","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20150108/20150108174616117572.jpg"},{"singerid":1960,"singername":"六哲","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170918/20170918155846723754.jpg"},{"singerid":84746,"singername":"祁隆","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160908/20160908122327220.jpg"},{"singerid":4484,"singername":"邓丽君","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20140118/20140118112603422807.jpg"},{"singerid":3523,"singername":"张国荣","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160909/20160909203241500.jpg"},{"singerid":3525,"singername":"张信哲","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160627/20160627151133261295.jpg"},{"singerid":1485,"singername":"汪苏泷","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170412/20170412162146478.jpg"},{"singerid":2627,"singername":"谭咏麟","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20161206/20161206191326535303.jpg"},{"singerid":6076,"singername":"王菲","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170807/20170807153108239.jpg"},{"singerid":6847,"singername":"卓依婷","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20171106/20171106184316860.jpg"},{"singerid":84161,"singername":"BIGBANG","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170704/20170704172442730.jpg"},{"singerid":724766,"singername":"缝纫机乐队","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170928/20170928233712987.jpg"},{"singerid":86899,"singername":"戴荃","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160408/20160408160520202665.jpg"},{"singerid":284905,"singername":"7妹","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160721/20160721155122819019.jpg"},{"singerid":4260,"singername":"陈瑞","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170718/20170718115144244177.jpg"},{"singerid":5086,"singername":"刘若英","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160418/20160418100516109.jpg"},{"singerid":2404,"singername":"任贤齐","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20161121/20161121143819177813.jpg"},{"singerid":168003,"singername":"易烊千玺","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170711/20170711120436898.jpg"},{"singerid":91839,"singername":"张艺兴","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160711/20160711155338814080.jpg"},{"singerid":5095,"singername":"降央卓玛","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160717/20160717170539668181.jpg"}]
         */

        private ListBean list;
        private int pagesize;
        private int page;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public ListBean getList() {
            return list;
        }

        public void setList(ListBean list) {
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

        public static class ListBean {
            private int total;
            /**
             * singerid : 3060
             * singername : 薛之谦
             * imgurl : http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170713/20170713161536456.jpg
             */

            private List<InfoBean> info;

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
                private int singerid;
                private String singername;
                private String imgurl;

                public int getSingerid() {
                    return singerid;
                }

                public void setSingerid(int singerid) {
                    this.singerid = singerid;
                }

                public String getSingername() {
                    return singername;
                }

                public void setSingername(String singername) {
                    this.singername = singername;
                }

                public String getImgurl() {
                    return imgurl;
                }

                public void setImgurl(String imgurl) {
                    this.imgurl = imgurl;
                }
            }
        }
    }
}

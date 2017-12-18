package com.example.tome_master.network;

import com.example.tome_master.bean.music.MusicBean;
import com.example.tome_master.bean.music.MusicDetails;
import com.example.tome_master.bean.music.MusicRLDBean;
import com.example.tome_master.bean.music.MusicSheet;
import com.example.tome_master.bean.music.MusicSheetList;
import com.example.tome_master.bean.music.MusicSheetDetails;
import com.example.tome_master.bean.music.MusicSonger;
import com.example.tome_master.bean.music.MusicSongerList;
import com.example.tome_master.bean.music.MusicSongerType;
import com.example.tome_master.bean.picture.BasePicEntity;
import com.example.tome_master.bean.picture.BodyBean;
import com.example.tome_master.bean.picture.PictureList;
import com.example.tome_master.bean.picture.PictureType;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * 时间 ：2017/9/22  15:15
 * 作者 ：陈奇
 * 作用 ：
 */
public interface ApiService {

    /**
     * 图片相关的url开始
     * ******************************************************************************
     */
    @FormUrlEncoded
    @POST("1208-1")
    Observable<BasePicEntity<BodyBean<PictureType>>> getPictureType(@Field("showapi_appid") String showapi_appid,
                                                                    @Field("showapi_test_draft") boolean showapi_test_draft,
                                                                    @Field("showapi_timestamp") String showapi_timestamp,
                                                                    @Field("showapi_sign") String showapi_sign);

    /**
     * https://route.showapi.com/1208-2?
     * page=1&rows=10&showapi_appid=49817&showapi_test_draft=false
     * &showapi_timestamp=20171116101358&type=3
     * <p>
     * &showapi_sign=28a54a755ceeb72c8e31b58f5a382b32
     */
    @FormUrlEncoded
    @POST("1208-2")
    Observable<BasePicEntity<BodyBean<PictureList>>>
    getPictrueList(@Field("page") int page,
                   @Field("rows") int rows,
                   @Field("showapi_appid") String showapi_appid,
                   @Field("showapi_test_draft") boolean showapi_test_draft,
                   @Field("showapi_timestamp") String showapi_timestamp,
                   @Field("type") int type,
                   @Field("showapi_sign") String showapi_sign);


    /**
     * https://route.showapi.com/1208-3?
     * id=13826&
     * showapi_appid=49817&
     * showapi_test_draft=false&
     * showapi_timestamp=20171116145446&
     * showapi_sign=fc54a22db10d5e4a6c8c37abad7f8ee2
     */
    @FormUrlEncoded
    @POST("1208-3")
    Observable<BasePicEntity<BodyBean<String>>> getPictureUrls(
            @Field("id") int id,
            @Field("showapi_appid") String appId,
            @Field("showapi_test_draft") boolean draft,
            @Field("showapi_timestamp") String time,
            @Field("showapi_sign") String sign
    );

    /**
     * 图片相关的url结束
     * <p>
     * ******************************************************************************
     * <p>
     * 音乐相关的url开始
     */
    @GET("api/v3/rank/list?apiver=4&withsong=1&showtype=2&plat=0&parentid=0&version=8352&with_res_tag=1")
    Observable<MusicBean> getRankingList();

    /**
     * 获取排行榜下所有音乐（分页）
     * <p>
     * http://mobilecdn.kugou.com
     * /api/v3/rank/song?
     * ranktype=2&rankid=6666&plat=0&page=1&pagesize=3&version=8352&with_res_tag=1
     */
    @GET("api/v3/rank/song")
    Observable<MusicRLDBean> getMusicRLDBean(@Query("ranktype") int ranktype,
                                             @Query("rankid") int rankid,
                                             @Query("page") int page,
                                             @Query("pagesize") int pagesize,
                                             @Query("plat") int plat,
                                             @Query("version") int version,
                                             @Query("with_res_tag") int with_res_tag);

    /**
     * 获取播放地址
     *
     * @param r
     * @param hash
     * @return
     */
    @GET("yy/index.php")
    Observable<MusicDetails> getMusicDetails(@Query("r") String r,
                                             @Query("hash") String hash);


    /**
     * 获取音乐歌单
     * http://mobilecdn.kugou.com/api/v3/category/special?
     * withsong=1&sort=3&plat=0&ugc=1&page=1&categoryid=0&pagesize=20
     */
    @GET("api/v3/category/special")
    Observable<MusicSheet> getMusicSheet(
            @Query("withsong") int withsong,
            @Query("sort") int sort,
            @Query("plat") int plat,
            @Query("ugc") int ugc,
            @Query("categoryid") int categoryid,
            @Query("page") int page,
            @Query("pagesize") int pagesize);

    /**
     * 歌单列表下的歌曲
     * http://m.kugou.com/plist/list/204626?json=true
     */
    @GET("api/v3/special/song?")
    Observable<MusicSheetList> getMusicSheetDetails(
            @Query("specialid") int specialid,
            @Query("plat") int plat,
            @Query("page") int page,
            @Query("pagesize") int pagesize,
            @Query("version") int version,
            @Query("with_res_tag") int with_res_tag);

    /**
     * 歌单下的音乐列表
     *
     * @param specialid
     * @return
     */
    @GET("plist/list/{specialid}?json=true")
    Observable<MusicSheetDetails> getMusicSheetDetails(@Path("specialid") int specialid);

    /**
     * 歌手分类
     *
     * @return
     */
    @GET("singer/class&json=true")
    Observable<MusicSongerType> getMusicSongerType();

    /**
     * 歌手分类下面的歌手列表
     *
     * @param classId
     * @return
     */
    @GET("singer/list/{classId}?json=true")
    Observable<MusicSonger> getMusicSongerList(@Path("classId") int classId);


    /**
     * 歌手信息
     * http://m.kugou.com/singer/info/3060&json=true
     */
    @GET("singer/info/{classId}?json=true")
    Observable<MusicSonger> getMusicSongerInfo(@Path("classId") int classId);

    /**
     * 获取歌手所有歌曲
     * http://mobilecdn.kugou.com/
     * api/v3/singer/song?
     * plat=0&page=1&sorttype=2&pagesize=20&version=8352&singerid={歌手id}&with_res_tag=1
     */
    @GET("api/v3/singer/song?")
    Observable<MusicSongerList> getMusicSongerMusicList(
            @Query("plat") int plat,
            @Query("version") int version,
            @Query("with_res_tag") int with_res_tag,
            @Query("singerid") int singerid,
            @Query("sorttype") int sorttype, // 1、最热；2、最新
            @Query("page") int page,
            @Query("pagesize") int pagesize);
}


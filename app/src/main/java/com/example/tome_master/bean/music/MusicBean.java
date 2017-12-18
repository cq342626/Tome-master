package com.example.tome_master.bean.music;

import java.util.List;

/**
 * 时间 ：2017/11/21  16:01
 * 作者 ：陈奇
 * 作用 ：
 */
public class MusicBean {

    /**
     * status : 1
     * error :
     * data : {"timestamp":1511236839,"info":[{"rankid":6666,"ranktype":2,"jump_url":"","id":1,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20150331/20150331161100773965.png","intro":"数据来源：酷狗排序方式：按歌曲搜索播放量的涨幅排序更新周期：每天","update_frequency":"每天","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20150717/20150717100030907982.png","haschildren":0,"songinfo":[{"songname":"薛之谦 - 天后 (Live)"},{"songname":"Vk - 病名は愛だった"},{"songname":"龙千里 - 可惜没如果 (Live)"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20150331/20150331161102692497.jpg","jump_title":"","rankname":"酷狗飙升榜","isvol":1},{"rankid":8888,"ranktype":2,"jump_url":"","id":2,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20150331/20150331161158855874.png","intro":"数据来源：酷狗排序方式：按歌曲搜索播放一周总量排序更新周期：周四","update_frequency":"周四","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20150717/20150717100046499341.png","haschildren":0,"songinfo":[{"songname":"大壮 - 我们不一样"},{"songname":"校长 - 带你去旅行"},{"songname":"赵雷 - 成都"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20150331/20150331161200306618.jpg","jump_title":"","rankname":"酷狗TOP500","isvol":1},{"rankid":23784,"ranktype":1,"jump_url":"","id":65,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20150818/20150818104301582059.png","intro":"数据来源：酷狗网络类歌曲排序方式：按歌曲搜索播放一周总量排序更新周期：周一","update_frequency":"周一","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20150818/20150818104300762763.png","haschildren":0,"songinfo":[{"songname":"金南玲 - 逆流成河"},{"songname":"梦然 - 没有你陪伴真的好孤单"},{"songname":"PRC 巴音汗 - 80000 !"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20150818/20150818104303844759.jpg","jump_title":"","rankname":"网络红歌榜","isvol":1},{"rankid":24971,"ranktype":1,"jump_url":"","id":109,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20160119/20160119114655861933.png","intro":"数据来源：酷狗DJ类歌曲排序方式：按歌曲搜索播放一周总量排序更新周期：周二","update_frequency":"周二","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20160119/20160119114653428408.png","haschildren":0,"songinfo":[{"songname":"大壮 - 我们不一样 (DJ版)"},{"songname":"秋裤大叔 - 一晃就老了 (DJ版)"},{"songname":"黑龙 - 盗心贼 (DJ版)"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20160119/20160119114657498573.jpg","jump_title":"","rankname":"DJ热歌榜","isvol":0},{"rankid":29951,"ranktype":0,"jump_url":"","id":127,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20160826/20160826113608660358.png","intro":"数据来源：酷狗付费歌曲购买量排序方式：按歌曲被购买次数排序更新周期：每天","update_frequency":"每天更新","custom_type":3,"imgurl":"http://imge.kugou.com/mcommon/{size}/20160824/20160824150135940461.jpg","haschildren":0,"songinfo":[{"songname":"毛不易 - 消愁 - Live"},{"songname":"毛不易 - 像我这样的人 - Live"},{"songname":"杨宗纬、张碧晨 - 凉凉"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20160824/20160824150139358094.jpg","jump_title":"","rankname":"酷狗单曲畅销榜","isvol":0},{"rankid":27,"ranktype":0,"jump_url":"","id":35,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20171106/20171106093727278090.jpg","intro":"数据来源：酷狗三个月内发行的华语新歌排序方式：按播放量、话题热度等维度综合排序更新周期：每周更新","update_frequency":"每周更新","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20171106/20171106093723977386.jpg","haschildren":0,"songinfo":[{"songname":"王源 - 骄傲"},{"songname":"薛之谦 - 骆驼"},{"songname":"汪峰 - 没时间干"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20171106/20171106093728427791.jpg","jump_title":"","rankname":"荣耀9华语新歌榜","isvol":0},{"rankid":28,"ranktype":0,"jump_url":"","id":36,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20150331/20150331161330279063.png","intro":"数据来源：酷狗半年内发行的欧美新歌排序方式：按播放量、话题热度等维度综合排序更新周期：每周更新","update_frequency":"每周更新","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20150717/20150717100117648320.png","haschildren":0,"songinfo":[{"songname":"Flo Rida、Maluma - Hola"},{"songname":"Jessie J - Queen"},{"songname":"Machine Gun Kelly、X Ambassadors、Bebe Rexha - Home【光灵插曲】"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20150331/20150331161331331346.jpg","jump_title":"","rankname":"欧美新歌榜","isvol":0},{"rankid":24045,"ranktype":0,"jump_url":"","id":67,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20170207/20170207104016820803.png","intro":"数据来源：酷狗半年内发行的韩国新歌排序方式：按播放量、话题热度等维度排序","update_frequency":"每周更新","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20170207/20170207104015555457.png","haschildren":0,"songinfo":[{"songname":"Red Velvet - 피카부 (Peek-A-Boo)"},{"songname":"金Samuel - 캔디(Candy)"},{"songname":"JUN. K、全昭弥 - 11월부터 2월까지 (Nov to Feb)"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20170207/20170207104018533257.jpg","jump_title":"","rankname":"韩国新歌榜","isvol":0},{"rankid":24047,"ranktype":0,"jump_url":"","id":69,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20151105/20151105175337978935.png","intro":"数据来源：酷狗半年内发行的日语新歌排序方式：按播放量、话题热度等维度综合排名更新周期：每周更新","update_frequency":"每周更新","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20151105/20151105175335175464.png","haschildren":0,"songinfo":[{"songname":"ストレイテナー、秦 基博 - 灯り"},{"songname":"UNISON SQUARE GARDEN - fake town baby【血界战线 第二季OP】"},{"songname":"西野カナ - LOVE"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20151105/20151105175339377312.jpg","jump_title":"","rankname":"日本新歌榜","isvol":0},{"rankid":22050,"ranktype":0,"jump_url":"","id":39,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20150331/20150331161439781918.png","intro":"数据来源：酷狗半年内发行的粤语新歌排序方式：按播放量、话题热度等维度综合排序更新周期：每周更新","update_frequency":"每周更新","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20150717/20150717100200275675.png","haschildren":0,"songinfo":[{"songname":"卫兰 - 一晃眼"},{"songname":"吴若希 - 泣血蔷薇"},{"songname":"李克勤 - 30克+红日 (Live)"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20150331/20150331161440745006.jpg","jump_title":"","rankname":"粤语新歌榜","isvol":0},{"rankid":21101,"ranktype":1,"jump_url":"http://sdn.kugou.com/link.aspx?id=56939&dl=1\u200b","id":30,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20170831/20170831224928236203.png","intro":"数据来源：酷狗排序方式：根据酷狗用户的分享、转发、下载量综合排序更新周期：周二","update_frequency":"周二","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20170831/20170831224926517073.png","haschildren":0,"songinfo":[{"songname":"王源 - 骄傲"},{"songname":"汪峰 - 没时间干"},{"songname":"大壮 - 我们不一样"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20170831/20170831224929767448.jpg","jump_title":"vivo新品首发","rankname":"vivo热歌分享榜","isvol":1},{"rankid":30972,"ranktype":1,"jump_url":"","id":167,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20170918/20170918152506134970.png","intro":"数据来源：腾讯原创音乐排序方式：按播放量、话题热度等维度排序","update_frequency":"周三更新","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20170918/20170918152504858511.png","haschildren":0,"songinfo":[{"songname":"万妮达 - Understand"},{"songname":"马帮乐队、蒋亮 - 打跟斗"},{"songname":"简弘亦 - 阍者"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20170918/20170918152509903814.jpg","jump_title":"","rankname":"原创榜","isvol":1},{"rankid":30906,"ranktype":0,"jump_url":"","id":163,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20170901/20170901183658641548.jpg","intro":"数据来源：2017年《蒙面唱将》节目歌曲排序方式：按节目歌曲搜索播放量的涨幅排序","update_frequency":"周日更新","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20170901/20170901183656417903.jpg","haschildren":0,"songinfo":[{"songname":"汪苏泷 - 追光者 (Live)"},{"songname":"薛之谦 - 遗憾 (Live)"},{"songname":"刘维、薛之谦 - 婚礼的祝福 (Live)"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20170901/20170901183659529269.jpg","jump_title":"","rankname":"蒙面唱将榜","isvol":0},{"rankid":31195,"ranktype":0,"jump_url":"","id":171,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20171027/20171027234702687931.jpg","intro":"数据来源：2017年《梦想的声音2》节目歌曲排序方式：按节目歌曲搜索播放量的涨幅排序","update_frequency":"周一更新","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20171027/20171027234700164824.jpg","haschildren":0,"songinfo":[{"songname":"张靓颖 - 老伴 (Live)"},{"songname":"孟鹏 - 一定要幸福 (Live)"},{"songname":"李荣浩 - 香水 (Live)"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20171030/20171030205726308330.jpg","jump_title":"","rankname":"梦想的声音榜","isvol":0},{"rankid":31127,"ranktype":0,"jump_url":"","id":169,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20171023/20171023155417359677.jpg","intro":"数据来源：2017年《天籁之战》节目歌曲排序方式：按节目歌曲搜索播放量的涨幅排序","update_frequency":"周一更新","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20171013/20171013172416985210.jpg","haschildren":0,"songinfo":[{"songname":"张杰 - 情深深雨蒙蒙  (Live)"},{"songname":"杨坤 - 远走高飞 (Live)"},{"songname":"费玉清 - 成都 (Live)"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20171013/20171013172347508264.jpg","jump_title":"","rankname":"天籁之战榜","isvol":0},{"rankid":22603,"ranktype":1,"jump_url":"","id":42,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20150331/20150331161900198477.png","intro":"数据来源：5sing排序方式：根据歌曲每周在5sing上获得总支持卡数来排序更新周期：周一","update_frequency":"周一","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20150717/20150717100404157966.png","haschildren":0,"songinfo":[{"songname":"诺言Jason - 追光者"},{"songname":"韦琪 - 单的刚刚好"},{"songname":"黄麒 - 盲眼画师"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20150331/20150331161902899654.jpg","jump_title":"","rankname":"5sing音乐榜","isvol":1},{"rankid":28061,"ranktype":0,"jump_url":"","id":119,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20160531/20160531175618297735.jpg","intro":"数据来源：校园及青春影视类歌曲排序方式：综合新旧程度和热门程度排序更新周期：周三","update_frequency":"周三","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20160531/20160531175617521660.jpg","haschildren":0,"songinfo":[{"songname":"岑宁儿 - 追光者"},{"songname":"杨丞琳 - 一千零一个愿望 - 单人版"},{"songname":"叶蓓、许巍 - 流浪途中爱上你"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20160602/20160602100444487940.jpg","jump_title":"","rankname":"校园歌曲榜","isvol":0},{"rankid":21335,"ranktype":1,"jump_url":"","id":32,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20150331/20150331161931512370.png","intro":"数据来源：繁星排序方式：按繁星网友投票数排序更新周期：每月更新","update_frequency":"每月更新","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20150717/20150717100418606039.png","haschildren":0,"songinfo":[{"songname":"白小白 - 最美情侣"},{"songname":"金南玲 - 逆流成河"},{"songname":"黑龙 - 盗心贼"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20150331/20150331161933888483.jpg","jump_title":"","rankname":"繁星音乐榜","isvol":1},{"rankid":4681,"ranktype":1,"jump_url":"","id":10,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20140905/20140905105445578636.png","intro":"数据来源：美国Billboard排序方式：根据歌曲在美国的销量、电台播放量、流媒体下载量等指标进行排序更新周期：周五","update_frequency":"周五","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20150717/20150717100525388020.png","haschildren":0,"songinfo":[{"songname":"Post Malone、21 Savage - rockstar"},{"songname":"Camila Cabello、Young Thug - Havana"},{"songname":"Cardi B - Bodak Yellow"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20140905/20140905105835603586.jpg","jump_title":"","rankname":"美国BillBoard榜","isvol":1},{"rankid":4680,"ranktype":1,"jump_url":"","id":12,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20140905/20140905105446188861.png","intro":"数据来源：英国Single Chart排序方式：根据歌曲在英国的一周销量进行排序更新周期：周一","update_frequency":"周一","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20150717/20150717100550553023.png","haschildren":0,"songinfo":[{"songname":"Camila Cabello、Young Thug - Havana"},{"songname":"Rita Ora - Anywhere"},{"songname":"Post Malone、21 Savage - rockstar"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20140905/20140905105835861963.jpg","jump_title":"","rankname":"英国单曲榜","isvol":1},{"rankid":4673,"ranktype":1,"jump_url":"","id":8,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20140905/20140905105033203397.png","intro":"数据来源：日本Oricon排序方式：根据日本实体CD销量进行排序更新周期：周三","update_frequency":"周三","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20150717/20150717100648566701.png","haschildren":0,"songinfo":[{"songname":"嵐 - Doors ~勇気の軌跡~"},{"songname":"私立惠比寿中学 - シンガロン・シンガソン"},{"songname":"HKT48 - キスは待つしかないのでしょうか?"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20140905/20140905105716562182.jpg","jump_title":"","rankname":"日本公信榜","isvol":1},{"rankid":4672,"ranktype":1,"jump_url":"","id":9,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20140905/20140905105033699839.png","intro":"数据来源：韩国M-net排序方式：根据M-net的销售、下载、播放等指标进行排序更新周期：周一","update_frequency":"周一","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20150717/20150717100534135743.png","haschildren":0,"songinfo":[{"songname":"MeloMance - 礼物 (선물)"},{"songname":"尹钟信、金民书 - 喜欢 (좋아)"},{"songname":"Wanna One (워너원) - Beautiful"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20140905/20140905105835941031.jpg","jump_title":"","rankname":"韩国M-net音乐榜","isvol":1},{"rankid":22163,"ranktype":1,"jump_url":"","id":40,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20170706/20170706113954725904.jpg","intro":"数据来源：音乐之声排序方式：由音乐之声主持人及编辑进行专业打分，综合短信、销量、微博投票的结果进行排序更新周期：周一","update_frequency":"周一","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20170706/20170706113952687748.jpg","haschildren":0,"songinfo":[{"songname":"毕书尽 - Be Your Light【港台】"},{"songname":"魏晨 - 星辰大海是你【内地】"},{"songname":"薛凯琪、方大同 - 天生一对【港台】"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20170706/20170706113955496537.jpg","jump_title":"","rankname":"中国TOP排行榜","isvol":1},{"rankid":70,"ranktype":0,"jump_url":"","id":71,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20151102/20151102152401664391.png","intro":"数据来源：酷狗中文DJ、混音、舞曲等歌曲排序方式：按搜索播放一周总量排序更新周期：周二","update_frequency":"周二","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20151102/20151102152359118990.png","haschildren":0,"songinfo":[{"songname":"大壮 - 我们不一样 - DJ版"},{"songname":"胡派 - 喝醉以后才明白 - DJ版"},{"songname":"白小白 - 最美情侣 - DJ版"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20151102/20151102152403367696.jpg","jump_title":"","rankname":"中文DJ","isvol":0},{"rankid":24306,"ranktype":0,"jump_url":"","id":73,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20160129/20160129102834552860.png","intro":"数据来源：世界top100 DJ歌手榜排序方式：综合新旧程度和热门程度排序更新周期：周二","update_frequency":"周二","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20160129/20160129102832611181.png","haschildren":0,"songinfo":[{"songname":"Alan Walker - Alone"},{"songname":"Alan Walker - The Spectre"},{"songname":"The Chainsmokers、Halsey - Closer"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20160129/20160129102836912818.jpg","jump_title":"","rankname":"全球百大DJ","isvol":0},{"rankid":88,"ranktype":0,"jump_url":"","id":81,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20160711/20160711153735586474.jpg","intro":"数据来源：酷狗排序方式：根据用户驾驶听歌习惯、播放和热度排序更新周期：周三","update_frequency":"周三","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20160711/20160711153735417140.jpg","haschildren":0,"songinfo":[{"songname":"Wiz Khalifa、Charlie Puth - See You Again"},{"songname":"Maroon 5 - Sugar"},{"songname":"Eminem、Beyoncé - Walk On Water"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20160711/20160711154145495798.jpg","jump_title":"","rankname":"车载音乐","isvol":0},{"rankid":24307,"ranktype":0,"jump_url":"","id":79,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20151105/20151105172334624074.png","intro":"数据来源：传唱度较高的歌曲排序方式：按搜索播放一周总量排序更新周期：周三","update_frequency":"周三","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20151105/20151105172333633386.png","haschildren":0,"songinfo":[{"songname":"毛不易 - 项羽虞姬"},{"songname":"张杰 - 情深深雨蒙蒙 (Live)"},{"songname":"薛之谦 - 渡"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20151105/20151105172336950507.jpg","jump_title":"","rankname":"KTV","isvol":0},{"rankid":22096,"ranktype":0,"jump_url":"","id":77,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20151105/20151105172249221738.png","intro":"数据来源：三个月内的影视歌曲排序方式：按搜索播放一周总量排序更新周期：周三","update_frequency":"周三","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20151105/20151105172246425804.png","haschildren":0,"songinfo":[{"songname":"杨宗纬、张碧晨 - 凉凉【三生三世十里桃花 】"},{"songname":"叶炫清 - 九张机【双世宠妃】"},{"songname":"毛不易 - 请记住我【寻梦环游记】"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20151105/20151105172251985332.jpg","jump_title":"","rankname":"影视金曲","isvol":0},{"rankid":24574,"ranktype":0,"jump_url":"","id":123,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20160713/20160713115035225905.jpg","intro":"数据来源：酷狗神曲及搞怪类歌曲排序方式：按搜索播放一周总量排序更新周期：周三","update_frequency":"周三","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20160713/20160713115034579027.jpg","haschildren":0,"songinfo":[{"songname":"PRC 巴音汗 - 80000 !"},{"songname":"大壮 - 我们不一样"},{"songname":"白小白 - 不甘示弱"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20160713/20160713115036492119.jpg","jump_title":"","rankname":"洗脑神曲","isvol":0}],"total":29}
     * errcode : 0
     */

    private int status;
    private String error;
    /**
     * timestamp : 1511236839
     * info : [{"rankid":6666,"ranktype":2,"jump_url":"","id":1,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20150331/20150331161100773965.png","intro":"数据来源：酷狗排序方式：按歌曲搜索播放量的涨幅排序更新周期：每天","update_frequency":"每天","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20150717/20150717100030907982.png","haschildren":0,"songinfo":[{"songname":"薛之谦 - 天后 (Live)"},{"songname":"Vk - 病名は愛だった"},{"songname":"龙千里 - 可惜没如果 (Live)"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20150331/20150331161102692497.jpg","jump_title":"","rankname":"酷狗飙升榜","isvol":1},{"rankid":8888,"ranktype":2,"jump_url":"","id":2,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20150331/20150331161158855874.png","intro":"数据来源：酷狗排序方式：按歌曲搜索播放一周总量排序更新周期：周四","update_frequency":"周四","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20150717/20150717100046499341.png","haschildren":0,"songinfo":[{"songname":"大壮 - 我们不一样"},{"songname":"校长 - 带你去旅行"},{"songname":"赵雷 - 成都"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20150331/20150331161200306618.jpg","jump_title":"","rankname":"酷狗TOP500","isvol":1},{"rankid":23784,"ranktype":1,"jump_url":"","id":65,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20150818/20150818104301582059.png","intro":"数据来源：酷狗网络类歌曲排序方式：按歌曲搜索播放一周总量排序更新周期：周一","update_frequency":"周一","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20150818/20150818104300762763.png","haschildren":0,"songinfo":[{"songname":"金南玲 - 逆流成河"},{"songname":"梦然 - 没有你陪伴真的好孤单"},{"songname":"PRC 巴音汗 - 80000 !"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20150818/20150818104303844759.jpg","jump_title":"","rankname":"网络红歌榜","isvol":1},{"rankid":24971,"ranktype":1,"jump_url":"","id":109,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20160119/20160119114655861933.png","intro":"数据来源：酷狗DJ类歌曲排序方式：按歌曲搜索播放一周总量排序更新周期：周二","update_frequency":"周二","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20160119/20160119114653428408.png","haschildren":0,"songinfo":[{"songname":"大壮 - 我们不一样 (DJ版)"},{"songname":"秋裤大叔 - 一晃就老了 (DJ版)"},{"songname":"黑龙 - 盗心贼 (DJ版)"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20160119/20160119114657498573.jpg","jump_title":"","rankname":"DJ热歌榜","isvol":0},{"rankid":29951,"ranktype":0,"jump_url":"","id":127,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20160826/20160826113608660358.png","intro":"数据来源：酷狗付费歌曲购买量排序方式：按歌曲被购买次数排序更新周期：每天","update_frequency":"每天更新","custom_type":3,"imgurl":"http://imge.kugou.com/mcommon/{size}/20160824/20160824150135940461.jpg","haschildren":0,"songinfo":[{"songname":"毛不易 - 消愁 - Live"},{"songname":"毛不易 - 像我这样的人 - Live"},{"songname":"杨宗纬、张碧晨 - 凉凉"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20160824/20160824150139358094.jpg","jump_title":"","rankname":"酷狗单曲畅销榜","isvol":0},{"rankid":27,"ranktype":0,"jump_url":"","id":35,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20171106/20171106093727278090.jpg","intro":"数据来源：酷狗三个月内发行的华语新歌排序方式：按播放量、话题热度等维度综合排序更新周期：每周更新","update_frequency":"每周更新","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20171106/20171106093723977386.jpg","haschildren":0,"songinfo":[{"songname":"王源 - 骄傲"},{"songname":"薛之谦 - 骆驼"},{"songname":"汪峰 - 没时间干"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20171106/20171106093728427791.jpg","jump_title":"","rankname":"荣耀9华语新歌榜","isvol":0},{"rankid":28,"ranktype":0,"jump_url":"","id":36,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20150331/20150331161330279063.png","intro":"数据来源：酷狗半年内发行的欧美新歌排序方式：按播放量、话题热度等维度综合排序更新周期：每周更新","update_frequency":"每周更新","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20150717/20150717100117648320.png","haschildren":0,"songinfo":[{"songname":"Flo Rida、Maluma - Hola"},{"songname":"Jessie J - Queen"},{"songname":"Machine Gun Kelly、X Ambassadors、Bebe Rexha - Home【光灵插曲】"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20150331/20150331161331331346.jpg","jump_title":"","rankname":"欧美新歌榜","isvol":0},{"rankid":24045,"ranktype":0,"jump_url":"","id":67,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20170207/20170207104016820803.png","intro":"数据来源：酷狗半年内发行的韩国新歌排序方式：按播放量、话题热度等维度排序","update_frequency":"每周更新","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20170207/20170207104015555457.png","haschildren":0,"songinfo":[{"songname":"Red Velvet - 피카부 (Peek-A-Boo)"},{"songname":"金Samuel - 캔디(Candy)"},{"songname":"JUN. K、全昭弥 - 11월부터 2월까지 (Nov to Feb)"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20170207/20170207104018533257.jpg","jump_title":"","rankname":"韩国新歌榜","isvol":0},{"rankid":24047,"ranktype":0,"jump_url":"","id":69,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20151105/20151105175337978935.png","intro":"数据来源：酷狗半年内发行的日语新歌排序方式：按播放量、话题热度等维度综合排名更新周期：每周更新","update_frequency":"每周更新","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20151105/20151105175335175464.png","haschildren":0,"songinfo":[{"songname":"ストレイテナー、秦 基博 - 灯り"},{"songname":"UNISON SQUARE GARDEN - fake town baby【血界战线 第二季OP】"},{"songname":"西野カナ - LOVE"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20151105/20151105175339377312.jpg","jump_title":"","rankname":"日本新歌榜","isvol":0},{"rankid":22050,"ranktype":0,"jump_url":"","id":39,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20150331/20150331161439781918.png","intro":"数据来源：酷狗半年内发行的粤语新歌排序方式：按播放量、话题热度等维度综合排序更新周期：每周更新","update_frequency":"每周更新","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20150717/20150717100200275675.png","haschildren":0,"songinfo":[{"songname":"卫兰 - 一晃眼"},{"songname":"吴若希 - 泣血蔷薇"},{"songname":"李克勤 - 30克+红日 (Live)"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20150331/20150331161440745006.jpg","jump_title":"","rankname":"粤语新歌榜","isvol":0},{"rankid":21101,"ranktype":1,"jump_url":"http://sdn.kugou.com/link.aspx?id=56939&dl=1\u200b","id":30,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20170831/20170831224928236203.png","intro":"数据来源：酷狗排序方式：根据酷狗用户的分享、转发、下载量综合排序更新周期：周二","update_frequency":"周二","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20170831/20170831224926517073.png","haschildren":0,"songinfo":[{"songname":"王源 - 骄傲"},{"songname":"汪峰 - 没时间干"},{"songname":"大壮 - 我们不一样"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20170831/20170831224929767448.jpg","jump_title":"vivo新品首发","rankname":"vivo热歌分享榜","isvol":1},{"rankid":30972,"ranktype":1,"jump_url":"","id":167,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20170918/20170918152506134970.png","intro":"数据来源：腾讯原创音乐排序方式：按播放量、话题热度等维度排序","update_frequency":"周三更新","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20170918/20170918152504858511.png","haschildren":0,"songinfo":[{"songname":"万妮达 - Understand"},{"songname":"马帮乐队、蒋亮 - 打跟斗"},{"songname":"简弘亦 - 阍者"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20170918/20170918152509903814.jpg","jump_title":"","rankname":"原创榜","isvol":1},{"rankid":30906,"ranktype":0,"jump_url":"","id":163,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20170901/20170901183658641548.jpg","intro":"数据来源：2017年《蒙面唱将》节目歌曲排序方式：按节目歌曲搜索播放量的涨幅排序","update_frequency":"周日更新","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20170901/20170901183656417903.jpg","haschildren":0,"songinfo":[{"songname":"汪苏泷 - 追光者 (Live)"},{"songname":"薛之谦 - 遗憾 (Live)"},{"songname":"刘维、薛之谦 - 婚礼的祝福 (Live)"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20170901/20170901183659529269.jpg","jump_title":"","rankname":"蒙面唱将榜","isvol":0},{"rankid":31195,"ranktype":0,"jump_url":"","id":171,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20171027/20171027234702687931.jpg","intro":"数据来源：2017年《梦想的声音2》节目歌曲排序方式：按节目歌曲搜索播放量的涨幅排序","update_frequency":"周一更新","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20171027/20171027234700164824.jpg","haschildren":0,"songinfo":[{"songname":"张靓颖 - 老伴 (Live)"},{"songname":"孟鹏 - 一定要幸福 (Live)"},{"songname":"李荣浩 - 香水 (Live)"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20171030/20171030205726308330.jpg","jump_title":"","rankname":"梦想的声音榜","isvol":0},{"rankid":31127,"ranktype":0,"jump_url":"","id":169,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20171023/20171023155417359677.jpg","intro":"数据来源：2017年《天籁之战》节目歌曲排序方式：按节目歌曲搜索播放量的涨幅排序","update_frequency":"周一更新","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20171013/20171013172416985210.jpg","haschildren":0,"songinfo":[{"songname":"张杰 - 情深深雨蒙蒙  (Live)"},{"songname":"杨坤 - 远走高飞 (Live)"},{"songname":"费玉清 - 成都 (Live)"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20171013/20171013172347508264.jpg","jump_title":"","rankname":"天籁之战榜","isvol":0},{"rankid":22603,"ranktype":1,"jump_url":"","id":42,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20150331/20150331161900198477.png","intro":"数据来源：5sing排序方式：根据歌曲每周在5sing上获得总支持卡数来排序更新周期：周一","update_frequency":"周一","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20150717/20150717100404157966.png","haschildren":0,"songinfo":[{"songname":"诺言Jason - 追光者"},{"songname":"韦琪 - 单的刚刚好"},{"songname":"黄麒 - 盲眼画师"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20150331/20150331161902899654.jpg","jump_title":"","rankname":"5sing音乐榜","isvol":1},{"rankid":28061,"ranktype":0,"jump_url":"","id":119,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20160531/20160531175618297735.jpg","intro":"数据来源：校园及青春影视类歌曲排序方式：综合新旧程度和热门程度排序更新周期：周三","update_frequency":"周三","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20160531/20160531175617521660.jpg","haschildren":0,"songinfo":[{"songname":"岑宁儿 - 追光者"},{"songname":"杨丞琳 - 一千零一个愿望 - 单人版"},{"songname":"叶蓓、许巍 - 流浪途中爱上你"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20160602/20160602100444487940.jpg","jump_title":"","rankname":"校园歌曲榜","isvol":0},{"rankid":21335,"ranktype":1,"jump_url":"","id":32,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20150331/20150331161931512370.png","intro":"数据来源：繁星排序方式：按繁星网友投票数排序更新周期：每月更新","update_frequency":"每月更新","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20150717/20150717100418606039.png","haschildren":0,"songinfo":[{"songname":"白小白 - 最美情侣"},{"songname":"金南玲 - 逆流成河"},{"songname":"黑龙 - 盗心贼"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20150331/20150331161933888483.jpg","jump_title":"","rankname":"繁星音乐榜","isvol":1},{"rankid":4681,"ranktype":1,"jump_url":"","id":10,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20140905/20140905105445578636.png","intro":"数据来源：美国Billboard排序方式：根据歌曲在美国的销量、电台播放量、流媒体下载量等指标进行排序更新周期：周五","update_frequency":"周五","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20150717/20150717100525388020.png","haschildren":0,"songinfo":[{"songname":"Post Malone、21 Savage - rockstar"},{"songname":"Camila Cabello、Young Thug - Havana"},{"songname":"Cardi B - Bodak Yellow"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20140905/20140905105835603586.jpg","jump_title":"","rankname":"美国BillBoard榜","isvol":1},{"rankid":4680,"ranktype":1,"jump_url":"","id":12,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20140905/20140905105446188861.png","intro":"数据来源：英国Single Chart排序方式：根据歌曲在英国的一周销量进行排序更新周期：周一","update_frequency":"周一","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20150717/20150717100550553023.png","haschildren":0,"songinfo":[{"songname":"Camila Cabello、Young Thug - Havana"},{"songname":"Rita Ora - Anywhere"},{"songname":"Post Malone、21 Savage - rockstar"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20140905/20140905105835861963.jpg","jump_title":"","rankname":"英国单曲榜","isvol":1},{"rankid":4673,"ranktype":1,"jump_url":"","id":8,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20140905/20140905105033203397.png","intro":"数据来源：日本Oricon排序方式：根据日本实体CD销量进行排序更新周期：周三","update_frequency":"周三","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20150717/20150717100648566701.png","haschildren":0,"songinfo":[{"songname":"嵐 - Doors ~勇気の軌跡~"},{"songname":"私立惠比寿中学 - シンガロン・シンガソン"},{"songname":"HKT48 - キスは待つしかないのでしょうか?"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20140905/20140905105716562182.jpg","jump_title":"","rankname":"日本公信榜","isvol":1},{"rankid":4672,"ranktype":1,"jump_url":"","id":9,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20140905/20140905105033699839.png","intro":"数据来源：韩国M-net排序方式：根据M-net的销售、下载、播放等指标进行排序更新周期：周一","update_frequency":"周一","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20150717/20150717100534135743.png","haschildren":0,"songinfo":[{"songname":"MeloMance - 礼物 (선물)"},{"songname":"尹钟信、金民书 - 喜欢 (좋아)"},{"songname":"Wanna One (워너원) - Beautiful"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20140905/20140905105835941031.jpg","jump_title":"","rankname":"韩国M-net音乐榜","isvol":1},{"rankid":22163,"ranktype":1,"jump_url":"","id":40,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20170706/20170706113954725904.jpg","intro":"数据来源：音乐之声排序方式：由音乐之声主持人及编辑进行专业打分，综合短信、销量、微博投票的结果进行排序更新周期：周一","update_frequency":"周一","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20170706/20170706113952687748.jpg","haschildren":0,"songinfo":[{"songname":"毕书尽 - Be Your Light【港台】"},{"songname":"魏晨 - 星辰大海是你【内地】"},{"songname":"薛凯琪、方大同 - 天生一对【港台】"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20170706/20170706113955496537.jpg","jump_title":"","rankname":"中国TOP排行榜","isvol":1},{"rankid":70,"ranktype":0,"jump_url":"","id":71,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20151102/20151102152401664391.png","intro":"数据来源：酷狗中文DJ、混音、舞曲等歌曲排序方式：按搜索播放一周总量排序更新周期：周二","update_frequency":"周二","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20151102/20151102152359118990.png","haschildren":0,"songinfo":[{"songname":"大壮 - 我们不一样 - DJ版"},{"songname":"胡派 - 喝醉以后才明白 - DJ版"},{"songname":"白小白 - 最美情侣 - DJ版"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20151102/20151102152403367696.jpg","jump_title":"","rankname":"中文DJ","isvol":0},{"rankid":24306,"ranktype":0,"jump_url":"","id":73,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20160129/20160129102834552860.png","intro":"数据来源：世界top100 DJ歌手榜排序方式：综合新旧程度和热门程度排序更新周期：周二","update_frequency":"周二","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20160129/20160129102832611181.png","haschildren":0,"songinfo":[{"songname":"Alan Walker - Alone"},{"songname":"Alan Walker - The Spectre"},{"songname":"The Chainsmokers、Halsey - Closer"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20160129/20160129102836912818.jpg","jump_title":"","rankname":"全球百大DJ","isvol":0},{"rankid":88,"ranktype":0,"jump_url":"","id":81,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20160711/20160711153735586474.jpg","intro":"数据来源：酷狗排序方式：根据用户驾驶听歌习惯、播放和热度排序更新周期：周三","update_frequency":"周三","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20160711/20160711153735417140.jpg","haschildren":0,"songinfo":[{"songname":"Wiz Khalifa、Charlie Puth - See You Again"},{"songname":"Maroon 5 - Sugar"},{"songname":"Eminem、Beyoncé - Walk On Water"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20160711/20160711154145495798.jpg","jump_title":"","rankname":"车载音乐","isvol":0},{"rankid":24307,"ranktype":0,"jump_url":"","id":79,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20151105/20151105172334624074.png","intro":"数据来源：传唱度较高的歌曲排序方式：按搜索播放一周总量排序更新周期：周三","update_frequency":"周三","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20151105/20151105172333633386.png","haschildren":0,"songinfo":[{"songname":"毛不易 - 项羽虞姬"},{"songname":"张杰 - 情深深雨蒙蒙 (Live)"},{"songname":"薛之谦 - 渡"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20151105/20151105172336950507.jpg","jump_title":"","rankname":"KTV","isvol":0},{"rankid":22096,"ranktype":0,"jump_url":"","id":77,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20151105/20151105172249221738.png","intro":"数据来源：三个月内的影视歌曲排序方式：按搜索播放一周总量排序更新周期：周三","update_frequency":"周三","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20151105/20151105172246425804.png","haschildren":0,"songinfo":[{"songname":"杨宗纬、张碧晨 - 凉凉【三生三世十里桃花 】"},{"songname":"叶炫清 - 九张机【双世宠妃】"},{"songname":"毛不易 - 请记住我【寻梦环游记】"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20151105/20151105172251985332.jpg","jump_title":"","rankname":"影视金曲","isvol":0},{"rankid":24574,"ranktype":0,"jump_url":"","id":123,"children":"","banner7url":"http://imge.kugou.com/mcommon/{size}/20160713/20160713115035225905.jpg","intro":"数据来源：酷狗神曲及搞怪类歌曲排序方式：按搜索播放一周总量排序更新周期：周三","update_frequency":"周三","custom_type":0,"imgurl":"http://imge.kugou.com/mcommon/{size}/20160713/20160713115034579027.jpg","haschildren":0,"songinfo":[{"songname":"PRC 巴音汗 - 80000 !"},{"songname":"大壮 - 我们不一样"},{"songname":"白小白 - 不甘示弱"}],"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20160713/20160713115036492119.jpg","jump_title":"","rankname":"洗脑神曲","isvol":0}]
     * total : 29
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
         * rankid : 6666
         * ranktype : 2
         * jump_url :
         * id : 1
         * children :
         * banner7url : http://imge.kugou.com/mcommon/{size}/20150331/20150331161100773965.png
         * intro : 数据来源：酷狗排序方式：按歌曲搜索播放量的涨幅排序更新周期：每天
         * update_frequency : 每天
         * custom_type : 0
         * imgurl : http://imge.kugou.com/mcommon/{size}/20150717/20150717100030907982.png
         * haschildren : 0
         * songinfo : [{"songname":"薛之谦 - 天后 (Live)"},{"songname":"Vk - 病名は愛だった"},{"songname":"龙千里 - 可惜没如果 (Live)"}]
         * bannerurl : http://imge.kugou.com/mcommonbanner/{size}/20150331/20150331161102692497.jpg
         * jump_title :
         * rankname : 酷狗飙升榜
         * isvol : 1
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
            private int rankid;
            private int ranktype;
            private String jump_url;
            private int id;
            private List<?> children;
            private String banner7url;
            private String intro;
            private String update_frequency;
            private int custom_type;
            private String imgurl;
            private int haschildren;
            private String bannerurl;
            private String jump_title;
            private String rankname;
            private int isvol;
            /**
             * songname : 薛之谦 - 天后 (Live)
             */

            private List<SonginfoBean> songinfo;

            public int getRankid() {
                return rankid;
            }

            public void setRankid(int rankid) {
                this.rankid = rankid;
            }

            public int getRanktype() {
                return ranktype;
            }

            public void setRanktype(int ranktype) {
                this.ranktype = ranktype;
            }

            public String getJump_url() {
                return jump_url;
            }

            public void setJump_url(String jump_url) {
                this.jump_url = jump_url;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public List<?> getChildren() {
                return children;
            }

            public void setChildren(List<?> children) {
                this.children = children;
            }

            public String getBanner7url() {
                return banner7url;
            }

            public void setBanner7url(String banner7url) {
                this.banner7url = banner7url;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public String getUpdate_frequency() {
                return update_frequency;
            }

            public void setUpdate_frequency(String update_frequency) {
                this.update_frequency = update_frequency;
            }

            public int getCustom_type() {
                return custom_type;
            }

            public void setCustom_type(int custom_type) {
                this.custom_type = custom_type;
            }

            public String getImgurl() {
                return imgurl;
            }

            public void setImgurl(String imgurl) {
                this.imgurl = imgurl;
            }

            public int getHaschildren() {
                return haschildren;
            }

            public void setHaschildren(int haschildren) {
                this.haschildren = haschildren;
            }

            public String getBannerurl() {
                return bannerurl;
            }

            public void setBannerurl(String bannerurl) {
                this.bannerurl = bannerurl;
            }

            public String getJump_title() {
                return jump_title;
            }

            public void setJump_title(String jump_title) {
                this.jump_title = jump_title;
            }

            public String getRankname() {
                return rankname;
            }

            public void setRankname(String rankname) {
                this.rankname = rankname;
            }

            public int getIsvol() {
                return isvol;
            }

            public void setIsvol(int isvol) {
                this.isvol = isvol;
            }

            public List<SonginfoBean> getSonginfo() {
                return songinfo;
            }

            public void setSonginfo(List<SonginfoBean> songinfo) {
                this.songinfo = songinfo;
            }

            public static class SonginfoBean {
                private String songname;

                public String getSongname() {
                    return songname;
                }

                public void setSongname(String songname) {
                    this.songname = songname;
                }
            }
        }
    }
}

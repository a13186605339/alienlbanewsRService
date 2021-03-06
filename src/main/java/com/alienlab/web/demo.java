package com.alienlab.web;

import com.alienlab.domain.AlinewsPaper;
import com.alienlab.domain.AlinewsPaperInfo;
import com.alienlab.domain.AlinewsPaperType;
import com.alienlab.domain.AlinewsUsers;
import com.alienlab.repository.AlinewsPaperInfoRepository;
import com.alienlab.repository.AlinewsPaperRepository;
import com.alienlab.repository.AlinewsPaperTypeRepository;
import com.alienlab.service.serviceImpl.AlinewsUserServiceImpl;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by zhuliang on 2017/4/3.
 */
@RestController
public class demo {
    @Autowired
    private AlinewsUserServiceImpl alinewsUserServiceImpl;
    @Autowired
    private AlinewsPaperTypeRepository alinewsPaperTypeRepository;
    @Autowired
    private AlinewsPaperRepository alinewsPaperRepository;
    @Autowired
    private AlinewsPaperInfoRepository alinewsPaperInfoRepository;
    @RequestMapping(value="/test",method = RequestMethod.GET)
    public ResponseEntity test(){
        List<AlinewsUsers> alinewsUserss = alinewsUserServiceImpl.findALLUser();
        return  ResponseEntity.ok().body(alinewsUserss);
    }

    @ApiOperation(value="新增报纸类型接口",notes="测试用。")
    @RequestMapping(value="/savetype",method = RequestMethod.GET)
    public ResponseEntity savetype(){
        Long t = 1L;
        String s = t.toString();
       /* List<String> list = new ArrayList();
        list.add("商业新闻报");
        list.add("晚报");
        list.add("都市报");
        list.add("对象报");
        list.add("生活报");
        for (String name: list) {
            AlinewsPaperType alinewsPaperType = new AlinewsPaperType();
            alinewsPaperType.setTypeName(name);
            alinewsPaperType.setStauts("1");
            System.out.println(ZonedDateTime.now());
            alinewsPaperType = alinewsPaperTypeRepository.save(alinewsPaperType);
        }*/

        return  ResponseEntity.ok().body("完成");
    }

    @ApiOperation(value="新增报纸接口",notes="测试用。")
    @RequestMapping(value="/savepaper",method = RequestMethod.GET)
    public ResponseEntity savepaper(){

       /* List<String> list = new ArrayList();

        List<String> list2 = new ArrayList();

        for (int i = 0;i>list.size();i++) {
            AlinewsPaper alinewsPaper = new AlinewsPaper();
            alinewsPaper.setCreateTime(new Date());
            alinewsPaper.setCollectCount(0);
            alinewsPaper.setPaperName(list.get(i));
            alinewsPaper.setPaperStatus("1");
            alinewsPaper.setPaperType("商业新闻报");
            alinewsPaper.setPaperUrl(list2.get(i));
            System.out.println(ZonedDateTime.now());
            alinewsPaper = alinewsPaperRepository.save(alinewsPaper);
            System.out.println(alinewsPaper);
        }

      list = new ArrayList();
        list.add("市场星报");
        list.add("重庆商报");
        list.add("成都商报");
        list.add("温州商报");
        list.add("东南商报");
        list.add("深圳商报");
        list.add("香港文汇报");

        list2 = new ArrayList();
        list2.add("http://www.ahscb.com/html/$$/node_2.htm");
        list2.add("http://e.chinacqsb.com/html/$$/node_2.htm");
        list2.add("http://e.chengdu.cn/html/$$/node_2.htm");
        list2.add("http://wzed.66wz.com/html/$$/node_123.htm");
        list2.add("http://daily.cnnb.com.cn/dnsb/html/$$/node_156.htm");
        list2.add("http://szsb.sznews.com/html/$$/node_1388.htm");
        list2.add("http://pdf.wenweipo.com/index.html");
        for (int i = 0;i<list.size();i++) {
            AlinewsPaper alinewsPaper = new AlinewsPaper();
            alinewsPaper.setCreateTime(new Date());
            alinewsPaper.setCollectCount(0);
            alinewsPaper.setPaperName(list.get(i));
            alinewsPaper.setPaperStatus("1");
            alinewsPaper.setPaperType("商业新闻报");
            alinewsPaper.setPaperUrl(list2.get(i));
            System.out.println(ZonedDateTime.now());
            alinewsPaper = alinewsPaperRepository.save(alinewsPaper);
        }*/

         /* list = new ArrayList();
        list.add("温州都市报");
        list.add("深圳都市报");
        list.add("汕头都市报");
        list.add("南国都市报");
        *//*list.add("扬州晚报");
        list.add("温州晚报");
        list.add("南湖晚报");
        list.add("法制晚报");
        list.add("成都晚报");
        list.add("苍梧晚报")*//*;

        list2 = new ArrayList();
        list2.add("http://dsb.66wz.com/html/$$/node_203.htm");
        list2.add("http://dtzbd.sznews.com/html/$$/node_3442.htm");
        list2.add("http://dsb.dahuawang.com/html/$$/node_2.htm");
        list2.add("http://ngdsb.hinews.cn/html/$$/node_1.htm");
    *//*    list2.add("http://zzwb.zynews.com/html/$$/node_102.htm");
        list2.add("http://zzwb.zynews.com/html/$$/node_102.htm");
        list2.add("http://zzwb.zynews.com/html/$$/node_102.htm");
        list2.add("http://zzwb.zynews.com/html/$$/node_102.htm");
        list2.add("http://zzwb.zynews.com/html/$$/node_102.htm");
        list2.add("http://zzwb.zynews.com/html/$$/node_102.htm");*//*
        for (int i = 0;i<list.size();i++) {
            AlinewsPaper alinewsPaper = new AlinewsPaper();
            alinewsPaper.setCreateTime(new Date());
            alinewsPaper.setCollectCount(0);
            alinewsPaper.setPaperName(list.get(i));
            alinewsPaper.setPaperStatus("1");
            alinewsPaper.setPaperType("都市报");
            alinewsPaper.setPaperUrl(list2.get(i));
            System.out.println(ZonedDateTime.now());
            alinewsPaper = alinewsPaperRepository.save(alinewsPaper);
        }

        list = new ArrayList();
        list.add("武汉晨报");
        list.add("宁波日报");
        list.add("重庆日报");
        list.add("现代金报");
        list.add("晶报");
        list.add("东方早报");
        list.add("现代快报");
        list.add("新华日报");

        list2 = new ArrayList();
        list2.add("http://whcb.cjn.cn/html/$$/node_42.htm");
        list2.add("http://daily.cnnb.com.cn/nbrb/html/$$/node_2.htm");
        list2.add("http://cqrbepaper.cqnews.net/cqrb/html/$$/node_124.htm");
        list2.add("http://dzb.jinbaonet.com/html/$$/node_23.htm");
        list2.add("http://jb.sznews.com/html/$$/node_1163.htm");
        list2.add("http://epaper.dfdaily.com/dfzb/html/$$/node_2.htm");
        list2.add("http://dz.xdkb.net/html/$$/node_41.htm");
        list2.add("http://xh.xhby.net/mp2/html/$$/node_2.htm");
        for (int i = 0;i<list.size();i++) {
            AlinewsPaper alinewsPaper = new AlinewsPaper();
            alinewsPaper.setCreateTime(new Date());
            alinewsPaper.setCollectCount(0);
            alinewsPaper.setPaperName(list.get(i));
            alinewsPaper.setPaperStatus("1");
            alinewsPaper.setPaperType("生活报");
            alinewsPaper.setPaperUrl(list2.get(i));
            System.out.println(ZonedDateTime.now());
            alinewsPaper = alinewsPaperRepository.save(alinewsPaper);
        }

        list = new ArrayList();
        list.add("解放军报");
        list.add("解放日报");
        list.add("中国青年报");
        list.add("中国教师报");
        list.add("北京青年报");
        *//*list.add("温州晚报");
        list.add("南湖晚报");
        list.add("法制晚报");
        list.add("成都晚报");
        list.add("苍梧晚报")*//*;

        list2 = new ArrayList();
        list2.add("http://www.81.cn/jfjbmap/content/$$/node_2.htm");
        list2.add("http://newspaper.jfdaily.com/jfrb/html/$$/node_2.htm");
        list2.add("http://zqb.cyol.com/html/$$/nbs.D110000zgqnb_01.htm");
        list2.add("http://paper.chinateacher.com.cn/zgjsb/html/$$/node_22.htm");
        list2.add("http://epaper.ynet.com/html/$$/node_1331.htm");
       *//* list2.add("http://zzwb.zynews.com/html/$$/node_102.htm");
        list2.add("http://zzwb.zynews.com/html/$$/node_102.htm");
        list2.add("http://zzwb.zynews.com/html/$$/node_102.htm");
        list2.add("http://zzwb.zynews.com/html/$$/node_102.htm");
        list2.add("http://zzwb.zynews.com/html/$$/node_102.htm");*//*
        for (int i = 0;i<list.size();i++) {
            AlinewsPaper alinewsPaper = new AlinewsPaper();
            alinewsPaper.setCreateTime(new Date());
            alinewsPaper.setCollectCount(0);
            alinewsPaper.setPaperName(list.get(i));
            alinewsPaper.setPaperStatus("1");
            alinewsPaper.setPaperType("对象报");
            alinewsPaper.setPaperUrl(list2.get(i));
            System.out.println(ZonedDateTime.now());
            alinewsPaper = alinewsPaperRepository.save(alinewsPaper);
        }*/

        return  ResponseEntity.ok().body("完成");
    }

    @ApiOperation(value="新增市场星报信息",notes="测试用。")
    @RequestMapping(value="/savescxbtype",method = RequestMethod.GET)
    public ResponseEntity savescxbtype(){
        AlinewsPaper alinewsPaper = alinewsPaperRepository.findPaperBypaperName("市场星报");
        AlinewsPaperInfo alinewsPaperInfo = new AlinewsPaperInfo();
        alinewsPaperInfo.setCreateTime(new Date());
        alinewsPaperInfo.setHtmlUrl(alinewsPaper.getPaperUrl());
        alinewsPaperInfo.setPaperId(alinewsPaper.getId());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        alinewsPaperInfo.setUpdateTime("2017-05-04");
       alinewsPaperInfoRepository.save(alinewsPaperInfo);
        return  ResponseEntity.ok().body("完成");
    }


    @RequestMapping(value="/save",method = RequestMethod.GET)
    public ResponseEntity save(@RequestParam String name,@RequestParam String password,@RequestParam String tel,@RequestParam String email,@RequestParam String resource){
        AlinewsUsers alinewsUsers = new AlinewsUsers();
        alinewsUsers.setUserName(name);
        alinewsUsers.setUserPassword(password);
        alinewsUsers.setTel(tel);
        alinewsUsers.setEmail(email);
        alinewsUsers.setSource(resource);
        alinewsUsers = alinewsUserServiceImpl.save(alinewsUsers);
        return  ResponseEntity.ok().body(alinewsUsers);
    }

}

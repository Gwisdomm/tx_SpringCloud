package com.gao.controller;

import com.gao.tool.CsdnTool;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


/**
 * @program: tx_springcloud_02
 * @description: 定时任务
 * @author: gaowz
 * @create: 2020-12-06 11:20
 **/
@Component
public class SchedulingTest {

    private Logger _log = LoggerFactory.getLogger(SchedulingTest.class);
    @Resource
    private CsdnTool csdnTool;
    private int i = 0;

    /**
     * 设置执行时间
     */
    @Scheduled(fixedRate = 120 * 1000)
    public void doSomethingWith() {
        String url = "https://blog.csdn.net/gwz_6903";

        _log.debug("当前CsdnTool的对象是：", csdnTool);
        System.out.println("当前CsdnTool的对象是：" + csdnTool);
        String body = csdnTool.doGet(url);
        Elements elements = csdnTool.parse(body);
        for (Element ele : elements) {
            String urlEle = ele.attr("href");
            System.out.println("urlEle:" + urlEle);
            csdnTool.doGet(urlEle);
        }
        i++;
        System.out.println("第" + i + "次访问");
    }
}

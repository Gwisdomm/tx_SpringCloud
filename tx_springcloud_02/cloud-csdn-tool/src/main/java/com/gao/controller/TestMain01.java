package com.gao.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.apache.commons.lang.StringEscapeUtils;

/**
 * @program: tx_springcloud_02
 * @description: 测试内部类
 * @author: gaowz
 * @create: 2020-12-10 11:13
 **/
public class TestMain01 {
    public static void main(String[] args) {
        /*TestInnorMethod testInnorMethod = new TestInnorMethod.Build().age(2).build();
        System.out.println(testInnorMethod.getAge());*/
        System.out.println(StringEscapeUtils.unescapeHtml("烟灶直播&ldquo;圣诞奇妙夜&rdquo;活动通知"));

    }


}

package com.gao.controller;

import org.apache.commons.lang.StringUtils;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @program: tx_springcloud_02
 * @description: 测试集合
 * @author: gaowz
 * @create: 2020-12-03 11:02
 **/
public class TestMain {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        System.out.println(StringUtils.strip(set.toString(),"[]"));
        System.out.println(set.toString());
    }
}

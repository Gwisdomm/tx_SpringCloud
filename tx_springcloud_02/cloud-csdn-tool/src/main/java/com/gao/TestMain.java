package com.gao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * @program: tx_springcloud_02
 * @description: 主启动
 * @author: gaowz
 * @create: 2020-12-06 11:17
 **/
@EnableScheduling //开启定时任务
@SpringBootApplication
public class TestMain {
    public static void main(String[] args) {
        SpringApplication.run(TestMain.class,args);
    }
}

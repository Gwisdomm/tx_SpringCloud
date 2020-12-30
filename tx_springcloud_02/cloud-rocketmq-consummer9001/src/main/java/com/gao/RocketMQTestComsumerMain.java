package com.gao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: tx_springcloud_02
 * @description: 消费者主程序
 * @author: gaowz
 * @create: 2020-12-27 22:57
 **/
@SpringBootApplication
public class RocketMQTestComsumerMain {

    public static void main(String[] args) {
        SpringApplication.run(RocketMQTestComsumerMain.class,args);
    }
}

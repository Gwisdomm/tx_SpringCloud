package com.gao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: tx_springcloud_02
 * @description: 支付服务启动类
 * @author: gaowz
 * @create: 2020-11-13 16:03
 **/
@EnableEurekaClient
@SpringBootApplication
public class PaymentApplication8002 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication8002.class,args);
    }
}

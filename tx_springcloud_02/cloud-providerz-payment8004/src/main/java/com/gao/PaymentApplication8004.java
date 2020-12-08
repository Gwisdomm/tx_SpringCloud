package com.gao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: tx_springcloud_02
 * @description: 支付的主程序zk
 * @author: gaowz
 * @create: 2020-11-18 12:47
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentApplication8004 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication8004.class,args);
    }
}

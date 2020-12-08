package com.gao;

import com.myrule.MySelRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @program: tx_springcloud_02
 * @description: 使用的负载均衡方式为随机
 * @author: gaowz
 * @create: 2020-11-16 13:18
 **/
@EnableEurekaClient
@SpringBootApplication
//此处是配置使用的负载均衡方式为自定义的方式，而不使用默认的轮询方式
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = MySelRule.class)
public class OrderMain81 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain81.class, args);
    }
}

package com.gao.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: tx_springcloud_02
 * @description: 配置类
 * @author: gaowz
 * @create: 2020-11-16 14:55
 **/
@Configuration
public class ApplicationContextConfig {

    //负载均衡注解,轮询方式
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}

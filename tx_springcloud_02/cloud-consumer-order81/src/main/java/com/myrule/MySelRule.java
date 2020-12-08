package com.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: tx_springcloud_02
 * @description: 自定义的负载均衡规则
 * @author: gaowz
 * @create: 2020-11-21 23:11
 **/
@Configuration
public class MySelRule {
    @Bean
    public IRule myRule(){
        return new RandomRule(); //定义为随机
    }
}

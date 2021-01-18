package com.gao.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: tx_springcloud_02
 * @description: feign日志增强
 * @author: gaowz
 * @create: 2021-01-10 22:55
 **/
@Configuration
public class FeignLogConfig {

    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}

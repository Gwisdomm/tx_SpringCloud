package com.gao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: tx_springcloud_02
 * @description: 主启动
 * @author: gaowz
 * @create: 2020-11-11 22:39
 **/
@EnableEurekaServer
@SpringBootApplication(exclude= DataSourceAutoConfiguration.class)
public class EurekaMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class,args);
    }
}

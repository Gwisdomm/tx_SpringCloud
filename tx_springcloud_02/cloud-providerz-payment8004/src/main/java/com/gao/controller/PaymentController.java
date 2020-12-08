package com.gao.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @program: tx_springcloud_02
 * @description: 支付的控制层
 * @author: gaowz
 * @create: 2020-11-18 12:49
 **/
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/zk")
    public String paymentZk() {
        return "zookeeper，serverPort: " + serverPort + UUID.randomUUID().toString();
    }

}

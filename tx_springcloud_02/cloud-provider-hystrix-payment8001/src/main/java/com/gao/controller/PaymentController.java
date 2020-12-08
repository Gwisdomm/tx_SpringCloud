package com.gao.controller;

import com.gao.service.impl.PaymentServiceImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: tx_springcloud_02
 * @description: 支付的控制层
 * @author: gaowz
 * @create: 2020-11-26 22:50
 **/
@RestController
@RequestMapping(value = "/payment")
public class PaymentController {

    @Resource
    private PaymentServiceImpl paymentService;

    @Value("${server.port}")
    private String serverPort;
    /**
     * 正常的方法
     * @param id
     * @return
     */
    @GetMapping(value = "/get/info/ok/{id}")
    public String paymentInfo_Ok(@PathVariable("id")Integer id){
        return paymentService.paymentInfo_Ok(id);
    }

    /**
     * 超时的方法
     * @param id
     * @return
     */
    @GetMapping(value = "/get/info/timeout/{id}")
    public String paymentInfo_Timeout(@PathVariable("id")Integer id){
        return paymentService.paymentInfo_Timeout(id);
    }
}

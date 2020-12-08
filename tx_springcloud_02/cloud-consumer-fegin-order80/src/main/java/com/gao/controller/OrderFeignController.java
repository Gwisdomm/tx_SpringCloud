package com.gao.controller;

import com.gao.domain.CommonResult;
import com.gao.service.PaymentFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: tx_springcloud_02
 * @description: 订单feign控制层
 * @author: gaowz
 * @create: 2020-11-24 22:45
 **/
@RestController
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping(value = "/consummer/payment/get/timeout")
    public String getPaymentTimeout(){
        return paymentFeignService.paymentFeiginTimeout();
    }
}

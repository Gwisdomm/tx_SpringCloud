package com.gao.controller;

import com.gao.domain.CommonResult;
import com.gao.domain.Payment;
import com.gao.service.impl.PaymentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: tx_springcloud_02
 * @description: 支付的控制层
 * @author: gaowz
 * @create: 2020-11-13 15:47
 **/
@RestController
@RequestMapping("/payment")
public class PaymentController {
    
    //获取yml中的端口号
    @Value("${server.port}")
    private String serverPort;

    @Autowired
    private PaymentServiceImpl paymentService;

    @GetMapping("/get/{id}")
    public CommonResult getPaymentById(@PathVariable(value = "id") Long id) {

        Payment payment = paymentService.getPaymentById(id);

        if (StringUtils.isEmpty(payment)) {
            return new CommonResult(404, "查无数据，serverPort "+serverPort, null);
        } else {
            return new CommonResult(200, "查询成功,serverPort "+serverPort, payment);
        }
    }

}

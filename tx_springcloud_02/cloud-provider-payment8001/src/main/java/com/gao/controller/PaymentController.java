package com.gao.controller;

import com.gao.domain.CommonResult;
import com.gao.domain.Payment;
import com.gao.service.impl.PaymentServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @program: tx_springcloud_02
 * @description: 支付的控制层
 * @author: gaowz
 * @create: 2020-11-13 15:47
 **/
@RestController
@RequestMapping("/payment")
public class PaymentController {



    //日志使用
    private static Logger _log = LoggerFactory.getLogger(PaymentController.class);

    @Value("${server.port}")
    private String serverPort;

    @Autowired
    private PaymentServiceImpl paymentService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/get/{id}")
    public CommonResult getPaymentById(@PathVariable(value = "id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        if (StringUtils.isEmpty(payment)) {
            return new CommonResult(404, "查无数据，serverPort "+serverPort, null);
        } else {
            return new CommonResult(200, "查询成功,serverPort "+serverPort, payment);
        }
    }

    @GetMapping(value = "/discovery")
    public Object discovery(){

        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            _log.info("*****"+service);
        }
        //输出实例信息
        List<ServiceInstance> instance = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance serviceInstance : instance) {
            _log.info("*****"+serviceInstance.getHost()+'\t'+serviceInstance.getInstanceId());
        }
        return this.discoveryClient;
    }

    /**
     * 超时调用
     * @return
     */
    @GetMapping(value = "/feign/timeout")
    public String paymentFeiginTimeout(){
        try {
            TimeUnit.SECONDS.sleep(3);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return serverPort;
    }

}

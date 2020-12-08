package com.gao.service;

/**
 * @program: tx_springcloud_02
 * @description: 支付的接口
 * @author: gaowz
 * @create: 2020-11-26 22:43
 **/
public interface IPaymentService {

    public String paymentInfo_Ok(Integer id);

    public String paymentInfo_Timeout(Integer id);
}

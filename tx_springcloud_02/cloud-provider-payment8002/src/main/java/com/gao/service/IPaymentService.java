package com.gao.service;

import com.gao.domain.Payment;

/**
 * @program: tx_springcloud_02
 * @description: 支付的业务层接口
 * @author: gaowz
 * @create: 2020-11-13 15:43
 **/
public interface IPaymentService {

    Payment getPaymentById(Long id);

    int addPayment(Payment payment);
}

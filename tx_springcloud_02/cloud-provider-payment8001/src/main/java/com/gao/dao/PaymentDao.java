package com.gao.dao;

import com.gao.domain.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @program: tx_springcloud_02
 * @description: 支付服务的持久层
 * @author: gaowz
 * @create: 2020-11-13 15:38
 **/
@Mapper
public interface PaymentDao {

    int addPayment(Payment payment);

    Payment getPaymentById(Long ID);

}

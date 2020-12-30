package com.gao.controller;

import com.gao.domain.TestMessage;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

/**
 * @program: tx_springcloud_02
 * @description: mq控制层
 * @author: gaowz
 * @create: 2020-12-27 22:56
 **/
@Service
@RocketMQMessageListener(consumerGroup = "consumer-group",topic = "add-bonus")
public class TestMessageController implements RocketMQListener<TestMessage> {


    @Override
    public void onMessage(TestMessage testMessage) {

        System.out.println("消费到消息=>" +testMessage.toString());
    }
}

package com.gao.mqservice;

import com.gao.domain.TestMessage;
import com.sun.xml.internal.ws.developer.Serialization;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

/**
 * @program: tx_springcloud_02
 * @description: 测试消息
 * @author: gaowz
 * @create: 2020-12-29 10:25
 **/
@Service
@RocketMQMessageListener(consumerGroup = "consumer-group",topic = "add-bonus")
public class TestMQService implements RocketMQListener<TestMessage> {
    @Override
    public void onMessage(TestMessage testMessage) {
        System.out.println("消费的内容是=> " + testMessage);
    }
}

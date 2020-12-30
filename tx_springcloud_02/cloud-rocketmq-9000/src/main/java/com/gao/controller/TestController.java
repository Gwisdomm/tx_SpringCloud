package com.gao.controller;

import com.gao.domain.TestMessage;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @program: tx_springcloud_02
 * @description: 消息的控制层
 * @author: gaowz
 * @create: 2020-12-27 21:58
 **/
@RestController
public class TestController {

    @Resource
    private RocketMQTemplate rocketMQTemplate;

    /**
     * 普通消息投递
     * @param msg
     * @return
     */
    @RequestMapping("/test")
    public String testMq(String msg){
        for (int i = 0; i < 1000 ; i++){
            TestMessage testMessage = new TestMessage();
            testMessage.setMsgId(UUID.randomUUID().toString());
            testMessage.setMsgTest(msg);
            rocketMQTemplate.convertAndSend("add-bonus",testMessage);
        }
        return "投递消息=> " +msg + "= > 成功";
    }
}

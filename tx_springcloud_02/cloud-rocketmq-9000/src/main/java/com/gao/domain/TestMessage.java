package com.gao.domain;

import lombok.experimental.Accessors;
import org.springframework.context.annotation.Bean;

/**
 * @program: tx_springcloud_02
 * @description: 测试消息
 * @author: gaowz
 * @create: 2020-12-27 21:56
 **/

@Accessors(chain = true)
public class TestMessage {

    private String msgId; //消息id
    private String msgTest; //消息内容

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public String getMsgTest() {
        return msgTest;
    }

    public void setMsgTest(String msgTest) {
        this.msgTest = msgTest;
    }

    @Override
    public String toString() {
        return "TestMessage{" +
                "msgId='" + msgId + '\'' +
                ", msgTest='" + msgTest + '\'' +
                '}';
    }
}

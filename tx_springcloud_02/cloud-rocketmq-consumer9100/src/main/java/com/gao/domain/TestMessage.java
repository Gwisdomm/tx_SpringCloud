package com.gao.domain;

/**
 * @program: tx_springcloud_02
 * @description: 消息的实体
 * @author: gaowz
 * @create: 2020-12-29 10:24
 **/
public class TestMessage {

    private String msgId;

    private String msgBody;

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public String getMsgBody() {
        return msgBody;
    }

    public void setMsgBody(String msgBody) {
        this.msgBody = msgBody;
    }

    @Override
    public String toString() {
        return "TestMessage{" +
                "msgId='" + msgId + '\'' +
                ", msgBody='" + msgBody + '\'' +
                '}';
    }
}

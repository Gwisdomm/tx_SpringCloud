package com.gao.domain;

/**
 * @program: tx_springcloud_02
 * @description: 测试消息实体
 * @author: gaowz
 * @create: 2020-12-27 22:54
 **/
public class TestMessage {

    private String msgId;
    private String msgText;

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public String getMsgText() {
        return msgText;
    }

    public void setMsgText(String msgText) {
        this.msgText = msgText;
    }

    @Override
    public String toString() {
        return "TestMessage{" +
                "msgId='" + msgId + '\'' +
                ", msgText='" + msgText + '\'' +
                '}';
    }

}

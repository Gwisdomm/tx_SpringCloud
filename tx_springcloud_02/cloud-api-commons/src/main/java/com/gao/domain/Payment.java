package com.gao.domain;

/**
 * @program: tx_springcloud_02
 * @description: 支付的实体类-公共服务
 * @author: gaowz
 * @create: 2020-11-11 16:28
 **/
public class Payment {
    private Long id;
    private String serial;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

}

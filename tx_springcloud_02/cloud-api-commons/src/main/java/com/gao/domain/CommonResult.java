package com.gao.domain;

import java.io.Serializable;

/**
 * @program: tx_springcloud_02
 * @description: 返回给前端的数据
 * @author: gaowz
 * @create: 2020-11-11 16:30
 **/
public class CommonResult<T> implements Serializable {
    // 404 not_found
    private Integer code;
    private String  message;
    private T       data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public CommonResult(){

    }
    public CommonResult(Integer code, String message){
        this(code,message,null);
    }
    public CommonResult(Integer code, String message, T data){
        this.code = code;
        this.message = message;
        this.data = data;
    }
}

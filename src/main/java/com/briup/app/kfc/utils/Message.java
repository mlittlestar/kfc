package com.briup.app.kfc.utils;

/**
 * @program: tb_app01
 * @description: 统一消息
 * @author: charles
 * @create: 2019-04-30 11:09
 **/

public class Message {
    private Integer status; //200 500
    private String message; //保存成功
    private Object data;    //[]/{}
    private Long timestamp; //时间戳

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}

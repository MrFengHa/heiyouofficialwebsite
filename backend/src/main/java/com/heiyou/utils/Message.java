package com.heiyou.utils;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

//统一返回结果的类
@Data
public class Message {

    private Boolean success;

    private Integer code;

    private String message;

    private Map<String, Object> data = new HashMap<String, Object>();

    //把构造方法私有
    private Message() {}

    //成功静态方法
    public static Message ok() {
        Message message = new Message();
        message.setSuccess(true);
        message.setCode(20000);
        message.setMessage("成功");
        return message;
    }

    //失败静态方法
    public static Message error() {
        Message message = new Message();
        message.setSuccess(false);
        message.setCode(20001);
        message.setMessage("失败");
        return message;
    }

    public Message success(Boolean success){
        this.setSuccess(success);
        return this;
    }

    public Message message(String message){
        this.setMessage(message);
        return this;
    }

    public Message code(Integer code){
        this.setCode(code);
        return this;
    }

    public Message data(String key, Object value){
        this.data.put(key, value);
        return this;
    }

    public Message data(Map<String, Object> map){
        this.setData(map);
        return this;
    }
}

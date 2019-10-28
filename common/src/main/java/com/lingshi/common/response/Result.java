package com.lingshi.common.response;

import com.lingshi.common.exception.ErrorCode;

import java.io.Serializable;

/**
 * @ClassName: Result
 * @Create By: chenxihua
 * @Date: 2019/9/11 10:05
 *
 * 因为是要返回到页面, 所有,这个要继续 Serializable 序列化接口,
 *
 */
public class Result<T> implements Serializable {


    private Integer code;
    private String msg;
    T data;

    public Result(){
    }

    public Result(ErrorCode errorCode){
        this.code = errorCode.getCode();
        this.msg = errorCode.getMsg();
    }

    public Result(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

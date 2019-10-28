package com.lingshi.common.exception;

/**
 * @ClassName: CustomException
 * @Create By: chenxihua
 * @Date: 2019/9/25 10:31
 */
public class CustomException extends RuntimeException {

    public CustomException() {
        super("自定义了一个异常");
    }
    public CustomException(String errorMessage){
        super(errorMessage);
    }



}

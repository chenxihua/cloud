package com.lingshi.common.exception;

/**
 * @ClassName: ErrorCode
 * @Create By: chenxihua
 * @Date: 2019/9/11 10:05
 */
public enum ErrorCode {


    SUCCESS_CODE(0, "操作成功"),

    UNKNOWN_ERROR(100, "发生未知异常"),
    FALSE_CODE(-1, "操作失败");

    private Integer code;
    private String msg;

    ErrorCode(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public int getCode(){
        return code;
    }

    public String getMsg(){
        return msg;
    }

    // 循环获取
    public static String getResultCode(int code){
        for (ErrorCode errorCode : ErrorCode.values()){
            if (code==errorCode.getCode()){
                return errorCode.getMsg();
            }
        }
        return UNKNOWN_ERROR.getMsg();
    }


}

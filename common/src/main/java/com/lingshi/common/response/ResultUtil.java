package com.lingshi.common.response;

import com.lingshi.common.exception.ErrorCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName: ResultUtil
 * @Create By: chenxihua
 * @Date: 2019/9/11 10:14
 */
public class ResultUtil {

    private final static Logger logger = LoggerFactory.getLogger(ResultUtil.class);


    public static Result SUCCESS = new Result(ErrorCode.SUCCESS_CODE);
    public static Result FALSE = new Result(ErrorCode.FALSE_CODE);

    public static Result success(){
        return SUCCESS;
    }

    public static Result error(){
        return FALSE;
    }

    public static Result success(String msg){
        Result result = new Result();
        result.setCode(0);
        result.setMsg(msg);
        return result;
    }

    public static Result success(String msg, Object obj){
        Result result = new Result();
        result.setCode(0);
        result.setMsg(msg);
        result.setData(obj);
        return result;
    }

    public static Result error(ErrorCode errorCode){
        Result result = new Result();
        result.setCode(errorCode.getCode());
        result.setMsg(errorCode.getMsg());
        return result;
    }

    public static Result error(Integer code, String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }


}

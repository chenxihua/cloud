package com.lingshi.producer.controller;

import com.lingshi.common.exception.ErrorCode;
import com.lingshi.common.response.Result;
import com.lingshi.common.response.ResultUtil;
import com.lingshi.producer.bean.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName: UserController
 * @Author: chenxihua
 * @Date: 2019/9/4 14:47
 * @Version: 1.0
 */
@Api("服务提供者 swagger")
@RestController
@RequestMapping(value = "/pro")
public class UserController {


    @Value("${server.port}")
    private String port;

    private final static Logger logger = LoggerFactory.getLogger(UserController.class);


    @ApiOperation("获取用户id集合")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Integer")
    @GetMapping(value = "/user")
    public Result getUser(@RequestParam Integer id){

        return ResultUtil.success("端口："+port, id);
    }


    @ApiOperation("传入一个用户实体")
    @ApiImplicitParam(name = "user", value = "用户实体", required = true, dataType = "User")
    @PostMapping(value = "/save")
    public Result saveUser(@RequestBody User user){
        logger.warn("你想传入实体, 进行保存....");
        return ResultUtil.success("传入的实体： "+user);
    }


    @ApiOperation("获取错误的日志消息")
    @GetMapping(value = "/getError")
    public Result getError(){
        logger.warn("你正在调用 warn 日志");
        return ResultUtil.error(ErrorCode.UNKNOWN_ERROR);
    }

}

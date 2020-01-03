package com.lingshi.producer.controller;

import com.lingshi.common.exception.ErrorCode;
import com.lingshi.common.response.Result;
import com.lingshi.common.response.ResultUtil;
import com.lingshi.producer.bean.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: UserController
 * @Author: chenxihua
 * @Date: 2019/9/4 14:47
 * @Version: 1.0
 */
@RestController
@RequestMapping(value = "/pro")
public class UserController {


    @Value("${server.port}")
    private String port;

    private final static Logger logger = LoggerFactory.getLogger(UserController.class);


    @GetMapping(value = "/user")
    public Result getUser(@RequestParam("id") Integer id){
        return ResultUtil.success("端口："+port, id);
    }


    @PostMapping(value = "/save")
    public Result saveUser(@RequestBody User user){
        logger.warn("你想传入实体, 进行保存....");
        return ResultUtil.success("传入的实体： "+user);
    }


    @GetMapping(value = "/getError")
    public Result getError(){
        logger.warn("你正在调用 warn 日志");
        return ResultUtil.error(ErrorCode.UNKNOWN_ERROR);
    }

    @GetMapping(value = "/getById")
    public Map<String, Object> getJsonBean(@RequestParam Integer id){
        Map<String, Object> resultMap = new HashMap<>();
        User user = new User();
        user.setId(id);
        user.setUsername("chenxihua:"+id);
        user.setAge(10+id);
        user.setEmail(id+"@qq.com");

        resultMap.put("Message", ResultUtil.success("查询成功", user));
        return resultMap;
    }

}

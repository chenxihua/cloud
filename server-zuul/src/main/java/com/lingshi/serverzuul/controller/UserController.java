package com.lingshi.serverzuul.controller;

import com.lingshi.common.response.Result;
import com.lingshi.common.response.ResultUtil;
import com.lingshi.serverzuul.bean.User;
import com.lingshi.serverzuul.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName: UserController
 * @Create By: chenxihua
 * @Author: Administrator
 * @Date: 2020/1/6 9:26
 **/
@RestController
@RequestMapping(value = "/user")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @GetMapping(value = "/login")
    public Result getUser(@RequestParam String name, @RequestParam String pass){
        logger.warn("进来后： username: {},  password: {}", name, pass);
        Object userByName = userService.getUserByName(name);
        return ResultUtil.success("成功调用", userByName);
    }


    @GetMapping(value = "/byNameAndPass")
    public Result getUserAndPass(@RequestParam String name, @RequestParam String pass){
        Object userAndPass = userService.getUserAndPass(name, pass);
        return ResultUtil.success("成功调用", userAndPass);
    }


}

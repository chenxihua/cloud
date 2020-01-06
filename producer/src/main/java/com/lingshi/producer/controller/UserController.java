package com.lingshi.producer.controller;

import com.lingshi.common.exception.ErrorCode;
import com.lingshi.common.response.Result;
import com.lingshi.common.response.ResultUtil;
import com.lingshi.producer.bean.User;
import com.lingshi.producer.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
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


    @Autowired
    UserService userService;

    private final static Logger logger = LoggerFactory.getLogger(UserController.class);


    @GetMapping(value = "/user")
    public Result getUser(@RequestParam("id") Integer id){
        User user = userService.searchById(id);
        return ResultUtil.success("查到一个实体",user);
    }


    @PostMapping(value = "/save")
    public Result saveUser(@RequestBody User user){
        logger.warn("你想传入实体, 进行保存....", user);
        boolean saveUser = userService.saveUser(user);
        return ResultUtil.success("保存一个实体结果： ", saveUser);
    }


    @GetMapping(value = "/getAll")
    public Result getError(){
        List<User> users = userService.searchList();
        return ResultUtil.success("查询到的用户列表结果", users);
    }


    @GetMapping(value = "/getByUsername")
    public Result getByUsername(@RequestParam String username){
        User user = userService.searchByUsername(username);
        return ResultUtil.success("根据用户名，查", user);
    }


    @GetMapping(value = "/getByUserAndPass")
    public Result getByUsernameAndPass(@RequestParam String username, @RequestParam String pass){
        User user = userService.searchByUserAndPass(username, pass);
        return ResultUtil.success("用户名和密码查", user);
    }


}

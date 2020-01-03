package com.lingshi.consume.controller;

import com.lingshi.common.response.Result;
import com.lingshi.common.response.ResultUtil;
import com.lingshi.consume.bean.User;
import com.lingshi.consume.server.impl.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName: UserController
 * @Author: chenxihua
 * @Date: 2019/9/4 15:08
 * @Version: 1.0
 */

@RestController
@RequestMapping(value = "/cons")
public class UserController {

    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserServiceImpl userServiceImpl;


    @GetMapping(value = "/byId")
    public Result getDatas(@RequestParam Integer id){
        String byId = userServiceImpl.queryItemById(id);
        return ResultUtil.success(byId);
    }


    @GetMapping(value = "/andById")
    public Result getDatas2(@RequestParam Integer id){
        String queryItemById = userServiceImpl.queryItemById(id);
        return ResultUtil.success(queryItemById);
    }


    @GetMapping(value = "/andById3")
    public Result getDatas3(@RequestParam Integer id){
        String queryItemById = userServiceImpl.queryItemById2(id);
        return ResultUtil.success(queryItemById);
    }


    @PostMapping(value = "/andById4")
    public Result getDatas4(@RequestBody User user){
        Result result = userServiceImpl.saveUser(user);
        return result;
    }

    @GetMapping(value = "/andById5")
    public Result getDatas5(@RequestParam Integer id){
        Result jsonBean = userServiceImpl.getJsonBean(id);
        return jsonBean;
    }







}

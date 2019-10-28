package com.lingshi.consume.controller;

import com.lingshi.common.response.ResultUtil;
import com.lingshi.consume.bean.User;
import com.lingshi.consume.server.UserPro;
import com.lingshi.consume.server.UserService;
import com.lingshi.consume.server.impl.UserProImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
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

@Api("消费者 API")
@RestController
@RequestMapping(value = "/cons")
public class UserController {

    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @Autowired
    UserProImpl userPro;


//    @GetMapping(value = "/show/{id}")
//    public String getPro(@PathVariable Integer id){
//        logger.warn("show .. id "+id);
//        String product = userService.getProduct(id);
//        return product;
//    }

    @ApiOperation("获取用户id")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Integer")
    @GetMapping(value = "/get")
    public String getFeignData(@RequestParam Integer id){
        String haha = userPro.haha(id);
        return haha;
    }


    @ApiOperation("传入一个用户实体")
    @ApiImplicitParam(name = "user", value = "用户实体", required = true, dataType = "User")
    @PostMapping(value = "/add")
    public String saveDatas(@RequestBody User user){
        logger.info("通过feign调用...  "+user);
        return "通过feign调用，结果："+userPro.saveUUU(user);
    }

}

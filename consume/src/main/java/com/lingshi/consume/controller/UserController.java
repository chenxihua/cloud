//package com.lingshi.consume.controller;
//
//import com.lingshi.common.response.Result;
//import com.lingshi.common.response.ResultUtil;
//import com.lingshi.consume.bean.User;
//import com.lingshi.consume.server.impl.UserProImpl;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.*;
//
///**
// * @ClassName: UserController
// * @Author: chenxihua
// * @Date: 2019/9/4 15:08
// * @Version: 1.0
// */
//
//@RestController
//@RequestMapping(value = "/cons")
//public class UserController {
//
//    private final static Logger logger = LoggerFactory.getLogger(UserController.class);
//
//
//    @Autowired
//    UserProImpl userPro;
//
//
//    @GetMapping(value = "/get")
//    public Result getFeignData(@RequestParam Integer id){
//        String haha = userPro.haha(id);
//        return ResultUtil.success(haha);
//    }
//
//
//    @PostMapping(value = "/add")
//    public Result saveDatas(@RequestBody User user){
//        Map<String, Object> map = new HashMap<>();
//        logger.info("通过feign调用...  "+user);
//        String saveUUU = userPro.saveUUU(user);
//        return ResultUtil.success("通过feign调用，结果", saveUUU);
//    }
//
//
//    @GetMapping(value = "/mySelfID")
//    public Result getId(@RequestParam Integer id){
//        return ResultUtil.success("我自调用自己", id);
//    }
//
//
//
//}

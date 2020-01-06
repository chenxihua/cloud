package com.lingshi.serverzuul.service;

import com.lingshi.common.response.Result;
import com.lingshi.serverzuul.bean.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: UserService
 * @Create By: chenxihua
 * @Author: Administrator
 * @Date: 2020/1/6 9:27
 **/
@Service
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    UserFeign userFeign;


    public Object getUserByName(String username){
        Result byUsername = userFeign.getByUsername(username);
        logger.warn("1: data   {}", byUsername);
        if (byUsername.getData()!=null){
            return byUsername.getData();
        }
        return null;
    }

    public Object getUserAndPass(String username, String password){
        Result byUsernameAndPass = userFeign.getByUsernameAndPass(username, password);
        logger.warn("2: data   {}", byUsernameAndPass);
        if (byUsernameAndPass.getData()!=null){
            return byUsernameAndPass.getData();
        }
        return null;
    }



}

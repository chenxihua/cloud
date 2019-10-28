package com.lingshi.consume.server.impl;

import com.lingshi.consume.bean.User;
import com.lingshi.consume.server.UserPro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: UserProImpl
 * @Author: chenxihua
 * @Date: 2019/9/9 16:02
 * @Version: 1.0
 */
@Service
public class UserProImpl {


    @Autowired
    UserPro userPro;

    public String haha(Integer id){
        return userPro.getUserData(id);
    }


    public String saveUUU(User user){
        return userPro.saveUser(user);
    }


}

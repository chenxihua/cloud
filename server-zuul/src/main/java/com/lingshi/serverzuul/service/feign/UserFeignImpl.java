package com.lingshi.serverzuul.service.feign;

import com.lingshi.common.response.Result;
import com.lingshi.common.response.ResultUtil;
import com.lingshi.serverzuul.service.UserFeign;
import org.springframework.stereotype.Component;

/**
 * @ClassName: UserFeignImpl
 * @Create By: chenxihua
 * @Author: Administrator
 * @Date: 2020/1/6 9:33
 **/
@Component
public class UserFeignImpl implements UserFeign {
    @Override
    public Result getByUsername(String username) {
        return ResultUtil.error(406, "远程调用失败，无法查到此用户: "+username);
    }

    @Override
    public Result getByUsernameAndPass(String username, String pass) {
        return ResultUtil.error(406, "远程调用失败，无法查询用户和密码: "+username+"; "+pass);
    }
}

package com.lingshi.consume.server.fallBack;

import com.lingshi.common.response.Result;
import com.lingshi.common.response.ResultUtil;
import com.lingshi.consume.bean.User;
import com.lingshi.consume.server.UserServiceFeign;
import org.springframework.stereotype.Component;


/**
 * @ClassName: UserServiceFallBack
 * @Create By: chenxihua
 * @Author: Administrator
 * @Date: 2020/1/3 11:07
 **/
@Component
public class UserServiceFallBack implements UserServiceFeign {

    @Override
    public Result getUser(Integer id) {
        return ResultUtil.error(404, "这里是 feign 远程调用失败啊，大哥。。。");
    }

    @Override
    public Result saveUser(User user) {
        return ResultUtil.error(405, "feign 保存用户时，失败。。。");
    }

    @Override
    public Result getJsonBean() {
        return ResultUtil.error(404, "查询所有用户失败。。。");
    }
}

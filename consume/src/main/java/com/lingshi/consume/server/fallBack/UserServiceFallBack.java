package com.lingshi.consume.server.fallBack;

import com.lingshi.common.response.Result;
import com.lingshi.common.response.ResultUtil;
import com.lingshi.consume.bean.User;
import com.lingshi.consume.server.UserServiceFeign;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

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
    public Map<String, Object> getJsonBean(Integer id) {
        Map<String, Object> result = new HashMap<>(2);
        result.put("code", 407);
        result.put("msg", "错啦，map");
        return result;
    }
}

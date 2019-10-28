package com.lingshi.consume.server;

import com.lingshi.consume.bean.User;
import com.lingshi.consume.server.fallBack.UserProFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName: UserPro
 * @Author: chenxihua
 * @Date: 2019/9/9 15:51
 * @Version: 1.0
 */
// 定义要远程调用的服务名, 并且设置, 如果调用超时,要使用的回调类.
@FeignClient(name = "producer", fallback = UserProFallBack.class)
public interface UserPro {


    /**
     * 调用别人的，如果有参数，必须要在方法里面添加 @RequestParam("") 注解
     *      -- 否则找不到这个参数的，会报405错误
     * @param id
     * @return
     */
    @GetMapping(value = "/pro/user")
    String getUserData(@RequestParam("id") Integer id);


    @PostMapping(value = "/pro/save")
    String saveUser(@RequestBody User user);

}

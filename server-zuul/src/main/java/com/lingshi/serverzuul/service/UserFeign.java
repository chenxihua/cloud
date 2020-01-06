package com.lingshi.serverzuul.service;

import com.lingshi.common.response.Result;
import com.lingshi.serverzuul.service.feign.UserFeignImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName: UserFeign
 * @Create By: chenxihua
 * @Author: Administrator
 * @Date: 2020/1/6 9:28
 **/
@FeignClient(value = "producer", fallback = UserFeignImpl.class)
public interface UserFeign {

    @GetMapping(value = "/pro/getByUsername")
    Result getByUsername(@RequestParam("username") String username);

    @GetMapping(value = "/pro/getByUserAndPass")
    Result getByUsernameAndPass(@RequestParam("username") String username, @RequestParam("pass") String pass);




}

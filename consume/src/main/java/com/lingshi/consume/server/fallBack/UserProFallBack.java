//package com.lingshi.consume.server.fallBack;
//
//import com.lingshi.consume.bean.User;
//import com.lingshi.consume.server.UserPro;
//import org.springframework.stereotype.Component;
//
///**
// * @ClassName: UserProFallBack
// * @Create By: chenxihua
// * @Date: 2019/9/26 11:28
// *
// * 这些类, 是调用远程调用接口使用的, 主要是远程调用如果超时, 则返回这个接口的数据.
// *
// */
//@Component
//public class UserProFallBack implements UserPro {
//
//    @Override
//    public String getUserData(Integer id) {
//        return "调用超时了, 使用 getUserData 这个接口的方法";
//    }
//
//    @Override
//    public String saveUser(User user) {
//        return "调用超时了, 使用这个 saveUser 接口的方法";
//    }
//
//    @Override
//    public String getUserById(Integer id) {
//        return "调用超时了, 使用 getUserById 这个接口的方法";
//    }
//}

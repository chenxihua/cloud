package com.lingshi.producer.service;

import com.lingshi.producer.bean.User;
import com.lingshi.producer.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @ClassName: UserService
 * @Create By: chenxihua
 * @Author: Administrator
 * @Date: 2020/1/5 15:05
 **/
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;


    public boolean saveUser(User user){
        User save = userRepository.save(user);
        if (save!=null){
            return true;
        }
        return false;
    }


    public List<User> searchList(){
        List<User> userList = userRepository.findAll();
        return userList;
    }


    public User searchById(Integer id){
        Optional<User> byId = userRepository.findById(id);
        if (byId.isPresent()){
            return byId.get();
        }
        return null;
    }


    public User searchByUserAndPass(String username, String password){
        User usernameAndPassword = userRepository.findByUsernameAndPassword(username, password);
        if (usernameAndPassword!=null){
            return usernameAndPassword;
        }
        return null;
    }


    public User searchByUsername(String username){
        User distinctFirstByUsername = userRepository.findDistinctFirstByUsername(username);
        if (distinctFirstByUsername!=null){
            return distinctFirstByUsername;
        }
        return null;
    }


}

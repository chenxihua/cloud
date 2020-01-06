package com.lingshi.producer.dao;

import com.lingshi.producer.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @ClassName: UserRepository
 * @Create By: chenxihua
 * @Author: Administrator
 * @Date: 2020/1/5 15:03
 **/
public interface UserRepository extends JpaRepository<User, Integer>, JpaSpecificationExecutor<User> {

    User findByUsernameAndPassword(String username, String password);

    /**
     * 这个是查找唯一的
     * @param username
     * @return
     */
    User findDistinctFirstByUsername(String username);

}

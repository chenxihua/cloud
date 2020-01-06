package com.lingshi.serverzuul.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName: User
 * @Create By: chenxihua
 * @Author: Administrator
 * @Date: 2020/1/6 9:51
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private Integer id;

    private String username;

    private String password;

    private Integer age;

    private String email;

}

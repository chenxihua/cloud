package com.lingshi.consume.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: User
 * @Author: chenxihua
 * @Date: 2019/9/10 8:58
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {


    private Integer id;

    private String username;

    private Integer age;

    private String email;


}

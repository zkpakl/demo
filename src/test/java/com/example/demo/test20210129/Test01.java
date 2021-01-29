package com.example.demo.test20210129;

import lombok.Data;
import org.junit.Test;

/**
 * @author zuokun
 * @date 2021/1/29 13:41
 */
public class Test01 {
    @Test
    public void addUser(){
        User user = new User();
        initUser(user);
        user.setPassword("");
        user.setUserName("");
        return ;
    }

    public void initUser(User user){
        user  = new User();
        user.setPassword("1");
    }


    @Data
    class User {
        private String userName;
        private String password;
    }
}

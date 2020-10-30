package com.example.demo.controller;

import com.example.demo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class Test02Controller {

    @GetMapping("/test01")
    private User UserController03(User user){
        System.out.println(user.getName());
        System.out.println(user.getAge());
        user.setGender("妖");
        user.setMotto("上班摸鱼");
        System.out.println(user);
        return user;
    }

    @GetMapping("/test02")
    private User TestController02(@RequestBody User user){
        System.out.println(user.getName());
        System.out.println(user.getAge());
        user.setGender("妖");
        user.setMotto("上班摸鱼");
        System.out.println(user);
        return user;
    }

    @GetMapping("/test03")
    private User TestController03(String username,String age,User user){
        System.out.println(username);
        System.out.println(user.getName());
        System.out.println(user.getAge());
        return user;
    }

    @GetMapping("test04")
    private User TestContorller04(@RequestParam("gen") String gender,User user){
        System.out.println(gender);
        System.out.println(user.getGender());
        return user;
    }

}

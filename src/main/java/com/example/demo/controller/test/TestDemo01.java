package com.example.demo.controller.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zuokun
 * @description
 * @date 2021/2/20 13:49
 */
@RestController
public class TestDemo01 {


    @GetMapping("/test")
    public String test(){

        return "hello world";
    }
}

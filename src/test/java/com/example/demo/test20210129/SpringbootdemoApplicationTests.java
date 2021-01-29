package com.example.demo.test20210129;

import com.example.demo.config.TestConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootdemoApplicationTests {
    @Autowired
    TestConfig testConfig;
    @Test
    void contextLoads() {
        System.out.println(testConfig.getName());
        System.out.println(testConfig.getBlogUrl());
    }

}
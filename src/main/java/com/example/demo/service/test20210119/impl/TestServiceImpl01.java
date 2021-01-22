package com.example.demo.service.test20210119.impl;


import com.example.demo.dao.test20210119.TestDao01;
import com.example.demo.entities.test20210119.TestUser01;
import com.example.demo.service.test20210119.TestService01;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zuokun
 * @date 2021/1/19 14:01
 */
@Service
public class TestServiceImpl01 implements TestService01 {
    @Autowired
    private TestDao01 testDao01;

    @Override
    public List<TestUser01> Select(String id) {

        List<TestUser01> user01List = testDao01.select(id);
        System.out.println(user01List);
        return user01List;
    }
}

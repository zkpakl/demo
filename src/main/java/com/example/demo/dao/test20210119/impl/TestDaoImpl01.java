package com.example.demo.dao.test20210119.impl;

import com.example.demo.dao.test20210119.TestDao01;
import com.example.demo.entities.test20210119.TestUser01;
import com.example.demo.mapper.test20210119.SelectMapper01;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author zuokun
 * @date 2021/1/19 14:03
 */
@Component
public class TestDaoImpl01 implements TestDao01 {
    @Autowired
    private SelectMapper01 selectMapper01;

    public void TestDaoImpl01(String a){

    }

    @Override
    public List<TestUser01> select(String id) {
        return selectMapper01.Select01(id);
    }
}

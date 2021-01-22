package com.example.demo.dao.test20210119;

import com.example.demo.entities.test20210119.TestUser01;

import java.util.List;

/**
 * @author zuokun
 * @date 2021/1/19 14:02
 */

public interface TestDao01 {

    List<TestUser01> select(String id);
}

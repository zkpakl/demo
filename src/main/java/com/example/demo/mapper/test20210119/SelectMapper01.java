package com.example.demo.mapper.test20210119;

import com.example.demo.entities.test20210119.TestUser01;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zuokun
 * @date 2021/1/19 14:11
 */
@Repository
public interface SelectMapper01 {

    /**
     * 测试能否连接MySQL正常查询
     * @param id
     * @return
     */
    List<TestUser01> Select01(String id);
}

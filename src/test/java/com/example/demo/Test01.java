package com.example.demo;

import org.apache.commons.collections.map.HashedMap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zuokun
 * @description
 * @date 2021/3/26 19:07
 */
public class Test01 {
    public static void main(String[] args) {
        Map<Student,String> m = new HashMap<>();
        m.put(new Student("张三",12,"男"),"01");

        // 如果不重写hashcode此时输出的是null
        System.out.println(m.get(new Student("张三",12,"男")));


    }
}

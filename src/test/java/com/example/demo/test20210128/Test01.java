package com.example.demo.test20210128;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * @author zuokun
 * @date 2021/1/28 16:49
 */
public class Test01 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("1","2","1","1");
        System.out.println(removeDuplicates(list));
        // 输出结果为[1,2]
    }
    // 去重,List转Set再转List
    protected static <T> List<T> removeDuplicates(List<T> list) {
        return new ArrayList(new LinkedHashSet(list));
    }
}
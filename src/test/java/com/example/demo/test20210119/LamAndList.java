package com.example.demo.test20210119;

import com.example.demo.config.BaseException;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author zuokun
 * @date 2021/1/19 9:39
 */
@Slf4j
public class LamAndList {

    @Test
    public void Test01() throws Exception {
        List<String> strings = Arrays.asList("abc", " ", "bc", "efg", "abcd", " ", "jkl");
        List<String> list = new ArrayList<>();
        List<String> strings1 = Optional.ofNullable(list).orElseGet(() -> {
            System.out.println("用户待办任务为空");
            return new ArrayList<>();
        });
        User user = new User();
        user = null;
        Optional.ofNullable(user).orElseThrow(() -> new BaseException("aaa"));


//        List<String> filtered = strings.stream()
//                .filter(string -> !string.equals(" "))
//                .collect(Collectors.toList());
//
//        strings.stream()
//                .filter(string -> !string.equals(" "))
//                .forEach((String s) -> System.out.println(s));
//
//        filtered.forEach(s -> {
//            System.out.println(s);
//        });
//        System.out.println(filtered);
        System.out.println(strings1);
    }

    @Data
    class User {
        private String name;
        private String age;
    }
}

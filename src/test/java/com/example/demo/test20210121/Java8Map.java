package com.example.demo.test20210121;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zuokun
 * @date 2021/1/21 10:06
 */
@Slf4j
public class Java8Map {


    @Test
    public void toMap(){
        List<User> list = new ArrayList<>();
        User user1 = new User("张三","男");
        User user2 = new User("李四","女");
        User user3 = new User("张三","女");
        list.add(user1);
        list.add(user2);
        list.add(user3);
        List<String> 结果 = list.stream()
                .filter(user -> StringUtils.equals(user.getName(), "张三"))
                .map(User::getGender)
                .collect(Collectors.toList());
        log.info("结果为"+结果);

    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    class User{
        private String name;
        private String gender;
    }
}

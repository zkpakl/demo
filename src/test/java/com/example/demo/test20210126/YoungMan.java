package com.example.demo.test20210126;

/**
 * @author zuokun
 * @date 2021/1/26 10:18
 */
public class YoungMan implements Female {

    @Override
    public String findWife(String str) {
        System.out.println("我喜欢"+str);
        return str;
    }
}

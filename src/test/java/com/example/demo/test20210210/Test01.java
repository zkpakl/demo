package com.example.demo.test20210210;

import java.util.Objects;

/**
 * @author zuokun
 * @description
 * @date 2021/2/10 10:29
 */
public class Test01 {
    public static void main(String[] args) {
        String ifReturn = ifReturn("蔡鸡美");
        System.out.println(ifReturn);
    }
    public static String ifReturn(String str){
        if(Objects.equals(str,"蔡鸡美")){
            return str+"唱跳rap打篮球";
        }
        return "蔡萝莉嘤嘤嘤";
    }
}

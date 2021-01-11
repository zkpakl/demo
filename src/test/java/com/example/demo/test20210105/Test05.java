package com.example.demo.test20210105;


import org.apache.commons.lang3.StringUtils;

/**
 * @author zuokun
 * @date 2021/1/5 16:33
 */
public class Test05 {
    public static void main(String[] args) {
        boolean b1= StringUtils.isNotEmpty("null");
        System.out.println("====="+b1);
        boolean b2=StringUtils.isNotEmpty("");
        System.out.println("-----"+b2);
        boolean b3=StringUtils.isNotEmpty(" ");
        System.out.println("*****"+b3);
        boolean b4=StringUtils.isNotEmpty("abc");
        System.out.println("######"+b4);

    }
}

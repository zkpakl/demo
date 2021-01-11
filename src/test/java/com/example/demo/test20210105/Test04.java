package com.example.demo.test20210105;


import org.apache.commons.lang3.StringUtils;

/**
 * @author zuokun
 * @date 2021/1/5 16:32
 */
public class Test04 {
    public static void main(String[] args) {
        boolean b1= StringUtils.isEmpty("null");
        System.out.println("====="+b1);
        boolean b2=StringUtils.isEmpty("");
        System.out.println("-----"+b2);
        boolean b3=StringUtils.isEmpty(" ");
        System.out.println("*****"+b3);
        boolean b4=StringUtils.isEmpty("abc");
        System.out.println("######"+b4);
        boolean b5=StringUtils.isEmpty("\t \n" +
                " \f \n");
        System.out.println("@@@@@"+b5);
    }
}

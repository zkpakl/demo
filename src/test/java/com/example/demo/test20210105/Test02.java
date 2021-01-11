package com.example.demo.test20210105;

import org.apache.commons.lang3.StringUtils;

/**
 * @author zuokun
 * @date 2021/1/5 16:28
 */
public class Test02 {
    public static void main(String[] args) {
        boolean b1= StringUtils.isBlank("null");
        System.out.println("b1:"+b1);
        boolean b2=StringUtils.isBlank("");
        System.out.println("b2:"+b2);
        boolean b3=StringUtils.isBlank(" ");
        System.out.println("b3:"+b3);
        boolean b4= StringUtils.isBlank("\t \n \f \r");//对于制表符、换行符、换页符和回车符StringUtils.isBlank()均识为空白符
        System.out.println("b4:"+b4);
        boolean b5= StringUtils.isBlank("\b");//"\b"为单词边界符
        System.out.println("b5:"+b5);
        boolean b6=StringUtils.isBlank("abc");
        System.out.println("b6:"+b6);
    }
}

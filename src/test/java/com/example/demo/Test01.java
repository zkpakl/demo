package com.example.demo;

/**
 * @author zuokun
 * @description
 * @date 2021/2/25 20:03
 */
public class Test01 {
    public static void main(String[] args) {
        System.out.println(fanzhuan("123"));
    }

    public static String fanzhuan(String str){
        char[] chars = str.toCharArray();
        int length = chars.length;
        String res  = "";
        for (int i = length-1; i >=0 ; i--) {
            res+=chars[i];
        }
        return res;
    }
}

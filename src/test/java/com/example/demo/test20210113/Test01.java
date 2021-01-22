package com.example.demo.test20210113;

/**
 * @author zuokun
 * @date 2021/1/13 9:57
 */
public class Test01 {
    public static void main(String[] args) {
        String str = "1211";
        String string = new String("1111");
        string.length();
        // 返回索引对应的值
        System.out.println(str.charAt(1));
        // 返回对应的ASCII码值
        System.out.println(str.codePointAt(0));
        // 返回对应的前一个ASCII码值
        System.out.println(str.codePointBefore(2));

    }
}

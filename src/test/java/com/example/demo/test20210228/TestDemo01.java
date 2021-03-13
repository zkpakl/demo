package com.example.demo.test20210228;

import com.sun.xml.internal.ws.api.client.WSPortInfo;

public class TestDemo01 {
    public static void main(String[] args) {
//        OneNum(1000);
//        OneStr("plmm");
        int a = 10;
        System.out.println(a);
        change(a);
        System.out.println(a);
    }

    public static void OneNum(int num){
        System.out.println(num);
        num = 100;
        System.out.println(num);
    }
    public static void OneStr(String str){
        System.out.println(str);
        str = "hello";
        System.out.println(str);
    }
    public static void change(int a){
        a = 50;
        System.out.println(a);
    }
}

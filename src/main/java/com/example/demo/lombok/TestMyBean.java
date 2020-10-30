package com.example.demo.lombok;

public class TestMyBean {
    public static void main(String[] args){
        MyTestBean m=new MyTestBean();
        m.setId(1);
        m.setName("zhangsan");
        m.setPassword("123456");
        System.out.println(m);
    }
}
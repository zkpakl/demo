package com.example.demo;

/**
 * @author zuokun
 * @date 2021/1/25 14:35
 */
public class Student {
    public String name;
    public Integer age;
    private String gender;

    public Student() {
        System.out.println("这是一个空参构造");
    }

    public Student(String name) {
        this.name = name;
        System.out.println("姓名："+name);
    }

    private Student(Integer age) {
        this.age = age;
        System.out.println("年龄："+age);
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
        System.out.println("姓名："+name+"  年龄："+age);
    }

    public Student(String name, Integer age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void t1(){
        System.out.println("无参的方法名：t1");
    }

    public void t2(Integer age){
        System.out.println("有一个参数的方法：t2");
    }

    private void t2(String name){
        System.out.println("私有方法名：t3");
    }

    public String t3(String name,Integer age){
        return "有两个参数方法t2";
    }

    public static void m6(String[] strs) {
        System.out.println(strs.length);
    }

    public static void main(String[] args) {
        System.out.println("main");
    }


}

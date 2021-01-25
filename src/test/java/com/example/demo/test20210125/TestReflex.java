package com.example.demo.test20210125;

import com.example.demo.Person;

import java.lang.reflect.Field;

/**
 * @author zuokun
 * @date 2021/1/25 11:38
 */
public class TestReflex {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Person person = new Person();
        Class<? extends Person> aClass = person.getClass();
        System.out.println(aClass.getName());

        Class<?> aClass1 = Class.forName("com.example.demo.Person");
        System.out.println(aClass1.getName());

        Class aclass2 = Person.class;
        System.out.println(aclass2.getName());

        // 创建字符串"Hello World"， 并赋给引用s
        String s = "Hello World";

        System.out.println("s = " + s); // Hello World

        // 获取String类中的value字段
        Field valueFieldOfString = String.class.getDeclaredField("value");

        // 改变value属性的访问权限
        // 由于JDK的安全检查耗时较多.所以通过setAccessible(true)的方式关闭安全检查就可以达到提升反射速度的目的
        valueFieldOfString.setAccessible(true);

        // 获取s对象上的value属性的值
        char[] value = (char[]) valueFieldOfString.get(s);

        // 改变value所引用的数组中的第5个字符
        value[5] = '_';

        System.out.println("s = " + s); // Hello_World


    }
}

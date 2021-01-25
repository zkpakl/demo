package com.example.demo.test20210125;

import com.example.demo.Student;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author zuokun
 * @date 2021/1/25 14:39
 */
public class Test01Reflex {


    @Test
    public void test01() throws Exception {

        // 反射调用无参构造函数
        // 调用字节码文件
        Class<?> aClass1 = Class.forName("com.example.demo.Student");
        Constructor<?> constructor1 = aClass1.getConstructor(null);
        constructor1.newInstance(null);

        // 反射构造有一个参数的构造函数
        Class<?> aClass2 = Class.forName("com.example.demo.Student");
        Constructor<?> constructor2 = aClass2.getConstructor(String.class);
        constructor2.newInstance("张三");

        // 反射构造两个参数的构造函数
        Class<?> aClass3 = Class.forName("com.example.demo.Student");
        Constructor<?> constructor3 = aClass3.getConstructor(String.class, Integer.class);
        constructor3.newInstance("张三", 18);

        // 反射调用私有方法的构造函数
        Class<?> aClass4 = Class.forName("com.example.demo.Student");
        Constructor<?> constructor4 = aClass4.getDeclaredConstructor(Integer.class);
        // 由于JDK的安全检查耗时较多.所以通过setAccessible(true)的方式关闭安全检查就可以达到提升反射速度的目的
        // 暴利反射
        constructor4.setAccessible(true);
        constructor4.newInstance(18);

        // 遍历所有反射类中的构造方法
        Class<?> aClass5 = Class.forName("com.example.demo.Student");
        Constructor[] declaredConstructor = aClass5.getDeclaredConstructors();
        for (Constructor cs : declaredConstructor
        ) {
            System.out.println(cs);
        }
    }

    @Test
    public void test02() throws Exception {
        Class clazz1 = Student.class;
        Student student = (Student) clazz1.newInstance();
        Method method1 = clazz1.getMethod("t1", null);
        method1.invoke(student, null);

        Class clazz2 = Student.class;
        Student student2 = (Student) clazz2.newInstance();
        Method method2 = clazz2.getMethod("t2", Integer.class);
        method2.invoke(student2, 19);

        Class clazz3 = Student.class;
        Student student3 = (Student) clazz3.newInstance();
        Method method3 = clazz3.getMethod("t3", String.class, Integer.class);
        String returnValue = (String) method3.invoke(student3, "张三", 19);
        System.out.println(returnValue);

    }

    @Test
    public void test03() {

    }

    @Test//private static void m6(String[] strs)
    public void test6() throws Exception{
        Class clazz = Student.class;
        Method m = clazz.getDeclaredMethod("m6",String[].class);
        m.setAccessible(true);
        m.invoke(null,(Object)new String[]{"a","b"});
    }
    @Test
    public void test7() throws Exception{
        Class clazz = Student.class;
        Method m = clazz.getMethod("main",String[].class);
        m.invoke(null,new Object[]{new String[]{"a","b"}});
    }



}

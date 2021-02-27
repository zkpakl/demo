package com.example.demo.test20210224;

public class ThreadLocalTest {

    public static void main(String[] args) {
        /**
         * static修饰的成员变量又称为类变量。
         * 不加static修饰的成员变量又叫对象变量。
         * 对象变量依附于具体的对象实例，它的值因具体对象实例的不同而不同，
         * 而类变量为该类的所有对象共享，它的值不因类的对象不同而不同。
         */

        ThreadLocalDog threadLocalDog=new ThreadLocalDog();
        threadLocalDog.threadLocal.set("小黄");
        ThreadLocalDog threadLocalDog1=new ThreadLocalDog();
        System.out.println(threadLocalDog1.threadLocal.get());

        ThreadLocalDogStatic threadLocalDogStatic = new ThreadLocalDogStatic();
        threadLocalDogStatic.threadLocal.set("小static");
        ThreadLocalDogStatic threadLocalDogStatic1 = new ThreadLocalDogStatic();
        System.out.println(threadLocalDogStatic1.threadLocal.get());

        threadLocalDog.threadLocal.remove();
        threadLocalDog1.threadLocal.remove();
    }
}
package com.example.demo.test20210205;

public class SynchronizedTest {
    public static void main(String[] args) {
        SynchronizedTest synchronizedTest = new SynchronizedTest();
        synchronizedTest.get();
    }
    public void get() {
        synchronized (this) {
            System.out.println("小张你好鸭！");
        }
    }
}

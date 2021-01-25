package com.example.demo.design.pattern;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("我是一只会飞的鸭子");
    }
}

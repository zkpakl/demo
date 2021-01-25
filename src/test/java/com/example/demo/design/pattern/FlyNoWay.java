package com.example.demo.design.pattern;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我是一只不会飞的鸭子");
    }
}

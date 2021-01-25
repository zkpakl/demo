package com.example.demo.design.pattern;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("我是一只会叫的鸭子");
    }
}

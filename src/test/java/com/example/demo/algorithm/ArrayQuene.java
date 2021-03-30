package com.example.demo.algorithm;

public class ArrayQuene {
    // 定义一个数组
    private Integer[] arr;
    // 定义数据下标
    private int index = 0;

    // 定义数组初始化容量
    public ArrayQuene(Integer size){
        this.arr = new Integer[size];
    }
    // 给数组一个默认容量
    public ArrayQuene(){
        this.arr = new Integer[5];
    }
    // 定义add元素方法
    public void add(Integer p){
        arr[index++] = p;
    }
    // 队列删除第一个元素的方法
    public void removeFirst(){
        for (int i = 1; i < this.arr.length; i++) {
            arr[i-1] = arr[i];
        }
        index--;
    }
    // 遍历队列
    public void switchArr(){
        for (int i = 0; i < this.arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

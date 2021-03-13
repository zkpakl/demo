package com.example.demo.test20210228;

public class Point {
    public int x;
    public int y;

    public void showPosition(){
        System.out.println("("+x+","+y+")");
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

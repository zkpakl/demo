package com.example.demo.test20210228;

public class TestDemo02 {

    public static void change(Point p1){
        p1 = new Point(10,10);
        /*p1.x = 10;
        p1.y = 10;*/
    }

    public static void main(String[] args) {
        Point p1 = new Point(1,1);
        p1.showPosition();
        change(p1);
        p1.showPosition();

    }


}

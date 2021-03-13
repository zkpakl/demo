package com.example.demo.test20210228;

class Emp {

    public int age;


}
public class Test {
    public static void change(Emp emp)
    {
//        emp.age = 50;
        emp = new Emp();//再创建一个对象
//        emp.age=100;
    }
    
    public static void main(String[] args) {
        Emp emp = new Emp();
        emp.age = 100;
        System.out.println(emp.age);
        change(emp);
        System.out.println(emp.age);
//        System.out.println(emp.age);
    }
}
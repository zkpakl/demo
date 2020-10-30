package com.example.demo;

public class Java8Test {
    final static String saluttation = "Hello! ";
    public static void main(String[] args) {
        GreetingService greetingService = message ->
        System.out.println(saluttation + message);
        greetingService.sayMessage("Runoob");
    }
    interface GreetingService {
        void sayMessage(String message);
    }


}

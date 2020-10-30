package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @RequestMapping(value = "/sayHello",method = RequestMethod.GET)
    public String hello(){
        return "hello ,this is springboot";
    }
    @RequestMapping(value="/sayHi",method= RequestMethod.GET)
    public String sayHi(){
        return "hi";
    }
    @GetMapping("/sayBoy")
    public String sayBoy(){
        return "hi boy";
    }
    @PostMapping("/sayGril")
    public String sayGril(){
        return "hi girl";
    }
}

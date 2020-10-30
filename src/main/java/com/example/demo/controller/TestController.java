package com.example.demo.controller;

import com.example.demo.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class TestController {
    @RequestMapping("/add")
    @ResponseBody
    public String add(@Valid Employee employee, BindingResult bindingResult){
        //所有字段是否验证通过，true-数据有误，false-数据无误
        if (bindingResult.hasErrors()){
            //验证有误情况，返回第一条错误信息到前端
            return bindingResult.getAllErrors().get(0).getDefaultMessage();
        }

        return "新增员工成功";
    }
}

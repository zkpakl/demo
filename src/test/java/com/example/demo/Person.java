package com.example.demo;

import com.alibaba.fastjson.annotation.JSONField;

//@JSONField作用在Field时，其name不仅定义了输入key的名称，同时也定义了输出的名称。
public class Person {
    //@JSONField(name = "name") // 注意观察生成的JSON串中name和age的区别
    private String name;
    //@JSONField(name = "AGE")
    private String age;

    @JSONField(name = "name")
    public String getName() {
        return name;
    }

    @JSONField(name = "name")
    public void setName(String name) {
        this.name = name;
    }

    @JSONField(name = "AGE")
    public String getAge() {
        return age;
    }

    @JSONField(name = "AGE")
    public void setAge(String age) {
        this.age = age;
    }


}
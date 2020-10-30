package com.example.demo;

import com.alibaba.fastjson.JSONObject;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {
    private Person person;

    /**
    * 初始化对象
    */
    @Before
    public void setUp() {
        person = new Person();
        person.setName("gyl");
        person.setAge("20");
    }

    @Test
    public void test() {
        String jsonStr = JSONObject.toJSONString(person);
        System.out.println("bean to json:" + jsonStr);
        person = JSONObject.toJavaObject(JSONObject.parseObject(jsonStr), Person.class);
        System.out.println("json to bean:" + person.getName());
    }
}
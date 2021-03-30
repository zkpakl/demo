package com.example.demo;

import java.util.Objects;

/**
 * @author zuokun
 * @date 2021/1/25 14:35
 */
public class Student {
    public String name;
    public Integer age;
    private String gender;

    public Student() {
        System.out.println("这是一个空参构造");
    }

    public Student(String name, Integer age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(age, student.age) &&
                Objects.equals(gender, student.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }
}

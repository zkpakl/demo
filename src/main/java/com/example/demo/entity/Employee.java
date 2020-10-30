package com.example.demo.entity;


import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * 员工对象
 *
 */
public class Employee {
 
    /** 姓名 */
    @NotBlank(message = "请输入名称")
    @Length(message = "名称不能超过个 {max} 字符", max = 10)
    public String name;
 
    /** 年龄 */
    @NotNull(message = "请输入年龄")
    @Range(message = "年龄范围为 {min} 到 {max} 之间", min = 1, max = 100)
    public Integer age;

    /**兴趣 */
    @NotEmpty(message = "兴趣爱好不能为空")
    @Size(message = "兴趣选择最多{max}个",max = 5)
    private List<String> hobbyList;
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public Integer getAge() {
        return age;
    }
 
    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getHobbyList() {
        return hobbyList;
    }

    public void setHobbyList(List<String> hobbyList) {
        this.hobbyList = hobbyList;
    }
 
}
package com.example.demo.entity;

import lombok.Data;

/**
 * 用户实体类模型
 *
 */
@Data
public class User {

	/** 姓名 */
	private String name;

	/** 年龄 */
	private Integer age;

	/** 性别 */
	private String gender;

	/** 座右铭 */
	private String motto;



}
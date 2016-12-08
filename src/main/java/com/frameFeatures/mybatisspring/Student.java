package com.frameFeatures.mybatisspring;
//http://www.mybatis.org/spring/factorybean.html
//http://mvnrepository.com/artifact/org.mybatis/mybatis-spring/1.3.0
//http://www.mybatis.org/spring/getting-started.html
public class Student {
	private Integer age;
	private String name;
	private Integer id;

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

}

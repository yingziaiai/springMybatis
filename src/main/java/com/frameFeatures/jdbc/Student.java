package com.frameFeatures.jdbc;
//https://www.tutorialspoint.com/spring/spring_jdbc_example.htm
//https://www.tutorialspoint.com/jdbc/jdbc-driver-types.htm
//http://www.tuicool.com/articles/AZnMvu7
//jdbc tutorial: https://www.tutorialspoint.com/jdbc/jdbc-driver-types.htm
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

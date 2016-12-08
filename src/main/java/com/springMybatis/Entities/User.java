package com.springMybatis.Entities;
//http://jingyan.baidu.com/article/64d05a0262f013de55f73bcc.html
public class User {
	private int id;
	private String name;
	private int age;
	private String sex;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void toString(User user) {
		System.out.println("用户id：" + id + "\n用户名" + name + "\n用户年龄" + age
				+ "\n用户性别" + sex);
	}

}

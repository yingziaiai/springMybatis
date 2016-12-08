package com.frameFeatures.mybatisspring;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAPP {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("springMybatis-student.xml");
	SqlSessionTemplate sessionTemplate = (SqlSessionTemplate) context.getBean("sqlSessionTemplate");
	Student student = sessionTemplate.selectOne("com.frameFeatures.mybatisspring.Student.getOne", 2);
	System.out.println(student.toString());
}
}

package com.frameFeatures.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("spring-student.xml");
	StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");
	studentJDBCTemplate.create("zhangsan", 11);
	studentJDBCTemplate.create("lisi", 12);
	studentJDBCTemplate.create("wangwu", 14);
	
	studentJDBCTemplate.delete(1);
	studentJDBCTemplate.update(2, "liuma");
	studentJDBCTemplate.getStudent(2);
}
}

package com.frameFeatures.mybatisspring;

import org.mybatis.spring.SqlSessionTemplate;

public class StudentDaoImpl implements StudentDAO{
	SqlSessionTemplate sqlSessionTemplate;

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	public Student getStudent(Integer id) {
		return sqlSessionTemplate.selectOne("com.frameFeatures.mybatisspring.Student.getOne", 2);
	}
	
}

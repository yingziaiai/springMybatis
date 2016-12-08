package com.frameFeatures.jdbc;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplate implements StudentDAO {
	private DataSource dataSource;

	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}



	// JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

	public void create(String name, Integer age) {
		String sqlString = "insert into student(name, age) values (?, ?)";
		jdbcTemplate.update(sqlString, name, age);
	}

	public void delete(Integer id) {
		String sqlString = "delete from student where id= ?";
		jdbcTemplate.update(sqlString, id);

	}

	public void update(Integer id, String name) {
		String sqlString = "update student set name = ? where id = ?";
		jdbcTemplate.update(sqlString, name, id);

	}

	public Student getStudent(Integer id) {
		String sqlString = "select * from student where id = ?";
		Student student = jdbcTemplate.queryForObject(sqlString,
				new Object[] { id }, new StudentMapper());
		return student;
	}

}

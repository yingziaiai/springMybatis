package com.frameFeatures.jdbc;

import javax.sql.DataSource;

public interface StudentDAO {
//	public void setDataSource(DataSource ds);

	public void create(String name, Integer age);

	public void delete(Integer id);

	public void update(Integer id, String name);

	public Student getStudent(Integer id);

}

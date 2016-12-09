package com.frameFeatures.mybatisspring;
//
//*****spring's features:http://docs.spring.io/spring/docs/4.2.0.BUILD-SNAPSHOT/spring-framework-reference/htmlsingle/#orm-hibernate
//
//***migration to new version spring:https://github.com/spring-projects/spring-framework/wiki/Migrating-from-earlier-versions-of-the-spring-framework


//http://www.mybatis.org/spring/factorybean.html
//http://mvnrepository.com/artifact/org.mybatis/mybatis-spring/1.3.0
//http://www.mybatis.org/spring/getting-started.html

/*
 * http://m.blog.csdn.net/article/details?id=53515956  mybatis-generator-core.jar
 * http://doc.okbase.net/fengshizty/archive/126397.html 
 * much more better for the version synchronization
 * 
 * http://blog.csdn.net/xiongyu777888/article/details/23815599  
 * similar to this demo and properties
 *   <bean  
23.        class="org.springframework.beans.factory.config.PropertyPlaceholderConfigurer">  
24.        <property name="locations">  
25.            <list>  
26.                <value>classpath:jdbc.properties</value>  
27.            </list>  
28.        </property>  
29.    </bean>  

<!-- 配置数据源(连接池，proxool) -->  
 * 
 * 
 * 
 * spring web + mybatis
 * http://blog.csdn.net/gebitan505/article/details/44455235/
 * http://blog.csdn.net/duchao123duchao/article/details/51176673
 * http://blog.csdn.net/u010987379/article/details/52152963
 * 
 * 
 * 多数据源 批量更新
 * http://blog.csdn.net/hupanfeng/article/details/21454847
 * 
 * 
 * why we choose Hibernate for projects
 * http://www.mkyong.com/hibernate/why-i-choose-hibernate-for-my-project/
 * 
 * 
 * Spring注解原理的详细剖析与实现 
 * http://blog.csdn.net/u010987379/article/details/52152795
 * http://blog.csdn.net/xyh820/article/details/7303330/
 * 
 * 
 * JSTL:
 * http://www.journaldev.com/2090/jstl-tutorial-jstl-example-jstl-core-tags
 */
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

	public String toString() {
		return "id:" + id + "name:" + name + "age:" + age;
	}
}

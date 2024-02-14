package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {


		ApplicationContext app= new ClassPathXmlApplicationContext("NewFile.xml");
		
		College college=app.getBean("c",College.class);
		
		
		System.out.println(college);
		
		Student s=app.getBean("s", Student.class);
		System.out.println(s);
	}

}

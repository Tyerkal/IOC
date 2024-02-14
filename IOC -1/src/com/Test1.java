package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
	
	public static void main(String[] args) {
		
		ApplicationContext app= new ClassPathXmlApplicationContext("NewFile.xml");
		
		College college=app.getBean("c",College.class);
		//college.m2();
		
	}

}

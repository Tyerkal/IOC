package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext apc=new AnnotationConfigApplicationContext(AppConfig.class);
		
//		AdharCard a = (AdharCard) apc.getBean("a");
//		System.out.println(a.hashCode());
		
//		AdharCard a1 = (AdharCard) apc.getBean("a");
//		System.out.println(a1.hashCode());
		
		Person p= apc.getBean("p",Person.class);
		System.out.println(p);
	}

}

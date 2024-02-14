package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext apc = new ClassPathXmlApplicationContext("NewFile.xml");

//		Engine e=apc.getBean("e", Engine.class);
//		System.out.println(e);

		Car c = apc.getBean("c", Car.class);
		System.out.println(c);

	/*	System.out.println("-----------------------------------");
		Car c1 = apc.getBean("c", Car.class);
		System.out.println(c1.getEngine().hashCode());
	}*/

}
}
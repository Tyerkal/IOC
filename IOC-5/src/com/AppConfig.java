package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Configuration
//@Component
public class AppConfig {
	
	@Bean(name="a")
	@Scope(value = "prototype")
	public AdharCard getAdharCard() {
		
		AdharCard a= new AdharCard();
		a.setAid(11);
		a.setAname("Abc");
		return a;
		
	}
	
	@Bean(name="p")
	public Person getPerson() {
		
		Person p= new Person();
		p.setPid(101);
		p.setPname("ABC");
//		p.setAdharCard(getAdharCard());
		
		return p;
	}
	
	@Bean(name="a1")
	@Scope(value = "prototype")
	public AdharCard getAdharCar() {
		
		AdharCard a= new AdharCard();
		a.setAid(12);
		a.setAname("pqr");
		return a;
		
	}

}

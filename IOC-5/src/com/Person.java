package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {

	private int pid;

	private String pname;
	
	@Autowired
	@Qualifier(value = "a")
	private AdharCard adharCard;

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", adharCard=" + adharCard + "]";
	}

	

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public AdharCard getAdharCard() {
		return adharCard;
	}

	public void setAdharCard(AdharCard adharCard) {
		this.adharCard = adharCard;
	}

}

package com;

public class AdharCard {
	
	private int aid;
	
	private String aname;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	@Override
	public String toString() {
		return "AdharCard [aid=" + aid + ", aname=" + aname + "]";
	}
	
	

}

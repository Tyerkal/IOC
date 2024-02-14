package com;

public class Car {

	private int cid;
	private String cname;

	private Engine engine;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Car(int cid, String cname, Engine engine) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [cid=" + cid + ", cname=" + cname + ", engine=" + engine + "]";
	}

}

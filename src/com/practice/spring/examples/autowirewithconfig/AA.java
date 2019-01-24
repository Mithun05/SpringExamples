package com.practice.spring.examples.autowirewithconfig;

public class AA {

	int id;
	String name;
	
	
	public AA(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("In AA :::: Id --> " + id + " Name ---> " + name);
	}
}

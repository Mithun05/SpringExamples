package com.practice.spring.examples.autowirewithxml;

public class A {

	int id;
	String name;
	
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
		System.out.println("In A :::: Id --> " + id + " Name ---> " + name);
	}
}

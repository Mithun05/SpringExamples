package com.practice.spring.examples.autowirewithxml;

import org.springframework.beans.factory.annotation.Autowired;

public class B {
	
	@Autowired
	 A a;
	
	public void display() {
		a.display();
	}
}

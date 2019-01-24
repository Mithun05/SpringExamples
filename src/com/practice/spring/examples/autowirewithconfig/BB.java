package com.practice.spring.examples.autowirewithconfig;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

public class BB {
	
	@Autowired
	AA aa;
	
	@PostConstruct
	public void customCall() {
		System.out.println("After Default Constructor And Just before returning object to the requesting object");
	}
	
	public void display() {
		System.out.print("In BB");
		aa.display();
	}
}

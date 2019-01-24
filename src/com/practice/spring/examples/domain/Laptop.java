package com.practice.spring.examples.domain;

import java.io.Serializable;

public class Laptop implements Serializable {

	private static final long serialVersionUID = 1L;
	
	int laptopId;
	String laptopName;
	
	
	public Laptop(int laptopId, String laptopName) {
		super();
		this.laptopId = laptopId;
		this.laptopName = laptopName;
	}

	public int getLaptopId() {
		return laptopId;
	}
	
	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}
	
	public String getLaptopName() {
		return laptopName;
	}
	
	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}

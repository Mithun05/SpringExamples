package com.practice.spring.examples.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class ChocolateInfo {
	
	private String chocolateName;
	private String chocolateCompany;
	private int chocolatePrice;
	
	@Autowired
	private ChocolateProviderInfo chocolateProviderInfo;
	
	public String getChocolateName() {
		return chocolateName;
	}


	public void setChocolateName(String chocolateName) {
		this.chocolateName = chocolateName;
	}


	public String getChocolateCompany() {
		return chocolateCompany;
	}


	public void setChocolateCompany(String chocolateCompany) {
		this.chocolateCompany = chocolateCompany;
	}


	public int getChocolatePrice() {
		return chocolatePrice;
	}


	public void setChocolatePrice(int chocolatePrice) {
		this.chocolatePrice = chocolatePrice;
	}

	@Override
	public String toString() {
		return "ChocolateInfo [chocolateName=" + chocolateName + ", chocolateCompany=" + chocolateCompany
				+ ", chocolatePrice=" + chocolatePrice + ", ChocolateProviderInfo=" + chocolateProviderInfo + "]";
	}
}

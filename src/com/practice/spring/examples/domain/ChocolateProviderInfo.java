package com.practice.spring.examples.domain;

import org.springframework.beans.factory.annotation.Required;

public class ChocolateProviderInfo {
	
	private String providerName;
	private String providerNum;
	
	public String getProviderName() {
		return providerName;
	}
	
	@Required
	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}
	
	public String getProviderNum() {
		return providerNum;
	}
	
	@Required
	public void setProviderNum(String providerNum) {
		this.providerNum = providerNum;
	}

	@Override
	public String toString() {
		return "ChocolateProviderInfo :::: [ProviderName = " + providerName + ", ProviderNum = " + providerNum + "]";
	}
	
}

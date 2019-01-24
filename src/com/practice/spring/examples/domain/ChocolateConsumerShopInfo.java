package com.practice.spring.examples.domain;

public class ChocolateConsumerShopInfo {
	
	private String shopName;
	private String shopLocation;
	private String shopNum;
	
	public String getShopName() {
		return shopName;
	}
	
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	
	public String getShopLocation() {
		return shopLocation;
	}
	
	public void setShopLocation(String shopLocation) {
		this.shopLocation = shopLocation;
	}
	
	public String getShopNum() {
		return shopNum;
	}
	
	public void setShopNum(String shopNum) {
		this.shopNum = shopNum;
	}
	
	@Override
	public String toString() {
		return "ChocolateConsumerShopInfo :::: [ShopName = " + shopName + ", ShopLocation = " + shopLocation + ", ShopNum = "
				+ shopNum + "]";
	}
	
	

}

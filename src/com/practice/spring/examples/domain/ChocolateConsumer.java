package com.practice.spring.examples.domain;

public class ChocolateConsumer {
	
	private String consumerName;
	private String consumerNum;
	private ChocolateInfo consumerCholocateInfo;
	private ChocolateConsumerShopInfo chocolateConsumerShopInfo;
	
	public ChocolateConsumer(String consumerName, String consumerNum, ChocolateInfo consumerCholocateInfo) {
		super();
		this.consumerName = consumerName;
		this.consumerNum = consumerNum;
		this.consumerCholocateInfo = consumerCholocateInfo;
	}

	public String getConsumerName() {
		return consumerName;
	}
	
	public void setConsumerName(String consumerName) {
		this.consumerName = consumerName;
	}
	
	public String getConsumerNum() {
		return consumerNum;
	}
	
	public void setConsumerNum(String consumerNum) {
		this.consumerNum = consumerNum;
	}
	
	public ChocolateInfo getConsumerCholocateInfo() {
		return consumerCholocateInfo;
	}
	
	public void setConsumerCholocateInfo(ChocolateInfo consumerCholocateInfo) {
		this.consumerCholocateInfo = consumerCholocateInfo;
	}
	
	public ChocolateConsumerShopInfo getChocolateConsumerShopInfo() {
		return chocolateConsumerShopInfo;
	}

	public void setChocolateConsumerShopInfo(ChocolateConsumerShopInfo chocolateConsumerShopInfo) {
		this.chocolateConsumerShopInfo = chocolateConsumerShopInfo;
	}

	@Override
	public String toString() {
		return "ChocolateConsumer :::: [ConsumerName = " + consumerName + ", ConsumerNum = " + consumerNum
				+ ", ConsumerCholocateInfo = " + consumerCholocateInfo + ", ChocolateConsumerShopInfo = "
				+ chocolateConsumerShopInfo + "]";
	}
}

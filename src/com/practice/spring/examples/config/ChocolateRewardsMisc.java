package com.practice.spring.examples.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.practice.spring.examples.autowirewithconfig.AA;
import com.practice.spring.examples.autowirewithconfig.BB;
import com.practice.spring.examples.dao.ChocolateRewards;
import com.practice.spring.examples.daoimpl.ChocolateRewardsImpl;

@Configuration
public class ChocolateRewardsMisc {

	@Bean(name="chocolateRewards")
	public ChocolateRewards getDefaultRewards() {
		return new ChocolateRewardsImpl();
	}
	
	@Bean
	public AA getAA() {
		return new AA(111, "XYZAA");
	}
	
	@Bean(name="bb")
	public BB getBB() {
		return new BB();
	}
}

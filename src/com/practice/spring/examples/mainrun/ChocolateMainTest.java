package com.practice.spring.examples.mainrun;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.practice.spring.examples.autowirewithconfig.BB;
import com.practice.spring.examples.autowirewithxml.B;
import com.practice.spring.examples.config.ChocolateRewardsMisc;
import com.practice.spring.examples.dao.ChocolateRewards;
import com.practice.spring.examples.daoimpl.ChocolateRewardsImpl;
import com.practice.spring.examples.domain.ChocolateConsumer;
import com.practice.spring.examples.domain.ChocolateInfo;

public class ChocolateMainTest {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		
		ChocolateInfo chocolateInfo = (ChocolateInfo) context.getBean("chocolateInfo");
		System.out.println("Chocolate Information :::: " + chocolateInfo);
		
		ChocolateConsumer chocolateConsumer = (ChocolateConsumer) context.getBean("chocolateConsumer");
		System.out.println("Consumer Information :::: " + chocolateConsumer);
		
		B b = (B) context.getBean("b");
		b.display();
		
		@SuppressWarnings("resource")
		ApplicationContext contextV = new AnnotationConfigApplicationContext(ChocolateRewardsMisc.class);
		
		ChocolateRewards chocolateRewards = (ChocolateRewardsImpl) contextV.getBean("chocolateRewards");
		System.out.println("Consumer Rewards :::: " + chocolateRewards.getRewards());
		
		BB bb = (BB) contextV.getBean("bb");
		System.out.println("Bean Config With Annotation :::: ");
		bb.display();

	}

}

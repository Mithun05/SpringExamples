package com.practice.spring.examples.cron;

import org.springframework.scheduling.annotation.Scheduled;

public class ChocolateTypes {

	@Scheduled(cron="*/5 * * * * ?")
	public void getTypesAvailable() {
		System.out.print("Miscellaneous Free Chocolates");
	}
}

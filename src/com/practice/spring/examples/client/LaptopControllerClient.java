package com.practice.spring.examples.client;


import com.practice.spring.examples.domain.Laptop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/client")
public class LaptopControllerClient {
	
	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/testgetlaptopapicall")
	public ResponseEntity<Laptop> getList() {
		return restTemplate.getForEntity("http://localhost:8080/laptop/fetchFromBucket", Laptop.class);
	}
	
	@PostMapping("/testaddlaptopapicall")
	public String addToList() {
		HttpEntity<Laptop> entity = new HttpEntity<>(new Laptop(123, "Dell"));
		return restTemplate.exchange("http://localhost:8080/laptop/addToBucket", HttpMethod.POST, entity, String.class).getBody();
	}
	
}

package com.practice.spring.examples.controller;


import com.practice.spring.examples.domain.Laptop;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/laptop")
public class LaptopController {
	
	private static List<Laptop> laptops = new ArrayList<>();
	
	@GetMapping("/fetchFromBucket")
	public List<Laptop> getAvailableLaptops() {
		return laptops;
	}
	
	@PostMapping("/addToBucket")
	public String addModelToBucket(@RequestBody Laptop laptop) {
		laptops.add(laptop);
		return "Product Added To Register";
	}
}

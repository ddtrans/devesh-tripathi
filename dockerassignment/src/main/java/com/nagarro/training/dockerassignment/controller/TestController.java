package com.nagarro.training.dockerassignment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/")
	public String[] testing() { 
		return new String[]{"Devesh","Nath","Tripathi"};
	}
	
}

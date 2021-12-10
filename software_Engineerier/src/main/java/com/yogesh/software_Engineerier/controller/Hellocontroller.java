package com.yogesh.software_Engineerier.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellocontroller {
	
	@GetMapping("/")
	public String helliworld() {
		return "Hello World!!! ";
		
	}

}

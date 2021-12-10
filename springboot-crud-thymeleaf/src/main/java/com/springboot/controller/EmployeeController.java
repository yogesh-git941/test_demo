package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.service.EmployeeServiceImpl;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceImpl serivece;

	@GetMapping("/")
	public String viewAllList(Model model) {
		model.addAttribute("listemloyee", serivece.getAllEmplyeeDeiail());
		
		return "index";
	}
	
}

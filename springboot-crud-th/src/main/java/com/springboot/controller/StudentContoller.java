package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.bean.Student;
import com.springboot.ser.Studentser;

@RestController
public class StudentContoller {
	
	@Autowired
	private Studentser ser;
	
	@GetMapping("/")
	public 	String getDetails(Model model) {
		List<Student > liststu=ser.viewdetails();
			model.addAttribute("lisstu", liststu);	
		return "index";
	}
	
	public void save() {
		
	}

}

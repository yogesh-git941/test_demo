package com.spr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spr.entity.Student;
import com.spr.service.StudentserImpli;

@RestController
public class StudentController {

	@Autowired
	private StudentserImpli service;

	@GetMapping("/")
	public String getDteails(Model model) {

		model.addAttribute("listdetails", service.viewDetails());
		return "index";

	}

	@PostMapping("/savestudent")
	public void savede(Student stu) {
		service.saveDeatails(stu);
	}

	@GetMapping("/getbyId/{id}")
	public String viewByid(@PathVariable("id") long id, Model model) {
		
		return "view_form";
	}
}

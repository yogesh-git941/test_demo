package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.model.Employee;
import com.springboot.repository.EmployeeRepository;

public class EmployeeService implements EmployeeServiceImpl {
	
	@Autowired
	private EmployeeRepository employeerepository;

	@Override
	public List<Employee> getAllEmplyeeDeiail() {

		return employeerepository.findAll();
	}

}

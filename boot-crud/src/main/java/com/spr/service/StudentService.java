package com.spr.service;

import java.util.List;

import com.spr.entity.Student;

public interface StudentService {
	
	List<Student> viewDetails();

	void saveDeatails(Student stu);
	
	Student findbyidno(long id);  

	Student byiddelet(long id);
	
}

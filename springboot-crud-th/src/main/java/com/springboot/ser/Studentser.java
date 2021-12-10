package com.springboot.ser;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.bean.Student;
import com.springboot.repository.Studentrepository;

@Service
public class Studentser {

	@Autowired
	private Studentrepository repo;

	public List<Student> viewdetails() {

		return repo.findAll();

	}
	
	public void save(Student stu) {
		repo.save(stu);
	}
	
	public Student geti(long id) {
		return repo.findById(id).get();
		
	}
	
	public void deleteid(long id) {
		repo. deleteById(null);
	}
}

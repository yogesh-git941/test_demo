package com.spr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spr.entity.Student;
import com.spr.repository.StydentRepo;

@Service
public class StudentserImpli implements StudentService {

	@Autowired
	private StydentRepo repo;

	@Override
	public List<Student> viewDetails() {

		return repo.findAll();
	}

	@Override
	public void saveDeatails(Student stu) {
		this.repo.save(stu);

	}

	@Override
	public Student findbyidno(long id) {
		Student stu  =this. repo.findById(id).get();
		return stu;
	}

	@Override
	public Student byiddelet(long id) {
   		return null;
	}

}

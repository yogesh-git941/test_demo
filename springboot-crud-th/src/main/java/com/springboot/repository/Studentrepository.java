package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.bean.Student;

@Repository
public interface Studentrepository extends JpaRepository<Student,Long> {

	

}

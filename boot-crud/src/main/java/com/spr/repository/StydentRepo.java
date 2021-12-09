package com.spr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spr.entity.Student;

@Repository
public interface StydentRepo extends JpaRepository<Student,Long>{

}

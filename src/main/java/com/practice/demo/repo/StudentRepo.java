package com.practice.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.demo.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}

package com.practice.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.demo.model.Student;
import com.practice.demo.repo.StudentRepo;

@RestController
public class HelloWorldController {

	@Autowired
	public StudentRepo studentrepo;

	@GetMapping("/getHello")
	public String HelloWorld() {

		Student studentModel = new Student();
		studentModel.setId(123);
		studentModel.setName("jarvis");
		studentModel.setCity("Kanpur");
		studentrepo.save(studentModel);
		
		return "Hi Hello";
	}
}

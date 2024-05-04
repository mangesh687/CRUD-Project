package com.crudapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crudapplication.entity.StudentEntity;
import com.crudapplication.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/create")
	public StudentEntity postMethodName(@RequestBody StudentEntity studentEntity) {
		//TODO: process POST request
		
		return studentService.create(studentEntity);
	}
	
}

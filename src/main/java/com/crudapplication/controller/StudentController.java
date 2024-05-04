package com.crudapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/getall")
	public List<StudentEntity> getall(){
		return studentService.findallentity();
	}
	
	@GetMapping("/get/{id}")
	public StudentEntity getone(@PathVariable Integer id){
		return studentService.findbyids(id);
	}
	
	
}

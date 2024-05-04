package com.crudapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudapplication.entity.StudentEntity;
import com.crudapplication.repository.StudentRepo;
@Service
public class StudentImpl implements StudentService {
	
	@Autowired
   private StudentRepo studentRepo;

	@Override
	public StudentEntity create(StudentEntity studentEntity) {
		// TODO Auto-generated method stub
		return studentRepo.save(studentEntity);
	}

	

}

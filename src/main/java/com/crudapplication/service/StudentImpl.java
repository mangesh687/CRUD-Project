package com.crudapplication.service;

import java.util.List;

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

	@Override
	public List<StudentEntity> findallentity() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

	@Override
	public StudentEntity findbyids(Integer id) {
		// TODO Auto-generated method stub
		return studentRepo.findById(id).get();
	}

	@Override
	public StudentEntity update(StudentEntity studentEntity) {
		// TODO Auto-generated method stub
		return studentRepo.save(studentEntity);
	}

	@Override
	public String delate(Integer id) {
		studentRepo.deleteById(id);
		return id+"this id is delate";
	}

	

	

}

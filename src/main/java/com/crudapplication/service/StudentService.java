package com.crudapplication.service;

import java.util.List;

import com.crudapplication.entity.StudentEntity;

public interface StudentService {

	public StudentEntity create(StudentEntity studentEntity);
	public List<StudentEntity> findallentity();
	public StudentEntity findbyids(Integer id);
	public StudentEntity update(StudentEntity studentEntity);
	public  String delete(Integer id);
	public StudentEntity findbyexamfee(Integer schoolfee);
}

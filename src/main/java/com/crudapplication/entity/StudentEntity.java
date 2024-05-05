package com.crudapplication.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String name;
private String lastname;
private int schoolfee;
public StudentEntity() {
	super();
	// TODO Auto-generated constructor stub
}
public StudentEntity(int id, String name, String lastname, int schoolfee) {
	super();
	this.id = id;
	this.name = name;
	this.lastname = lastname;
	this.schoolfee = schoolfee;
}
@Override
public String toString() {
	return "StudentEntity [id=" + id + ", name=" + name + ", lastname=" + lastname + ", schoolfee=" + schoolfee + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public int getSchoolfee() {
	return schoolfee;
}
public void setSchoolfee(int schoolfee) {
	this.schoolfee = schoolfee;
}


}

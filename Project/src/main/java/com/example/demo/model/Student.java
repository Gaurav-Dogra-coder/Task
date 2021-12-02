package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "student")
public class Student {
@Id
private long ID;//contact number
private String fname;//first name
private String lname;//last name
private String dob;
private double age;
private String college;
private String branch;
public Student() {
	super();
	
}
public Student(long contact, String fname, String lname, String dob, double age, String college, String branch) {
	super();
	this.ID = contact;
	this.fname = fname;
	this.lname = lname;
	this.dob = dob;
	this.age = age;
	this.college = college;
	this.branch = branch;
}
public long getId() {
	return ID;
}
public void setId(long contact) {
	this.ID = contact;
}
public String getfName() {
	return fname;
}
public void setfName(String fname) {
	this.fname = fname;
}
public String getlName() {
	return lname;
}
public void setlName(String lname) {
	this.lname = lname;
}
public String getDOB() {
	return dob;
}
public void setDOB(String dob) {
	this.dob = dob;
}
public double getAge() {
	return age;
}
public void setAge(double age) {
	this.age = age;
}
public String getCollege() {
	return college;
}
public void setCollege(String college) {
	this.college = college;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
}

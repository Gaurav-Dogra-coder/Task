package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.repositories.StudentRepository;
import java.util.*;
@RestController
public class StudentController {
	@Autowired
	public StudentRepository studentRepository;
	
	@GetMapping(value= "/all")
	public List<Student> getAllStudents(){
		try {
		return studentRepository.findAll();
		} 
		catch(Exception e) {
			System.out.println(e);
			List<Student> l=new LinkedList<>();
			return l;
		}
	}
	
	@GetMapping(value="/create")
	public String createStudent(@RequestBody Student student){	
		
		try {
			studentRepository.insert(student);
			return "Created Student";
		}
		catch(Exception e) {
			return "eRROR";
		}
	}
}

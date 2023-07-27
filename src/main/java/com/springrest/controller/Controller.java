package com.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.entity.Student;
import com.springrest.service.StudentService;

@RestController
public class Controller {

	@Autowired
	StudentService studentService;
	
	@GetMapping("/find/allstudents")
	public List<Student> findAllStudents()
	{
		return studentService.findAllStudents();	
	}
	
	@GetMapping("/find/student/{id}")
	public Student findStudentById(@PathVariable int id)
	{
		return studentService.findStudentById(id);	
	}
	
	@PostMapping("/add/student")
	public List<Student> addStudent(@RequestBody Student student)
	{
		return studentService.addStudent(student);
		
	}
	
	@PutMapping("/update/student/{id}")
	public Student updateStudent(@RequestBody Student student,@PathVariable int id)
	{
		return studentService.updateStudent(student,id);
	}
	
	@DeleteMapping("/delete/student/{id}")
	public void deleteStudentById(@PathVariable int id)
	{
		studentService.deleteStudentById(id);
	}
}

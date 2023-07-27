package com.springrest.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.springrest.entity.Student;

public interface StudentService {

	
	public List<Student> findAllStudents();
	
	public Student findStudentById(int id);
	
	public List<Student> addStudent(Student student);
	
	public Student updateStudent(Student student, int id);
	
	public void deleteStudentById(int id);
}

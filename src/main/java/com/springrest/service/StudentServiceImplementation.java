package com.springrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.entity.Student;

@Service
public class StudentServiceImplementation implements StudentService {

	public List<Student> studentlist=null;
	
	
	StudentServiceImplementation()
	{
		studentlist=new ArrayList<>();
		
		studentlist.add(new Student( 1,"sushant","gajmal","22 jan",79));
		studentlist.add(new Student( 2,"rahul","surve","28 feb",70));
		studentlist.add(new Student( 3,"suraj","gajmal","22 feb",89));
		studentlist.add(new Student( 4,"ganesh","wayangankar","22 may",75));
	}


	@Override
	public List<Student> findAllStudents() {
		return studentlist;
	}


	@Override
	public Student findStudentById(int id) {

		Student student=null;
		for(Student st:studentlist)
		{
			if(st.getId()==id)
			{
				student=st;
			}
		}
		return student;
	}


	@Override
	public List<Student> addStudent(Student student) {
		studentlist.add(student);
		return studentlist;
		
	}


	@Override
	public Student updateStudent(Student student,int ids) {
		for(Student std:studentlist)
		{
			if(std.getId()==student.getId())
			{
				std.setFirstname(student.getFirstname());
				std.setLastname(student.getLastname());
				std.setDOB(student.getDOB());
				std.setMarks(student.getMarks());
			}
			
		}
		return student;
	}


	@Override
	public void deleteStudentById(int id) {
		
			studentlist.removeIf(student-> student.getId()==id);
		
             }


}

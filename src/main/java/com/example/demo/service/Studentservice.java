package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Student;

public interface Studentservice{

	List<Student> getAllStudents();
	Student saveStudent(Student s);
	Student getbyid(long id);
	Student Modstudent(Student stu,long id);
	void Delstu(long id);
}

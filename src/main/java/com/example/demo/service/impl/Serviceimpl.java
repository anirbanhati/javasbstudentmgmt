package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.Studentrepo;
import com.example.demo.service.Studentservice;

@Service
public class Serviceimpl implements Studentservice{
	private Studentrepo repo;
	
	public Serviceimpl(Studentrepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Student saveStudent(Student s) {
		// TODO Auto-generated method stub
		return repo.save(s);
	}

	@Override
	public Student getbyid(long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public Student Modstudent(Student stu, long id) {
		// TODO Auto-generated method stub
		Student s=repo.findById(id).orElse(null);
		if(stu.getFirstname()!=null)
		{s.setFirstname(stu.getFirstname());}
		if(stu.getLastname()!=null)
		{s.setLastname(stu.getLastname());}
		if(stu.getEmail()!=null)
		{s.setEmail(stu.getEmail());}
		return repo.save(s);
//		return s;
	}

	@Override
	public void Delstu(long id) {
		// TODO Auto-generated method stub
		repo.findById(id);
		repo.deleteById(id);
		
	}

}

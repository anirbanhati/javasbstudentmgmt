package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Student;
import com.example.demo.service.Studentservice;

@Controller
public class Studentcontroller {

	@Autowired
	Studentservice ss;
	@GetMapping("/students")
	public String allstudents(ModelMap model)
	{
		model.put("students", ss.getAllStudents());
		return "students";
	}
	@GetMapping("/students/new")
	public String newstudent(ModelMap model)
	{
		Student s=new Student();
		model.put("student", s);
		return "newstudent";
	}
	@PostMapping("/studentadd")
	public String addstudent(@ModelAttribute("student") Student student)
	{
		ss.saveStudent(student);
		return "redirect:/students";
	}
	@GetMapping("/students/edit/{id}")
	public String editstudent(@PathVariable Long id,ModelMap model)
	{
		//Student s=new Student();
		model.put("student", ss.getbyid(id));
		return "editstudent";
	}
	@PostMapping("/studentadd/{id}")
	public String editsave(@PathVariable Long id,@ModelAttribute("student") Student student)
	{
		ss.Modstudent(student, id);
		return "redirect:/students";
	}
	@GetMapping("/studentsdel/{id}")
	public String rmstudent(@PathVariable Long id,ModelMap model)
	{
		//Student s=new Student();
		ss.Delstu(id);
		return "redirect:/students";
	}
}

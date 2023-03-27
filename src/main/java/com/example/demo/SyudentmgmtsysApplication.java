package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Student;
import com.example.demo.repository.Studentrepo;

@SpringBootApplication
public class SyudentmgmtsysApplication /*implements CommandLineRunner */
{

	public static void main(String[] args) {
		SpringApplication.run(SyudentmgmtsysApplication.class, args);
	}
	/*@Autowired
	Studentrepo repo;
	@Override
	public void run(String... args)throws Exception
	{
		Student s2=new Student("jon","doe","jondoe@gmail.com");
		repo.save(s2);
	}*/

}

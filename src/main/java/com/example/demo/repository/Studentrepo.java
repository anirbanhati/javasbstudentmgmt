package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Student;

public interface Studentrepo extends JpaRepository<Student,Long>{

}

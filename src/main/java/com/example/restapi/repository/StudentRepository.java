package com.example.restapi.repository;

import com.example.restapi.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {
    List<Student> findStudentByCity(String city);

    List<Student> findAll();
}


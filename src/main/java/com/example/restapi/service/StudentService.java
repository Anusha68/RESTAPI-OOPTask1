package com.example.restapi.service;

import com.example.restapi.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getStudentByCity(String city);
    List<Student> getAllStudents();

    void addNewStudent(Student student);

}

package com.example.restapi.service.impl;

import com.example.restapi.model.Student;
import com.example.restapi.repository.StudentRepository;
import com.example.restapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getStudentByCity(String city) {
        return studentRepository.findStudentByCity(city);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void addNewStudent(Student student){
        studentRepository.save(student);
    }

}

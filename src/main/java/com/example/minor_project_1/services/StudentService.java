package com.example.minor_project_1.services;

import com.example.minor_project_1.domain.Student;
import com.example.minor_project_1.repositries.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public void createStudent(Student student){
        studentRepository.save(student);
    }
    public Student getStudentById(int id){
        return studentRepository.findById(id).orElse(null);
    }
}

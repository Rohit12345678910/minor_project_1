package com.example.minor_project_1.controlers;

import com.example.minor_project_1.domain.Student;
import com.example.minor_project_1.dtos.CreateStudentRequest;
import com.example.minor_project_1.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/student")
    public void create(@RequestBody @Valid CreateStudentRequest request){
        studentService.createStudent(request.toStudent());
    }
    @GetMapping("/getById")
    public Student getById(@RequestParam("id") String studentId){
        return studentService.getStudentById(Integer.parseInt(studentId));
    }
}

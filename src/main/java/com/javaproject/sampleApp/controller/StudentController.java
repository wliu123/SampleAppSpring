package com.javaproject.sampleApp.controller;

import com.javaproject.sampleApp.model.Student;
import com.javaproject.sampleApp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController{
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    @CrossOrigin(origins = "http://localhost:3000")
    public String add(@RequestBody Student student) {
        studentService.saveStudent(student);
        return "New student has been created";
    }

    @GetMapping("/getAll")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
}

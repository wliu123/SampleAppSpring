package com.javaproject.sampleApp.service;

import com.javaproject.sampleApp.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}

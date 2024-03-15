package com.example.demo.service;

import com.example.demo.dto.StudentDto;
import com.example.demo.model.Student;

import java.util.List;

public interface StudentService {
    void saveStudent(StudentDto studentDto);
    Student findStudentByEmail(String email);
    List<StudentDto> findAllStudents();
}

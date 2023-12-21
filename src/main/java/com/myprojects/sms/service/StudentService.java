package com.myprojects.sms.service;

import com.myprojects.sms.dto.StudentDto;
import com.myprojects.sms.entity.Student;

import java.util.List;

public interface StudentService {
    List<StudentDto> getAllStudents();

    void createStudent(StudentDto student);

    StudentDto getStudentById(Long studentId);
}

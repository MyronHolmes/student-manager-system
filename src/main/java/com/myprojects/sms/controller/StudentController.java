package com.myprojects.sms.controller;

import com.myprojects.sms.dto.StudentDto;
import com.myprojects.sms.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public String listStudents(Model model){
        List<StudentDto> students =studentService.getAllStudents();
        model.addAttribute("students", students);
        return "students";
    }
}

package com.CenterOfAdoption.bellAdoptionCenter.controller;

import com.CenterOfAdoption.bellAdoptionCenter.MODEL.Student;
import com.CenterOfAdoption.bellAdoptionCenter.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("StudentAccess")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("allStudent")
    public List<Student> getAllStudent()
    {
        return studentService.getAllStudent();
    }
}

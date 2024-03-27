package com.example.exam_javacore_webapp.controller;

import com.example.exam_javacore_webapp.entity.StudentEntity;
import com.example.exam_javacore_webapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AddController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/add")
    public String add(StudentEntity student){
        studentService.add(student);
        return "redirect:/Add";
    }


}

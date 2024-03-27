package com.example.exam_javacore_webapp.controller;

import com.example.exam_javacore_webapp.entity.StudentEntity;
import com.example.exam_javacore_webapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/search")
public class FindNameController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/search")
    public String search() {
        return "search";
    }
    @PostMapping("/search")
    public String search(@RequestParam("name") String name, Model model) {
        List<StudentEntity> students = studentService.getByName(name);
        model.addAttribute("students", students);
        return "result";
    }
}

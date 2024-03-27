package com.example.exam_javacore_webapp.controller;


import com.example.exam_javacore_webapp.repository.StudentRepository;
import com.example.exam_javacore_webapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private StudentRepository studentRepository;
    @GetMapping("/home")
        public String showAll(Model model){
        model.addAttribute("students", studentRepository.findAll());
        return "homePage";
        }
}

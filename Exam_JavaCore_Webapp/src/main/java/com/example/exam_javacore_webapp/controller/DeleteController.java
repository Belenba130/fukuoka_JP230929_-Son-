package com.example.exam_javacore_webapp.controller;

import com.example.exam_javacore_webapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/delete")
public class DeleteController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/delete")
    public String delete(@RequestParam("id") Long id) {
        studentService.delete(id);
        return "homePage";
    }
}

package com.example.exam_javacore_webapp.controller;

import com.example.exam_javacore_webapp.entity.StudentEntity;
import com.example.exam_javacore_webapp.repository.StudentRepository;
import com.example.exam_javacore_webapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
@RequestMapping("/update")
public class UpdateController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private StudentRepository studentRepository;
    @GetMapping("/update")
    public String update(@RequestParam("id") Long id, Model model) {
        Optional<StudentEntity> student = studentRepository.findById(id);
        model.addAttribute("student", student);
        return "update";
    }

     @PostMapping("/update")
     public String updateStudent(StudentEntity studentUp) {
         studentService.update(studentUp, studentUp.getId());
         return "redirect:/update";
     }

}

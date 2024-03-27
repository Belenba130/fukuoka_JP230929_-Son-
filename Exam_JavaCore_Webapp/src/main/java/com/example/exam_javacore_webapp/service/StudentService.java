package com.example.exam_javacore_webapp.service;

import com.example.exam_javacore_webapp.entity.StudentEntity;
import com.example.exam_javacore_webapp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<StudentEntity> getAll() {
        return studentRepository.findAll();
    }

    public StudentEntity add(StudentEntity studentEntity) {
        return studentRepository.save(studentEntity);
    }

    public void update(StudentEntity studentEntity, int id) {
        Optional<StudentEntity> studentUpdate = studentRepository.findById(Long.valueOf(id));
        if (studentUpdate.isPresent()) {
            studentUpdate.get().setId(studentEntity.getId());
            studentUpdate.get().setStudentName(studentEntity.getStudentName());
            studentUpdate.get().setSex(studentEntity.getSex());
            studentUpdate.get().setPhoneNumber(studentEntity.getPhoneNumber());
            studentUpdate.get().setImageUrl(studentEntity.getImageUrl());
            studentUpdate.get().setBirthday(studentEntity.getBirthday());
            studentUpdate.get().setAddress(studentEntity.getAddress());
            studentRepository.save(studentUpdate.get());
        }

    }

    public void delete(Long id) {
        if (studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
        }
    }

    public List<StudentEntity> getByName(String name) {
        return studentRepository.findByNameContaining(name);
    }
}

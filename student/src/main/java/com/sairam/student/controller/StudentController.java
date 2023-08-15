package com.sairam.student.controller;

import com.sairam.student.model.Student;
import com.sairam.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/v1/getStudents")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping("/v1/addStudent")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @GetMapping("/v1/getStudent/{id}")
    public Student getStudentById(@PathVariable("id") int id) {
        return studentService.getStudentById(id);
    }

    @DeleteMapping("/v1/deleteStudent/{id}")
    public String deleteStudentById(@PathVariable("id") int id) {
        return studentService.deleteStudentById(id);
    }

}

package com.sairam.student.service;

import com.sairam.student.model.Student;

import java.util.List;

public interface StudentService {

    public List<Student> getStudents();

    public Student addStudent(Student student);

    public Student getStudentById(int id);

    public String deleteStudentById(int id);

}

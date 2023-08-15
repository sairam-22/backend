package com.sairam.student.service;

import com.sairam.student.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.isNull;

@Service
public class StudentServiceImpl implements StudentService {

    private final static List<Student> students = new ArrayList<>();

    @Override
    public List<Student> getStudents() {
        return students;
    }

    @Override
    public Student addStudent(Student student) {
        students.add(student);
        return student;
    }

    @Override
    public Student getStudentById(int id) {
       return students.stream().filter(student -> id == student.getId())
               .findFirst().orElse(null);
    }

    @Override
    public String deleteStudentById(int id) {
        Student student = getStudentById(id);
        if(!isNull(student)){
            students.removeIf(student1 -> student1.getId() == id);
            return "Student deleted successfully";
        }
        return "Not able to delete student with id " + id;
    }
}

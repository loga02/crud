package com.example.practiseSpring.Service;

import com.example.practiseSpring.Entity.Student;

import java.util.List;
import java.util.Optional;


public interface myService {

    Student addStudent(Student student);

    List<Student> getAllStudents();

    Student getStudent(int id);

    Student updateStudent(Student student,int id);

    void deleteStudent(int id);
}

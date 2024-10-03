package com.example.practiseSpring.Service;

import com.example.practiseSpring.Entity.Student;
import com.example.practiseSpring.Repository.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class myServiceImpl implements myService{

    public myRepository myRepository;
    public myServiceImpl(myRepository myRepository){
        this.myRepository=myRepository;
    }
    @Override
    public Student addStudent(Student student) {
        return myRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return myRepository.findAll();
    }

    @Override
    public Student getStudent(int id) {
        Optional<Student> student=myRepository.findById(id);
        Student s1=null;
        if(student.isPresent()){
            s1=student.get();
        }
        return s1;
    }

    @Override
    public Student updateStudent(Student student, int id) {
        Optional<Student> s1=myRepository.findById(id);
        Student finStudent=null;
        if(s1.isPresent()){
            finStudent=s1.get();
        }
        finStudent.setName(student.getName());
        finStudent.setRole(student.getRole());
        finStudent.setId(student.getId());
        return finStudent;
    }

    @Override
    public void deleteStudent(int id) {
        myRepository.deleteById(id);
    }


}

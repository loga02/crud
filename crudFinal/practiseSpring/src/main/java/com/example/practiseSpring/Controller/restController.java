package com.example.practiseSpring.Controller;


import com.example.practiseSpring.Entity.Student;
import com.example.practiseSpring.Service.myServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/student")
public class restController {

    public myServiceImpl myServiceImpl;
    public restController(myServiceImpl myServiceImpl){
        this.myServiceImpl=myServiceImpl;
    }

    @PostMapping("/addStudent")
    public void addStudent(@RequestBody Student student){
        myServiceImpl.addStudent(student);
    }

    @GetMapping("/getAllStudent")
    public List<Student> getAllStudent(){
        return myServiceImpl.getAllStudents();
    }

    @GetMapping("/getStudent/{id}")
    public Student getStudentById(@PathVariable int id){
        return myServiceImpl.getStudent(id);
    }

    @PutMapping("{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable("id") int id, @RequestBody Student student){
        return new ResponseEntity<Student>(myServiceImpl.updateStudent(student,id), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable int id){
        myServiceImpl.deleteStudent(id);
        return new ResponseEntity<String>("Employee deleted successfully!",HttpStatus.OK);
    }




}

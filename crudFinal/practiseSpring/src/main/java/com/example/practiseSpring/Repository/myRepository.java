package com.example.practiseSpring.Repository;

import com.example.practiseSpring.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface myRepository extends JpaRepository<Student,Integer> {

}

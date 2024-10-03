package com.example.practiseSpring.Entity;


import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column(name="name")
    public String name;

    @Column(name="role")
    public String role;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Student(int id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    public Student() {
    }
}

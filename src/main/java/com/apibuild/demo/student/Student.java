package com.apibuild.demo.student;

import java.time.LocalDate;

public class Student {
    private Long id;
    private String name;
    private LocalDate dob;
    private int age;
    private String email;

    public Student() {
    }

    public Student(Long id,
                   String name,
                   LocalDate dob,
                   int age,
                   String email) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.age = age;
        this.email = email;
    }

    public Student(String name,
                   LocalDate dob,
                   int age,
                   String email) {
        this.name = name;
        this.dob = dob;
        this.age = age;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}

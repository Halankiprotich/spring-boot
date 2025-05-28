package com.restexample.resthalan.student;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName= "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )

    private long id;
    private String name;
    private String email;
    private LocalDate dob;
    private int age;


    public student() {
    }

    public student(int age,
                   LocalDate dob,
                   String email,
                   String name) {
        this.age = age;
        this.dob = dob;
        this.email = email;
        this.name = name;
    }


    public student(
            long id,
            String name,
            String email,
            LocalDate dob,
            int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;


    }

    public student(String kevin, String mail, LocalDate of, int i) {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
}

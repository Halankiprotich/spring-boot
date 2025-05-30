package com.restexample.resthalan.student;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.Period;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class student { // Fixed to PascalCase
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long id;

    private String name;
    private String email;
    private LocalDate dateOfBirth;
    private Integer age;

    // Existing constructor for CommandLineRunner usage
    public student(String name, String email, LocalDate dateOfBirth, Integer age) {
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
    }

    // New constructor to calculate age dynamically
    public student(String name, String email, LocalDate dateOfBirth) {
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.age = calculateAge(dateOfBirth);
    }

    // Method to calculate age based on dateOfBirth
    private Integer calculateAge(LocalDate dateOfBirth) {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }
}
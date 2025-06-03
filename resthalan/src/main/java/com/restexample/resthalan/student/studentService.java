package com.restexample.resthalan.student;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDate;
import java.util.List;


@Service
public class studentService {
    private final studentRepository studentRepository;

    public studentService(studentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public List<student> getstudents(){
        return studentRepository.findAll();

    }
    public static void addNewStudent(student Student) {
        System.out.println(Student);
    }
}

package com.restexample.resthalan.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;


@RestController
@RequestMapping(path= "api/v1/student")
public class studentController {

    @Autowired
    private final studentService StudentService;

    public studentController(studentService studentService) {
        StudentService = studentService;
    }

    @GetMapping
    public List<student> getstudents() {
        return StudentService.getstudents();
    }
}

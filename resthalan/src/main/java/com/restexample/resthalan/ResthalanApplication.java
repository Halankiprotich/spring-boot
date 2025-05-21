package com.restexample.resthalan;

import com.restexample.resthalan.student.student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@RestController
public class ResthalanApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResthalanApplication.class, args);
	}
    @GetMapping
    public List <student> hello(){
        return List.of(
                new student(
                        1l,
                        "halan",
                        "kiprotichhalan@gmail.com",
                        LocalDate.of(2002,12,19),
                        22

                )
                );
    }
}

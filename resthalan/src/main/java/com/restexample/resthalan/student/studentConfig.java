package com.restexample.resthalan.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class studentConfig {

    @Bean
    CommandLineRunner commandLineRunner(studentRepository repository) {
        return args -> {
            student kevin = new student(
                    "Kevin",
                    "kevinkipyegon@gmail.com",
                    LocalDate.of(2020, 12, 19)
            );
            student victor = new student(
                    "Victor",
                    "victorkipkoech@gmail.com",
                    LocalDate.of(2010, 10, 21)

            );
            repository.saveAll(List.of(kevin, victor));
        };
    }
}
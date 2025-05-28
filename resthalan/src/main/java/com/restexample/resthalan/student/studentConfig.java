package com.restexample.resthalan.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class studentConfig {
    @Bean

    CommandLineRunner commandLineRunner(
            studentRepository repository
    ){
        return args ->{
            student Kevin= new student(

                            "Kevin",
                            "kevinkipyegon@gmail.com",
                            LocalDate.of(2002,12,19),
                            22

            );
            student Victor= new student(
                    "Victor",
                    "victorkipkoech@gmail.com",
                    LocalDate.of(2007,10,21),
                    29);
            repository.saveAll(
                    List.of(Kevin,Victor)
            );

        };
    }
}

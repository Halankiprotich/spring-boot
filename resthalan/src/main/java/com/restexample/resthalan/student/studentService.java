package com.restexample.resthalan.student;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class studentService {

    public List<student> getstudents(){
        return List.of(
                new student(
                        1L,
                        "halan",
                        "kiprotichhalan@gmail.com",
                        LocalDate.of(2002,12,19),
                        22

                )
        );
    }
}

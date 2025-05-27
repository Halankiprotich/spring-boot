package com.restexample.resthalan;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ResthalanApplication {

	public static void main(String[] args) {
        SpringApplication.run(ResthalanApplication.class, args);
	}

}

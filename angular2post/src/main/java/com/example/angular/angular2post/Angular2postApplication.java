package com.example.angular.angular2post;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(value="http://localhost:4200")
public class Angular2postApplication {

	public static void main(String[] args) {
		SpringApplication.run(Angular2postApplication.class, args);
	}

}

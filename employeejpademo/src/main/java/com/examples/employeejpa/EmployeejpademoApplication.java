package com.examples.employeejpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.examples.employeejpa")
public class EmployeejpademoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeejpademoApplication.class, args);
	}

}

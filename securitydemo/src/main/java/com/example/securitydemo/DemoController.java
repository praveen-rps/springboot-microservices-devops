package com.example.securitydemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	
	@GetMapping("/test1")
	public String test1() {
		return "test1 is working...";
	}
	
	@GetMapping("/test2")
	public String test2() {
		return "test2 is working...";
	}

}

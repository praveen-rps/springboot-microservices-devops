package com.example.securitydemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	
	@PostMapping("/post")
	public String getData(@RequestBody String name) {
		return "Hello "+name;
	}
	
	
	@GetMapping("/details")
	public String getDetails() {
		return "user details are displayed";
	}
	
	@GetMapping("/delete")
	public String deleteUser() {
		return "user account is deleted...";
	}
	
	@GetMapping("/display")
	public String displayAllUsers() {
		return "All user details are displayed...";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "bank contact details are displayed...";
	}

}

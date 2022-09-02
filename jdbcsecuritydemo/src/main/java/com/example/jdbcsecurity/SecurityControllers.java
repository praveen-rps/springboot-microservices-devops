package com.example.jdbcsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityControllers {
	
	
	@GetMapping("/getDetails")
	public String getUserDetails() {
		return "User details are returned...";
	}
	
	@GetMapping("/deleteUser")
	public String deletetUserDetails() {
		return "User details are deleted....";
	}

}

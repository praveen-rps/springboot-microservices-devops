package com.example.testingweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class GreetingController {

	
	
	private final GreetingServiceImpl service;

	
	public GreetingController(GreetingServiceImpl service) {
		this.service = service;
	}

	@RequestMapping("/hai")
	public @ResponseBody String greetingHai() {
		return service.greetHai();
	}
	@RequestMapping("/bye")
	public @ResponseBody String greetingBye() {
		return service.greetBye();
	}

}

package com.example.coforge.coforgedemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(value="/class1", method=RequestMethod.GET)
public class TestController {
	
	
	@GetMapping("/test")
	public ResponseEntity<String> getResponseValue(){
		
		return new ResponseEntity<>("This is the payload", HttpStatus.CREATED);
	}
	
	@GetMapping("/employee")
	public ResponseEntity<Employee> sendEmployee() {
		return new ResponseEntity<>(new Employee("kumar","qualiyt","manager"),HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/getParameters")
	public String getHeaderParameters(@RequestParam("param1") String param1) {
		return "the param1 value is:"+param1;
	}
	
	
	@GetMapping("/all")
	public ResponseEntity<List<Employee>> showAllEmployees() {
		ArrayList<Employee> emps = new ArrayList<>();
		emps.add(new Employee("sunil","finance","manager"));
		emps.add(new Employee("kamal","quality","lead"));
		emps.add(new Employee("balu","marketing","executive"));
		return new ResponseEntity<>(emps,HttpStatus.OK);
	}
	
	
	@PostMapping("/getEmployee")
	public String getEmployee(@RequestBody Employee emp) {
		return emp.getName()+" is from "+emp.getDept()+" and working as "+emp.getDesg();
	}
	
	@PostMapping("/greet/{name}/{city}")
	public String greeting(@PathVariable("name") String name,
			@PathVariable("city") String city) {
		return "Hello, "+name+" Good Evening...!"+"How is "+city;
	}
	
	
	@GetMapping("/get1")
	public String test1() {
		return "Hi, I am from controller - get1 method";
	}
	
	@GetMapping("/get2")
	public String test3() {
		return "Hi, I am from controller - get2 method";
	}
	
	@PostMapping("/post")
	public String test2() {
		return "Hi, I am from controller - post method";
	}
	
	@PutMapping("/put")
	public String test4() {
		return "from put mapping";
	}
	

	@DeleteMapping("/delete")
	public String test5() {
		return "from delete mapping";
	}
	

}

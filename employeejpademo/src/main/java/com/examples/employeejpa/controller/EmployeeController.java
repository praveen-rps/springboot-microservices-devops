package com.examples.employeejpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examples.employeejpa.model.Employee;
import com.examples.employeejpa.model.EmployeeDto;
import com.examples.employeejpa.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	
	@Autowired
	EmployeeService service; 
	
	
	
	@GetMapping("/findNamesByDept/{dept}")
	public ResponseEntity<List<EmployeeDto>> findAllEmpNamesByDept(@PathVariable("dept") String dept){
		List<EmployeeDto> emps = service.findEmployeeNamesByDept(dept);
		return new ResponseEntity<>(emps,HttpStatus.OK);
		
	}
	
	
	@GetMapping("find/{empid}")
	public ResponseEntity<Optional<Employee>> findEmployeeById(@PathVariable("empid")int empid){
		
		return new ResponseEntity<>(service.searchEmployee(empid), HttpStatus.OK);
	}
	
	
	@GetMapping("/findByDept/{dept}")
	public ResponseEntity<List<Employee>> findAllEmpsByDept(@PathVariable("dept") String dept){
		List<Employee> emps = service.findEmployeesByDept(dept);
		return new ResponseEntity<>(emps,HttpStatus.OK);
		
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Employee>> findAllEmps(){
		List<Employee> emps = service.getAllEmps();
		return new ResponseEntity<>(emps,HttpStatus.OK);
		
	}
	
	@PostMapping("/save")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		
		return new ResponseEntity<>(service.addEmployee(employee), HttpStatus.CREATED);
		
	}
	
	@DeleteMapping("/delete/{empid}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("empid") int empid){
		
		service.deleteEmployee(empid);
		return new ResponseEntity<>("Record Deleted",HttpStatus.OK);
	}
	
	

}

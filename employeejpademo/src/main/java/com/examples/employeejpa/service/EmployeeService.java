package com.examples.employeejpa.service;

import java.util.List;
import java.util.Optional;

import com.examples.employeejpa.model.Employee;
import com.examples.employeejpa.model.EmployeeDto;

public interface EmployeeService {
	
	public List<Employee> getAllEmps();
	public Employee addEmployee(Employee employee);
	public void deleteEmployee(int empid);
	public Optional<Employee> searchEmployee(int empid);
	public List<Employee> findEmployeesByDept(String dept);
	public List<EmployeeDto> findEmployeeNamesByDept(String dept);

}

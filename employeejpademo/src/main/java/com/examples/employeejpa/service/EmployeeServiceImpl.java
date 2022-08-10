package com.examples.employeejpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examples.employeejpa.model.Employee;
import com.examples.employeejpa.model.EmployeeDto;
import com.examples.employeejpa.repo.EmployeeRepository;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	
	@Autowired
	EmployeeRepository repo;

	@Override
	public List<Employee> getAllEmps() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return repo.save(employee);
	}

	@Override
	public void deleteEmployee(int empid) {
		// TODO Auto-generated method stub
		
		repo.deleteById(empid);
		
	}

	@Override
	public Optional<Employee> searchEmployee(int empid) {
		// TODO Auto-generated method stub
		
		
		return repo.findById(empid);
	}

	@Override
	public List<Employee> findEmployeesByDept(String dept) {
		// TODO Auto-generated method stub
		return repo.findAllEmpsByDept(dept);
	}

	@Override
	public List<EmployeeDto> findEmployeeNamesByDept(String dept) {
		// TODO Auto-generated method stub
		return repo.findAllEmpsNamesByDept(dept);
	}

}

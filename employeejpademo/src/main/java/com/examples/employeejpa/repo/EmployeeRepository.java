package com.examples.employeejpa.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.examples.employeejpa.model.Employee;
import com.examples.employeejpa.model.EmployeeDto;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

	@Query("SELECT u FROM Employee u WHERE u.dept = ?1")
	public List<Employee> findAllEmpsByDept(String dept);
	
	
	@Query("SELECT u.empid,u.name FROM Employee u WHERE u.dept = ?1")
	public List<EmployeeDto> findAllEmpsNamesByDept(String dept);


	
}

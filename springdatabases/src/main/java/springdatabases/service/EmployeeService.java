package springdatabases.service;

import java.util.List;

import springdatabases.model.Employee;

public interface EmployeeService {
	
	public List<Employee> showAllEmployees();
	public Employee insertEmployee(Employee employee);

}

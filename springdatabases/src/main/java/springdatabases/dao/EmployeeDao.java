package springdatabases.dao;

import java.util.List;

import springdatabases.model.Employee;

public interface EmployeeDao {

	public Employee insertEmployee(Employee employee);

	public List<Employee> getAllEmployess();

}

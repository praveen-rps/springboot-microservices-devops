package springdatabases.service;

import java.util.List;

import springdatabases.dao.EmployeeDaoImpl;
import springdatabases.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	
	EmployeeDaoImpl dao;
	

	public EmployeeDaoImpl getDao() {
		return dao;
	}


	public void setDao(EmployeeDaoImpl dao) {
		this.dao = dao;
	}


	public List<Employee> showAllEmployees() {
		// TODO Auto-generated method stub
		return dao.getAllEmployess();
	}


	public Employee insertEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return dao.insertEmployee(employee);
	}

}

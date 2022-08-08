package springdatabases.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springdatabases.model.Employee;
import springdatabases.service.EmployeeService;
import springdatabases.service.EmployeeServiceImpl;

public class EmployeeController {
	
	public static void main(String args[]) {
		
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("beans.xml");
		
		EmployeeServiceImpl service = (EmployeeServiceImpl) ctx.getBean("service");
		
		Employee emp= new Employee(1006,"Finance","Manager","Sairam");
		service.insertEmployee(emp);
		
		List<Employee> emps = service.showAllEmployees();
		
		for(Employee emp1:emps)
			System.out.println(emp1.getEmpid()+" "+emp1.getName()+" "+emp1.getDept()+" "+emp1.getDesg());
	
		
	
	}

}

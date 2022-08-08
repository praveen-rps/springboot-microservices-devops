package springdatabases.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import springdatabases.model.Employee;
import springdatabases.model.EmployeeRowMapper;

public class EmployeeDaoImpl implements EmployeeDao {
	
	JdbcTemplate template;
	

	public JdbcTemplate getTemplate() {
		return template;
	}


	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}


	public List<Employee> getAllEmployess() {
		// TODO Auto-generated method stub
		String sql = "select * from employee";
		List<Employee> emps = template.query(sql, new EmployeeRowMapper());
		return emps;
	}


	public Employee insertEmployee(Employee employee) {
		// TODO Auto-generated method stub
		String sql = "insert into employee values(?,?,?,?)";
		template.update(sql, employee.getEmpid(),employee.getDept(),employee.getDesg(),employee.getName());
		return employee;
	}

}

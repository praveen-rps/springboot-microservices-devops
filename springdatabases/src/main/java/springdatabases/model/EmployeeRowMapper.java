package springdatabases.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.setDept(rs.getString(2));
		employee.setName(rs.getString(4));
		employee.setDesg(rs.getString(3));
		employee.setEmpid(rs.getInt(1));
		
		return employee;
	}

}

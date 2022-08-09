package com.example.datajpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	int employeeId;
	
	@Column
	String dept;
	
	@Column
	String desg;
	
	@Column
	String name;
	
	public Employee() {
		
	}
	public Employee(int employeeId, String dept, String desg, String name) {
		super();
		this.employeeId = employeeId;
		this.dept = dept;
		this.desg = desg;
		this.name = name;
	}
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

package com.examples.employeejpa.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeDto {
	
	@Id
	int empid;
	String name;
	public EmployeeDto() {
		
	}
	public EmployeeDto(int empid, String name) {
		super();
		this.empid = empid;
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}

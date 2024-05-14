package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long empID;
	
	private String empName;
	
	private Float empSalary;
	
	public Long getEmpID() {
		return empID;
	}

	public void setEmpID(Long empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public Float getEmpSalary() {
		return empSalary;
	}


	public void setEmpSalary(Float empSalary) {
		this.empSalary = empSalary;
	}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(Long empID, String empName, Float empSalary) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	
}

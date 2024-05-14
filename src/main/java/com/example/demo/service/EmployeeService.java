package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService {
	Employee saveEmp(Employee emp);
	List<Employee> getAllEmp();
	Employee getEmpById(Long id);
	Employee updateEmp(Long id,Employee emp);
	String deleteEmpById(Long id);
}

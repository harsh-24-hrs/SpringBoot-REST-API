package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	@PostMapping("/saveEmployee")
	public Employee saveEmployee(@RequestBody Employee emp) {
		return empService.saveEmp(emp);
	}
	
	@GetMapping("/getAllEmp")
	public List<Employee> getAllEmp(){
		return empService.getAllEmp();
	}
	
	@GetMapping("/getEmpById/{id}")
	public Employee getById(@PathVariable("id") Long id) {
		return empService.getEmpById(id);
	}
	
	@PutMapping("/updateEmp/{id}")
	public Employee updateEmp(@PathVariable("id") Long id,@RequestBody Employee emp) {
		return empService.updateEmp(id, emp);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable("id") Long id) {
		return empService.deleteEmpById(id);
	}
	
}

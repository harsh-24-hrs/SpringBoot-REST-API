package com.example.demo.service.serviceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;

@Service
public class EmployeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee saveEmp(Employee emp) {
		return employeeRepository.save(emp);
	}

	@Override
	public List<Employee> getAllEmp() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmpById(Long id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id).get();
	}

	@Override
	public Employee updateEmp(Long id, Employee emp) {
		Optional<Employee> optional=employeeRepository.findById(id);
		if(optional.isPresent()) {
			Employee oldEmp=optional.get();
			if(!emp.getEmpName().equalsIgnoreCase(oldEmp.getEmpName()))
				oldEmp.setEmpName(emp.getEmpName());
			if(emp.getEmpSalary()!=oldEmp.getEmpSalary())
				oldEmp.setEmpSalary(emp.getEmpSalary());
			
			return employeeRepository.save(oldEmp);
				
		}
		return null;
	}

	@Override
	public String deleteEmpById(Long id) {
		Optional<Employee> optional=employeeRepository.findById(id);
		if(optional.isPresent()) {
			employeeRepository.deleteById(id);
			return "Emp with id="+id+" deleted successfully";
		}
		return "No Employee available";
	}
	
	
	

}

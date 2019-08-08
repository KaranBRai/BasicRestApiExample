package com.example.restapidemo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restapidemo.model.Employee;
import com.example.restapidemo.repository.EmployeeRepository;

@Service
public class EmployeeDAO {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	// Save an employee
	
	public Employee saveEmployee(Employee emp) {
		
		return employeeRepository.save(emp);
		
	}
	
	// search all employees
	
	public List<Employee> showEmployeeList(){
		
		return employeeRepository.findAll();
	}
	// get an employee by id
	
	public Employee getEmployeeInfo(Long id) {
		
		return employeeRepository.getOne(id);
	}
	
	// delete an employee by object
	
	public void deleteEmployee(Employee emp) {
		
		employeeRepository.delete(emp);
	}

}

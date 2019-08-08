package com.example.restapidemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restapidemo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long > {

}

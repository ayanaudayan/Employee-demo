package com.lxisoft.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxisoft.employee.model.Employee;
import com.lxisoft.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepo;

	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		List<Employee>employee =employeeRepo.findAll();
		return employee;
	}
}

package com.lxisoft.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lxisoft.employee.model.Employee;
import com.lxisoft.employee.service.EmployeeService;


@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	 @GetMapping("/employees")
	    public List<Employee> getAllEmployees() {
		 
		 List<Employee>employee =employeeService.findAll();
		 return employee;
	            }
	 @GetMapping("/employees/{id}") 
	    public Employee getEmployee(@PathVariable Long id) {
	        
	        return null;
	    }
	 @PostMapping("/employees")
	    public String createEmployee(@RequestBody Employee employee) {
		 
		 return null;
	    }
	 @DeleteMapping("/employees/{id}")
	    public void deleteEmployee(@PathVariable Long id) {
	         }
	 @PutMapping("/employees")
	    public String updateEmployee(@RequestBody Employee employee) {
		 
		 return null;
	    }
}

package com.example.demoapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.example.demoapp.employees.Employee;
import com.example.demoapp.employees.EmployeeRepository;

@Configuration
public class InitializeData {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
//	@PostConstruct
	public void xxxx() {
		Employee employee = new Employee();
		employee.setId(1000);
		employee.setName("Pongsakorn");
		employeeRepository.saveAndFlush(employee);
	}
}

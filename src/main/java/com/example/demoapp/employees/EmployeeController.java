package com.example.demoapp.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees/{id}")
	public EmployeeResponse getEmployeeById(@PathVariable String id) {
		
//		Validate input
//		Cleansing data
		EmployeeResponse response = employeeService.getById(Integer.parseInt(id));
		
		return response;
	}
	
	@GetMapping("/employees")
	public EmployeeResponse[] listEmployee() {
		
		EmployeeResponse employee01 = new EmployeeResponse();
		employee01.setId(1);
		employee01.setName("Ravinun");
		EmployeeResponse employee02 = new EmployeeResponse();
		employee02.setId(2);
		employee02.setName("Ravinun 2");
		
		return new EmployeeResponse[] {employee01, employee02};
	}
}

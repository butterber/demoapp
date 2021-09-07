package com.example.demoapp.employees;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class EmployeeControllerFailureTest {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Test
	@DisplayName("เกิด error 404 เมื่อค้นหา employee id = 1 ไม่เจอ")
	public void case01() {
		// Arrange
		int id = 1;
		// Act
		ErrorResponse result = restTemplate.getForObject("/employees/" + id, ErrorResponse.class);
		// Assert
		assertEquals(404, result.getCode());
		assertEquals("Employee not found id = 1", result.getDetail());
		
	}	
}

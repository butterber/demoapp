package com.example.demoapp.employees;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class EmployeeControllerTest {
	
	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void listEmployees() {
		//Act
		EmployeeResponse[] results = restTemplate.getForObject("/employees", EmployeeResponse[].class);
		
		//Assert
		assertEquals(2, results.length);
		assertEquals(1, results[0].getId());
		assertEquals("Ravinun", results[0].getName());
	}
	
	@Test
	public void getEmployeeById() {
		// Arrange
		int id = 1;
        // Act
        EmployeeResponse result = restTemplate.getForObject("/employees/" + id, EmployeeResponse.class);
        // Assert
        assertEquals(id, result.getId());
        assertEquals("Ravinun", result.getName());
	}

}

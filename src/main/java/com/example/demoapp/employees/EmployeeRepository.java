package com.example.demoapp.employees;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	// select * from employee where id=? and name=?
	List<Employee> findAllByIdAndName(int id, String name);

}

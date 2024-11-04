package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EmployeeResponse;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/v1")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/empAll")
	public List<Employee> getAll() {
		return employeeService.getAll();
	}

	@GetMapping("/emp/{id}/{country}")
	public EmployeeResponse getByEmpIDAndCountry(@PathVariable Long id, @PathVariable String country) {
		return employeeService.findByEmpIDAndCountry(id, country);

	}

	@GetMapping("/emp/{id}")
	public Employee getById(@PathVariable Long id) {
		return employeeService.getbyId(id);
	}

	@PostMapping("/emp")
	public Employee postMethodName(@RequestBody Employee emp) {
		return employeeService.create(emp);
	}

}

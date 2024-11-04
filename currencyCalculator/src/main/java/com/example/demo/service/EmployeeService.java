package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.EmployeeInfoWithCountry;
import com.example.demo.dto.EmployeeResponse;
import com.example.demo.entity.Currency;
import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	CurrencyService currencyService;

	public List<Employee> getAll() {
		return employeeRepository.findAll();
	}

	public Employee getbyId(Long id) {
		return employeeRepository.getById(id);
	}

	public Employee create(Employee emp) {
		return employeeRepository.save(emp);
	}

	public EmployeeResponse findByEmpIDAndCountry(Long id, String country) {

		Double currValue = currencyService.getINR(country);
		Employee emp = employeeRepository.findById(id).get();
		
		EmployeeResponse employeeResponse = new EmployeeResponse();
		employeeResponse.setAddress(emp.getAddress());
		employeeResponse.setName(emp.getName());
		
		EmployeeInfoWithCountry employeeInfoWithCountry = new EmployeeInfoWithCountry();
		employeeInfoWithCountry.setAge(emp.getInfo().getAge());
		employeeInfoWithCountry.setCountry(country);
		employeeInfoWithCountry.setSalary(currValue * emp.getInfo().getSalary());

		employeeResponse.setInfo(employeeInfoWithCountry);
		return employeeResponse;
	}

}

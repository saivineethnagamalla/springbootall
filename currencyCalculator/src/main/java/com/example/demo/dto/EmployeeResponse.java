package com.example.demo.dto;

import com.example.demo.entity.EmployeeAddress;

public class EmployeeResponse {

	private Long id;

	private String name;

	private EmployeeAddress address;

	private EmployeeInfoWithCountry info;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EmployeeAddress getAddress() {
		return address;
	}

	public void setAddress(EmployeeAddress address) {
		this.address = address;
	}

	public EmployeeInfoWithCountry getInfo() {
		return info;
	}

	public void setInfo(EmployeeInfoWithCountry info) {
		this.info = info;
	}
	
}

package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Currency {
	
	@Id
	private String country;
	
	private Double valueInINR;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Double getValueInINR() {
		return valueInINR;
	}

	public void setValueInINR(Double valueInINR) {
		this.valueInINR = valueInINR;
	}
	
	

}

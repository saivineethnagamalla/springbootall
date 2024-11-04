package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Currency;
import com.example.demo.service.CurrencyService;

@RestController
@RequestMapping("/v1")
public class CurrencyController {

	@Autowired
	CurrencyService currencyService;

	@GetMapping("/currAll")
	public List<Currency> getAllCurr() {
		return currencyService.findAll();
	}

	@GetMapping("/{country}")
	public Double getByID(@PathVariable String country) {
		return currencyService.getINR(country);
	}

	@PostMapping("/curr")
	public Currency post(@RequestBody Currency cu) {
		return currencyService.postINR(cu);
	}
	@PutMapping("/put")
	public Currency putMap(@RequestBody Currency cu) {
		return currencyService.putINR(cu);
	}

}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SecondSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondSpringBootApplication.class, args);
	}

}

@RestController
class Controller {

	@GetMapping("/add")
	public String add() {
		int a = 10;
		int b = 20;
		int c = a + b;
		String d = "The value of a : " + a + "the value of b : " + b + "the sum : " + c + "";
		return d;
	}

	@GetMapping("/sub")
	public String sub() {
		int a = 10;
		int b = 20;
		int c = a - b;
		String d = "The value of a : " + a + "the value of b : " + b + "the sub : " + c + "";
		return d;
	}

	@GetMapping("/mul")
	public String mul() {
		int a = 10;
		int b = 20;
		int c = a * b;
		String d = "The value of a : " + a + "the value of b : " + b + "the mul : " + c + "";
		return d;
	}

	@GetMapping("/div")
	public String div() {
		int a = 20;
		int b = 10;
		int c = a / b;
		String d = "The value of a : " + a + "the value of b : " + b + "the div : " + c + "";
		return d;
	}

}
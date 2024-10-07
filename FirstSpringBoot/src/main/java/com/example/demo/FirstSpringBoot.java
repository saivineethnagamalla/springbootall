package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class FirstSpringBoot {

	public static void main(String[] args) {
		System.out.println("The new application");
		SpringApplication.run(FirstSpringBoot.class, args);
	}

}

@RestController
class Controller {

	@GetMapping("/")
	public String check() {
		return "hi from spring boot";
	}

}

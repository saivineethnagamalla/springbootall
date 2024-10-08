package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Person;
import com.example.demo.repository.PersonRespository;

@Service
public class PersonService {

	@Autowired
	PersonRespository personRespository;

	public List<Person> getAll() {
		return personRespository.findAll();
	}

	public Person getForId(Long id) {
		return personRespository.getById(id);
	}

	public Person insertData(Person person) {

		if (person.getAge() > 18) {
			return personRespository.save(person);
		} else
			System.out.println("the age should be above 18");
		return null;

	}

	public void deleteData(Long id) {
		personRespository.deleteById(id);
	}

	public void deleteAll() {
		personRespository.deleteAll();
	}

}

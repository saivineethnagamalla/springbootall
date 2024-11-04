package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Currency;
import com.example.demo.repository.CurrencyRepository;

@Service
public class CurrencyService {

	@Autowired
	CurrencyRepository currencyRepository;

	public List<Currency> findAll() {
		return currencyRepository.findAll();
	}

	public Double getINR(String country) {
		return currencyRepository.getById(country).getValueInINR();
	}

	public Currency putINR(Currency currency) {
		System.out.println("the value" +currency);
		Optional<Currency> cuExisting = currencyRepository.findById(currency.getCountry());
		if (!cuExisting.isPresent()) {
			System.out.println(" no data found for that country");
			return null;
		} else {
			Currency newCur = cuExisting.get();
			newCur.setValueInINR(currency.getValueInINR());
			return currencyRepository.save(newCur);
		}

	}

	public Currency postINR(Currency currency) {
		return currencyRepository.save(currency);

	}

}

package com.countryservice.countryServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.countryservice.countryService.CountryService;
import com.countryservice.countryServiceDAO.CountryServiceDAO;
import com.countryservice.model.Country;

@Component
public class CountryServiceImpl implements CountryService {

	
	@Autowired
	private CountryServiceDAO countryServiceDAO;
	
	public Country getCountry(int contryCode) {
		// TODO Auto-generated method stub
		return null;
	}

	public String addCountry(Country country) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getContrycodeByName(String countryName) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Country modifyCountry(Country oldCountryName, Country newCountryName) {
		// TODO Auto-generated method stub
		return null;
	}

	public String deleteCountryByName(String countryName) {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.countryservice.countryServiceDAOImpl;

import org.springframework.stereotype.Component;

import com.countryservice.countryServiceDAO.CountryServiceDAO;
import com.countryservice.model.Country;


@Component
public class CountryServiceDAOImpl implements CountryServiceDAO {

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

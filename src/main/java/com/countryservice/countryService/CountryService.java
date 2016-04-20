package com.countryservice.countryService;

import com.countryservice.model.Country;

public interface CountryService {
	
	public Country getCountry(int contryCode);
	
	public String addCountry(Country country);
	
	public int getContrycodeByName(String countryName);
	
	public Country modifyCountry(Country oldCountryName, Country newCountryName);
	
	public String deleteCountryByName(String countryName);
	
}

package com.countryservice.countryService;

import com.countryservice.model.Country;

public interface CountryService {
	
	public String getCountry(int contryCode);
	
	public String addCountry(String country);
	
	public int getContrycodeByName(String countryName);
	
	public Country modifyCountry(Country oldCountryName, Country newCountryName);
	
	public String deleteCountryByName(String countryName);
	
}

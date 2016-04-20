package com.countryservice.countryServiceDAO;

import com.countryservice.model.Country;

public interface CountryServiceDAO {
	
	public Country getCountry(int contryCode);
	
	public String addCountry(Country country);
	
	public int getContrycodeByName(String countryName);
	
	public Country modifyCountry(Country oldCountryName, Country newCountryName);
	
	public String deleteCountryByName(String countryName);
	
	

}

package com.countryservice.countryServiceDAOImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.countryservice.countryServiceDAO.CountryServiceDAO;
import com.countryservice.model.Country;


@Component
public class CountryServiceDAOImpl implements CountryServiceDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public String getCountry(int contryCode) {
		String sql = "select * from country where id = ?";
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(contryCode);
		Country country = (Country) jdbcTemplate.query(sql,intList.toArray(), new CountryNameExtractor());
		String countryName  = country.getCountryName();
		return countryName;
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

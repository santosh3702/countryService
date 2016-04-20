package com.countryservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.countryservice.countryService.CountryService;
import com.countryservice.validation.Validation;

@RestController
public class Controller {

	@Autowired
	private CountryService  countryService;
	
	@Autowired
	private Validation validation;
	
	

	@RequestMapping("/")
	public String test(){
		return "hello world";
		
	}
	
	
}

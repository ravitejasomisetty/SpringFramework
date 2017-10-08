package com.udemylearning.springbootwebapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.udemylearning.springbootwebapp.appconfig.CarConfig;

@org.springframework.stereotype.Service
public class CarService {

	@Autowired
	private CarConfig carConfig;
	
	@Override
	public String toString() {
		return carConfig.toString();
	}
}

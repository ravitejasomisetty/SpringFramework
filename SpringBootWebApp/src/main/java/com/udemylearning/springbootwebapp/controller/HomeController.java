package com.udemylearning.springbootwebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.udemylearning.springbootwebapp.service.CarService;

@Controller
public class HomeController {
	
	private CarService service;
	
	@Autowired
	public void setCarService(CarService service)
	{
		this.service = service;
	}
	
	@Value("${welcome.greeting}")
	private String welcomeGreeting;

	@RequestMapping("/")
	@ResponseBody
	public String home() {
		return welcomeGreeting;
	}
	
	@RequestMapping("/printConfig")
	@ResponseBody
	public String printConfig() {
		return service.toString();
	}
}

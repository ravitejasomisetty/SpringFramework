package com.udemylearning.springbootwebapp.appconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "carconfig")
public class CarConfig {
	private String make;
	private String model;
	private int year;
	private double mileage;
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getMileage() {
		return mileage;
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	
	@Override
	public String toString() {
		return "CarConfig [make=" + make + ", model=" + model + ", year=" + year + ", mileage=" + mileage + "]";
	}
}

package com.jasongj.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jasongj.annotation.Vehicle;

@Vehicle(type="BMW")
public class BMWCar extends Car {
	
	private static Logger LOG = LoggerFactory.getLogger(BMWCar.class);
	
	public BMWCar() {
		this.name = "BMW";
	}

	@Override
	public void drive() {
		LOG.info("My name is {}. I'm on my way", name);
	};

}

package com.jasongj.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jasongj.annotation.Vehicle;

@Vehicle(type="Benz")
public class BenzCar extends Car {
	
	private static Logger LOG = LoggerFactory.getLogger(BenzCar.class);
	
	public BenzCar() {
		this.name = "Benz";
	}

	@Override
	public void drive() {
		LOG.info("My name is {}. I'm on my way", name);
	};

}

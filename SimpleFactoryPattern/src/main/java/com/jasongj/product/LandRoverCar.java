package com.jasongj.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jasongj.annotation.Vehicle;

@Vehicle(type="Land Rover")
public class LandRoverCar extends Car {
	
	private static Logger LOG = LoggerFactory.getLogger(LandRoverCar.class);
	
	public LandRoverCar() {
		this.name = "Land Rover";
	}

	@Override
	public void drive() {
		LOG.info("My name is {}. I'm on my way", name);
	};

}

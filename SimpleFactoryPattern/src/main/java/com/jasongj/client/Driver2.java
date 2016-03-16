package com.jasongj.client;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.XMLConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jasongj.product.BMWCar;
import com.jasongj.product.BenzCar;
import com.jasongj.product.Car;
import com.jasongj.product.LandRoverCar;

public class Driver2 {
	
	private static final Logger LOG = LoggerFactory.getLogger(Driver2.class);

	public static void main(String[] args) throws ConfigurationException {
		XMLConfiguration config = new XMLConfiguration("car.xml");
		String name = config.getString("driver2.name");
		Car car;

		switch (name) {
		case "Land Rover":
			car = new LandRoverCar();
			break;
		case "BMW":
			car = new BMWCar();
			break;
		case "Benz":
			car = new BenzCar();
			break;
		default:
			car = null;
			break;
		}
		LOG.info("Created car name is {}", name);
		car.drive();
	}

}

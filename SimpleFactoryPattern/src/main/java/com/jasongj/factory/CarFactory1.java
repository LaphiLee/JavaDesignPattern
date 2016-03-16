package com.jasongj.factory;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.XMLConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jasongj.product.BMWCar;
import com.jasongj.product.BenzCar;
import com.jasongj.product.Car;
import com.jasongj.product.LandRoverCar;

public class CarFactory1 {
	
	private static final Logger LOG = LoggerFactory.getLogger(CarFactory1.class);

	public static Car newCar() {
		Car car = null;
		String name = null;
		try {
			XMLConfiguration config = new XMLConfiguration("car.xml");
			name = config.getString("factory1.name");
		} catch (ConfigurationException ex) {
			LOG.error("parse xml configuration file failed", ex);
		}

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
		return car;
	}

}

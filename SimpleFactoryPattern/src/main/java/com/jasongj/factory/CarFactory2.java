package com.jasongj.factory;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.XMLConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jasongj.product.Car;

public class CarFactory2 {
	
	private static final Logger LOG = LoggerFactory.getLogger(CarFactory2.class);

	public static Car newCar() {
		Car car = null;
		String name = null;
		try {
			XMLConfiguration config = new XMLConfiguration("car.xml");
			name = config.getString("factory2.class");
		} catch (ConfigurationException ex) {
			LOG.error("Parsing xml configuration file failed", ex);
		}
		
		try {
			car = (Car)Class.forName(name).newInstance();
			LOG.info("Created car class name is {}", name);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			LOG.error("Instantiate car {} failed", name);
		}
		return car;
	}

}

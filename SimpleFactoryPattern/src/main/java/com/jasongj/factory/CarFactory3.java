package com.jasongj.factory;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.XMLConfiguration;
import org.reflections.Reflections;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jasongj.annotation.Vehicle;
import com.jasongj.product.Car;

public class CarFactory3 {

	private static final Logger LOG = LoggerFactory.getLogger(CarFactory3.class);

	private static Map<String, Class> allCars;

	static {
		Reflections reflections = new Reflections("com.jasongj.product");
		Set<Class<?>> annotatedClasses = reflections.getTypesAnnotatedWith(Vehicle.class);
		allCars = new ConcurrentHashMap<String, Class>();
		for (Class<?> classObject : annotatedClasses) {
			Vehicle vehicle = (Vehicle) classObject.getAnnotation(Vehicle.class);
			allCars.put(vehicle.type(), classObject);
		}
		allCars = Collections.unmodifiableMap(allCars);
	}

	public static Car newCar() {
		Car car = null;
		String type = null;
		try {
			XMLConfiguration config = new XMLConfiguration("car.xml");
			type = config.getString("factory3.type");
			LOG.info("car type is {}", type);
		} catch (ConfigurationException ex) {
			LOG.error("Parsing xml configuration file failed", ex);
		}

		if (allCars.containsKey(type)) {
			LOG.info("Created car type is {}", type);
			try {
				car = (Car) allCars.get(type).newInstance();
			} catch (InstantiationException | IllegalAccessException ex) {
				LOG.error("Instantiate car failed", ex);
			}
		} else {
			LOG.error("specified car type {} does not exist", type);
		}
		return car;
	}

}

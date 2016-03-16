package com.jasongj.client;

import com.jasongj.factory.CarFactory1;
import com.jasongj.product.Car;

public class Driver3 {

	public static void main(String[] args) {
		Car car = CarFactory1.newCar();
		car.drive();
	}

}

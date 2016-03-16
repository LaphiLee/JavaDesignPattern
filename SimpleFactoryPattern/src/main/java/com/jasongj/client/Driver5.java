package com.jasongj.client;

import com.jasongj.factory.CarFactory3;
import com.jasongj.product.Car;

public class Driver5 {

	public static void main(String[] args) {
		Car car = CarFactory3.newCar();
		car.drive();
	}

}

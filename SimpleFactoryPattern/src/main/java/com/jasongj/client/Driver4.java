package com.jasongj.client;

import com.jasongj.factory.CarFactory2;
import com.jasongj.product.Car;

public class Driver4 {

	public static void main(String[] args) {
		Car car = CarFactory2.newCar();
		car.drive();
	}

}

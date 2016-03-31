package com.jasongj.product;

public abstract class Car {
	
	protected String name;
	
	public abstract void drive();
	
	public String getName(){
		return this.name;
	}
	
}

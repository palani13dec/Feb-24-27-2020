package com.lab03;

public class Circle implements Shape {

	private double radius;
	
	@Override
	public void initializeAttributes(double... values) {
		if(values.length == 1) {
			this.radius = values[0];
		}
	}

	@Override
	public double area() {
		return 3.14 * radius * radius;
	}

}

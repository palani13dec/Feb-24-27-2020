package com.lab03;

public class Rectangle implements Shape {

	private double length;
	private double width;
	
	
	@Override
	public void initializeAttributes(double ...values) {
		if(values.length == 2) {
			this.length = values[0];
			this.width = values[1];
		}

	}

	@Override
	public double area() {
		return length * width;
	}

}

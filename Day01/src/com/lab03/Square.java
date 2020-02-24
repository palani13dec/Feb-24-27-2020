package com.lab03;

public class Square implements Shape {

	private double side;
	
	@Override
	public void initializeAttributes(double... values) {
		if(values.length == 1) {
			side = values[0];
		}

	}

	@Override
	public double area() {
		return side * side;
	}

}

package com.lab03;

public class Triangle implements Shape {

	private double breadth;
	private double height;
	
	@Override
	public void initializeAttributes(double... values) {
		if(values.length == 2) {
			this.breadth = values[0];
			this.height = values[1];
		}

	}

	@Override
	public double area() {
		return 0.5 * breadth * height;
	}

}

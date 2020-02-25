package com.lab04;

@FunctionalInterface
public interface Calc {
	int compute(int a, int b);
}


class Calculator {
	private int num1, num2;
	
	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int operate(Calc calc) {
		return calc.compute(num1, num2);
	}
}

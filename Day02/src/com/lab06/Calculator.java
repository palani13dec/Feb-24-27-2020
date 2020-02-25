package com.lab06;

import java.util.function.BiFunction;

public class Calculator {
	private int num1, num2;

	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int operate(BiFunction<Integer, Integer, Integer> biFunc) {
		return biFunc.apply(num1, num2);
	}

}

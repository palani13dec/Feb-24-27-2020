package com.lab04;

public class Lab04Main {

	public static void main(String[] args) {
		Calculator calculator = new Calculator(10, 5);
		
		int sum = calculator.operate((a, b) -> a + b);
		System.out.println("Sum: " + sum);
		
		Calc diff = (a, b) -> a - b;
		int difference = calculator.operate(diff);
		System.out.println("Difference: " + difference);
		
		System.out.println(calculator.operate((a, b) ->  a * b));
		
		System.out.println(calculator.operate((a, b) ->  a / b));
		
		System.out.println(calculator.operate((a, b) ->  (a * a) + (b * b) + (2 * a * b)));
	}

}

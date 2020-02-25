package com.lab05;

import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		//Function is a FI
		//takes argument of any Type and returns argument of any Type
		//map functions accept Function as argument

		Function<Integer, Integer> inc = num -> num + 1;
		int result = inc.apply(10);
		System.out.println(result);
		
		Function<String, Integer> len = val -> val.length();
		System.out.println(len.apply("hello"));
		
		
		System.out.println(len
							.andThen(inc)
							.andThen(inc)
							.andThen(inc)
							.apply("sam"));
		
		
		
		BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
		System.out.println(sum.apply(1, 2));
		
		//Similar to Predicate
		Function<Integer, Boolean> isEven = num -> num % 2 == 0;
		isEven.apply(12);

	}

}

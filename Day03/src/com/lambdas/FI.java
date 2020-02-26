package com.lambdas;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class IsEven implements Predicate<Integer> {

	public boolean test(Integer num) {
		return num % 2 == 0;
	}
	
}

public class FI {

	public static void main(String[] args) {
		//Any interface with just one abstract method is a functional interface
		//@FunctionalInterface
		
		//Lambda expression is an implementation of the functional interface
		
		Predicate<Integer> isEven = num -> num % 2 == 0;
		isEven.test(12);
		
		//Function is FI used to transform from one type to another
		Function<String, Integer> len = value -> value.length();
		len.apply("abc");
		
		//BiFunction thats take 2 items and returns a result item of some type
		BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
		add.apply(1, 2);
		
		
		//Supplier supplies us with some data of any Type
		Supplier<Double> random = () -> Math.random() * 100;
		random.get();
		
		//Consumer accepts data from you and doesn't return anything
		Consumer<Integer> print = num -> System.out.println(num);
		print.accept(1000);
		
		
	}

}

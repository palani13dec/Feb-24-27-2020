package com.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Util {
	public boolean evenCheck(int num) {
		System.out.println("Checking if " + num + " is even");
		return num % 2 == 0;
	}
	
	public int increment(int num) {
		return num + 1;
	}
}

public class CollectionExample {

	static boolean evenCheck(int num) {
		System.out.println("Checking if " + num + " is even");
		return num % 2 == 0;
	}
	
	static int increment(int num) {
		return num + 1;
	}
	
	public static void main(String[] args) {
		Util util = new Util();
		//Function<Integer, Integer> inc = num -> num + 1;
		
		Function<Integer, Integer> inc = CollectionExample::increment;
		Function<Integer, Integer> inc2 = util::increment;
		
		
//		Predicate<Integer> isEven = num -> {
//			System.out.println("Checking if " + num + " is even");
//			return num % 2 == 0;
//		};
		Predicate<Integer> isEven = CollectionExample::evenCheck;
		isEven.test(12);
		
		
		
		
		List<String> cities = Arrays.asList("Chennai", "Mumbai", "Cochin", "Bengaluru", "Boston");
		//print all the cities that start with C in upper case
		cities
			.stream()
			.filter(it -> it.startsWith("C"))
			.map(String::toUpperCase)
			.forEach(System.out::println);
		
		
	}

}

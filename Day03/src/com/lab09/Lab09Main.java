package com.lab09;

import java.util.Arrays;
import java.util.List;

public class Lab09Main {

	public static void main(String[] args) {
		List<Integer> numbers = 
				Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		//Find the largest number
		final int max1 = numbers
							.stream()
							.reduce((largest, next) -> largest > next ? largest : next)
							.get();
		
		final int max2 = numbers
							.stream()
							.mapToInt(it -> it)
							.max()
							.getAsInt();
		
		//Find the smallest number
		final int min1 = numbers
							.stream()
							.reduce((smallest, next) -> smallest < next ? smallest : next)
							.get();
		
		final int min2 = numbers
							.stream()
							.mapToInt(it -> it)
							.min()
							.getAsInt();
		
		//Find the double of the first even number greater than 3 or else return -1
		final int output = numbers
			.stream()
			.filter(it -> it % 2 == 0)
			.filter(it -> it > 3)
			.map(it -> it * 2)
			.findFirst()
			.orElseThrow(NoValueFoundException::new);
			//.orElse(-1);
		
		//Find the sum of the squares of all numbers 
		final int sum1 = numbers
			.stream()
			.map(it -> it * it)
			.reduce((first, next) -> first + next)
			.get();
		
		final int sum2 = numbers
				.stream()
				.mapToInt(it -> it * it)
				.sum();
		
		//Find the largest  odd number
			final int largestOdd = numbers
				.stream()
				.filter(it -> it % 2 != 0)
				.mapToInt(it -> it)
				.max()
				.orElse(-1);
				
		System.out.println(largestOdd);
		

	}

}

class NoValueFoundException extends RuntimeException {}





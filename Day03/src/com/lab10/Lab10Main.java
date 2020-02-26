package com.lab10;

import java.util.List;

public class Lab10Main {

	public static void main(String[] args) {
//		Library library = new Library();
//
//		List<Long> evenNumbers = library.findEvenNumbers();
//		List<Long> oddNumbers = library.findOddNumbers();
//
//		List<Long> squares = library.findSquares();
//		List<Long> cubes = library.findCubes();
		
		ModifiedLibrary library = new ModifiedLibrary();
		
		List<Long> evenNumbers = library.find(it -> it % 2 == 0);
		List<Long> oddNumbers = library.find(it -> it % 2 != 0);
		
		List<Long> squares = library.compute(it -> it * it);
		List<Long> cubes = library.compute(it -> it * it * it);
		
		
		List<Long> evenNumbers2 = library.findAndCompute(it -> it % 2 == 0, it -> it);
		List<Long> oddNumbers2 = library.findAndCompute(it -> it % 2 != 0, it -> it);
		
		List<Long> squares2 = library.findAndCompute(it -> true, it -> it * it);
		List<Long> cubes2 = library.findAndCompute(it -> true, it -> it * it * it);
		
		
		
		System.out.println(evenNumbers2);
		System.out.println(oddNumbers2);
		System.out.println(squares2);
		System.out.println(cubes2);

	}

}

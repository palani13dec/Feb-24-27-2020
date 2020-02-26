package com.lab10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {
	private List<Long> numbers = Arrays.asList(12L, 34L, 56L, 21L, 78L, 92L, 43L);

	//TOO MUCH DUPLICATION

	public List<Long> findEvenNumbers() {
		List<Long> even = new ArrayList<>();
		for (long num : numbers) {
			if(num % 2 == 0) {
				even.add(num);
			}
		}
		return even;
	}

	public List<Long> findOddNumbers() {
		List<Long> odd = new ArrayList<>();
		for (long num : numbers) {
			if(num % 2 != 0) {
				odd.add(num);
			}
		}
		return odd;
	}

	public List<Long> findSquares() {
		List<Long> square = new ArrayList<>();
		for (long num : numbers) {
			square.add(num * num);
		}
		return square;
	}

	public List<Long> findCubes() {
		List<Long> cubes = new ArrayList<>();
		for (long num : numbers) {
			cubes.add(num * num * num);
		}
		return cubes;
	}
}

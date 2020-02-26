package com.lab10;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ModifiedLibrary {
	private List<Long> numbers = Arrays.asList(12L, 34L, 56L, 21L, 78L, 92L, 43L);

	
	public List<Long> findAndCompute(Predicate<Long> predicate, Function<Long, Long> func) {
		return numbers
				.stream()
				.filter(predicate)
				.map(func)
				.collect(Collectors.toList());
	}
	
	
	public List<Long> find(Predicate<Long> predicate) {
		return numbers
				.stream()
				.filter(predicate)
				.collect(Collectors.toList());
	}

	public List<Long> compute(Function<Long, Long> func) {
		return numbers
				.stream()
				.map(func)
				.collect(Collectors.toList());
	}

}

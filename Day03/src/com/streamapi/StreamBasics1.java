package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamBasics1 {

	public static void main(String[] args) {
		//Stream is an abstraction of a collection
		//Stream is created on a collection
		//It's used for sequential reading of data in a collection
		//Cannot modify the underlying collection
		//CANNOT be REUSED
		
		List<String> languages = Arrays.asList("Java", "Ruby", "Groovy", "JavaScript");
		Stream<String> stream = languages.stream();
		stream.forEach(System.out::println);
		
		stream = languages.stream();
		stream.forEach(System.out::println);
		
		IntStream intStream = IntStream.range(1, 100);
		DoubleStream doubleStream = DoubleStream.of(1.23, 3.45, 6.54, 7.8);
	}

}

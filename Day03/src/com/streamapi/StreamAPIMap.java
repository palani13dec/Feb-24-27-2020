package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIMap {

	public static void main(String[] args) {
		List<String> languages = Arrays.asList("Java", "Ruby", "Groovy", "JavaScript", "Scala", "Clojure", "Haskell");
		
		//map() is used for transformation
		//It takes every item and converts it to another item of some other type
		//result of a map() is a new collection

		
		languages
			.stream()
			.map(it -> { 
				System.out.println("***In map " + it);
				return it.length();
			})
			//.peek(it -> System.out.println(it))
			.collect(Collectors.toList());
		
		System.out.println();
		
		languages
				.stream()
				.map(it -> { 
					System.out.println("***In map " + it);
					return it.length();
				})
				.forEach(System.out::println);

		
		
		
		List<Integer> lst = languages
			.stream()
			.map(it -> it.length())
			.collect(Collectors.toList());
		
		
		languages
			.stream()
			.map(it -> it.toUpperCase())
			.forEach(System.out::println);
		
		languages
			.stream()
			.filter(it -> it.length() > 4)
			.map(it -> it.charAt(0))
			.forEach(System.out::println);
	}

}

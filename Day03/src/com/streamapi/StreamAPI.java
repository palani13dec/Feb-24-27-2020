package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {
		List<String> languages = Arrays.asList("Java", "Ruby", "Groovy", "JavaScript", "Scala", "Clojure", "Haskell");

		//filter, map, forEach, collect, reduce


		//Print all the languages starting with J and length > 5

		//		languages
		//			.stream()
		//			.filter(it -> it.startsWith("J"))
		//			.filter(it -> it.length() > 5)
		//			.forEach(System.out::println);

		//Streams are lazily evaluated
		//They are evaluated only when the Terminal or Final condition is met
		Stream<String> filteredStream = languages
			.stream()
			.filter(it -> {
				System.out.println("***Filter 1 " + it);
				return it.startsWith("J");
			})
			.filter(it -> {
				System.out.println("***Filter 2 " + it);
				return it.length() > 5;
			});
			//.forEach(System.out::println);

		//filteredStream.forEach(System.out::println);
		String item = filteredStream.findFirst().get();
		System.out.println(item);
	}

}






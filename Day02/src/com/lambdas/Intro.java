package com.lambdas;

import java.util.Arrays;
import java.util.List;

public class Intro {

	public static void main(String[] args) {
		List<String> languages = Arrays.asList("Java", "Python", "Ruby", "JavaScript", "Scala");

		//DECLARATIVE STYLE
		//YOU ONLY SPECIFY WHAT TO DO
		//No variables scattered around
		//Compose functions
		//readable
		//Elegant
		String item = languages
			.parallelStream()
			.filter(lang -> "Groovy".equals(lang))
			.findAny()
			.orElse("Groovy not found");
		
		System.out.println(item);
		
		
		//Verbose
		//Explicitly iterate your collections
		//Poor readability
		//Lot of variables scattered around
		//IMPERATIVE STYLE OF PROGRAMMING
		//YOU specify WHAT to do and also HOW to do
		boolean found = false;
		for (int i = 0; i < languages.size(); i++) {
			String language = languages.get(i);
			if("JavaScript".equals(language)) {
				found = true;
				break;
			}
		}
		if(found) {
			System.out.println("JavaScript is present in the collection");
		}
		else {
			System.out.println("JavaScript is not present in the collection");
		}
		
	}

}

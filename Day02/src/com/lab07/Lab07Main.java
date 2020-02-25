package com.lab07;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class Lab07Main {

	public static void main(String[] args) {
		Map<Integer, String> romans = new HashMap<Integer, String>();
		romans.put(1, "I");
		romans.put(2, "II");
		romans.put(3, "III");
		
		BiConsumer<Integer, String> bic = (k, v) -> System.out.println(k + " -> " + v);
		romans.forEach(bic);
		
		romans.forEach((k, v) -> System.out.println(k + " -> " + v));
		
		//Imperative Style
		Set<Integer> keys = romans.keySet();
		for (int key : keys) {
			System.out.println(key + " -> " + romans.get(key));
		}
		
		List<String> cities = Arrays.asList("Chennai", "Mumbai", "Bengaluru", "Boston");

		//Declarative style
		cities.forEach(city -> System.out.println(city));
		
		cities.forEach(System.out::println);
		
		
		
		//Imperative style
		for (String city : cities) {
			System.out.println(city);
		}
	}

}

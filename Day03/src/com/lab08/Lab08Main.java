package com.lab08;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lab08Main {

	private static List<Item> items = Arrays.asList(
			new Item("Nike", 20.45), 
			new Item("Adidas", 31.45), 
			new Item("Reebok", 29.25), 
			new Item("Puma", 25.15), 
			new Item("Fila", 15.15));

	public static void main(String[] args) {
		//Print the names of all the items
		items
			.stream()
			.map(it -> it.getName())
			.forEach(System.out::println);
		
		//Print the list of all items that cost more than 20
		final List<String> lst = items
			.stream()
			.filter(it -> it.getPrice() > 20)
			.map(it -> it.getName())
			.collect(Collectors.toList());
		System.out.println(lst);
		
		//Add a discount of 10% to all the items and print the total price
		final double totalPrice = items
			.stream()
			.map(it -> it.getPrice() - (it.getPrice() * 0.1))
			.reduce((first, next) -> {
				System.out.println("First: " + first + ", Next: " + next);
				return first + next;
			})
			.get();
		System.out.println(totalPrice);
			
		
		
		
		
	}

}






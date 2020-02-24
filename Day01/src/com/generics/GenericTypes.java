package com.generics;

public class GenericTypes {

	public static void main(String[] args) {
		MyCollection<String> letters = new MyCollection<>();
		letters.add("A");
		letters.add("B");
		//letters.add(12);
		
		MyCollection<Integer> numbers = new MyCollection<>();
		numbers.add(1);
		numbers.add(2);
		//numbers.add("C");
	}

}

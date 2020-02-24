package com.generics;

public class VarianceUser {

	public static void main(String[] args) {
		MyEntertainmentCollection<CD> cds = new MyEntertainmentCollection<>();
		MyEntertainmentCollection<DVD> dvds = new MyEntertainmentCollection<>();
		MyEntertainmentCollection<Book> books = new MyEntertainmentCollection<>();
		
		
		//MyEntertainmentCollection<Integer> numbers = new MyEntertainmentCollection<>();
		//MyEntertainmentCollection<Boolean> booleans = new MyEntertainmentCollection<>();
	}

}

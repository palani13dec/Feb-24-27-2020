package com.lambdas;

import java.time.LocalDate;

@FunctionalInterface
interface Greet {
	void hi(String name);
//	void bye(String name);
}

interface Echo {
	void speakOut(String name, String message);
}

interface Incrementer {
	int increment(int num);
}

interface CurrentTime {
	String now();
}

public class LambdasSyntax {

	public static void main(String[] args) {
		//CODE SYNTHESIS or CODE GENERATION
		CurrentTime ct = () -> LocalDate.now().toString();
		
		Incrementer inc = num -> num + 1;
		System.out.println(inc.getClass().getName());
		int result = inc.increment(12);
		
		Incrementer inc2 = num -> {
			System.out.println("Incrementing " + num);
			return num + 1;
		};
		System.out.println(inc2.getClass().getName());
		
		
		Echo echo1 = (name, message) -> System.out.println(message + " " + name);
		echo1.speakOut("Ram", "Hey");
		
		Greet greet1 = (String name) -> System.out.println("Hi " + name);
		Greet greet2 = name -> System.out.println("Hi " + name);
		Greet greet3 = name -> {
			System.out.println("Hi " + name);	
			System.out.println("Hello " + name);
		};
	}

}

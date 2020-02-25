package com.lambdas;


interface Greeting {
	void hello(String name);
}

class GreetingImpl implements Greeting {
	public void hello(String name) {
		System.out.println("Hello " + name);
	}
}

public class Lambdas1 {

	public static void main(String[] args) {
		Greeting greetingOld = new GreetingImpl();
		greetingOld.hello("Sam");
		
		Greeting greetingLatest = new Greeting() {
			public void hello(String name) {
				System.out.println("Hi " + name);
			}
		};
		greetingLatest.hello("Sam");
		
		
		Greeting greetingModern = name -> System.out.println("Wassup " + name);
		greetingModern.hello("Sam");
		
		
		
		
		
		
	}

}

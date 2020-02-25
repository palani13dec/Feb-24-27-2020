package com.lambdas;

interface Worker {
	void doSomething(String message);
}

public class LambdaAsArguments {

	public static void main(String[] args) {
		Worker coder = (message) -> System.out.println("Writing code " + message);
		Worker runner = (message) -> System.out.println("Running marathons " + message);
		
		int i = 10;
		preLunchTrauma(coder);
		preLunchTrauma(runner);
		preLunchTrauma((message) -> System.out.println("Scratching my head " + message));
	}
	
	static void preLunchTrauma(Worker worker) {
		String message = "!!! I am damn hungry!!!!";
		worker.doSomething(message);
	}

}

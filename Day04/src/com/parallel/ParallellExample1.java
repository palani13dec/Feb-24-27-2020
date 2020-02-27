package com.parallel;

import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

public class ParallellExample1 {

	public static void main(String[] args) {
		int cores = Runtime.getRuntime().availableProcessors();
		//System.out.println(cores);
		//computeEvenGreaterThan50();
		
		//Blocking Factor = 0 to 1
		//CPU intensive tasks Blocking factor will be closer to 0
		//IO intensive tasks Blocking factor will be closer to 1
		
		//number of threads = number of cores / (1 - blocking factor)
		//Blocking factor can be 0.9
		//number of threads = 4/ (1 -0.9) = 4/0.1 = 40
		
		ForkJoinPool fjp = new ForkJoinPool(40);
		fjp.execute(() -> {
			computeEven();
		});
		sleep(120);
		
	}
	
	static void computeEvenGreaterThan50() {
		IntStream intStream = IntStream.range(1, 10001);
		int result = intStream
			.parallel()
			.filter(num -> {
				System.out.println(Thread.currentThread() + " filter(1) " + num);
				sleep(1);
				return num > 50;
			})
			.filter(num -> {
				System.out.println(Thread.currentThread() + " filter(2) " + num);
				sleep(1);
				return num % 2 == 0;
			})
			.findAny().getAsInt();
		System.out.println("*************RESULT : " + result);

	}
	
	
	static void computeEven() {
		IntStream intStream = IntStream.range(1, 101);
		intStream
			.parallel()
			.filter(num -> {
				System.out.println(Thread.currentThread() + " filtering " + num);
				sleep(1);
				return num % 2 == 0;
			})
			.forEach(num -> {
				System.out.println("***For each " + num);
			});
	}

	static void sleep(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

package com.parallel;

import java.time.LocalTime;

public class ThreadingExample {

	public static void main(String[] args) {
/*
		Thread timerThread = new Thread(new Runnable() {
			public void run() {
				while(true) {
					System.out.println("It's " + LocalTime.now());
					sleep(1);
				}
			}
		});
*/
		Thread timerThread = new Thread(() -> {
			while(true) {
				System.out.println("It's " + LocalTime.now());
				sleep(1);
			}
		});
		timerThread.start();
	}
	
	static void sleep(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

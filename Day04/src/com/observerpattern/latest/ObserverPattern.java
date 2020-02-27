package com.observerpattern.latest;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;



class CricketPortal {
	private List<Consumer<Integer>> subscribers = new ArrayList<>();
	
	public void addSubscriber(Consumer<Integer> sub) {
		subscribers.add(sub);
	}
	public void getLatestScore() {
		int score = (int)(Math.random() * 8);
		subscribers.forEach(it -> it.accept(score));
	}
}


public class ObserverPattern {

	public static void main(String[] args) {

		CricketPortal espn = new CricketPortal();

		espn.addSubscriber(score -> System.out.println("***BREAKING NEWS " + score));
		espn.addSubscriber(score -> System.out.println("--KILL TIME " + score));
		espn.addSubscriber(score -> System.out.println("Latest score " + score));
		
		Thread match = new Thread(() -> {
			while(true) {
				espn.getLatestScore();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		match.start();
		
		
		
	}

}






package com.patterns;

import java.util.ArrayList;
import java.util.List;

//List of observers observing a data or something
//When the data changes the observers are notified

interface Subscriber {
	public void notify(int score);
}

class Website implements Subscriber {
	public void notify(int score) {
		System.out.println("---Latest Score " + score);
	}
}

class SoftwareEngineer implements Subscriber {
	public void notify(int score) {
		System.out.println(">>>KILL TIME " + score);
	}
}

class NewsChannel implements Subscriber {
	public void notify(int score) {
		System.out.println("***BREAKING NEWS " + score);
	}
}


class CricketPortal {
	private List<Subscriber> subscribers = new ArrayList<>();
	public void addSubscriber(Subscriber sub) {
		subscribers.add(sub);
	}
	public void getLatestScore() {
		int score = (int)(Math.random() * 8);
		subscribers.forEach(it -> it.notify(score));
	}
}


public class ObserverPattern {

	public static void main(String[] args) {

		CricketPortal espn = new CricketPortal();
		SoftwareEngineer sam = new SoftwareEngineer();
		NewsChannel cnn = new NewsChannel();
		Website toi = new Website();
		espn.addSubscriber(toi);
		espn.addSubscriber(sam);
		espn.addSubscriber(cnn);
		
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






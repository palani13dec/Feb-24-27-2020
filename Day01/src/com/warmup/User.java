package com.warmup;

import java.util.List;

public class User {

	public static void main(String[] args) {
		System.out.println("Are you all feeling good on Monday morning?");
		
		Training intermediateJava = new Training("Intermediate Java", "Prabhu", 4);
		intermediateJava.setComments("Sucks");
		intermediateJava.register("Sam");
		intermediateJava.register("Ram");
		intermediateJava.register("Mary");
		
		List<String> participants = intermediateJava.getParticipants();
		for (String participant : participants) {
			System.out.println(participant);
		}
		
		for (int i = 0; i < participants.size(); i++) {
			System.out.println(participants.get(i));
		}
		
	}

}

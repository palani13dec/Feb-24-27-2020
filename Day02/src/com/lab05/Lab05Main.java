package com.lab05;

import static com.lab05.ValidationConstants.*;

public class Lab05Main {

	public static void main(String[] args) {
		String userName = "sdlkfjad";
		boolean valid = isNotNull
						.and(isNotEmpty)
						.and(isNotBlank)
						.and(isNotLesserThan6)
						.test(userName);
		System.out.println(valid);
		
		String name = "a";
		
		boolean nameValid = isNotNull
				.and(isNotEmpty)
				.and(isNotBlank)
				.test(name); 
		System.out.println(nameValid);
				
	}

}

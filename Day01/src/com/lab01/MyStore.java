package com.lab01;

import java.util.HashMap;
import java.util.Map;

public class MyStore {
	private Map<Integer, String> romanNumerals;
	
	public MyStore() {
		romanNumerals = new HashMap<>(); 
	}
	
	public void add(int number, String value) {
		romanNumerals.put(number, value);
	}
	
	public String get(int number) {
		if(romanNumerals.containsKey(number)) {
			return romanNumerals.get(number);	
		}
		return "Not Found";
	}
	
	public int getSize() {
		return romanNumerals.size();
	}
	
	
}

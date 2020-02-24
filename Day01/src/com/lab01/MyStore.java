package com.lab01;

import java.util.HashMap;
import java.util.Map;

public class MyStore<K, V> {
	private Map<K, V> romanNumerals;
	
	public MyStore() {
		romanNumerals = new HashMap<>(); 
	}
	
	public void add(K number, V value) {
		romanNumerals.put(number, value);
	}
	
	public Object get(K number) {
		if(romanNumerals.containsKey(number)) {
			return romanNumerals.get(number);	
		}
		return "Not Found";
	}
	
	public int getSize() {
		return romanNumerals.size();
	}
	
	
}

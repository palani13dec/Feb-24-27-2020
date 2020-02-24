package com.generics;

import java.util.ArrayList;

public class GenericsBasics {

	public static void main(String[] args) {
		
		
		
		//NOT RECOMMENDED
		ArrayList<Object> objects =  new ArrayList<Object>();
		objects.add(true);
		objects.add(12);
		objects.add("Hello");
		
		for (int i = 0; i < objects.size(); i++) {
			if(objects.get(i) instanceof Boolean) {
				Boolean b = (Boolean)objects.get(i);
			}
			else if(objects.get(i) instanceof Integer) {
				int b = (int)objects.get(i);
			}
			else if(objects.get(i) instanceof String) {
				String str = (String)objects.get(i);
			}
			
		}
		
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		
		ArrayList<Boolean> booleans = new ArrayList<Boolean>();
		booleans.add(true);
		//booleans.add(1);
		
		ArrayList<String> items = new ArrayList<String>();
		items.add("Book1");
		//items.add(12);
		//items.add(true);
		
		for (int i = 0; i < items.size(); i++) {
			String item = items.get(i);
		}
	}

}

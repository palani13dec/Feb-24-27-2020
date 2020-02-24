package com.generics;

import java.util.ArrayList;

public class NeedForGenerics {

	public static void main(String[] args) {
		ArrayList items = new ArrayList();
		items.add("Book1");
		items.add(12);
		items.add(true);
		
		String item1 = (String)items.get(0);
		int item2 = (int)items.get(1);
		boolean item3 = (boolean)items.get(2);

		//ClassCastException
		for (int i = 0; i < items.size(); i++) {
			String item = (String)items.get(i);
			System.out.println(item);
		}
		
		
	}

}

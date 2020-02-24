package com.generics;

import java.util.ArrayList;
import java.util.List;

public class MyCollection<T> {
	private List<T> items;
	
	public MyCollection() {
		items = new ArrayList<>();
	}
	
	public void add(T item) {
		items.add(item);
	}
	
	
}

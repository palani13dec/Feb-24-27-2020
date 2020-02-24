package com.lab02;

import java.util.ArrayList;
import java.util.List;

public class MyStack<T extends StackItem> {

	private T stackItemType;
	private List<Integer> numbers = new ArrayList<>();
	
	public MyStack(T stackItemType) {
		this.stackItemType = stackItemType;
	}
	
	public void push(int number) {
		if(stackItemType.canBeAdded(number)) {
			numbers.add(number);	
		}
		else {
			System.out.println(number + " cannot be added");
		}
	}
	
	public int pop() {
		return -1;
	}

	public void print() {
		for (int item : numbers) {
			System.out.println(item);
		}
	}
	
	
	
	
}

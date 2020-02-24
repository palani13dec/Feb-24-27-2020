package com.lab02;

public class OddStackItem implements StackItem {
	
	public boolean canBeAdded(int number) {
		return number % 2 != 0;
	}
	
}

package com.lab02;

public class StackUser {
	public static void main(String[] args) {
		MyStack<EvenStackItem> evenStack = new MyStack<>(new EvenStackItem());
		evenStack.push(1);
		evenStack.push(2);
		evenStack.push(3);
		evenStack.push(4);
		evenStack.print();
		
		System.out.println();
		
		MyStack<OddStackItem> oddStack = new MyStack<>(new OddStackItem());
		oddStack.push(1);
		oddStack.push(2);
		oddStack.push(3);
		oddStack.push(4);
		oddStack.print();
	}
}

package com.lab01;

public class MyStoreUser {

	public static void main(String[] args) {
		MyStore myStore = new MyStore();
		myStore.add(1, "I");
		myStore.add(2, "II");
		myStore.add(3, "III");
		System.out.println("Size: " + myStore.getSize());
		System.out.println("1 -> " + myStore.get(1));
		System.out.println("2 -> " + myStore.get(2));
		System.out.println("10 -> " + myStore.get(10));
	}

}

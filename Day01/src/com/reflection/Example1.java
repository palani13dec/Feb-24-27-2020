package com.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Example1 {

	public static void main(String[] args) throws Exception {
		//class = bytecodes + metadata
		//metadata is information about that class
		//loading this metadata is known as reflection
		
		Class cls = Class.forName("com.reflection.Book");
		System.out.println(cls.getName());
		System.out.println(cls.getSuperclass().getName());
		System.out.println(cls.isInterface());
		for (Method method : cls.getMethods()) {
			System.out.println(method.getName());
		}
		for(Field field: cls.getDeclaredFields()) {
			System.out.println(field.getName());
		}
		Book book = (Book)cls.getDeclaredConstructor().newInstance();
		
	}

}

class Book {
	public Book() {
		System.out.println("***BOOK CREATED");
	}
	private String title;
	public void read() {
		System.out.println("***READING");
	}
}

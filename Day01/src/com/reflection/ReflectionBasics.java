package com.reflection;

public class ReflectionBasics {

	public static void main(String[] args) throws Exception {
//		Person person = new Person();
//		person.eat();
		
		//Loading the metadata of Person class
		Class cls = Class.forName("com.reflection.Person");
		System.out.println(cls.getName());
		Object person = cls.getDeclaredConstructor().newInstance();
		cls.getMethod("eat").invoke(person);
		
		
		
	}

}

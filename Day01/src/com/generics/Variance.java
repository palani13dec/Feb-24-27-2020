package com.generics;

import java.util.ArrayList;
import java.util.List;

public class Variance {

	public static void main(String[] args) {
		Animal animal = new Cat();

		//List<Animal> animals = new ArrayList<Cat>();
		
		//Co-variance
		List<? extends Animal> cats = new ArrayList<Cat>();
		List<? extends Animal> dogs = new ArrayList<Dog>();
		
		//Cat cat = new Animal();
		
		//Contra-variance
		List<? super Cat> myAnimals = new ArrayList<Animal>();
		//myAnimals.add(new Dog());
		
		
		//List<? super Cat> myDogs = new ArrayList<Dog>();
		
		//List<? extends Animal> donkeys = new ArrayList<Donkey>();
		
		
		
//		List<Cat> cats = new ArrayList<>();
//		List<Animal> animals = cats;
		
	}

}

class Animal {}
class Cat extends Animal {}
class Dog extends Animal {}
class Donkey {}








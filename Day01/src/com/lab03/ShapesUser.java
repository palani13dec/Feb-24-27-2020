package com.lab03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShapesUser {

	public static void main(String[] args) throws Exception {
		List<String> lines = readShapesFromFile("./shapes.txt");
		ShapesPopulator shapesPopulator = new ShapesPopulator();
		shapesPopulator.populateShapes(lines);
		for (Shape shape : shapesPopulator.getShapes()) {
			System.out.println("Area -> " + shape.area());
		}
	}

	
	private static List<String> readShapesFromFile(String fileName) throws FileNotFoundException {
		List<String> lines = new ArrayList<>();
		Scanner scanner = new Scanner(new File(fileName));
		while(scanner.hasNext()) {
			lines.add(scanner.nextLine());
		}
		scanner.close();
		return lines;
	}
}

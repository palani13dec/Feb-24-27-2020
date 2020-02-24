package com.lab03;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ShapesPopulator {

	private List<Shape> shapes;
	
	public ShapesPopulator() {
		shapes = new ArrayList<>();
	}
	
	public void populateShapes(List<String> lines) throws Exception {
		String basePackage = "com.lab03.";
		for (String line : lines) {
			String[] values = line.split(",");
			String className = values[0].substring(0, 1).toUpperCase() + "" + values[0].substring(1, values[0].length());
			className = basePackage + className;
			Class shapeCls =  Class.forName(className);
			Shape shape = (Shape)shapeCls.getDeclaredConstructor().newInstance();
			if(values.length == 2) {
				shape.initializeAttributes(Double.parseDouble(values[1].trim()));	
			}
			else if(values.length == 3) {
				shape.initializeAttributes(Double.parseDouble(values[1].trim()), Double.parseDouble(values[2].trim()));
			}
			
			shapes.add(shape);
			
		}
	}
	public List<Shape> getShapes() {
		return shapes;
	}
	
	
}

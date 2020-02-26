package com.lab11;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Lab11Main {

	private static List<String> lines;
	
	public static void main(String[] args) throws Exception {
		
		lines = Files.readAllLines(Paths.get("./places.txt"));
		
		extract("./cities.txt", line -> line.split(",")[0].trim());
		extract("./states.txt", line -> line.split(",")[1].trim());
		
		printCountOfAllCitiesGroupedByState();
		generateJsonFile();
	}
	
	static String constructJson(String line) {
		String[] items = line.split(",");
		StringBuilder json = new StringBuilder("");
		json.append("{");
		json.append("\"city\": ");
		json.append("\"");
		json.append(items[0].trim());
		json.append("\"");
		json.append(", ");
		json.append("\"state\": ");
		json.append("\"");
		json.append(items[1].trim());
		json.append("\"");
		json.append(", ");
		json.append("\"geonameid\": ");
		json.append(items[2].trim());
		json.append(" }");
		return json.toString();
	}
	
	static void generateJsonFile() throws Exception {
		String json = lines
				.stream()
				.skip(1)
				.map(Lab11Main::constructJson)
				.distinct()
				.collect(Collectors.joining(",\n", "[", "]"));
		Files.write(Paths.get("places.json"), json.getBytes());		
		
	}
	
	static void printCountOfAllCitiesGroupedByState() {
		
		Map<String, Long> groupedItems = lines
				.stream()
				.skip(1)
				.collect(Collectors.groupingBy(line -> line.split(",")[1].trim(), Collectors.counting()));
		
		groupedItems.forEach((state, citiesCount) -> System.out.println(state + "-> " + citiesCount));
		
		
		
//		Map<String, List<String>> groupedItems = lines
//			.stream()
//			.skip(1)
//			.collect(Collectors.groupingBy(line -> line.split(",")[1].trim()));
//		
//		groupedItems.forEach((state, cities) -> {
//			System.out.println(state + " -> " + cities.size());
//		});
	}


	
	static void extract(String fileName, Function<String, String> func) throws Exception {
		List<String> items = lines
				.stream()
				.skip(1)
				.map(func)
				.distinct()
				.collect(Collectors.toList());
		Files.write(Paths.get(fileName), items);
	}
	

}





* Use Reflection
* Create a file __shapes.txt__ that contains the following lines

```
rectangle,12,34
circle,13.4
square,13.4
rectangle,12.3,3.4
rectangle,1.32,134
circle,33.4
square,33.4
rectangle,12.5,89
rectangle,1.22,9.08
circle,37.44
square,137.44
rectangle,5.12,12.3
square,37.44
circle,443.46
circle,123.094
square,37.44
circle,13.64
rectangle,90.12,89.23
circle,64.4
square,90.44
circle,72.87
square,43.404
square,37.144
square,27.44
rectangle,90.12,89.223
```

* Create class hierarchy of shapes
* Load the file and create instances of each shape dynamically __without using if-else__
* Print the area of all the shapes

* You can use this method to load the __shapes.txt__file

``` java
	
	private List<String> readShapesFromFile(String fileName) throws FileNotFoundException {
		List<String> lines = new ArrayList<>();
		Scanner scanner = new Scanner(new File(fileName));
		while(scanner.hasNext()) {
			lines.add(scanner.nextLine());
		}
		scanner.close();
		return lines;
	}
	
```




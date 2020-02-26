* Start with the following classes **Library** and **Lab10Main**

```java
public class Library {
	private List<Long> numbers = Arrays.asList(12, 34, 56, 21, 78, 92, 43);
	
	//TOO MUCH DUPLICATION
	
	public List<Long> findEvenNumbers() {
		List<Long> even = new ArrayList<>();
		for (long num : numbers) {
			if(num % 2 == 0) {
				even.add(num);
			}
		}
		return even;
	}
	
	public List<Long> findOddNumbers() {
		List<Long> odd = new ArrayList<>();
		for (long num : numbers) {
			if(num % 2 != 0) {
				odd.add(num);
			}
		}
		return odd;
	}
	
	public List<Long> findSquares() {
		List<Long> square = new ArrayList<>();
		for (long num : numbers) {
			square.add(num * num);
		}
		return square;
	}
	
	public List<Long> findCubes() {
		List<Long> cubes = new ArrayList<>();
		for (long num : numbers) {
			cubes.add(num * num * num);
		}
		return cubes;
	}
}
```

```java
public class Lab10Main {

	public static void main(String[] args) {
		Library library = new Library();
		
		List<Long> evenNumbers = library.findEvenNumbers();
		List<Long> oddNumbers = library.findOddNumbers();
		
		List<Long> squares = library.findSquares();
		List<Long> cubes = library.findCubes();
		
		System.out.prlongln(evenNumbers);
		System.out.prlongln(oddNumbers);
		System.out.prlongln(squares);
		System.out.prlongln(cubes);
	}

}
```


* Remove duplication and use streams.
* Rewrite library and Lab10Main classes

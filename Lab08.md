* You have a collection of items with their names and prices

```java


public class Item {
	private String name;
	private double price;
	
	public Item(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	public double getPrice() {
		return this.price;
	}
}
```

```java
	private List<Item> items = Arrays.asList(new Item("Nike", 20.45), new Item("Adidas", 31.45), new Item("Reebok", 29.25), new Item("Puma", 25.15), new Item("Fila", 15.15))
```


## To Do - Declarative Style

* Print the names of all the items
* Print the list of all items that cost more than __20__ 
* Add a __discount of 10%__ to all the items and print the __total__ price


```
* Use Method Reference wherever possible, if lambdas grow in size
* Use __map()__, __filter()__, __reduce()__ methods in Stream API. 

```




* Define a class __MyStack__ with the following methods
* __push()__ that pushes an item
* __pop()__ that removes an item
* __size()__ that prints the size
* __print()__ that prints all the items

* MyStack should be a generic type. You can only add Items that implement the following interface

``` java
public interface StackNumberItem {
	boolean canBeAdded(int number);
}
```

* Define two types of stack __Even number__ stack and __Odd number__ stack
* Even number stack will allow only even numbers to be added and odd number stack is used for adding odd numbers only

* Create two instances of MyStack one for Even and another for Odd
* Use push, pop, print, size methods on these instances


* __Note:__ This is a design exercise
 
package hg222ii_assign1.intCollection;

import java.util.Iterator;

public class CollectionMain  {
	public static void main(String[] args) {

		/* How the ArrayIntList class can be used */
		System.out.println("ArrayIntList class:");
		ArrayIntList intList = new ArrayIntList();
		intList.add(1);
		intList.add(4);
		intList.add(6);
		System.out.println("The size: " + intList.size());
		System.out.println("Elements in array: " + intList.toString());
		System.out.println("Is it empty?: " + intList.isEmpty());
		System.out.println("Get method: " + intList.get(1));
		System.out.println("IndexOf method: " + intList.indexOf(6));
		intList.addAt(7, 3);
		System.out.println("Elements in array after addAt: " + intList);

		intList.remove(2);
		System.out.print("After removing: ");
		Iterator<?> it = intList.iterator(); //The showcase of the iterator method
		while (it.hasNext()) {
			System.out.print(it.next()+" ");
		}

		/* How the ArrayIntStack class can be used */
		System.out.println("\n\nArrayIntStack class:");
		ArrayIntStack intStack = new ArrayIntStack();
		intStack.push(6);
		intStack.push(4);
		intStack.push(5);
		intStack.push(5);
		intStack.push(5);
		intStack.push(5);
		intStack.push(5);
		intStack.push(5);
		intStack.push(5);
		intStack.push(5);
		intStack.push(5);
		intStack.push(5);
		intStack.push(5);
		intStack.push(5);
		intStack.push(5);
		intStack.push(5);
		intStack.push(5);
		intStack.push(5);
		intStack.push(5);
		intStack.push(5);
		intStack.push(7);
		intStack.push(9);

		
		System.out.println("Elements in stack: "+intStack.toString());

		System.out.println("Size of stack: "+intStack.size());
		System.out.println("Peeks at the element top of the stack: "+intStack.peek());
		System.out.println("Pops and returns the new element on top: "+intStack.pop());

		System.out.print("Prints out the stack using the iterator: ");
		Iterator<?> to = intStack.iterator();
		while (to.hasNext()) {
			System.out.print(to.next()+" ");
		}
	}
}
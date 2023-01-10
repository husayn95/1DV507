package queue;

import java.util.Iterator;

/**
 * Class showing the capabilities of the class LinkedQueue
 * @author Husayn
 */
public class QueueMain {

	public static void main(String[] args) {

		LinkedQueue queue = new LinkedQueue();

		for (int i = 1; i <= 10; i++) { //starting with size 10
			queue.enqueue(i);
		}

		System.out.println("Size: " + queue.size());
		System.out.println("ToString method: " + queue.toString());
		System.out.println("Last object: " + queue.last());
		System.out.println("Remove and Return first object: " + queue.dequeue());
		System.out.println("Size: " + queue.size());
		System.out.println("First object: " + queue.first());
		System.out.println("Last object: " + queue.last());
		System.out.println("Remove and Return first object: " + queue.dequeue());
		System.out.println("ToString method: " + queue.toString());
		System.out.print("Iterator method: ");
		Iterator<Object> i = queue.iterator();
		while (i.hasNext()) {
			System.out.print(i.next() + " ");
		}

	}
}
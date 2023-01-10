package queue;

import java.util.Iterator; 

import java.util.NoSuchElementException;


public class LinkedQueue implements Queue {
	private int size = 0;
	private Node head = null;
	private Node tail = null;

	
	/**
	 * This is a inner Node class which helps to reference the element in the queue
	 */
	private class Node {
		private Object data;
		private Node next;
	}	
	
	
	
	/**
	 * An empty LinkedQueue constructor .
	 */
	public LinkedQueue() {

	}

	
	
	/**
	 * Returns the size of the queue
	 */
	@Override
	public int size() {
		return size;
	}

	
	
	/**
	 * Returns true if the queue is empty, false otherwise.
	 */
	@Override
	public boolean isEmpty() {
		return head == null;
	}

	
	
	/**
	 * Insert Object at the last position of the queue.
	 * @param element Object to be added          
	 */
	@Override
	public void enqueue(Object element) {
		if (isEmpty() == true) {
			Node node = new Node(); //new node
			node.data = element;   //adds new element
			head = node;          //sets the element to first
			tail = head;         //the element is also the last one in the queue
			}

		 else {
			Node node2 = new Node();
			node2.data = element; 
			tail.next = node2; //if the above is statement isn't true then put the element
			tail = tail.next; //to the next tail node and change the position of the tail node
		}
		   size++;          //increase the size in either of the cases
	}

	
	
	/**
	 * This method returns and removes the Object at the first position in the queue
	 * Throws NoSuchElementException if the queue is empty
	 */
	@Override
	public Object dequeue() {
		if (isEmpty() == true) {
			throw new NoSuchElementException();
		}

		Object element = head.data; //return and remove the first element in the queue
		head = head.next;          //change the head node next to element
		size--;                   //decrease the size
		return element;
	}

	
	
	/**
	 * This method returns the Object at the first position in the queue
	 * Throws NoSuchElementException if the queue is empty
	 */
	@Override
	public Object first() {
		if (head == null) {
			throw new NoSuchElementException();
		} else
			return head.data;  //return the first element if the head node is not empty
	}

	
	
	/**
	 * This method returns the Object at the last position in the queue
	 * Throws NoSuchElementException if the queue is empty
	 */
	@Override
	public Object last() {
		if (tail == null) {
			throw new NoSuchElementException();
		} else
			return tail.data;  //return the last element
	}

	
	
	/**
	 * Method to convert all the elements in the queue to string
	 * @return String 
	 */
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		Node newNode = new Node();
		newNode = head;
		str.append("[");  //add [ to the start of string
		while (newNode != null) {            // while head node is not null, add space " "
			str.append(" " + newNode.data); //in between the elements
			newNode = newNode.next;
		}
		str.append(" ]");  //add ] to the end of the string
		return str.toString();
	}

	
	
	/**
	 * Runs through all the elements present in the queue.
	 * @return Iterator
	 */
	@Override
	public Iterator<Object> iterator() {
		return new LinkedQueueIterator();
	}
	
	
	
	//inner iterator class
	private class LinkedQueueIterator implements Iterator<Object> {
		private Node elementPosition;
		
		//constructor
		public LinkedQueueIterator() {
			elementPosition = null;
		}

		
		
		/**
		 * This method returns true until the iterator reaches up to the last Object of the queue
		 * @return boolean
		 */
		@Override
		public boolean hasNext() {
			if (elementPosition == null) {
				return head != null; //returns true only if the queue is not empty
			} else
				return elementPosition.next != null; //returns true until position reaches to tail/end

		}

		
		
		/**
		 * This method returns Object until the !hasnNext() case gets true
		 * @return Object
		 */
		@Override
		public Object next() {
			if (!hasNext()) {
				throw new NoSuchElementException(); //throw if the iterator is already running
			}
			if (elementPosition == null) { //this will only run if the above case is true
				elementPosition = head;
			} else {
				elementPosition = elementPosition.next; //in this case it will return elements until it reaches the tail
			}
			return elementPosition.data;
		}
	}
}
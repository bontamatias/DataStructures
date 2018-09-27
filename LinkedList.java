//manually writing out a linked list

import java.util.NoSuchElementException;

public class LinkedList {
	
	class Node { //node supports any object, therefore overall list supports any object
		public Object data;
		public Node next;
	}

	class LinkedListIterator implements ListIterator {
		private Node current;
		private Node previous;
		private boolean isAfterNext;

		public LinkedListIterator () {
			current = null;
			previous = null;
			isAfterNext = false;
		}

		public boolean hasNext () {
			if (current == null) return first != null;
			else return current.next != null;
		}

		public Object next () {
			if (!hasNext()) throw new NoSuchElementException();
			previous = current;
			isAfterNext = true;

			if (current == null) {
				current = first;
			}
			else {
				current = current.next;
			}
			return current.data;
		}
	}

	private Node first;

	public LinkedList () {
		first = null;
	}

	/** adds an element to the beginning of the list
	 * @param data the element to add
	 */
	public void addFirst (Object data) {
		Node newNode = new Node ();
		newNode.data = data;
		newNode.next = first;
		first = newNode;
	}
	
	/** returns the first element in the list
	 * @return the first element in the list
	 */
	public Object getFirst () {
		if (first == null) throw new NoSuchElementException();
		return first.data;
	}

	/** removes the element at the beginning of the list
	 * @return the element removed
	 */
	public Object removeFirst () {
		if (first == null) throw new NoSuchElementException();
		Object hold = first.data;
		first = first.next;
		return hold;
	}

	/** adds an element to the end of the list
	 * @param data the element to add
	 */
	public void addLast (Object data) {
		Node newNode = new Node();
		newNode.data = data;
		if (first == null) {
			first = newNode;
		}
		else {
			Node current = first;
			while (current.next != null) current = current.next;
			current.next = newNode;
		}
	}

	public String toString () {
		String temp = "";
		Node current = first;
		while (current != null) {
			temp += (String) current.data + " ";
			current = current.next;
		}

		return temp;
	}
}

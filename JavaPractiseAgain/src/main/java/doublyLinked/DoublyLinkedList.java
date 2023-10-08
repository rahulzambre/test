package doublyLinked;

public class DoublyLinkedList {

	private DoublyLinkedNode head;
	private DoublyLinkedNode tail;
	private int length;

	// create an empty list
	public DoublyLinkedList() {
		head = null;
		tail = null;
		length = 0;
	}

	public DoublyLinkedNode getHead() {
		return head;
	}

	public void setHead(DoublyLinkedNode head) {
		this.head = head;
	}

	public DoublyLinkedNode getTail() {
		return tail;
	}

	public void setTail(DoublyLinkedNode tail) {
		this.tail = tail;
	}

	public void setLength(int length) {
		this.length = length;
	}

	// get length of the doubly linked list
	public int getLength() {
		return length;
	}

	public void addANodeAtTheFront(int i) {

		DoublyLinkedNode temp = new DoublyLinkedNode(i);
		// if list is empty
		if (head == null) {
			head = temp;
		}
		// if list not empty
		else {
			temp.setNext(head);
			head.setPrev(temp);
			head = temp;
		}
		System.out.println("Node added at the front: " + head.getData());
		// increment length
		length++;
	}

	public void printList() {
		System.out.print("List has");
		DoublyLinkedNode temp = head;
		for (int i = 0; i < getLength(); i++) {
			System.out.print(":" + temp.getData());
			temp = temp.getNext();
		}
		System.out.println("Length is: " + getLength());
	}

	public void insertAtTheEnd(int i) {
		DoublyLinkedNode temp = new DoublyLinkedNode(i);
		// if list is empty
		if (head == null) {
			head = temp;
			System.out.println("Node added at the end: " + head.getData());
		}
		// if list not empty
		// if tail is empty
		else if (tail == null) {
			tail = temp;
			tail.setPrev(head);
			head.setNext(tail);
			System.out.println("Node added at the end: " + tail.getData());
		} else {
			temp.setPrev(tail);
			tail.setNext(temp);
			tail = temp;
			System.out.println("Node added at the end: " + tail.getData());
		}

		// increment length
		length++;

	}

	public void insertAtTheMiddle(int i) {
		DoublyLinkedNode temp = new DoublyLinkedNode(i);
		// if list is empty
		if (head == null) {
			head = temp;
			System.out.println("Node added at the middle: " + head.getData());
		}
		// if list not empty
		// if tail is empty
		else if (tail == null) {
			tail = temp;
			tail.setPrev(head);
			head.setNext(tail);
			System.out.println("Node added at the middle: " + tail.getData());
		} else {
			// if both head and tail are present, find the middle based on length, traverse
			// to that and adjust pointers accordingly.
			//
			DoublyLinkedNode currentNode = head;
			int middleNodePosition = (getLength() / 2) - 1;
			for (int j = 0; j < middleNodePosition; j++) {
				// System.out.print(":" + temp.getData());
				currentNode = currentNode.getNext();
			}
			temp.setNext(currentNode.getNext());
			(currentNode.getNext()).setPrev(temp);
			currentNode.setNext(temp);
			temp.setPrev(currentNode);
			System.out.println("Node added at the middle: " + temp.getData());
		}

		// increment length
		length++;

	}

}

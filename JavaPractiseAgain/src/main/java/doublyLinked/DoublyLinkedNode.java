package doublyLinked;

public class DoublyLinkedNode {
	private int data;
	private DoublyLinkedNode next;
	private DoublyLinkedNode prev;
	
	
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public DoublyLinkedNode getNext() {
		return next;
	}

	public void setNext(DoublyLinkedNode next) {
		this.next = next;
	}

	public DoublyLinkedNode getPrev() {
		return prev;
	}

	public void setPrev(DoublyLinkedNode prev) {
		this.prev = prev;
	}


	
	public DoublyLinkedNode(int data) {
		this.data=data;
		next = null;
		prev=null;
		
	}
	
	
	

}

package doublyLinkedTests;

import org.junit.Assert;
import org.junit.Test;

import doublyLinked.DoublyLinkedList;

public class TestsDoublyLinkedList {

	@Test
	public void unitTest() {
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		Assert.assertEquals(doublyLinkedList.getLength(), 0);

		doublyLinkedList.addANodeAtTheFront(1);
		doublyLinkedList.printList();

		doublyLinkedList.insertAtTheEnd(5);
		doublyLinkedList.printList();

		doublyLinkedList.insertAtTheMiddle(2);
		doublyLinkedList.printList();

		doublyLinkedList.insertAtTheMiddle(3);
		doublyLinkedList.printList();

		doublyLinkedList.insertAtTheMiddle(4);
		doublyLinkedList.printList();
	}
}

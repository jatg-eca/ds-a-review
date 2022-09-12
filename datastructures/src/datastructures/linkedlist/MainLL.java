package datastructures.linkedlist;

public class MainLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList myLinkedList;
		myLinkedList = new LinkedList(2);
		
		myLinkedList.getHead();
		myLinkedList.getTail();
		myLinkedList.getLength();
		
		myLinkedList.printList();
		
		myLinkedList.append(5);
		myLinkedList.getHead();
		myLinkedList.getTail();
		myLinkedList.getLength();
		myLinkedList.printList();
		
		myLinkedList.append(30);
		myLinkedList.getHead();
		myLinkedList.getTail();
		myLinkedList.getLength();
		myLinkedList.printList();
		

	}

}

package datastructures.doublylinkedlist;

public class DoublyLinkedList {
	private Node head;
	private Node tail;
	private int length;
	
	class Node{
		int value;
		Node next;
		Node prev;
		
		public Node(int value) {
			this.value = value;
		}
	}
	
	public DoublyLinkedList(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}
	
	public void printList() {
		Node temp = head;
		while(temp != null) {
			int index = 0;
			System.out.println("Index " + index + " = " + temp.value);
			temp = temp.next;
		}
	}
	
	public void getHead() {
		System.out.println("Head: " + this.head.value);
	}
	
	public void getTail() {
		System.out.println("Tail: " + this.tail.value);
	}
	
	public void getLength() {
		System.out.println("Length: " + this.length);
	}

}

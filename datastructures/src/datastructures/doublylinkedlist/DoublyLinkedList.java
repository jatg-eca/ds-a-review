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
	
	public DoublyLinkedList() {}
	
	public void printList() {
		Node temp = head;
		while(temp != null) {
			int indexCount = 0;
			System.out.println("Index " + indexCount + " = " + temp.value);
			temp = temp.next;
			indexCount ++;
		}
	}
	
	public void getHead() {
		if(head == null) System.out.println("No head :(");
		else System.out.println("Head: " + this.head.value);
	}
	
	public void getTail() {
		if(tail == null) System.out.println("Tail: null");
		else System.out.println("Tail: " + this.tail.value);
	}
	
	public void getLength() {
		System.out.println("Length: " + this.length);
	}
	
	public void append(int value) {
		Node newNode = new Node(value);
		Node prev = null;
		Node temp = this.head;
		if(length <1) {
			head = newNode;
			tail = newNode;
			length = 1;
		} else {
		while(temp.next != null) {
			prev = temp;
			temp = temp.next;
		}
		temp.next = newNode;
		newNode.prev = prev;
		tail = newNode;
		length ++;
		}
	}

}

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
		int indexCount = 0;
		while(temp != null) {
			System.out.println("Index " + indexCount + " = " + temp.value);
			
			if(temp.prev != null) {
			System.out.println("El nodo pasado de " + temp.value + " es: " + temp.prev.value);
			}
			else {
				System.out.println("De " + temp.value + " el pasado es null" );
			}
			
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
	
	public void appendOofN(int value) {
		Node newNode = new Node(value);
		Node prev = null;
		Node temp = this.head;
		if(length == 0) {
			head = newNode;
			tail = newNode;
			newNode.prev = prev;
			length = 1;
		} else {
//		while(temp.next != null) {
//			prev = temp;
//			temp = temp.next;
//		}
		for(int i=0; i<length; i++) {
			prev = temp;
			if(temp.next == null) break;
			temp = temp.next;
		}
		temp.next = newNode;
		newNode.prev = prev;
		tail = newNode;
		length ++;
		}
	}
	
	public void append(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		length ++;
	}
	
	public void removeLast() {
		if(length == 1) {
			head = null;
			tail = null;
		}
		else {
		Node temp = tail;
		temp = tail.prev;
		temp.next = null;
		tail = temp;
		}
		length --;
		
		
	}

}

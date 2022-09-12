package datastructures.linkedlist;

public class LinkedList {
	private Node head;
	private Node tail;
	private int length;
	
	//Inner class - nested class
	private class Node{
		int value;
		Node next;
		
		Node(int value) {
			this.value = value;
		}
	}
	
	
	public LinkedList(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}
	
	public LinkedList() {}
	
	//Methods
	public void printList() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
	
	public void getHead() {
		if (this.head == null) {
			System.out.println("There's no head :(: It's null");
		} else {
		System.out.println("Head is: " + head.value);
		}
	}
	
	public void getTail() {
		if (this.tail == null) {
			System.out.println("There's no tail: It's null");
		}
		else {
		System.out.println("Tails is: " + tail.value);
		}
	}
	
	public void getLength() {
		System.out.println("Length is: " + this.length);
	}
	
	public void append(int value) {
		Node appendedNode = new Node(value);
		
		if(this.length < 1) {
			this.head = appendedNode;
			this.tail = appendedNode;
			this.tail.next = null;
			this.length = 1;
		}
//		else if(this.length == 1) {
//			this.head.next = appendedNode;
//			this.tail = appendedNode;
//			this.tail.next = null;
//			this.length += 1;
//		}
		else {
			this.tail.next = appendedNode;
			this.tail = appendedNode;
			appendedNode.next = null;
			this.length += 1;
		}
	}
	
	public void removeLast() {
		Node temp = head;
		Node penultimo = null;
		int numEsperado = this.length - 1;
		int recorrido = 1;
		
		if(this.length < 1) {
			System.out.println("LinkedList is null");
		} else if(this.length == 1) {
			int removedLast = this.tail.value;
			this.head = null;
			this.tail = null;
			this.length --;
			System.out.println("The only number was eliminated: " + removedLast);
		} else if(this.length == 2) {
			int removedLast = this.tail.value;
			this.head = head;
			this.head.next=null;
			this.tail = head;
			this.length --;
			System.out.println("There is only one number. Eliminated was:  " + removedLast);
		}
			else {
			int removedLast = this.tail.value;
			while(temp != null) {
				temp = temp.next;
				recorrido +=1;
			if(recorrido == numEsperado) {
				penultimo = temp;
				break;
			}
		}
			this.tail = penultimo;
			this.tail.next = null;
			this.length --;
			System.out.println("Last value was removed: " + removedLast);
			
		}
		
	}
	

}

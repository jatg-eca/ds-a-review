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
	
	//Methods
	public void printList() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
	
	public void getHead() {
		System.out.println("Head is: " + head.value);
	}
	
	public void getTail() {
		System.out.println("Tails is: " + tail.value);
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
		}
		else if(this.length == 1) {
			this.head.next = appendedNode;
			this.tail = appendedNode;
			this.tail.next = null;
			this.length += 1;
		}
		else {
			this.tail.next = appendedNode;
			this.tail = appendedNode;
			appendedNode.next = null;
			this.length += 1;
		}
	}
	

}

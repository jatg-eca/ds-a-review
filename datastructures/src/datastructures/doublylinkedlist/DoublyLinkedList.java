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
	
	public Node removeLast() {
		Node temp = tail;
		if(length == 0) {
			head = null;
			tail = null;
			//System.out.println("No hay nada");
			return null;
		}
		if(length == 1) {
			head = null;
			tail = null;
//			length --;
			//System.out.println("Se acaba de vaciar");
			//return temp;

		}
		else if (length > 1){
		//Node temp = tail;
		tail = temp.prev;
		temp.prev = null;
		tail.next = null;
//		length --;
//		return temp;
		}
		length --;
		return temp;
		
	}
	
	public void prepend(int value) {
		Node newNode = new Node(value);
		if(length == 0) {
			head = newNode;
			tail = newNode;
		}
		else {
		newNode.next = head;
		head.prev = newNode;
		head = newNode;
		}
		length ++;
	}
	
	public Node removeFirst() {
		Node temp = head;
		if(length == 0) {
			return null;
		}
		if(length == 1) {
			head = null;
			tail = null;
		}
		else {
		head = head.next;
		head.prev = null;
		temp.next = null;
		}
		length --;
		return temp;
	}
	
	/*
	 * Este método se habilitó para hacer pruebas
	 * en JUnit Jupiterrrrrr
	 */
	public boolean removeFirstBool() {
		Node temp = head;
		if(length == 0) {
			return false;
		}
		if(length == 1) {
			head = null;
			tail = null;
		}
		else {
			head = head.next;
			head.prev = null;
			temp.next = null;
		}
		length --;
		return true;
	}
	
	public Node get(int index) {		
		if(index<0 || index > length) {
			System.out.println("Out of bounds index");
			return null;
		}
		Node temp = null;
		int half = length / 2;
		if (index <= half) {
		temp = head;
		for(int i=0; i<index; i++) {
			temp=temp.next;
		}
		}
		else if(index > half) {
			temp = tail;
			for (int i=length-1; i>index; i--) {
				temp=temp.prev;
			}
		}
		return temp;
	}
	
	public boolean set(int index, int value) {
		if(index <0 || index > length) 
			return false;
		else {
			Node temp = get(index);
			temp.value = value;
			return true;
		}
	}

}

package datastructures.queues;

public class Queue {
	private Node first;
	private Node last;
	private int length;
	
	class Node{
		int value;
		Node next;
		Node(int value) {
			this.value = value;
		}
	}
	
	public Queue(int value){
		Node newNode = new Node(value);
		first = newNode;
		last = newNode;
		length =1;
	}
	
	public Queue() {}
	
	public void printQueue() {
		int index = 0;
		Node temp = first;
		if(temp != null) {
		while(temp != null) {
			System.out.println("Index " + index + " = "+ temp.value);
			temp = temp.next;
			index ++;
		}}
		else {
			System.out.println("No queue yet");
		}
	}
	
	public void getLength() {
		if(length > 0) System.out.println("Length of Q: " + this.length);
		else System.out.println("no Q length");
	}
	public void getFirst() {
		if(length>0) System.out.println("First of Q: " + this.first.value);
		else System.out.println("no Queue first");
	}
	public void getLast() {
		if(length>0) System.out.println("Last of Q: " + this.last.value);
		else System.out.println("no Queue last");
	}
	
	public void enqueue(int value) {
		Node newNode = new Node(value);
		if(length <1) {
			first = newNode;
			last = newNode;
			length = 1;
		}
		else {
			last.next = newNode;
			last = newNode;
			length ++;
		}
	}
	
	public Node dequeue() {
		Node temp = first;
		if(length < 1) {
			return null;
		}
		else if(length == 1) {
			first = null;
			last = null;
//			length --;
//			return temp;
		}
		else {
			first = first.next;
		}
		length --;
		return temp;			
	}

}

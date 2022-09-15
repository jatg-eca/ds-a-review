package datastructures.stacks;

public class Stack {
	private Node top;
  //private Node bottom;  //Se representan vertical, por lo que un top y un bottom teoreticamente existen
	private int height; //Por representación vertical, no es length sino heigth
	//Inner class node
	class Node{
		int value;
		Node next;
		public Node(int value) {
			this.value = value;
		}
	}
	//Construye stack
	public Stack(int value) {
		Node newNode = new Node(value);
		this.top = newNode;
		height = 1;
	}
	
	//Getters
	public void getTop() {
		if(this.top == null) System.out.println("Nothing on top");
		System.out.println("Top: " + this.top.value);
	}
	
	public void getHeight() {
		System.out.println("Height of stack: " + this.height);
	}
	
	public void printStack() {
		int index = 0;
		Node temp = top;
		while (temp != null) {
			System.out.println("Index " + index + " value = " + temp.value);
			temp = temp.next;
			index ++;
		}
	}
	
	//Métodos
	public void push(int value) {
		Node newNode = new Node(value);
//		Node temp = top;
//		newNode.next = temp;
		newNode.next = top;
		top = newNode;
		height ++;
	}

}

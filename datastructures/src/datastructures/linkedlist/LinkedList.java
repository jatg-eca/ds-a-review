package datastructures.linkedlist;

public class LinkedList {
	private Node head;
	private Node tail;
	private int length;
	
	//Inner class - nested class
	class Node{
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
	
	public Node removeLast() {
		if(this.length == 0) { 
			return null;
		}
		Node temp = this.head;
		Node pre = this.head;		
		while(temp.next != null) {
			pre = temp;
			temp = temp.next;
		}
		this.tail = pre;
		this.tail.next = null;
		length --;
		if(length == 0) {
			head = null;
			tail = null;
		}
		return temp;
	}
	
	public void removeLastJATG() {
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
				penultimo = temp;
				temp = temp.next;
				recorrido +=1;
				
//			if(recorrido == numEsperado) {
//				penultimo = temp;
//				break;
//			}
				if (temp.next == null) {
					break;
				}
		}
			this.tail = penultimo;
			this.tail.next = null;
			this.length --;
			System.out.println("Last value was removed: " + removedLast);
			
		}
		
	}
	
	public void prepend(int value) {
		Node newHeadNode = new Node(value);
		if(this.head == null) {
			this.head = newHeadNode;
			this.tail = newHeadNode;
			this.tail.next = null;
		}else {
		Node temp = this.head;
		this.head = newHeadNode;
		this.head.next = temp;
		
		//newHeadNode.next = this.head;
		//this.head = newHeadNode;
		}
		length++;
	}
	
	public Node removeFirst() {
		if(length == 0) return null;
		Node temp = this.head;
		//Node newHead = this.head.next;
		this.head = head.next;
		//
		temp.next = null;
		//
		this.length --;
		if (length == 0) {
			//this.head = null;
			this.tail = null;
			//return temp;
		}
		//this.head.next = newHead.next;
		return temp;
	}
	
	public Node getJATG(int index) {
		Node temp = this.head;
		int i = 1;
		while(temp.next != null) {
			if (i == index) {
				break;
			}
			else if (index < 0 || index >= this.length) {
				System.out.println("Catch: Ese ??ndice no existe");
				return null;
			}
			temp = temp.next;
			i++;
		}
		return temp;
	}
	
	public Node get(int index) {
		if(index < 0 || index >= length) {
			return null;
		}
		Node temp = head;
		for(int i=0; i<index; i++) {
			temp = temp.next;
		}
		return temp;
	}
	
	public boolean setJATG(int index, int value) {
		if(index<0 || index >= this.length) {
			System.out.println("No se cambi?? n??mero: Ese ??ndice no est?? en la lista");
			return false;
		}
		Node temp = this.head;
		for(int i=0; i<index; i++) {
			temp = temp.next;
		}
		int oldValue = temp.value;
		temp.value = value;
		System.out.println("Cambiado el valor de " + temp + " de " + oldValue + " a " + temp.value);
		return true;
	}
	
	public boolean set(int index, int value) {
		Node temp = get(index);
		if(temp != null) {
			temp.value = value;
			return true;
		}
		return false;
	}
	
	public boolean insert(int index, int value) {
		if(index < 0 || index>this.length) {
			return false;
		}
		if(index == 0) {
			prepend(value);
			return true;
		}
		if(index == length) {
			append(value);
			return true;
		}
		Node temp = get(index);
		Node pre = get(index -1);
		Node newNode = new Node(value);
		pre.next = newNode;
		newNode.next = temp;
		this.length ++;
		return true;
		
	}
	
	public Node remove(int index) {
		if(index < 0 || index >= this.length) return null;
		
		if(index == 0) removeFirst();
		
		if(index == this.length - 1) removeLast();
		
//		Node removedNode = get(index);
//		Node temp = get(index -1);
//		temp.next = removedNode.next;
//		length --;
//		return removedNode;
		Node prev = get(index-1);
		Node temp = prev.next;
		
		prev.next = temp.next;
		temp.next = null;
		length --;
		return temp;
	}
	
	public void reverse() {
		Node temp = this.head;
		head = tail;
		tail = temp;
		Node before = null;
		Node after = temp.next;
		for(int i = 0; i<this.length; i++) {
//			System.out.println(i);
//			System.out.println(after);
			//Se le pone cual va despu??s en el anterior list
			after = temp.next;
			//System.out.println(before.value);
			//Cu??l va despu??s en el nuevo list
			temp.next = before;
			//El de antes se pasa a temp
			before = temp;
			//Temp se pasa al de after
			temp = after;
		}
	}

}

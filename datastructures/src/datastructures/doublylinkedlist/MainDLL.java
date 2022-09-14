package datastructures.doublylinkedlist;

public class MainDLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList myDll = new DoublyLinkedList();
		
		myDll.getHead();
		myDll.getTail();
		myDll.getLength();
		
		myDll.printList();
		
		myDll.append(7);
		myDll.getHead();
		myDll.getTail();
		myDll.getLength();
		
		myDll.append(9);
		myDll.getHead();
		myDll.getTail();
		myDll.getLength();
		
		myDll.append(16);
		myDll.getHead();
		myDll.getTail();
		myDll.getLength();
		
		myDll.append(32);
		myDll.printList();

	}

}

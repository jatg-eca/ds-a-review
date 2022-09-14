package datastructures.doublylinkedlist;

public class MainDLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList myDll = new DoublyLinkedList();
		
		myDll.getHead();
		myDll.getTail();
		myDll.getLength();
		
		myDll.printList();
		System.out.println("Al borrar vacio " + myDll.removeLast());
		
		myDll.append(16);
		myDll.append(23);
		myDll.printList();
		System.out.println("Borrar " + myDll.removeLast().value);
		System.out.println("A ver " + myDll.removeLast().value);
		System.out.println("Vacio " + myDll.removeLast());
//		
//		myDll.append(7);
//		myDll.getHead();
//		myDll.getTail();
//		myDll.getLength();
//		
//		myDll.append(9);
//		myDll.getHead();
//		myDll.getTail();
//		myDll.getLength();
//		
//		myDll.append(16);
//		myDll.getHead();
//		myDll.getTail();
//		myDll.getLength();
//		
//		myDll.append(32);
//		myDll.printList();
		
//		myDll.removeLast();
//		myDll.printList();
//		
//		myDll.removeLast();
//		myDll.printList();
//		myDll.removeLast();
//		myDll.printList();
//		myDll.removeLast();
//		myDll.printList();
//		myDll.removeLast();
//		myDll.printList();

	}

}

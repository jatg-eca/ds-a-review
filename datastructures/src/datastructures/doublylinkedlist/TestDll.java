package datastructures.doublylinkedlist;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import datastructures.doublylinkedlist.DoublyLinkedList.Node;

class TestDll {
	DoublyLinkedList myDll;
	
	
	@BeforeEach
	void setUp() {
		myDll=new DoublyLinkedList(1);
		
		myDll.prepend(0);
		myDll.printList();
		myDll.append(2);
		myDll.append(3);
		myDll.append(4);
		myDll.append(5);
	}
	

	@Test
	@DisplayName("Test uno")
	void testUno() {
		assertTrue(myDll.set(6, 16));
		//assertEquals(1, )
	}
	
	@Test
	@DisplayName("Test dos. Out of bounds")
	void testDos() {
		assertAll(
				() -> assertFalse(myDll.set(100, 100), "Esto da false: Es mayor al length"),
				() -> assertFalse(myDll.set(-15, 32), "Esto da false: Es menor a cero")
				);
	}

}

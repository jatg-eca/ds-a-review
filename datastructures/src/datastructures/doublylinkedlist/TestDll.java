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
		myDll=new DoublyLinkedList();
		
		myDll.append(5);
		myDll.append(3);
	}
	

	@Test
	@DisplayName("Test uno")
	void testUno() {
		assertTrue(myDll.removeFirstBool());
		//assertEquals(1, )
	}
	
	@Test
	@DisplayName("Quitando dos")
	void testDos() {
		assertTrue(myDll.removeFirstBool());
		assertTrue(myDll.removeFirstBool());
	}
	
	@Test
	@DisplayName("Quitando todos")
	void testTres() {
		assertTrue(myDll.removeFirstBool());
		assertTrue(myDll.removeFirstBool());
		assertTrue(myDll.removeFirstBool(), "este no da true");
	}

}

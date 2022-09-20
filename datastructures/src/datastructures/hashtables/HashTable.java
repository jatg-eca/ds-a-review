package datastructures.hashtables;

public class HashTable {
	private int size = 7; //prime number to avoid collisions
	private Node[] dataMap;
	
	class Node{
		String key;
		int value;
		Node next;
		
		Node(String key, int value) {
			this.key = key;
			this.value = value;
		}
	}
	
	//Adresses
	public HashTable() {
		dataMap = new Node[size];
	}
	
	public void printTable() {
		Node temp;
		for(int i = 0; i<size; i++) {
			temp = dataMap[i];
			System.out.println("Inicio de address "+ i  + " = " + temp);
			while(temp != null) {
				System.out.println(" Pairs = " + temp.key + " : " + temp.value);
				temp = temp.next;
			}
			
		}
	}

}

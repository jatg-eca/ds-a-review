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
	
	private int hash(String key) {
		int hash = 0;
		char [] keycharArray = key.toCharArray();
		for(int i= 0; i<keycharArray.length; i++) {
			int asciivalue = keycharArray[i];
			hash = (hash+asciivalue*23) % dataMap.length;
		}
		return hash;
	}
	
	public void setJATGECA(String key, int value) {
		Node newNode = new Node(key, value);
		int hashvalue = hash(newNode.key);
		hashvalue = Math.round(hashvalue);
		if(dataMap[hashvalue] == null) {
			dataMap[hashvalue] = newNode;
		}
		else if(dataMap[hashvalue] != null) {
			int length = 0;
			Node temp = dataMap[hashvalue];
			while(temp != null) {
				temp = temp.next;
				length ++;
			}
			Node add = dataMap[hashvalue];
			for(int i = 0; i<length-1; i++) {
				//System.out.println(dataMap[hashvalue].key + " : " + length);
				add = add.next;
			}
			add.next = newNode;
		}
		
	}
	
	public void set(String key, int value) {
		Node newNode = new Node(key, value);
		int hashvalue = hash(newNode.key);
		hashvalue = Math.round(hashvalue);
		if(dataMap[hashvalue] == null) {
			dataMap[hashvalue] = newNode;
		}
		else {
			Node temp = dataMap[hashvalue];
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		}

}

package datastructures.hashtables;

public class MainHT {
	
	public static void main(String[] arrays) {
		System.out.println("**HashTables***");
		
		HashTable myHashTable = new HashTable();
		myHashTable.printTable();
		myHashTable.set("nails", 1000);
		//myHashTable.printTable();
		myHashTable.set("ee", 1000);
		myHashTable.set("ee", 3500);
		myHashTable.set("ee", 6500);
		myHashTable.set("aa", 6500);
		myHashTable.printTable();
		myHashTable.set("nails", 4500);
		myHashTable.printTable();
		System.out.println("Key x: "+ myHashTable.get("x"));
		System.out.println("Key aa: "+ myHashTable.get("nails"));
	}
	

}

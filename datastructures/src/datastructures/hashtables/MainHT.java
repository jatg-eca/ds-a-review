package datastructures.hashtables;

public class MainHT {
	
	public static void main(String[] arrays) {
//		System.out.println("**HashTables***");
//		
//		HashTable myHashTable = new HashTable();
//		myHashTable.printTable();
//		myHashTable.set("nails", 1000);
//		//myHashTable.printTable();
//		myHashTable.set("bolts", 10);
//		myHashTable.set("lumber", 3500);
//		myHashTable.set("hammers", 6500);
//		myHashTable.set("backpacks", 30);
//		myHashTable.printTable();
//		myHashTable.set("tiles", 4500);
//		myHashTable.printTable();
//		System.out.println("Key bolts: "+ myHashTable.get("bolts"));
//		System.out.println("Key nails: "+ myHashTable.get("nails"));
//		System.out.println("Key tiles: "+ myHashTable.get("tiles"));
//		System.out.println(myHashTable.keys().toString());
		
		//Array
		int arrayOne [] = {1, 3, 5};
		int [] arrayTwo = {2, 4, 5};
		
		//O(n^2) bad space-time complexity
		for(int i= 0; i<arrayOne.length;i++) {
			for(int j=0; j<arrayTwo.length; j++) {
				System.out.print("\n"+arrayOne[i] + " " + arrayTwo[j]);
				if(arrayOne[i] == arrayTwo[j]) {
					System.out.print(" <-- Equal numbers");
				}
			}
		}
	}
	

}

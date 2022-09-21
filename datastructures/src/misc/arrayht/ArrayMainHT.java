package misc.arrayht;

import java.util.HashMap;

public class ArrayMainHT {
	
	public static boolean arrayCheck(int [] array1, int[] array2){
		for(int i : array1) {
			for(int j:array2) {
				if(i == j) return true;
			}
		}
		return false;
	}
	
	public static boolean mapArrayCheck(int [] array1, int[] array2) {
		HashMap<Integer, Boolean> myHashMap = new HashMap<>();
		for( int  i : array1 ) {
			myHashMap.put(i, true);
		}
		
		for( int j : array2) {
			if(myHashMap.get(j) != null) return true;
		}
		return false;
	}
	
	public static void main(String [] arr) {
//	//Array
//			int arrayOne [] = {1, 3, 5};
//			int [] arrayTwo = {2, 4, 5};
//			
//			//O(n^2) bad space-time complexity
//			for(int i= 0; i<arrayOne.length;i++) {
//				for(int j=0; j<arrayTwo.length; j++) {
//					System.out.print("\n"+arrayOne[i] + " " + arrayTwo[j]);
//					if(arrayOne[i] == arrayTwo[j]) {
//						System.out.print(" <-- Equal numbers");
//					}
//				}
//			}
		
		int arrayOne [] = {1, 3, 5};
		int [] arrayTwo = {2, 4, 5};
		//O(n^2) solution
		///System.out.println(arrayCheck(arrayOne, arrayTwo));
//		
//		HashMap<Integer, Boolean> arrayMapOne = new HashMap<>();
//		arrayMapOne.put(1, true);
//		arrayMapOne.put(3, true);
//		arrayMapOne.put(5, true);
		
		System.out.println(mapArrayCheck(arrayOne, arrayTwo));
		
		
		
		
			
	}

}

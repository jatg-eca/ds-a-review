package algorithms.sort.insertionsort;

import java.util.Arrays;

public class InsertionSort {
	
	public static void insertionsort(int array []) {
		for(int i=1; i<array.length; i++) {
			int temp = array[i];
			int j = i-1;
			while(j>=0 && temp<array[j]) {
				array[j+1] = array[j];
				array[j] = temp;
				j--;
			}
		}
	}
	
	public static void main(String [] array) {
		int myArray [] = {5, 3, 4, 2, 1};
		System.out.println(Arrays.toString(myArray));
		insertionsort(myArray);
		System.out.println(Arrays.toString(myArray));
	}

}

package algorithms.sort.mergesort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {
	
	public static int [] merge(int [] array1, int [] array2) {
		int [] combinedArray = new int [array1.length + array2.length];
		int index = 0;
		int i = 0;
		int j = 0;
		while(i<array1.length && j<array2.length) {
			if(array1[i] < array2[j]) {
				combinedArray[index] = array1[i];
				i++;
			}
			else if(array2[j] < array1[i]) {
				combinedArray[index] = array2[j];
				j++;
			}
			index++;
		}
		if(i<array1.length) {
			while(i<array1.length) {
				combinedArray[index] = array1[i];
				i++; index++;
			}
		}
		else if(j<array2.length) {
			while(j<array2.length) {
				combinedArray[index] = array2[j];
				j++; index++;
			}
			
		}
		
		return combinedArray;
	}
	
	public static void main(String [] arra) {
		System.out.println("Merging");

        int[] array1 = {1,3,7,8};
        int[] array2 = {2,4,5,6};

        System.out.println( Arrays.toString( merge(array1, array2) ) );

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 2, 3, 4, 5, 6, 7, 8]

         */

    }


}

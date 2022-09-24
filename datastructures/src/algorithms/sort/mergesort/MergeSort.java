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
	
	public static int [] mergesortNoCopy(int [] array) {
		if(array.length == 1) return array;

		int half = array.length / 2;
		int  [] array1 = new int[half];
		int [] array2 = new int[array.length - half];
		
		int j = 0;
		int k = 0;
		for(int i=0; i<array.length; i++) {
			if(j<array1.length) {
				array1[j] = array[i];
				j++;
			}
			else if(k < array2.length) {
				array2[k] = array[i];
				k++;
			}
		}
		
		return merge(mergesortNoCopy(array1), mergesortNoCopy(array2));
	}
	
	public static int [] mergeSort(int [] array) {
		if(array.length == 1) return array;
		
		int mid = array.length / 2;
		int [] left = Arrays.copyOfRange(array, 0, mid);
		int [] right = Arrays.copyOfRange(array, mid, array.length);
		
		return merge(mergeSort(left), mergeSort(right));
		
	}
	
	public static void divide(int [] array) {
		if(array.length !=1) {
		int half = array.length/2;
		int [] array1 = new int [half];
		int [] array2 = new int [array.length - half];
		int j = 0;
		int k = 0;
		for(int i=0; i<array.length; i++) {
			if(j<array1.length) {
				array1[j] = array[i];
				j++;
			}
			else if(k < array2.length) {
				array2[k] = array[i];
				k++;
			}
		}
			divide(array1);
			divide(array2);
			if(array1.length == 1 && array2.length == 1) {
				System.out.println( Arrays.toString( merge(array1, array2)));
			}
		}
	}
	
	public static void main(String [] arra) {
		System.out.println("Merging");

        int[] array3 = {2, 3 , 4, 1, 6, 8, 10, 9};
        
        System.out.println(Arrays.toString( mergeSort(array3) ));
        System.out.println(Arrays.toString( mergesortNoCopy(array3) ));

        //System.out.println( Arrays.toString( merge(array1, array2) ) );

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 2, 3, 4, 5, 6, 7, 8]

         */
        
        
        

    }


}

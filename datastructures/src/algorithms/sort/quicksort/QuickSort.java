package algorithms.sort.quicksort;

import java.util.Arrays;

public class QuickSort {
	
	/***
	 * La función de pivote
	 * ordena un array de un lado los menores a
	 * un pivote y del otro los mayores a este
	 * de tal manera que se puede aplicar recursión
	 * y reordenar los datos faltantes	
	 * @param array
	 * @return
	 */
	public static int pivoting(int [] array) {
		int pivot = 0;
		int swap = pivot;
		for(int i=1; i<array.length; i++) {
			if(array[i] > array[pivot]) {
				continue;
			}
			else if (array[i] < array[pivot]){
				swap++;
				int temp = array[swap];
				array[swap] = array[i];
				array[i] = temp;
			}
		}
		int temp = array[pivot];
		array[pivot] = array[swap];
		array[swap] = temp;
		
		System.out.println( Arrays.toString(array) );
		return swap;
	}
	
	
	public static void main(String[] miau) {
		int [] myarray = {4, 6, 1, 7, 3, 2, 5};
//		int [] myarray = {9, 6, 1, 7, 3, 2, 5, 8, 4};
		System.out.println(pivoting(myarray));
	}

}

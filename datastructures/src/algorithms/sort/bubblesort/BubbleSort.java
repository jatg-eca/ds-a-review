package algorithms.sort.bubblesort;

import java.util.Arrays;

public class BubbleSort {
	
	public static void bubblesort(int []array) {
		for(int i=array.length-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}		
	}
	
	public static void main(String [] ayy) {
		int [] array = {3, 45, 22, 19, 21, 1};
		System.out.println(Arrays.toString(array));
		bubblesort(array);
		System.out.println(Arrays.toString(array));
	}

}

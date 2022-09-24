package algorithms.sort.selectionsort;

import java.util.Arrays;

public class SelectionSort {
	
	public static void selectionsort(int [] array) {
		for(int i=0; i<array.length; i++) {
			int minIndex = i;
			for(int j = i+1; j<array.length; j++) {
				if(array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			if(minIndex != i) {
				int temp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = temp;
			}
		}
	}
	
	public static void main(String[] argh) {
		int [] arrays = {1, 5, 33, 54, 21};
		
		System.out.println(Arrays.toString(arrays));
		selectionsort(arrays);
		System.out.println(Arrays.toString(arrays));
	}

}
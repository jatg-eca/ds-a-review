package algorithms.sort;

public class Review {
	
	public static void bubbleSortR(int [] array) {
		for(int i= array.length-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(array[j+1] < array[j]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] =temp;
				}
			}
		}
	}
	
	public static void selectionSortR(int [] array) {
		for(int i=0; i<array.length; i++) {
			int minIndex = i;
			for(int j=i+1; j<array.length; j++) {
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
	
	public static void insertionSortR(int [] array) {
		for(int i=1; i<array.length; i++) {
			int temp = array[i];
			int j = i-1;
			while(j>=0 && temp < array[j]) {
				array[j+1] = array[j];
				array[j] = temp;
				j--;
			}
		}
	}

}

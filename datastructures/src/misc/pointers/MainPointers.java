package misc.pointers;

import java.util.Arrays;
import java.util.HashMap;

public class MainPointers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 11;
		int num2 = num1;
		
		System.out.println(num1);
		System.out.println(num2);
		
		num1=32;
		
		System.out.println(num1);
		System.out.println(num2); //They ain't pointing to the same thing
		//Storing the values
		
		HashMap<String, Integer> map1 = new HashMap<String, Integer>();
		HashMap<String, Integer> map2 = new HashMap<String, Integer>();
		
		map1.put("value", 11);
		map2 = map1;
		System.out.println(map1);
		System.out.println(map2);
		
		map1.put("value", 32);
		System.out.println(map1);
		System.out.println(map2);
		
		//Pointing to the same hash and ID 
		
		HashMap<String, Integer> map3 = new HashMap<String, Integer>();
		
		map3.put("values", 36);
		map2 = map3;
		System.out.println(map1);
		System.out.println(map2);
		System.out.println(map3);
		
		map1 = map2;
		
		System.out.println(map1);
		System.out.println(map2);
		System.out.println(map3);
		
		int array [] = new int [5];
		array[0] = 10;
		
		System.out.println(Arrays.toString(array));
		
		
		

	}

}

package filah.abuebook;

import java.util.Arrays;

public class IngramexMainFactory {
	
	
	public static void main(String [] arr) {
		Book abueBook = new CiGaBook("vino", 22, false, "cultural", "couche", false);
		
		abueBook.despliegaPaginasLargas();
		abueBook.leer();
		abueBook.regresaPagina();
		
		for(int i = 0; i == 50; i++) {
		abueBook.avanzaPagina();
		}
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
//		System.out.printf(null, null, arr);
		
		int _$12integer = 00_34;
		System.out.println(_$12integer);
		int[] arrayofIntegers;
		arrayofIntegers = new int[10];
		
		System.out.println(Arrays.toString(arrayofIntegers));
		System.out.println("Hola, homelo chino");
		
//		public static void main(String[] args) {
	        String[][] names = {
	            {"Mr. ", "Mrs. ", "Ms. "},
	            {"Smith", "Jones"}
	        };
	        // Mr. Smith
	        System.out.println(names[0][0] + names[1][0]);
	        // Ms. Jones
	        System.out.println(names[0][2] + names[1][1]);
		
	}

}

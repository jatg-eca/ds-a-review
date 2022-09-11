package misc.bigo;

import java.util.ArrayList;

public class ArrayListBigo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> myList = new ArrayList<Integer>();
		
		//Se añaden números
		myList.add(11);
		myList.add(3);
		myList.add(23);
		myList.add(7);
		//Lo que significa que se realiza una única operación
		//Constante, en la que se añade un valor con un índice final
		System.out.println(myList.toString());
		//Por lo tanto, es O(1)
		
		myList.add(17); //O(1)
		int tamanioAL = myList.size();
		System.out.println(tamanioAL);
		myList.remove(4); //O(1), por que solo se quita un número y no se toca el resto
		tamanioAL = myList.size();
		System.out.println(tamanioAL);
		
		myList.remove(0); //Ya que es al inicio
		//los demás elementos se tienen que iterar para cambiar los índices
		myList.add(0, 11); //Este elemento cambia e itera el resto de índices
		
		//Por esta operación: O(n)
		
		myList.add(1, 99); //O(n), por el peor caso, por el comportamiento que hará
		tamanioAL = myList.size();
		System.out.println(tamanioAL);
		System.out.println(myList.toString());
		
		//Encontrar iterando
		//O(n^2)
		for(int i=0; i<tamanioAL; i++) {
			if(myList.get(i) == 7) {
				System.out.println("Se iteró hasta encontrar el " + myList.get(i));
				System.out.println("por lo tanto esto es O(n^2)");
			}
			else {
				System.out.println("Se iteran números: " + myList.get(i));
			}
		}
		
		//Encontrar por índice único
		//O(1)
		System.out.println("Se encuentra por índice: " + myList.get(tamanioAL-1));
		System.out.println("Es decir: O(1)");


	}

}

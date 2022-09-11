package misc.bigo;

public class OandDiffTerms {
	
	public static void fakeOofn(int a, int b) {
		for(int i=0; i<a; i++) {
			System.out.println(i);
		}
		
		for (int j=0; j<b; j++) {
			System.out.println(j);
		}
		//No es O(n)
		//Esto es O(a+b)
		//Los parámetros se comportarían diferente y hay que tomar
		//cada uno en cuenta para saber la complejidad espacio-tiempo
	}
	
	//De la misma forma
	public static void fakeOnsquared(int a, int b) {
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				System.out.println(i + " " + j);
				//Estos loops no dan O(n^2), u O(n*n
				//Dan O(a*b)
				//Y de acuerdo a sus parámetros hay distina complejidad espacio-tiempo
			}			
		}
	}

	//Es decir, se usan distintos términos de acuerdo a la notación algebraica correspondiente
	//ya que A puede ser 10, y B puede ser, digamos, un millón...
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

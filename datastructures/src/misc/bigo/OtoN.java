package misc.bigo;

public class OtoN {
	
	//O(n)
	public static void printItems(int n) {
		for (int i=0; i<n; i++) {
			System.out.println(i);
		}
	}
	
	//O(n) => drop constants [O(2n)]
	public static void printItemsSecond(int n) {
		for (int i=0; i<n; i++) {
			System.out.println(i);
		}
		for (int j=0; j<n; j++) {
			System.out.println(j);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printItems(11);
		//printItemsSecond(11);

	}

}

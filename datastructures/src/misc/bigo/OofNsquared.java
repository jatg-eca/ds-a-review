package misc.bigo;

public class OofNsquared {
	
	//O(n^2)
	//Factorizable: less efficient in time complexity 
	public static void printItems(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				//Un tercer for sería O(n^2), aunque parezca O(n^3)
				System.out.println(i + " " + j);
			}
		}
		
		//O(n^2 + n) => drop non dominants => O(n^2)
		for(int k=0; k<n; k++) {
			System.out.println(k);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Homelochino");
		printItems(5);

	}

}

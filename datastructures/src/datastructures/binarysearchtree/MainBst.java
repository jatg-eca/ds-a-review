package datastructures.binarysearchtree;

public class MainBst {
	
	public static void main(String[] pArrgschePirata) {
		//System.out.println("Nice");
		
		BinarySearchTree mybts = new BinarySearchTree();
		//System.out.println("Root = " +  mybts.root);
		System.out.println(mybts.getRoot());
		System.out.println(mybts.insert(54));
		System.out.println(mybts.insert(54));
		System.out.println(mybts.insert(56));
		System.out.println(mybts.insert(25));
		System.out.println(mybts.insert(84));
		System.out.println(mybts.insert(36));
		
	}

}

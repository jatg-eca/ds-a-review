package datastructures.binarysearchtree;

public class MainBst {
	
	public static void main(String[] pArrgschePirata) {
		//System.out.println("Nice");
		
		BinarySearchTree mybts = new BinarySearchTree();
		//System.out.println("Root = " +  mybts.root);
		System.out.println(mybts.getRoot());
//		System.out.println("Contains " + mybts.contains(4));
//		System.out.println(mybts.insert(54));
//		System.out.println(mybts.insert(54));
//		System.out.println(mybts.insert(56));
//		System.out.println(mybts.insert(25));
//		System.out.println(mybts.insert(84));
//		System.out.println(mybts.insert(36));
//		System.out.println(mybts.getRoot().value);
//		
//		System.out.println(mybts.root.left.right.value);
//		System.out.println("Contains " + mybts.contains(4));
//		System.out.println("Contains " + mybts.contains(32));
//		System.out.println("Contains " + mybts.contains(36));
		
			mybts.insert(47);
	        mybts.insert(21);
	        mybts.insert(76);
	        mybts.insert(18);
	        mybts.insert(27);
	        mybts.insert(52);
	        mybts.insert(82);

		
	        System.out.println("\nBreadth First Search");
		System.out.println(mybts.BFS());
		
		
		System.out.println("\nDFS PreOrder:");
	        System.out.println( mybts.DFSpreorder() );
		/*
	            EXPECTED OUTPUT:
	            ----------------
	            DFS PreOrder:
	            [47, 21, 18, 27, 76, 52, 82]

		 */
	        
	        System.out.println("\nDFS PostMalonek:");
	        System.out.println( mybts.DFSpostorder() );
	    
	        System.out.println("\nDFS InOrder:");
	        System.out.println( mybts.DFSinorder() );

	}}

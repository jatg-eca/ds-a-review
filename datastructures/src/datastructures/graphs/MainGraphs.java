package datastructures.graphs;

public class MainGraphs {
	
	public static void main(String[] arrrrrrr) {
	
		Graph myGraph = new Graph();
//		System.out.println(myGraph.addVertex("A"));
////		System.out.println(myGraph.addVertex("A"));
//		System.out.println(myGraph.addVertex("B"));
//		System.out.println(myGraph.addVertex("C"));
//		
//		myGraph.printGraph();
//		System.out.println(myGraph.addEdge("B", "A"));
//		System.out.println(myGraph.addEdge("C", "B"));
//		System.out.println(myGraph.addEdge("C", "A"));
////		System.out.println(myGraph.addEdge("A", "D")); //Bidirecc
////		System.out.println(myGraph.addEdge("A", "E")); //Bidirecc
////		System.out.println(myGraph.addEdge("A", "B")); 
//		myGraph.printGraph();
//		
//		System.out.println(myGraph.removeEdge("C", "D"));
//		System.out.println(myGraph.removeEdge("A", "B"));
		
		myGraph.printGraph();
		
		myGraph.addVertex("A");
		myGraph.addVertex("B");
		myGraph.addVertex("C");
		myGraph.addVertex("D");
		
		myGraph.addEdge("A", "B");
		myGraph.addEdge("A", "C");
		myGraph.addEdge("A", "D");
		
		myGraph.addEdge("B", "D");
		myGraph.addEdge("C", "D");
		
		myGraph.printGraph();
		myGraph.removeVertex("D");
		myGraph.printGraph();
		
		
	}
	

}

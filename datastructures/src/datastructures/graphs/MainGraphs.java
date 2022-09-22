package datastructures.graphs;

public class MainGraphs {
	
	public static void main(String[] arrrrrrr) {
	
		Graph myGraph = new Graph();
		System.out.println(myGraph.addVertex("A"));
//		System.out.println(myGraph.addVertex("A"));
		System.out.println(myGraph.addVertex("B"));
		
		myGraph.printGraph();
		System.out.println(myGraph.addEdge("B", "A"));
//		System.out.println(myGraph.addEdge("A", "D")); //Bidirecc
//		System.out.println(myGraph.addEdge("A", "E")); //Bidirecc
//		System.out.println(myGraph.addEdge("A", "B")); 
		myGraph.printGraph();
		
		System.out.println(myGraph.removeEdge("C", "D"));
		System.out.println(myGraph.removeEdge("A", "B"));
		
		myGraph.printGraph();
		
	}
	

}

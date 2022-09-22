package datastructures.graphs;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
	
	private HashMap<String, ArrayList<String>> adjList =
			new HashMap<>();
	
	public Graph() {
	};
	
	public boolean addVertex(String vertex) {
//		if(adjList.get(vertex) != null) {
//			return false;
//		}
//		adjList.put(vertex, new ArrayList<String>());
//		return true;
		if(adjList.get(vertex) == null) {
			adjList.put(vertex, new ArrayList<String>());
			return true;
		}
		return false;
	}
	
	public void printGraph() {
		System.out.println(adjList);
	}
	
}

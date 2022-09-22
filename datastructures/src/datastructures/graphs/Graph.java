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
	
	public boolean addEdgeJATG(String vertex, String edge) {
		if (adjList.get(vertex) == null) {
			System.out.println("El vertex no está");
			return false;
		}
		else {
			ArrayList<String> info = adjList.get(vertex);
			if(adjList.get(edge) == null || edge.equals(vertex)) {
				System.out.println("No hay vertex para el edge");
				return false;
			}
			else {
				info.add(edge);
				return true;
			}
		}
	}
	
	public boolean addEdge(String vertexOne, String vertexTwo) {
		if(adjList.get(vertexOne) != null 
				&& 
		   adjList.get(vertexTwo) != null) {
			
			adjList.get(vertexOne).add(vertexTwo);
			adjList.get(vertexTwo).add(vertexOne);
			return true;
		} 
		return false;
	}
	
	public boolean removeEdge(String vertexOne, String vertexTwo) {
		if(adjList.get(vertexOne) != null
				&&
			adjList.get(vertexTwo) != null) {
			//
			adjList.get(vertexOne).remove(vertexTwo);
			adjList.get(vertexTwo).remove(vertexOne);
			return true;
		}
			
		return false;
	}
	
}

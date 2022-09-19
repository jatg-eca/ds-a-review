package datastructures.binarysearchtree;

public class BinarySearchTree {
	private Node root;
	
	public BinarySearchTree(int value) {
		Node newNode = new Node(value);
		root = newNode;
	}
	
	public BinarySearchTree(){}
	
	class Node{
		int value;
		Node left;
		Node right;
		
		Node(int value){
			this.value = value;
		}
	}
	
	public Node getRoot() {
		return root;
	}
	
	

}

package datastructures.binarysearchtree;

import org.junit.jupiter.api.io.TempDir;

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
	
	public boolean insert(int value) {
		Node newNode = new Node(value);
		boolean achieved = false;
		if(root == null) {
			root = newNode;
			achieved = true;
		} else {
		Node temp = root;
		while(temp != null) {
			if(newNode.value == temp.value) {
				break;
			}
			if(newNode.value < temp.value) {
				System.out.println("menor");
				temp = temp.left;
			} 
			else if(newNode.value > temp.value) {
				System.out.println("mayor");
				System.out.println("Temp antes" + temp.value);
				temp = temp.right;
				System.out.println("Temp después" + temp);
			}
			if(temp == null) {
				achieved = true;
				System.out.println("ok");
				temp = newNode;
			}
			else { 
				continue;
				}
		}}
		return achieved;
	}

}

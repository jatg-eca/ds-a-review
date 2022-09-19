package datastructures.binarysearchtree;

import org.junit.jupiter.api.io.TempDir;

public class BinarySearchTree {
	Node root;
	
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
		if(root == null) {
			root = newNode;
			return true;
		} else {
		Node temp = root;
		while(true) {
			if(newNode.value == temp.value) {
				return false;
			}
			if(newNode.value < temp.value) {
//				System.out.println("menor");
				if(temp.left == null) {
					temp.left = newNode;
					return true;
				}
				else {
					temp = temp.left;
				}
			} 
			else if(newNode.value > temp.value) {
//				System.out.println("mayor");
				if(temp.right == null) {
					temp.right = newNode;
					return true;
				}
				else {
					temp = temp.right;
				}
			}
		}
	}
}

}

package datastructures.binarysearchtree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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

	
	public boolean contains(int value) {
		if(root == null) return false; //This line can be ommited
		Node temp = root;
		while(temp != null) {
			if(value < temp.value) {
				temp = temp.left;
			}
			else if(value > temp.value) {
				temp = temp.right;
			}
			else if(value == temp.value) {
				return true;
			}
		}
		return false;
	}
	
	/***
	 * Writes an arraylist that replicates
	 * the order of the elements
	 * row by row
	 * column by column
	 * @return
	 */
	public ArrayList<Integer> BFS(){
		Node currentNode = root;
		Queue<Node> queue = new LinkedList<>();
		ArrayList<Integer> values = new ArrayList<Integer>();
		queue.add(currentNode);
		while(queue.size() > 0) {
			currentNode = queue.remove();
			if(currentNode.left != null)
				queue.add(currentNode.left);
			if(currentNode.right != null)
				queue.add(currentNode.right);
			values.add(currentNode.value);
		}
		
		return values;
	}
	
	
	/***
	 * Allows to write an array of elements going to the left
	 * starting from the root
	 * @return
	 */
	public ArrayList<Integer> DFSpreorder() {
		ArrayList<Integer> values = new ArrayList<>();
		
		class Traverse{
			Traverse(Node currentNode) {
				values.add(currentNode.value);
				if(currentNode.left != null) {
					new Traverse(currentNode.left);
				}
				if(currentNode.right != null) {
					new Traverse(currentNode.right);
				}
				
			}
		} 

		new Traverse(root);
		return values;
	}
	
	
	/***
	 * Allows to write an arraylist of elements starting from the root
	 * @return
	 */
	public ArrayList<Integer> DFSpostorder() {
		ArrayList<Integer> values = new ArrayList<>();
		
		class Traverse{
			
			Traverse(Node currentNode) {
				if(currentNode.left != null) {
					new Traverse(currentNode.left);
				}
				if(currentNode.right != null) {
					new Traverse(currentNode.right);
				}
				values.add(currentNode.value);
			}
		}
		
		new Traverse(root);
		return values;
	}
	
	/***
	 * Allows to write an arraylist of numbers in order
	 * @return
	 */
	public ArrayList<Integer> DFSinorder() {
		
		ArrayList<Integer> values = new ArrayList<>();
		
		class Traverse{
			Traverse(Node currentNode) {
				if(currentNode.left != null) {
					new Traverse(currentNode.left);
				}
				
				values.add(currentNode.value);
				
				if(currentNode.right != null) {
					new Traverse(currentNode.right);
				}
			}
		}
		
		new Traverse(root);
		return values;
	}
}

package datastructures.stacks;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stacked = new Stack();
		
		stacked.getHeight();
		stacked.getTop();
		
		stacked.printStack();  //LIFO
		System.out.println("\n");
		
		stacked.push(4);
		stacked.getHeight();
		stacked.getTop();
		
		stacked.printStack();  //LIFO
		System.out.println("\n");
		
		stacked.push(5);
		stacked.printStack();  //Last In First Out
		stacked.getHeight();
		stacked.getTop();
		System.out.println("\n");

		
		stacked.push(6);
		stacked.printStack();
		stacked.getHeight();
		stacked.getTop();
		System.out.println("\n");
		
		System.out.println("Se borró " + stacked.pop().value);
		stacked.printStack();
		System.out.println("\n");
		
		System.out.println("Se borró " + stacked.pop().value);
		stacked.printStack();
		System.out.println("\n");
		
		System.out.println("Se borró " + stacked.pop().value);
		stacked.printStack();
		System.out.println("\n");
		
		System.out.println(stacked.pop());
		stacked.getTop();
		stacked.getHeight();


	}

}

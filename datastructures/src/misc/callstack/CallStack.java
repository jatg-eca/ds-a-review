package misc.callstack;

public class CallStack {
	
	
	
	public static void methodThree() {
		System.out.println("Three");
	}
	
	public static void methodTwo() {
		methodThree(); //...which pushes another method
		System.out.println("Two");
	}
	
	public static void methodOne() {
		methodTwo(); //This method stacks another method
		System.out.println("One");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Stacks!");
		methodOne();

	}

}

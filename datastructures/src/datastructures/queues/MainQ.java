package datastructures.queues;

public class MainQ {
	
	public static void main(String[] arrElPirata) {
		//System.out.println("ok");
		Queue myFifas = new Queue(6);
		myFifas.printQueue();
		myFifas.getFirst();
		myFifas.getLast();
		myFifas.getLength();
		
		System.out.println("\n");
		myFifas.enqueue(3);
		myFifas.getLength();
		myFifas.printQueue();
		
		System.out.println("\n");
		myFifas.enqueue(33);
		myFifas.getLength();
		myFifas.printQueue();
		
		myFifas.getFirst();
		myFifas.getLast();
	
	
	}

}

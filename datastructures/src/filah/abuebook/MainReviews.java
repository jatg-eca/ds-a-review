package filah.abuebook;

public class MainReviews {
	
	public static void main(String[] arr) {
		
		//IF then ELSE
		int testScore = 76;
		char grade = '0';
		
		if (testScore > 90) {
			grade = 'A';
		} else if (testScore >80){
			grade = 'B';
		} else if (testScore > 70) {
			grade = 'C';
		} else if (testScore > 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println(grade);
		
		//Month
		int month = 2;
		String monthDays;
		switch (month) {
			case 1, 3, 5, 7, 8 , 10, 12: 
				monthDays = "31";
				break;
			case 4, 6, 9, 11:
				monthDays = "30";
				break;
			case 2:
				monthDays = "29 or 28";
				break;
			default:
				monthDays = "Invalid month";
		}
		System.out.println("Días del mes elegido : " + monthDays);
		
		
//		String monthName = null; //NullPointerException
		String monthName = null;
		
		if (monthName == null) {
			monthName = "nullMonth";
		}
		boolean isOdd = false;
		boolean isPair = false;
		switch (monthName.toLowerCase()) {
			case "january", "march", "may", "july", "september", "november":
				isOdd = true;
				break;
			case "february", "april", "june", "august", "october", "december":
				isPair = true;
				break;
			default:
				System.out.println("Invalid month name");
		}
		String monthStatement = isOdd ? " is odd " : " was an invalid month ";
		monthStatement = isPair ? " is pair " : " was an invalid month ";
		Catch:
		System.out.println("The month " + monthName + " " + monthStatement);
		
		//dowhile
		int counter = 0;
		while(counter <0) {
			System.out.println(counter);
			counter ++;
		}
		System.out.println("While counter " + counter);
		int counterDo = 0;
		do {
			System.out.println("muaja " + counterDo);
			counterDo++;
		} while (counterDo < 0);
		System.out.println("Do-while counter " + counterDo);

		//For infinite loop
//		for(String abue = "abue"; true; ) {
//			System.out.println("hola " + counterDo++);
//		}
		String stringAcabado = "nuevaAcounter: Acounter: Acounter: Acounter: Acounter: ";
		
//		for(String nueva = "nueva"; nueva.equals(stringAcabado); ){//counterDo <= 10; counterDo++) {
//			System.out.println(nueva);
//			nueva = nueva + "A" + "counter: ";
//		}
//		
		int [] arrayNumbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		for(int number : arrayNumbers) {
			System.out.println(number);
		}
		
		int [] arrayNumTwo = {123, 1240, 44, 32, 99, 156, 48};
		for(int number : arrayNumTwo) {
			if(number == 1000) {
				System.out.println("Se encontró numero " + number);
				break;
			}
		}
		
		int [] [] arrayOfInts = 
			{{1, 33, 44, 36}, {2, 34, 45, 37}, {3, 35, 46, 38}};
		int searchFor = 45;
		plan:
		for(int[] array : arrayOfInts) {
//			System.out.println(java.util.Arrays.toString(array));
			System.out.println("sigue");
			for(int number : array) {
				System.out.println(number);
				if(number == searchFor) break plan;
			}
		}
		System.out.println("Ya se acabó el número");
		
		String searchMe = "peter piper picked a " + "peck of pickled peppers";
		int max = searchMe.length();
		int numOfPs = 0;
		
		for(int i = 0; i<max; i++) {
			if(searchMe.charAt(i) != 'p') {
				
				continue;
			}
			numOfPs ++;
		}
		System.out.println("Numero: " + numOfPs);
		
		String searchMeNow = "Look for a substring in me";
        String substring = "sub";
        boolean foundIt = false;
        int maxO = searchMeNow.length() - substring.length();
        test:
        for(int i = 0; i <= maxO; i++) {
        	int n = substring.length();
        	int j = i;
        	int k = 0;
        	
        	while(n-- != 0) {
        		if(searchMeNow.charAt(j++) == substring.charAt(k++)) {
        			continue test;
        		}
        	}
        	foundIt = true;
        	break test;
        	
        }
        
        System.out.println(foundIt ? "Found it" : "No found");
        
        //reviews
//        int aNumber = 3;
//        if(aNumber == 0)
//        	System.out.println("First string");
//        else System.out.println("second string");
//        System.out.println("third string");
//        int aNumber = 3;
//        if(aNumber == 0)
//        	System.out.println("First string");
//        else
//        	System.out.println("second string");
//        
//        System.out.println("third string");
        int aNumber = 3;

        if(aNumber == 0) {
        	System.out.println("First string");
        }
        else {
        	System.out.println("second string");
        }
        System.out.println("third string");
	
		
	}
}

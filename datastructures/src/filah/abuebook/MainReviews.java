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
		for(String abue = "abue"; true; ) {
			
		}
	}
	

}

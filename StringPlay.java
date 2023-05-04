import java.util.*;
public class StringPlay {

	static final int DAYS= 8;
	static final int DAYS_IN_APRIL=30;
	
	////////////////////////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String [] daysOfWeek = new String [] {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		String choice = "";
		
		do {
		
		//examples of string manipulation
		System.out.print("Enter some data, a word, sentence or etc: ");
		String someString = keyboard.nextLine();
		
		System.out.print("Show character at givem index: ");
		int index = keyboard.nextInt();
		
		System.out.println("someString="+ someString);
		System.out.println("           "+"0123456789012345678901234567890123456789");
		System.out.println("The letter at index "+ index+ " is: "+ someString.charAt(index));
		
		OurTools.printStrReverse(someString);
		System.out.println("\n '"+someString+ " has "+OurTools.vowelCount(someString)+ " vowels in it.");
		
		System.out.println("Enter letter of interest (A-Z): ");
		char searchChar = keyboard.next().toUpperCase().charAt(0);
		
		System.out.println(someString+": has "+OurTools.charCount(someString, searchChar)+ " instances of "+searchChar);
		
		System.out.print("Run again (yes/no)? ");
		choice = keyboard.next();
		
		//clear keyboard buffer
		keyboard.nextLine();
		
		}while (choice.equalsIgnoreCase("yes"));
		
		keyboard.close();
	}//end of main

}//end of class

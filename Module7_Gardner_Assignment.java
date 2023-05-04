
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of the code that declares the class as well as the import for the scanner as well as the meth for the BigInteger class

import java.util.*;
import java.math.*;

public class Module7_Gardner_Assignment {

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
//This is the portion of the code that prints out the instructions to the user and print the reults to what the user is looking for by using the scanner to hold inputs
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("\nWelcome to the Fbonacci Number Calculator and Locator\n");
	
		System.out.print("For your search today, will you be searching for a fibonacci number higher than the 47th number in the sequence ((1) For Yes / (2) For No): ");
	
		int UserChoice = keyboard.nextInt();
	
		if (UserChoice == 1 ) {
		
			System.out.print("\n\nPlease enter what index you are looking for within the fibonacci number sequence: ");

				int UserEnteredNumber = keyboard.nextInt();

			System.out.println("\nThe fibanocci number corresponding to the number the user entered which was " + (UserEnteredNumber) + " is: " + 
	
				FibonacciCalculation2(UserEnteredNumber));
		
		}//end of if
	
		else if (UserChoice == 2) {

			System.out.print("\n\nPlease enter what index you are looking for within the fibonacci number sequence: ");

				int UserEnteredNumber = keyboard.nextInt();

			System.out.println("\nThe fibanocci number corresponding to the number the user entered which was " + (UserEnteredNumber) + " is: " + 
	
				FibonacciCalculation1(UserEnteredNumber));
	
		}//end of else if
	
		else {
		
			System.out.println("\n\nERROR! PLEASE RESTART THE PROGRAM AND TRY ENTERING A VALID NUMBER FOR THE QUESTION");
		
		}//end of else

	}//end of the method main
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of the code used to calculate any number in the fibonacci sequence lower than the 47th numbwer
	
	public static int FibonacciCalculation1 (int CountingVariable1) {
		 
		 if(CountingVariable1 == 0)

			 return 0;

		 else if(CountingVariable1 == 1)

			 return 1;

		 else

			 return FibonacciCalculation1(CountingVariable1 - 1) + FibonacciCalculation1(CountingVariable1 - 2);
		 
	}//end of the method FibonachiCalculation1

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of the code used to calculate numbers higher than 47 in the fibonacci sequence since after 47 when using int overflow occurs

	public static BigInteger FibonacciCalculation2 (int CountingVariable2) {
		   
		   BigInteger FirstValue = BigInteger.valueOf(0);
		   
		   BigInteger SecondValue = BigInteger.valueOf(1);
		   
		   BigInteger ThirdValue = BigInteger.valueOf(1);
		   
		   for (int Counting = 2 ; Counting <= CountingVariable2; Counting++) {
			   
			   	ThirdValue =  FirstValue.add(SecondValue);
	            
	            FirstValue = SecondValue;
	            
	            SecondValue = ThirdValue;
	            
	        }//end of for loop
	  
	        return SecondValue;

	}//end of the method FibonachiCalculation2
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}//end of class Module7_Gardner_Assignment










import java.util.*;
public class BinaryConversions {

	public static void main(String[] args) {

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
//Portion of the code that declares a scanner that allows for the user to input data in the program
		
		Scanner keyboard = new Scanner(System.in);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
//Portion of the code that declares the variables of the program
		
		int DecimalNumber;
		int CountingNumber = 0;
		int CountingNumberTwo = 0;
		int BinaryNumber[] = new int[100];
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Portion of code used to prompt the user for a positive decimal value that they would like to convert to binary
		
		do {
		
		System.out.println("\nWelcome to this new binary conversion calculator\n\n");
		
		System.out.print("Please input the number that is positive that you wish to be comnverted into binary: ");
		DecimalNumber = keyboard.nextInt();
		
		if (DecimalNumber < 0) {
			
			System.out.println("\nINVALID INPUT DUE TO A NEGATIVE NUMBER PLEASE IMPUT A POSITIVE INTEGER!\n");
			
		}//end of if statement
		
		}while (DecimalNumber < 0);	//end of while loop
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
//Portion of the code for the function to perform the calculation for the binary number
		
		while (DecimalNumber > 0) {
			
			BinaryNumber[CountingNumber] = DecimalNumber % 2;
			DecimalNumber = DecimalNumber / 2;	
			CountingNumber++;
		
			
		}	//end of while loop 
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
//Portion of the code for the system to print the output of the binary number for the user
		
		System.out.print("\nThe binary representation of this number is: ");
		for (CountingNumberTwo= CountingNumber - 1; CountingNumberTwo >= 0; CountingNumberTwo--) {
			
			if (CountingNumberTwo %4 == 0) {
				
				System.out.print(" ");
				
			}	//end of if loop
			
			
			System.out.print(" " + BinaryNumber[CountingNumberTwo]);
			
		}	//end of for loop
		
		
	}	//end of method

}	//end of program

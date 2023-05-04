///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	//Here this is where the main class is declared as well as the stack is created for it to be used

import java.util.Stack;

public class Module3_Gardner_Assignment1 {

	public static void main(String[] args) {
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
	//Portion of the code used to send a message to the user welcoming the user and prompting the user to be patient since it may take time	
		
	System.out.println("\nWelcome to the calculation of the first 50 fibonacci numbers in decnding order");
		
	System.out.println("\n\nThe stack may take a few minutes to load please be patient as the computer computes the fibonacci stack\n\n");
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//Portion of the code used to print out each number of the fibonacci sequence in descending order
	
	Stack <Long> CountingNumber = new Stack<>();
	
    for (int i = 0; i <= 50; i++) {
    	
    	CountingNumber.push(FibonacciNumbers.Fibonacci(i));
            
    }//end of for statement
    
    while(!CountingNumber.isEmpty()) {
    	
        System.out.println(CountingNumber.pop());
        
    }//end of while statement
		
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
	}//end of the method Main
	
}//end of the class Module3_Gardner_Assignment1

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	//Portion of the code used to create a seperate class for the fibonacci numbers to be calculated and created to make sure they are correct

class FibonacciNumbers {
	
	public static long Fibonacci(int CountingVariable) {
		
	long Results;
		
	if (CountingVariable < 2) {
		
		Results = CountingVariable;
		
		return Results;
	}//end of if statement

	else {
		
		Results = Fibonacci(CountingVariable - 1) + Fibonacci(CountingVariable -2);
	}//end of else statement
	
	return Results;
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	}//end of method Fibonacci
		
}//end of class FibonacciNumbers
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

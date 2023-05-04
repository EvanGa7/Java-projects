///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Thsis is the protion of the code that declares the class and creates the stack that can be imported while also declaring the counting variable

import java.util.Stack;

public class Module8_Gardner_Assignment {
	
	static int CountingVariable = 0;
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of the code that is the NON RECURSIVE PROGRAM within this method holding the calculations for that and it also prints the recursive method
	
	public static void main(String[] args) {
	
		Stack<Long> NonRecursiveStack = new Stack<Long>();
			long Variable1 = 1, Variable2 = 1, TemporaryVariable;

		  NonRecursiveStack.push(Variable1);
		  NonRecursiveStack.push(Variable2);
		  
		  //Counting the above two push statements within the program
		  CountingVariable += 2;

		  //This is the number of fibonnacci numbers that will be printed
		  int n = 5;
		  
		  for(int i = 2; i < n; i++) {
			  
			  TemporaryVariable = Variable1;
			  Variable1 = Variable2;
			  Variable2 += TemporaryVariable;
			  NonRecursiveStack.push(Variable2);
		   
			  //This is to coumt the four statements within the loop's body so that it can count the lines
			  CountingVariable += 4;
		   
		  }//end of for loop

		  //Display the number of fibonnacci numbers that is shown as n
		  System.out.println("Fibonacci Numbers For Non Recursive Program:");
		  
		  while(!NonRecursiveStack.isEmpty()) {
			  
			  System.out.println(NonRecursiveStack.pop() + " ");
		   
		  }//end of while loop
		  
		  //Display the number of lines of codes that is being executed
		  System.out.println("\nNumber of lines of code executed within tne program: " + CountingVariable);
		  
		  //This is to print out the recursive part of the program
		  RecursiveFibonacciSequence(args);

	}//end of the method main
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
//This is the protion of the code that is the RECURSIVE PROGRAM that takes the calculation for the recursive program
	
	public static void RecursiveFibonacciSequence(String[] args) {

		Stack<Long> RecursiveStack = new Stack<Long>();
		
		//This is the number of fibonnacci numbers being printed out
		int n = 5;
  
		for(int i = 1; i <= n; i++) {   
  
			RecursiveStack.push(FibonacciCalculation(i));
   
			//This is to count the push statement above within the loop
			CountingVariable++;
			
		}//end of for loop
  
		//Display the number of fibonnacci numbers that is shown as n
		System.out.println("\n\nFibonacci Numbers For Recursive Program:");
		
		while(!RecursiveStack.isEmpty()) {
			
			System.out.println(RecursiveStack.pop() + " ");
			
		}//end of while loop
  
		//Display the number of lines of codes that is being executed
		System.out.println("\nNumber of lines of code executed within the program: " + CountingVariable);
		
	}//end of the method ReccursiveFibonacciSequence
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
//This is the portion of the fibonacci calculation for the recursive program that works to calculate each number up to the 47th number 

	public static long FibonacciCalculation(int InputNumber) {
		
		CountingVariable += 2;
		
     if(InputNumber <= 1)
    	 
    	 return InputNumber;
     
     else
    	 
    	 return FibonacciCalculation(InputNumber - 1) + FibonacciCalculation(InputNumber - 2);
     
	}//end of the method FibonacciCalculation
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of the code that declares the end of the program and the class
	
}//end of class Module8_Gardner_Assignment 

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////








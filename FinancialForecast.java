import java.util.*;
public class FinancialForecast {
	
	public static void main(String[] args) {
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Place where the keyboard as well as the variables are initialized
		
		Scanner keyboard = new Scanner(System.in);
		
		//variables for the user to input their values and name
		String fullName;
		double deposit;
		double marketRate;
		double allowance;
		
		//variables for the first loop to get to one trillion dollars
		double deposit1;
		double depositRate1;
		int years=0;
		
		//Variables for second loop with allowance
		double deposit2;
		double depositRate2;
		int years1=0;
		
		//variables for the third loop with the divorce
		double deposit3;
		double depositRate3;
		int years2=0;
		int divorceYear;
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Place for user to enter their full name and a loop if their full name is not entered
do {
		System.out.print("Please enter the name:");
		fullName = keyboard.nextLine();
			    
            if (!fullName.contains(" ")) {
            	System.out.println ("Error: You must enter a first and last name.");
            }//end of if
            
}while (!fullName.contains(" "));
            
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Place for user to enter the initial amount that they are depositing and a loop if they don't enter a number over 0

do {
	
        System.out.print("Please enter the initial amount to be deposited:"); 
        deposit = keyboard.nextDouble();
        	
        	if (deposit <= 0) {
        		System.out.print("Error: You must enter a deposit amount > 0\n");
			}//end of if
        	
} while (deposit <= 0);
        	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Place for user to enter the money market interest rate and a loop if they don't input a number within the range

do {
        System.out.print("Please enter the money market interest rate:");
        marketRate = keyboard.nextDouble();
        
        	if ((marketRate < 0) || (marketRate > 30)) {
        		System.out.print("Error: You must enter an interest Rate in the 0 - 30% range\n");
        	}//end of if
        	
} while ((marketRate < 0) || (marketRate > 30));
        
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Place for user to enter their yearly allowance and a loop if the user enters a number less then 50000

do {
        System.out.print("Please enter the yearly allowance for this person:");
        allowance = keyboard.nextDouble();
        
        	if (allowance < 50000) {
        		System.out.print("Error: You must enter a number >= $50000 for the allowance");
        	}//end of if
        	
} while (allowance < 50000);
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Place where the first calculation to get to one trillion dollars takes place using a loop

System.out.print("\nOne Trillion Dollars\n");
		
		marketRate = marketRate / 100;
		deposit1 = deposit;
		
do {
	
			depositRate1 = marketRate * deposit1;
			deposit1 = deposit1 + depositRate1;
		    years++; 
		    
		    System.out.print("\nYear: "+ years +" Amount: "+ deposit1);
		    
}while (deposit1 < 1000000000000L);
	    
System.out.print("\n\nIt took "+ years +" years to reach the goal!");


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Place where the second calculation to get to one trillion dollars takes place with a yearly allowance using a loop

System.out.print("\n\n\nOne Trillion Dollars With An Allowance\n");

			deposit2 = deposit;
			
do {
	
			depositRate2 = marketRate * deposit2;
			deposit2 = deposit2 + depositRate2;
			deposit2 = deposit2 - allowance;
			years1++; 
			
			System.out.print("\nYear: "+ years1 +" Amount: "+ deposit2);

}while (deposit2 < 1000000000000L);

System.out.print("\n\nIt took "+ years1 +" years to reach the goal with a yearly allowance of $"+allowance);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Place where the third calculation to get to one trillion dollars takes place with the divorce by using a if statement within a loop

System.out.print("\n\n\nOne Trillion Dollars With A Divorce\n");

			deposit3 = deposit;
			divorceYear= years/ 2;
			
do {			
			if (years2 == divorceYear) {
		
			deposit3 = deposit3 / 2;
			System.out.print("\n** Divorce Year: "+ years2 +" ***: New Amount = $" + deposit3);
		
			depositRate3 = marketRate * deposit3;
			deposit3 = deposit3 + depositRate3;
			deposit3 = deposit3 - allowance;
			years2++;
		
			System.out.print("\nYear: "+ years2 +" Amount: "+ deposit3);
		
	}//end of if
	
			else {
				
				years2++; 
				depositRate3 = marketRate * deposit3;
				deposit3 = deposit3 + depositRate3;
				deposit3 = deposit3 - allowance;
				
				System.out.print("\nYear: "+ years2 +" Amount: "+ deposit3);
				
	}//end of else

}while (deposit3 < 1000000000000L);

System.out.print("\n\nIt took "+ years2 +" years to reach the goal with the divorce");

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Place where the keyboard buffer is cleared for the name
		
		keyboard.nextLine();

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
	}//end of main

}//end of class

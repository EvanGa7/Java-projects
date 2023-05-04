import java.util.*;
public class Vending {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		final int MM_PRICE = 85;
		final int SK_PRICE = 95;
		final int GUM_PRICE = 65;
		
		//present menu
		
		System.out.println("1. M & Ms - " + MM_PRICE + " cents");
		System.out.println("2. Skittles - " + SK_PRICE + " cents");
		System.out.println("3. Gum - " + GUM_PRICE + " cents");
		int deposit;
		int credit = 0;
		int change = 0;
		
		//ask for money
		
	do {
		System.out.println("\nPlease Deposit Coins (credit "+credit+" cents) : ");
		deposit = keyboard.nextInt();
		
		//handle if pennies have been deposited
	
		int pennies = deposit % 5;
		
		if (pennies > 0) {
		System.out.println("THIS MACHINE DOES NOT ACCEPT PENNIES! YOU PENNY PINCHER!");
		System.out.println("Returning " + pennies + " pennies");
		deposit -= pennies; //deduct pennies from credit
		}
		
		credit += deposit; //add deposit to credit
		
	} while (deposit > 0);

	//allow user to choose
	
	System.out.println("\nSelection {1, 2, or 3):");
	int choice = keyboard.nextInt();
	
	if (choice == 1 ) {
		
		if (credit >= MM_PRICE) {
		
			if (credit == MM_PRICE) {
		System.out.println ("Thank You! Please take your item!");
			}
			
			
			else {
				change = credit - MM_PRICE;
				System.out.println ("Thank You! Please take your item and change!");
				
			}
			
			
		}
		else {
		System.out.println ("Please deposit "+(MM_PRICE-credit)+" cents more");
		}
	}
	
	else if (choice == 2 ) {
		
		if (credit >= SK_PRICE) {
		
			if (credit == SK_PRICE) {
		System.out.println ("Thank You! Please take your item!");
			}
			
			
			else {
				change = credit - SK_PRICE;
				System.out.println ("Thank You! Please take your item and change!");
				
			}
			
			
		}
		else {
		System.out.println ("Please deposit "+(SK_PRICE-credit)+" cents more");
		}
	}
	else if (choice == 3 ) {
		
		if (credit >= GUM_PRICE) {
		
			if (credit == GUM_PRICE) {
		System.out.println ("Thank You! Please take your item!");
			}
			
			
			else {
				change = credit - GUM_PRICE;
				System.out.println ("Thank You! Please take your item and change!");
				
			}
			
			
		}
		else {
		System.out.println ("Please deposit "+(GUM_PRICE-credit)+" cents more");
		}
	}
	else {
		System.out.println("\nInvalid choice! Choose 1, 2, or 3");
	}
	
	if (change > 0) {
		int quarters = change / 25;
		int leftover = change % 25;
		
		int dimes = leftover / 10;
		leftover = leftover % 10;
		
		int nickels = leftover / 5;
		leftover = leftover % 5;
		
		System.out.println("\nChange due: "+quarters+" Quarters "+dimes+" Dimes "+nickels+" Nickels ");
	}
	
	}

}

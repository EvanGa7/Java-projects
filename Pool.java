import java.util.*;
public class Pool {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		final double CUBIC_WATER = 7.48;
		final int DAYS_MONTHLY = 30;
		double costG1 = 0.01;
		
		//Space for user to enter their name-marked as a string
		
		System.out.print("Please enter your name: ");
		String userName = keyboard.next();

		//Space for user to enter the pool diameter-marked as a integer
		
		System.out.print("Please enter the pool diameter in feet: ");
		int poolD = keyboard.nextInt();
		
		//Space for user to enter the pool height-marked as a double
		
		System.out.print("Please enter the pool height in feet: ");
		double poolH = keyboard.nextDouble();

		//Space for user to enter the cost per gallon of water in cents and pennies-marked as a double
		
		System.out.print("Please enter the cost of a gallon of water in cents/pennies: ");
		double costG = keyboard.nextDouble();

		//Space for user to enter the rate that the pool is leaking in gallons per day-marked as a double
		
		System.out.print("Please enter the rate that the pool is leaking in gallons/day: ");
		double leakD = keyboard.nextDouble();
		
		//Reading the numbers typed in back to the user
		
		System.out.println("\nHello " + userName + ",\n");
		
		System.out.println("You entered the following data for your pool:"
				+ "\n Pool Diameter: " + poolD + "\n Pool Height: " + poolH
				+ "\n Gallon of water cost: $" + costG + "\n Leak rate in gallons/day: " + leakD);
		
		//Calculating the total gallons needed to fill the pool
		//needs to be fixed because it doesn't round correctly
		
		double gallonsN;
		int poolR = poolD/2;
		double volume = Math.PI * Math.pow(poolR, 2) * poolH;
		gallonsN = volume * CUBIC_WATER;
		gallonsN= Math.round(gallonsN);
		System.out.print("\nThe number of Gallons required to fill the pool is: " + gallonsN);
		
		//Calculating the total cost to fill the pool
		
		double totalC;
		totalC= gallonsN * costG;
		totalC = Math.round(totalC);
		System.out.print("\nThe Total Cost to fill the pool is: $" + totalC);
		
		//Note explaining that their pool is leaking and how much it will cost monthly
		
		double leakD2;
		leakD2 = DAYS_MONTHLY * costG * leakD;
		System.out.printf("\nNote: Your pool may be leaking so this will cost you $%.2f" , leakD2);
		System.out.print(" per month");
		
		
		/* Algorithm and Analysis
		  
		  Prompt: create a program that determines: the number of gallons needed to fill a pool, the total cost to fill the pool,
		  and how much it will cost for the leak in the pool
		  
		  Questions to answer:
		  		
	 	How many gallons of water will it take to fill the pool?
		How much will this cost?
		Even though the politician repaired the leak, there's still a bit of leaking going on. The politician ended up dropping a wrench while working on the pool and created a new leak that they do not know about yet. So enter in a leak rate of gallons/day to see how often he has to fill his pool.
			(The politician will be in denial about a pool leak and probably enter 0 and say - "My pool doesn't leak, I just fixed that".  But soon, they'll realize that there's a leak and have to deal with it and run this program again.)
		Also figure out his monthly bill for the leak.
		  
		  
		  Step 1: Begin to PANIC!!!!!!!
		  
		  Step 2: declare the amount for a gallon of water as 7.48 which would be a final double value
		  final double CUBIC_WATER = 7.48;
		  
		  Step 3: declare the amount of days in a month as 30 which would be a final integer value
		  final int DAYS_MONTHLY = 30;
		  
		  Step 4: declare the amount for one gallon of water in NJ but not as a constant
		  double costG1 = 0.01;
		  
		  Step 5: create a scanner to allow the user to input values into program
		  Scanner keyboard = new Scanner(System.in);
		  
	Area to enter user's information for the program:
		  
		  Step 6: prompt the user to enter their name into the program "Please enter your name: "
		  
		  Step 7: create a area for the computer to read and remember the user's name
		  String userName = keyboard.next();
		  
		  Step 8: prompt the user to enter their pool's diameter into the program "Please enter the pool diameter in feet: "
		  
		  Step 9: create a area for the computer to read and remember the pool's diameter in feet
		  int poolD = keyboard.nextInt();
		  
		   Step 10: prompt the user to enter their pool's height into the program "Please enter the pool height in feet: "
		  
		  Step 11: create a area for the computer to read and remember the pool's height in feet
		  double poolH = keyboard.nextDouble();
		  
		  Step 12: prompt the user to enter their cost for a gallon of water where they live into the program "Please enter the rate that the pool is leaking in gallons/day: "
		  
		  Step 13: create a area for the computer to read and remember the cost for a gallon of water where they live
		  double costG = keyboard.nextDouble();
		  
		  Step 14: prompt the user to enter how much their pool is leaking per day into the program "Please enter the rate that the pool is leaking in gallons/day: "
		  
		  Step 15: create a area for the computer to read and remember the amount the pool is leaking per day in gallons
		  double leakD = keyboard.nextDouble();
		  
Where the user's information is repeated back to the user:
		  
		  Step 16: Respond back to the user by saying hello and their name and then repeat the information they have given to the computer
		  
	Finding the total amount of water needed to fill the pool:
		  
		  Step 17: create a value to hold the total amount of water needed to fill the pool declared as a double
		  double gallonsN;
		  
		  Step 18: create a value that holds pools radius by making it equal to the pool's diameter and dividing it by two making it declared as a integer
		  int poolR = poolD/2;
		  
		  Step 19: find the volume of the pool by plugging it into the cylinder formula and making it equal to a double value named volume
		  double volume = Math.PI * Math.pow(poolR, 2) * poolH;
		  
		  Step 20: find the amount of gallons needed by multiplying the volume and the amount of water in a gallon which is 7.48 declared at the beginning
		  gallonsN = volume * CUBIC_WATER;
		  
		  Step 21: find out the amount of that value rounded up 
		  gallonsN= Math.round(gallonsN);
		  
		  Step 22: Read back to the user by telling them how many gallons it would take to fill the pool "The number of Gallons required to fill the pool is: "
		 
	Finding how much it would cost to fill up the pool:
		 
		  Step 23: create a value for the total cost to fill up the pool declaring it a double
		  double totalC;
		  
		  Step 24: multiply the amount of water needed to fill the pool by the cost of water where you live and make it equal to the value for the cost to fill up the pool
		  totalC= gallonsN * costG;
		  
		  Step 25: round the number to the nearest whole number
		  totalC = Math.round(totalC);
		  
		  Step 26: respond to the user by telling the cost to fill up the pool "The Total Cost to fill the pool is: $"
		  
	Finding out how much the leak in the pool will cost per month:
		  
		  Step 27: create a value for the total cost of the leak in the pool and declare it a double value
		  double leakD2;
		  
		  Step 28: set that value equal to the number of days per month multiplied by the amount the pool is leaking and also by the cost per gallon of water
		  leakD2 = DAYS_MONTHLY * costG * leakD;
		  
		  Step 29: respond back to the user by telling the cost that the leak will be per month "The Total Cost to fill the pool is: $"
		  
		 */
		

	}

}

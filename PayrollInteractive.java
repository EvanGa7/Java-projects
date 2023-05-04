import java.util.*;
import java.io.*;
public class PayrollInteractive {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		final int SIZE = 6;
		String choice = "";
		int index = 0;
		Paycheck [] company = new Paycheck [SIZE];
		
		/*
		company[0] = new Paycheck("John Doe", 40, 10, 1 );
		company[1] = new Paycheck("Jane Doe", 145, 67, 2);
		company[2] = new Paycheck("Mary Doe", 55, 25, 0);
		*/
		
		
		Scanner fileToRead = null;
		
		String fileName= "workers.txt";
		
		try {
			fileToRead = new Scanner (new File (fileName));
		}
		catch (FileNotFoundException e) {
			System.out.println("CAN'T FIND FILE!");
			System.exit(0);
		}
		
		do {	
			
			
			String empName = fileToRead.nextLine();  //"String" means a variable that
												//can hold a word or group of characters
			double hoursWorked = fileToRead.nextDouble();
			
			double regularRate = fileToRead.nextDouble();
			
			int dependents = fileToRead.nextInt();
			
			//create a paycheck object
			company[index] = new Paycheck(empName, hoursWorked, regularRate, dependents);
			
			choice  = fileToRead.next();
			
			fileToRead.nextLine();
			
			index++;
			
			if (index>=SIZE)
				System.out.println("System can currently only handle "+SIZE+" employees!");
			
			
	   } while (choice.equalsIgnoreCase("yes") && (index<SIZE) && (fileToRead.hasNext())); 
			
	 		fileToRead.close();
		
	 		double totalPay = 0;
		
		for (int i = 0; i<company.length; i++) {
		System.out.print("\nEmployee's "+ (i+1) +" info: \n\n");
		company[i].processALL();
		totalPay += company[i].getGross();
		}//end of for
		
		System.out.print("\nThe total pay for the whole company is $" + totalPay);
		
	}//end of main

}//end of class

import java.util.*;
public class Payroll {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		final double REGULAR_HOURS = 40; //"final" mean it can't be changed
		String choice;
		
	do {
		System.out.print("Enter the employee's name: ");
		String empName = keyboard.next();
		
		System.out.print("How many hours did the employee work?");
		double hoursWorked = keyboard.nextDouble();
		
		System.out.print("What's the employee's pay rate?");
		double regularRate = keyboard.nextDouble();
		
		double gross=0;
		
		//Calculate gross
		
		if (hoursWorked <= REGULAR_HOURS) {
			gross = hoursWorked * regularRate;
		}
		else {
			double otHours = hoursWorked - REGULAR_HOURS;
			double otRate = regularRate + (regularRate/2);
			double regularPay = regularRate * REGULAR_HOURS;
			double otPay = otHours * otRate;
			gross = regularPay + otPay;
		}
		
		System.out.println("Pay to the order of " + empName + "Gross pay = $"+gross);
		System.out.print("Anymore employees to process (yers/no)? ");
		choice = keyboard.next();
		
	} while (choice.equalsIgnoreCase("yes"));
	
	}

}

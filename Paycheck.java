import java.util.*;
public class Paycheck {
	
	//data members
	private String empName;
	private double hoursWorked;
	private double regularRate;
	private int dependents;
	private double gross=0;
	private double fTax=0;
	
	static Scanner keyboard = new Scanner(System.in);
	final static double REGULAR_HOURS = 40;
	final static double FED_TAX_RATE = 0.18;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public Paycheck () {
		
		empName = "NO-NAME-YET";
		//System.out.print("I'M INSIDE OF THE CONSTRUCTOR!");
		
	}//end of paycheck
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public Paycheck (String theName, double theHours, double theRate, int theDeps) {
		
	empName = theName;
	hoursWorked = theHours;
	regularRate = theRate;
	dependents = theDeps;
		//System.out.print("I'M INSIDE OF THE CONSTRUCTOR!");
		
	}//end of paycheck
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public void inputData () {
		
			System.out.print("\nEnter the employee's name:");
			empName = keyboard.nextLine();  //"String" means a variable that
												//can hold a word or group of characters
			
			System.out.print("How many hours did the employee work?");
			hoursWorked = keyboard.nextDouble();
			
			
			System.out.print("What's the employee's pay rate?");
			regularRate = keyboard.nextDouble();
			

			System.out.print("How many dependents does the employee have?");
			dependents = keyboard.nextInt();
		
			keyboard.nextLine();
	 }//end of input data
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public double calculateGross() {

		//Calculate gross
		double otHours=0;

		if (hoursWorked <= REGULAR_HOURS) {
			gross = hoursWorked * regularRate;
		}//end of if
		else {
			otHours = hoursWorked - REGULAR_HOURS;
			double otRate  = regularRate + (regularRate/2.0);
			double regularPay = regularRate *  REGULAR_HOURS;
			double otPay = otHours * otRate;
			gross = regularPay + otPay;
		}//end of else

		return gross;

	}//end of calculate gross
//////////////////////////////////////////////////////////////////////////////
	public double fedTax() {
		
		
		
		if (dependents == 0) {
			fTax = gross * FED_TAX_RATE;
		}//end of if
		else if (dependents ==1) {
			fTax = gross * (FED_TAX_RATE*0.75);
		}//end of else if
		else if (dependents == 2) {
			fTax = gross * (FED_TAX_RATE*0.5);
		}//end of else if
		else if (dependents == 3) {
			fTax = gross * (FED_TAX_RATE*0.25);
		}//end of else if
		else {
			fTax = 0;
		}//end of else
		
		
		return fTax;
	}//end of fedTax
//////////////////////////////////////////////////////////////////////////////
	public void printCheck() {
		
		double netPay = gross - fTax;

		//System.out.println("Hours of over time worked: "+otHours);
		System.out.println("Gross Pay: $"+gross);
		System.out.println("Federal with holdings: $" + fTax);
		
		System.out.println("Pay to the order of "+  empName+" $"+netPay);
		
	}//end of printCheck
//////////////////////////////////////////////////////////////////////////////
	public void processALL () {
		
		calculateGross();
		fedTax();
		printCheck();
	
	}//end of process
//////////////////////////////////////////////////////////////////////////////
	//Setters------------------------------------------------------------------
	
	public void setEmpName (String newName) {
		
		empName = newName;

	}
/////////////////////////////////////////////////////////////////////////////
	public void setHousWorked (double newHours) {
		
		hoursWorked = newHours;

	}
/////////////////////////////////////////////////////////////////////////////
	public void setRegularRate (double newRate) {
	
		regularRate = newRate;

	}
/////////////////////////////////////////////////////////////////////////////
	public void setDependents(int newDependents) {
		
		dependents = newDependents;

	}//--------------------------------------------------------------------------
/////////////////////////////////////////////////////////////////////////////
	//Getters/Accessors--------------------------------------------------------------------

	public String getEmpName () {

		return empName;

	}
/////////////////////////////////////////////////////////////////////////////
	public double getHousWorked () {

		return hoursWorked;

	}
/////////////////////////////////////////////////////////////////////////////
	public double getRegularRate () {

		return regularRate;

	}
/////////////////////////////////////////////////////////////////////////////
	public int getDependents() {

		return dependents;

	}
/////////////////////////////////////////////////////////////////////////////
	public double getGross() {

		return gross;

	}//---------------------------------------------------------------------------
/////////////////////////////////////////////////////////////////////////////







}//end of class

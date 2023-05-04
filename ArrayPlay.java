import java.util.*;
public class ArrayPlay {

	static final int DAYS= 8;
	static final int DAYS_IN_APRIL=30;
	
	////////////////////////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String [] daysOfWeek = new String [] {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		
		double [] temp = new double [] {50, 75, 68, 65, 37.8, 77, 80};
		
		double [] tempWeek2= new double [] {60, 85, 78, 75, 47.8, 87, 90};
		
		double [] april = new double [30];
		
		
 /*Here to demonstrate prompting array values
		//prompt user to end days of the week
		
		System.out.println("Enter days of the week");
		
		for (int i=0; i<DAYS; ++i) {
			System.out.println("Enter name for day"+(i+1)+": ");
			daysOfWeek [i]=keyboard.next();
		}//end of for loop
*/
		
/*
		print7DayReverseForecast( daysOfWeek, temp);
		
		System.out.printf("\nThe average temperature will be: %.2f",averageTemp(temp));
		//printHighest( daysOfWeek, temp);
	*/
		/*
		System.out.println("\n\nWeek 2 Forecast\n");
		
		print7DayForecast( daysOfWeek, tempWeek2);
		printHighest( daysOfWeek, tempWeek2);
		
		System.out.print("\n\n\nEnter the day of interest: ");
		String dayToFind = keyboard.next();
		
		double tempFound = dayToTemp(daysOfWeek, temp, dayToFind);
		System.out.println("\nThe Tempurature on "+ dayToFind+" will be "+ tempFound);
		*/
		
		//examples of string manipulation
		
		String someString = "Roses are red, Violets are blue.";
		
		int index = 0;
		
		System.out.println("someString="+ someString);
		System.out.println("           "+"0123456789012345678901234567890123456789");
		System.out.println("The letter at index "+ index+ " is: "+ someString.charAt(index));
		
		printStrReverse(someString);
		System.out.println("\n '"+someString+ " has "+vowelCount(someString)+ " vowels in it.");
		
	}//end of main
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void print7DayForecast(String [] dayname, double [] dayTemps) {
		//print out days of the week
		
				System.out.println("7 Day Forecast\n");
				System.out.printf("%-15s %1s\n\n", "Day", "Temp");
				
				for (int i=0; i<dayname.length; ++i) {
					System.out.printf("%-15s %.1f\n", dayname[i], dayTemps[i]);
				}//end of for loop
	
	}//End of 7 Day Forecast
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void printHighest(String [] dayname, double [] dayTemps) {
		double highTemp = 0;
		String highDay = "Someday";
		
		
	for (int index=0; index<dayname.length; ++index) {
		
			if (dayTemps[index] > highTemp) {
			highTemp = dayTemps[index];
			highDay = dayname[index];
			
			}//End of If
			
	}//End of For
		
		System.out.print("\n"+highDay+" will be the hottest day in the forcast at "+highTemp+" degrees");
	
	
	}//End of Highest
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static double dayToTemp(String [] dayname, double[] temp, String targetDay) {
		
		double tempFound = -3;
		
		for (int index=0; index<dayname.length; ++index) {
			
			if(dayname[index] .equalsIgnoreCase(targetDay)) {
			System.out.println("\nDAY FOUND!");
			tempFound = temp[index];
			
			}//End of If
			
		}//end of For
		
		return tempFound;
		
	}//End of DayTemp
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void print7DayReverseForecast(String [] dayname, double [] dayTemps) {
		//print out days of the week
		
				System.out.println("7 Day Forecast In Reverse Order\n");
				System.out.printf("%-15s %1s\n\n", "Day", "Temp");
				
				for (int i=(dayname.length-1); i>=0; --i) {
					System.out.printf("%-15s %.1f\n", dayname[i], dayTemps[i]);
				}//end of for loop
	
	}//End of 7 Day Forecast Reverse
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static double averageTemp(double [] tempList) {
		double avg=0;
		double sum=0;
		
		for (int i=0; i<tempList.length; i++) {
			sum += tempList[i];
		}//end of for loop
		
		avg=sum/tempList.length;
		
		return avg;
	
	
	
	}//end of average Temperature
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void printStrReverse(String aString) {
		
		//print string backwards
		
				for (int i=aString.length()-1; i>0; i--)
				System.out.print(aString.charAt(i));
	
				
	}//end of print Reverse
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static int vowelCount(String aString) {
			
		int count =-6;
		
		//for (int i=aString.length()-1; i>0; i--)
			
			//if (aString.charAt(i);)
		
		return count;
	

}//end of print Reverse
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


}//end of class

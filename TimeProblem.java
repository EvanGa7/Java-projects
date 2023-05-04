import java.util.*;
public class TimeProblem {

	public static void main(String[] args) {
		final int SECONDS_IN_DAY = 86400;
		final int SECONDS_IN_HOUR = 3600;
		final int SECONDS_IN_MINUTE = 60;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter total seconds: ");
		int totalSeconds = keyboard.nextInt();
		
		int numOfDays = totalSeconds / SECONDS_IN_DAY;
		int secondsLeftOver = totalSeconds % SECONDS_IN_DAY;
		
		int hours = secondsLeftOver / SECONDS_IN_HOUR;
		int secondsLeftOver2 = secondsLeftOver % SECONDS_IN_HOUR;
		
		int minutes = secondsLeftOver2 / SECONDS_IN_MINUTE;
		int seconds = secondsLeftOver2 % SECONDS_IN_MINUTE;
		
		System.out.println("That would be "+numOfDays+" day "+
		hours+" hours "+minutes+" minutes and "+seconds+" seconds. ");
	}

}

import java.util.*;
public class SquareNum {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		 System.out.println("What number would you like to square?");
		 int numToSqr = keyboard.nextInt();
		 
		 int answer = numToSqr * numToSqr;
		
		System.out.println(numToSqr+"squared is "+answer);
	}

}

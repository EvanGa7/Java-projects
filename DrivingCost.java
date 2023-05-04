import java.util.*;
public class DrivingCost {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
			System.out.print("How many miles per gallon does your car get? ");
			double carMpg = keyboard.nextDouble();
			
			System.out.print("How many miles is your trip? ");
			double distance = keyboard.nextDouble();
			
			System.out.print("How many dollars is a gallon of gas? ");
			double gasPrice = keyboard.nextDouble();
			
			double cost = (distance/carMpg)*gasPrice;
			
				//System.out.println("The trip will cost $"+cost);
			
			System.out.printf("The trip will cost $%.2f",cost);
			
	}

}

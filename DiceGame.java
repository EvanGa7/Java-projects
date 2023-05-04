import java.util.*;
public class DiceGame {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int die1, die2, score;
		int highest=0, lowest=Integer.MAX_VALUE;
		double average;
		int totalScore = 0;
		
		int [] allCounts = new int[6];
		
		System.out.print("How many times would you like to roll?");
		int gameCount = keyboard.nextInt();
		
		int [] gameStats = new int[gameCount];
		
		for (int i=0; i < gameCount; i++) {
			System.out.println("\nYou rolled the following: ");
			die1 = rollDice();
			
			//count occurences for die1
			
			allCounts [die1-1]++; //increment the element at the index that is one less than the die outcome
			
			
			die2 = rollDice();
			
			//count occurences for die2
			
			allCounts [die2-1]++;
			
			
			score = die1 + die2;
			
			gameStats[i] = score;
			
			totalScore += score;
			
			System.out.println("Current score total = "+totalScore);
			
			if(score>highest) 
				highest = score;
			
			if(score<lowest)  
				lowest = score;
			
			System.out.println("Game "+(i+1)+": Die1 = "+die1+" Die2 = "+die2+" Score = "+score);
		}
		
		average = (double) totalScore / gameCount;
		
		System.out.println("\nYour highest score was: "+highest);
		System.out.println("\nYour lowest score was: "+lowest);
		System.out.println("\nYour average score was: "+average);
		
		System.out.println("\n\nDice Outcome Analysis\n");
		for(int index=0; index<6; ++index)
		drawLine(index+1,allCounts[index]);
		
		for (int count=0; count<gameCount; count++)
		System.out.println("The score for game " +(count+1) +" :"+gameStats[count]);
	}
////////////////////////////////////////////////////////////////////////////////////
	public static int rollDice() {
		Random generator = new Random();
		
		int outcome = generator.nextInt(6)+1;
		
		return outcome;
	}
////////////////////////////////////////////////////////////////////////////////////
	public static void drawLine(int diceface, int starcount) {
		System.out.print("\n"+diceface);
		
		
		for (int i=0; i < starcount; i++) {
			System.out.print("*");
		}
		
		System.out.print("(occurred "+starcount+" times)");
		
	
	
	}
/////////////////////////////////////////////////////////////////////////////////////
}

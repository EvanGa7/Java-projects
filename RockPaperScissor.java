import java.util.*;
public class RockPaperScissor {
	
       static Scanner keyboard = new Scanner(System.in);
       
	public static void main(String[] args) {
		
		welcome();
		
		System.out.print("\nHow many games would you like to play?");
		int gameCount = keyboard.nextInt();
		
		int humanWins = 0;
		int compWins = 0;		
		
		for (int i=1; i <= gameCount; i++) {
			
			System.out.println("\nGAME "+ i);
			
		String userPick = userPlayMenu();
		System.out.println("The user played: "+letterToWord(userPick));
		
		String compPick = computerPlay();
		System.out.println("The computer played: "+letterToWord(compPick));
		
		String winner = determineWinner (userPick, compPick);
		
		if (winner.equalsIgnoreCase("Human")) 
			humanWins++;
		
		if (winner.equalsIgnoreCase("Computer"))
			compWins++;
		
		
		if(!winner.equalsIgnoreCase("Tie")) 
			System.out.println("The winner is the "+winner);
		else 
			System.out.println("It's a tie!");
		
		}
		System.out.println("Human won "+humanWins+" times!");
		System.out.println("Computer won "+compWins+" times!");
	}
/******************************************************************************/
	public static void welcome() {
		System.out.println("WELCOME TO THE ROCK, PAPER, SCISSOR GAME!\n\n");
		System.out.println("GAME RULES:\n");
		System.out.println("A player who decides to play rock will beat another player "+
		                    "who has chosen scissors\n (\"rock crushes scissors\" or sometimes \"blunts scissors\"),");
		System.out.println("but will lose to one who has played paper (\"paper covers rock\"); a play of paper\n will lose to a play of scissors (\"scissors cuts paper\").");		
	}
/******************************************************************************/
 public static 	String userPlayMenu() {
	 
	 String choice = "";
	 boolean invalidEntry;
	 
	 do {
		 
	 
	 System.out.println("\nBust a move!!!\n");
	 System.out.println("(R)ock");
	 System.out.println("(P)aper");
	 System.out.println("(S)cissors\n");
     System.out.print("Choice (R,P,S):");
	 choice = keyboard.next();
	 
	 invalidEntry = !(choice.equalsIgnoreCase("R") || choice.equalsIgnoreCase("P") || choice.equalsIgnoreCase("S"));
	 
	 if (invalidEntry) {
		 System.out.println("INVALID CHOICE! PLEASE CHOOSE R, P, OR S");
	 }
	 
	 } while (invalidEntry);
	 
	 return choice;
 }
	
	
/******************************************************************************/
 public static 	String computerPlay() {
	 Random generator = new Random();
	 
	 int number = generator.nextInt(3)+1; //Random number from 1 to 3
	 String choice="";
	 
      switch(number) {
	      case 1: choice = "R";
	              break;
	      case 2: choice = "P";
	             break;
	      case 3: choice = "S";
	              break;
      }
	 
	 
	 return choice;
 }
 /******************************************************************************/ 
 public static String determineWinner(String user, String computer) {
	 String message="";
	 
	 //User plays Rock
	 if (user.equalsIgnoreCase("R") ) {
		 if (computer.equalsIgnoreCase("S")) 
			 message = "Human";
		 else if (computer.equalsIgnoreCase("P"))
			 message = "Computer";
		 else
			 message = "Tie";
	 }
	 
	 //User plays Paper
	 if (user.equalsIgnoreCase("P") ) {
		 if (computer.equalsIgnoreCase("R")) 
			 message = "Human";
		 else if (computer.equalsIgnoreCase("S"))
			 message = "Computer";
		 else
			 message = "Tie";
	 }
	 
	 //User plays Scissors
	 if (user.equalsIgnoreCase("S") ) {
		 if (computer.equalsIgnoreCase("P")) 
			 message = "Human";
		 else if (computer.equalsIgnoreCase("R"))
			 message = "Computer";
		 else
			 message = "Tie";
	 }
		 
		 
	 return message;
	 
 }
 /******************************************************************************/ 
 public static String letterToWord(String letter) {
	 String word = "";
	 
	 switch(letter.toUpperCase()) {
     case "R": word = "Rock";
             break;
     case "P": word = "Paper";
            break;
     case "S": word = "Scissors";
             break;
 }
	 
	 return word;
 }
 
 /******************************************************************************/ 
} // End of Class

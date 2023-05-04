
public class OurTools {
	final static double REGULAR_HOURS = 40;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void printStrReverse(String aString) {

		//print string backwards

		for (int i=aString.length()-1; i>=0; i--)
			System.out.print(aString.charAt(i));


	}//end of print Reverse
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static int vowelCount(String aString) {

		int count =0;
		String tempSTR = aString.toUpperCase();

		for (int i=aString.length()-1; i>=0; i--) {
			switch (tempSTR.charAt(i)) {
			case 'A':

			case 'E':

			case 'I':

			case 'O':

			case 'U': count++;
			break;
			}//End of switch

		}//End of for loop
		return count;


	}//end of vowel
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static int charCount (String str, char ch) {
		
		int count = 0;
		String tempSTR = str.toUpperCase();
		
		
		for (int i=tempSTR.length()-1; i>=0; i--) {
			
			if (tempSTR.charAt(i) == ch) {
				count++;
				
			}//end of if
			
		}//end of for
	
		return count;
		
	} //end of charCount
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	
	
	
}//end of class


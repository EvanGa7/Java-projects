import java.util.*;
public class BinaryConversionSIgnedAndUnsigned {

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
//Beginning of the first method which will be used for inputs and outputs
	
	public static void main(String[] args) {
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
//Portion of the code that declares a scanner that allows for the user to input data in the program

		Scanner keyboard = new Scanner(System.in);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Portion of the code for the variables to be declared in for this method which will be used for the input and output of the numbers
		
		 int UserChoiceToContinue;
		 
		 int DecimalValue;

         String BinaryValue;
         
         String SpaceValue = "4";
         
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Portion of the code used in a while loop in which the loop will continue and keep asking for numbers and converting them until it is terminated
//This segment prompts the user for the user to either pick whether they want to convert a number or end the program and stores the input
         
         while (true) {

             System.out.println("WELCOME TO THIS BINARY CONVERSION CALCULATOR \n\n"
             		+ "PLEASE ENTER 1 IF YOU WISH TO CONVERT A NUMBER TO BINARY"
             		+ "\nPLEASE ENTER ANY OTHER NUMBER TO END THE PROGRAM");

             UserChoiceToContinue = keyboard.nextInt();

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Portion of the code used to start the if statement whether the user chose to convert a number to binary and where it will be sent to the method to convert
             
             if (UserChoiceToContinue == 1) {

                   System.out.println("\nEnter decimal value that you wish to be converted to binary: ");

                   DecimalValue = keyboard.nextInt();

                   BinaryValue = DecimalToBinary(DecimalValue);
                   
                   BinaryValue = BinaryValue.replaceAll("(.{" + SpaceValue + "})", "$0 ").trim();

                   System.out.println("\nThe decimal value " + DecimalValue + " converted to binary is " + BinaryValue + "\n");

             }	//end of if
             
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Portion of the code if the user chose to end the program in which and thank you and goodbye message will appear      
             
             else {

                   System.out.println("\nTHANK YOU FOR CHOOSING THIS BINARY CONVERSION CALCULATOR \n	   HAVE A NICE REST OF YOUR DAY! :)");

                   break;

             }	//end of else
             
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

      }	//end of while
     
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
         
//Portion of the code used to close the keyboard since there is no more input needed and to stop the keyboard form continuing

      keyboard.close();
      
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	}//end of method
	
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
//Beginning of the second method for which this is the part where the conversion to binary will occur
	
	public static String DecimalToBinary(int DecimalValue) {
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Portion of the code used to declare the variables for the second method to convert the numbers to binary
		
           String BinaryValue = "";
           
           String NegativeBinaryValue = "";

           int RemainderValue;

           int SignedIntegerValue = 1;
           
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This if statement is used to make sure that the decimal being placed in is not negative and if it is then it will be used for the signed integer function
           
           if(DecimalValue<0) {	

        	   SignedIntegerValue = -1; 

               DecimalValue = -DecimalValue; 

           }	//end of if
           
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Portion of the code that creates the binary number from the decimal value
           
           for (int i = 0; i < 32; i++) {
        	   
        	  RemainderValue = DecimalValue % 2;

         	  DecimalValue = DecimalValue / 2;

         	  BinaryValue = RemainderValue + BinaryValue;
                  
           }	//end of for statement
           
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Portion of the code for signed integers to be converted into binary through the two's compliment method which inverts all the numbers after the first 1

           if(SignedIntegerValue == -1) {

                  for(int i=0;i<BinaryValue.length();i++) {

                        if(BinaryValue.charAt(i)=='0')	{

                        	NegativeBinaryValue = NegativeBinaryValue + '1';
                         
                        }	//end of if

                        else	{

                        	NegativeBinaryValue = NegativeBinaryValue + '0';
                               
                        }	//end of else

                  }		//end of for statement

                  RemainderValue = 1;

                  BinaryValue = "";

                  for(int i=NegativeBinaryValue.length()-1;i>=0;i--) {

                        if(RemainderValue == 1) {

                               if(NegativeBinaryValue.charAt(i)=='1') {

                            	   BinaryValue = '0' + BinaryValue;

                               }	//end of if

                               else {

                            	   BinaryValue = '1' + BinaryValue;

                            	   RemainderValue = 0;

                               }	//end of else

                        }	//end of if 

                        else {

                        	BinaryValue =NegativeBinaryValue.charAt(i) + BinaryValue;

                        }	//end of else

                  }		//end of for statement

           }	//end of if 

           return BinaryValue;

	}	//end of method
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}//end of class

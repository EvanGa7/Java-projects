import java.util.*;
public class Module2_Gardner_Assignment1 {

	public static void main(String[] args) {

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		//Portion of the code that declares the scanner for input if needed during the program as well as the Array that will be the matrix
	
		Scanner keyboard = new Scanner(System.in);
		
		int ArrayMatrix[][] = new int[4][4];
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		//Portion of the code that will count from 1 to 16 which will then be displayed using the next section of code
		
		int Counting = 1;
		
		for (int Counting1=0; Counting1<4; Counting1++){
			
	          for (int Counting2=0; Counting2<4; Counting2++) {
	        	  
	        	  ArrayMatrix [Counting1][Counting2]=Counting;
	        	  Counting++;
	                    
	          }//end of for loop
		
		}//end of for loop
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		//Portion of the code that list out the numbers in the matrix that were just counted in the 4 by 4 array
		
		System.out.println("Matrix: \n");

		for(int Counting3=0; Counting3<4; Counting3++) {

			for(int Counting4=0; Counting4<4; Counting4++) {

				System.out.print(ArrayMatrix[Counting3][Counting4]+ "\t");
		
			}//end of for loop

		System.out.println();

		}//end of for loop
		
		System.out.println("\n");
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		//Portion of the code used to calculate the total sum of all the elements in the array to be displayed to the user
		
		int TotalSumOfArray=0;

		for(int Counting5=0; Counting5<4; Counting5++) {

			for(int Counting6=0; Counting6<4; Counting6++) {

				TotalSumOfArray+= ArrayMatrix[Counting5][Counting6];
		
			}//end of for loop
		
		}//end of for loop

		System.out.println("Total sum of elemets: "+ TotalSumOfArray);
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		//portion of the code used to calculate the total sum of each row to be displayed to the user
		
		int SumOfEachRow[]=new int[4];

		for(int Counting7=0; Counting7<4; Counting7++) {

			for(int Counting8=0; Counting8<4; Counting8++) {

				SumOfEachRow[Counting7]+= ArrayMatrix[Counting7][Counting8];
		
			}//end of for loop
		
		}//end of for loop

		for(int Counting9=0; Counting9<4; Counting9++) {

			System.out.println("Sum Row "+ (Counting9+1)+ ": "+ SumOfEachRow[Counting9]);
		
		}//end of for loop
		
		System.out.print("\n");

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		//portion of the code used to calculate the total sum of each column to be displayed to the user
		
		int SumOfEachColumn[]=new int[4];

		for(int Counting10=0; Counting10<4; Counting10++) {

			for(int Counting11=0; Counting11<4; Counting11++) {

				SumOfEachColumn[Counting11]+= ArrayMatrix[Counting10][Counting11];
				
			}//end of for loop
			
		}//end of for loop

		for(int Counting12=0; Counting12<4; Counting12++) {

			System.out.println("Sum Coloumn "+ (Counting12+1)+ ": "+ SumOfEachColumn[Counting12]);
		
		}//end of for loop
		
		System.out.print("\n");
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		//portion of the code used to calculate the total sum of each diagonal to be displayed to the user
		
		int SumOfDiagonal1=0;

		for(int Counting13=0; Counting13<4; Counting13++) {

			SumOfDiagonal1+= ArrayMatrix[Counting13][Counting13];
			
		}//end of for loop

		int SumOfDiagonal2=0;

		for(int Counting14=0; Counting14<4; Counting14++) {

			SumOfDiagonal2+= ArrayMatrix[Counting14][(4-1)-Counting14];
			
		}//end of for loop

		System.out.println("Sum Diagonal 1: "+ SumOfDiagonal1);

		System.out.println("Sum Diagonal 2: "+ SumOfDiagonal2);
		
		System.out.print("\n");
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
	}//end of method

}//end of class

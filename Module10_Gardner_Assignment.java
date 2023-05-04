
//This is the portion of the code that declares the class for the program to run within and to declare a random import from java

import java.util.Random;

public class Module10_Gardner_Assignment {

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of the main code that pirnts out the quick sorted array and delcares the variables setting up the quick sort
	
	public static void main(String[] args) {
	
		int QuickSortSize = 5000;
		int ARRAYForQuickSort[] = new int[QuickSortSize];
		FillingTheArrrayRandomlyToBeSorted(ARRAYForQuickSort);
		  
		Module10_Gardner_Assignment MemoryForQuickSort = new Module10_Gardner_Assignment();
		MemoryForQuickSort.QuickSortImplementation(ARRAYForQuickSort, 0, QuickSortSize - 1);

		System.out.println("The Sorted Version Of The Array Using Quick Sort Is: ");
		PrintTheArrayThatIsSorted(ARRAYForQuickSort);
		
	}//end of the method main
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is a portion of the code that uses the pivot from the last position to the correct position with all smaller to the left and greater to the 
//right of pivot
	
	public int QuickSortEachElementUsingPivot(int ARRAYForQuickSort[], int LowerPointInQuickSort, int HigherPointInQuickSort) {
		
		int PivotPointForQuickSort = ARRAYForQuickSort[HigherPointInQuickSort];
	
		int ValueSmallerThanElement = (LowerPointInQuickSort - 1);
	
		for (int CounterVariable1 = LowerPointInQuickSort; CounterVariable1 <= HigherPointInQuickSort - 1; CounterVariable1++) {
		
			if (ARRAYForQuickSort[CounterVariable1] <= PivotPointForQuickSort) {
				
				ValueSmallerThanElement++;

				int TemporaryVariableForQuickSort1 = ARRAYForQuickSort[ValueSmallerThanElement];
				ARRAYForQuickSort[ValueSmallerThanElement] = ARRAYForQuickSort[CounterVariable1];
				ARRAYForQuickSort[CounterVariable1] = TemporaryVariableForQuickSort1;
				
			}//end of the if statement
			
		}//end of the for loop

		int TemporaryVariableForQuickSort1 = ARRAYForQuickSort[ValueSmallerThanElement + 1];
	
		ARRAYForQuickSort[ValueSmallerThanElement + 1] = ARRAYForQuickSort[HigherPointInQuickSort];
	
		ARRAYForQuickSort[HigherPointInQuickSort] = TemporaryVariableForQuickSort1;
	
		return ValueSmallerThanElement + 1;
	
	}//end of the method 
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
//This is the portion of the code that implements the quick sort using the higher and lower values to sort them after they are seperatedand repeated
	
	public void QuickSortImplementation(int ARRAYForQuickSort[], int LowerPointInQuickSort, int HigherPointInQuickSort) {
		
		if (LowerPointInQuickSort < HigherPointInQuickSort) {
	
			int PivotPointForQuickSort = QuickSortEachElementUsingPivot(ARRAYForQuickSort, LowerPointInQuickSort, HigherPointInQuickSort);

			QuickSortImplementation(ARRAYForQuickSort, LowerPointInQuickSort, PivotPointForQuickSort - 1);
			QuickSortImplementation(ARRAYForQuickSort, PivotPointForQuickSort + 1, HigherPointInQuickSort);
	
		}//end of if statement
		
	}//end of the method
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of the code used to print the array that has been quick sorted
	
	public static void PrintTheArrayThatIsSorted(int ARRAYForQuickSort[]) {
		
		int ARRAYSize = ARRAYForQuickSort.length;
	
		for (int CountingVariable2 = 0; CountingVariable2 < ARRAYSize; ++CountingVariable2) {
			
			System.out.println(ARRAYForQuickSort[CountingVariable2] + " ");
			System.out.println();
			
		}//end of the for loop
			
	}//end of the method

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
//This is a method taht fills the array with values that are chosen that will be qucik sorted
	
	public static void FillingTheArrrayRandomlyToBeSorted(int[] ARRAYForQuickSort) {
		
		int ARRAYSize = ARRAYForQuickSort.length;
		Random RandomValuesToSort = new Random();
	
		for(int CounmtingVariable3 = 0; CounmtingVariable3 < ARRAYSize; CounmtingVariable3++) {
		
			ARRAYForQuickSort[CounmtingVariable3] = RandomValuesToSort.nextInt()%5000;
	
		}//end of the for loop
	
	}//end of the method 
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
//This is the portion of the code that ends the class and has two comments in which they explain the best and worst time needed to sort with a quick sort

}//end of the class Module10_Gardner_Assignment

//The Best Time Needed To Sort The Elements Using Quick Sort Is O(n Log n)

//The Worst Time Needed To Sort The Elements Using Quick Sort Is O(n^2)

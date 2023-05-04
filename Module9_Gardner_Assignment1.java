
//This is the portion of the code that declares the class for the program to run within

public class Module9_Gardner_Assignment1 {

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
//This is the portion of code that is the main method holding the NLR claculations for all six examples within the figure 7.3
	
	public static void main(String[] args) {

		//This is the portion of the code for the binary tree example A in the figure 7.3

		String[] TreeA_Array= new String[]{"A","B","D","E","F","G","H"};

		System.out.println("\nThe Data Structure For The Binary Tree A Is: ");

		Module9_Gardner_Assignment1 BinaryTreeA = new Module9_Gardner_Assignment1();

		NLRCalculationsForBST(TreeA_Array,0,TreeA_Array.length);
		
		
		//This is the portion of the code for the binary tree example B in the figure 7.3
		
		String[] TreeB_Array = new String[]{"A","B"};

		System.out.println("\n\nThe Data Structure For The Binary Tree B Is: ");

		Module9_Gardner_Assignment1 BinaryTreeB = new Module9_Gardner_Assignment1();

		NLRCalculationsForBST(TreeB_Array,0,TreeB_Array.length);
		
		
		//This is the portion of the code for the binary tree example C in the figure 7.3
		
		String[] TreeC_Array = new String[]{"A","B","C","D"};

		System.out.println("\n\nThe Data Structure For The Binary Tree C Is: ");

		Module9_Gardner_Assignment1 BinaryTreeC = new Module9_Gardner_Assignment1();

		NLRCalculationsForBST(TreeC_Array,0,TreeC_Array.length);
		
		
		//This is the portion of the code for the binary tree example D in the figure 7.3
		
		String[] TreeD_Array = new String[]{"A","B","C"};

		System.out.println("\n\nThe Data Structure For The Binary Tree D Is: ");

		Module9_Gardner_Assignment1 BinaryTreeD = new Module9_Gardner_Assignment1();

		//passing parameters to scan NLR

		NLRCalculationsForBST(TreeD_Array,0,TreeD_Array.length);
		
		
		//This is the portion of the code for the binary tree example E in the figure 7.3
		
		String[] TreeE_Array= new String[]{"A","B","C","D","E","F"};

		System.out.println("\n\nThe Data Structure For The Binary Tree E Is: ");

		Module9_Gardner_Assignment1 BinaryTreeE = new Module9_Gardner_Assignment1();

		NLRCalculationsForBST(TreeE_Array,0,TreeE_Array.length);
		
		
		//This is the portion of the code for the binary tree example F in the figure 7.3
		
		String[] TreeF_Array = new String[]{"A","B","C","D","E","F","G"};

		System.out.println("\n\nThe Data Structure For The Binary Tree F Is: ");

		Module9_Gardner_Assignment1 BinaryTreeF = new Module9_Gardner_Assignment1();

		NLRCalculationsForBST(TreeF_Array,0,TreeF_Array.length);
		
	}//end of the method main
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of code that declares the NLR calculation portion of the code that uses an If statement to construct the binary tree using the 
//constraint of two nodes at most per parent node
	
	public static void NLRCalculationsForBST(String[] ARRAY,int CountingValue,int CalculationSize) {

	if(CountingValue >= CalculationSize)

	return;

	//This is the portion of the code to print out each element and node within the binary tree

	System.out.print(ARRAY[CountingValue]+ " ");

	//NLR Calculations on the left hand side of the binary tree

	NLRCalculationsForBST(ARRAY,(2*CountingValue)+1,ARRAY.length);

	//NLR Calculations on the right hand side of the binary tree

	NLRCalculationsForBST(ARRAY,(2*CountingValue)+2,ARRAY.length);

	}//end of the method NLRCalculationsForBST
	
}//end of the class Module9_Gardner_Assignment1

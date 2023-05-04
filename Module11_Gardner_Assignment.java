///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of the code that begins the the class/ main method declaring the maps as well as the data that will be sent through the transverse
//method to be printed out using the depth first algorithm

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Module11_Gardner_Assignment {
	
	public Map <Integer, List<Integer>> AdjacencyListForDepthFirstAlgorithm = new HashMap<>();
	public Map <Integer, Boolean> VisitedNodesMapForDepthFirstAlgorithm = new HashMap<>();

	public static void main(String[] args) {
		
		System.out.println("THIS IS A SOFTWARE EXAMPLE OF A DEPTH-FIRST ALGORTHIM TO FIND EACH NODE WITHIN THE GRAPH\n\n");
		
		Module11_Gardner_Assignment DepthFirstAlgorithm = new Module11_Gardner_Assignment();
		DepthFirstAlgorithm.TranverseDepthFirstAlgorithm(1);
		
	}//end of the method main

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of the code that uses the lists to declare parts of the map as well as each part of the arry list where they can be mapped to each node
	
	public Module11_Gardner_Assignment() {
	
		List<Integer> listDepthFirstAlgorithm1 = new ArrayList<>();
		listDepthFirstAlgorithm1.add(4);
   
		List<Integer> listDepthFirstAlgorithm2 = new ArrayList<>();
		listDepthFirstAlgorithm2.add(3);

		List<Integer> listDepthFirstAlgorithm3 = new ArrayList<>();
		listDepthFirstAlgorithm3.add(2);
		listDepthFirstAlgorithm3.add(4);
		listDepthFirstAlgorithm3.add(8);
   
    	List<Integer> listDepthFirstAlgorithm4 = new ArrayList<>();
    	listDepthFirstAlgorithm4.add(1);
    	listDepthFirstAlgorithm4.add(3);
    	listDepthFirstAlgorithm4.add(5);
    	listDepthFirstAlgorithm4.add(9);

    	List<Integer> listDepthFirstAlgorithm5 = new ArrayList<>();
    	listDepthFirstAlgorithm5.add(4);
    	listDepthFirstAlgorithm5.add(6);
   
    	List<Integer> listDepthFirstAlgorithm6 = new ArrayList<>();
    	listDepthFirstAlgorithm6.add(5);
    	listDepthFirstAlgorithm6.add(7);
    	listDepthFirstAlgorithm6.add(10);

    	List<Integer> listDepthFirstAlgorithm7 = new ArrayList<>();
    	listDepthFirstAlgorithm7.add(6);

    	List<Integer> listDepthFirstAlgorithm8 = new ArrayList<>();
    	listDepthFirstAlgorithm8.add(3);
   
    	List<Integer> listDepthFirstAlgorithm9 = new ArrayList<>();
    	listDepthFirstAlgorithm9.add(4);
    	listDepthFirstAlgorithm9.add(11);
    	listDepthFirstAlgorithm9.add(12);

    	List<Integer> listDepthFirstAlgorithm10 = new ArrayList<>();
    	listDepthFirstAlgorithm10.add(6);

    	List<Integer> listDepthFirstAlgorithm11 = new ArrayList<>();
    	listDepthFirstAlgorithm11.add(9);  
    	listDepthFirstAlgorithm11.add(13);
    	listDepthFirstAlgorithm11.add(14);

    	List<Integer> listDepthFirstAlgorithm12 = new ArrayList<>();
    	listDepthFirstAlgorithm12.add(9);  
    	listDepthFirstAlgorithm12.add(15);

    	List<Integer> listDepthFirstAlgorithm13 = new ArrayList<>();
    	listDepthFirstAlgorithm13.add(13);  
   
    	List<Integer> listDepthFirstAlgorithm14 = new ArrayList<>();
    	listDepthFirstAlgorithm14.add(11);  

    	List<Integer> listDepthFirstAlgorithm15 = new ArrayList<>();
    	listDepthFirstAlgorithm15.add(12);          
   
    	AdjacencyListForDepthFirstAlgorithm.put(1, listDepthFirstAlgorithm1);
    	AdjacencyListForDepthFirstAlgorithm.put(2, listDepthFirstAlgorithm2);
    	AdjacencyListForDepthFirstAlgorithm.put(3, listDepthFirstAlgorithm3);
    	AdjacencyListForDepthFirstAlgorithm.put(4, listDepthFirstAlgorithm4);
    	AdjacencyListForDepthFirstAlgorithm.put(5, listDepthFirstAlgorithm5);
    	AdjacencyListForDepthFirstAlgorithm.put(6, listDepthFirstAlgorithm6);
    	AdjacencyListForDepthFirstAlgorithm.put(7, listDepthFirstAlgorithm7);
    	AdjacencyListForDepthFirstAlgorithm.put(8, listDepthFirstAlgorithm8);
    	AdjacencyListForDepthFirstAlgorithm.put(9, listDepthFirstAlgorithm9);
    	AdjacencyListForDepthFirstAlgorithm.put(10, listDepthFirstAlgorithm10);
    	AdjacencyListForDepthFirstAlgorithm.put(11, listDepthFirstAlgorithm11);
    	AdjacencyListForDepthFirstAlgorithm.put(12, listDepthFirstAlgorithm12);
    	AdjacencyListForDepthFirstAlgorithm.put(13, listDepthFirstAlgorithm13);
    	AdjacencyListForDepthFirstAlgorithm.put(14, listDepthFirstAlgorithm14);
    	AdjacencyListForDepthFirstAlgorithm.put(15, listDepthFirstAlgorithm15);
   
    	for (Integer KeyForMapWithinDepthFirstAlgorithm: AdjacencyListForDepthFirstAlgorithm.keySet()) {
    	
    		VisitedNodesMapForDepthFirstAlgorithm.put(KeyForMapWithinDepthFirstAlgorithm, false);
        
    	}//end of the for loop statement
    
	}//end of the constructopr method Module11_Gardner_Assignment

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of the code that is declared that uses the tranverse function with the depth first algorithm to preform the action of jumping from nodes
//to node that will be printed out in the main method after being marked as visited
	
	public void TranverseDepthFirstAlgorithm(int currentNode) {
	
		if (VisitedNodesMapForDepthFirstAlgorithm.get(currentNode)) {
    	
			return;
        
		}//end of the if statement
   
		VisitedNodesMapForDepthFirstAlgorithm.put(currentNode, true);
		System.out.print("\tThis Is The Jump Between Each Node Within The Adjacent List " + currentNode + "\n\n");

		List<Integer> AdjacentNodeListFromTheAdjecentList = AdjacencyListForDepthFirstAlgorithm.get(currentNode);
		if (AdjacentNodeListFromTheAdjecentList == null) {
    	
			return;
        
		}//end of the if statement
    
		for (Integer AdjacentNodeFromTheAdjecentList: AdjacentNodeListFromTheAdjecentList) {
    	
			TranverseDepthFirstAlgorithm(AdjacentNodeFromTheAdjecentList);
        
		}//end of the for loop statement
    
	}//end of the method TranverseDepthFirstAlgorithm
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of the code that declares the end of the class where theprogram comes to a close
	
}//end of the class Module11_Gardner_Assignment

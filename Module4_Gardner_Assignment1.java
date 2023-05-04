public class Module4_Gardner_Assignment1 {

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This portion of the code used to declare the queue and the main variables of the code and where the user will see the printed code for the customer 
	
	public static void main(String[] args) {
		
		LinkedListQueue ques = new LinkedListQueue();

		int RemainingMinutes = 720;

		int AmountOfTime;

		int MaxNumber = 5;

		int MinNumber =1;

		for (AmountOfTime=0; AmountOfTime <= RemainingMinutes; AmountOfTime++) {

			int CustomerInput = MinNumber+(int) (Math.random()*((MaxNumber-MinNumber)+1));

			int CustomerOutput = MinNumber+(int) (Math.random()*((MaxNumber-MinNumber)+1));

			System.out.println("CustomerInput: " + CustomerInput + " " + "CustomerOutput: " + CustomerOutput);

			ques.DisplayQueue();

		}//end of for loop

	}//end of method

}//end of class

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is a portion of the code in which the class for the linked list is made and the list is declared and the queue is being made with each method

class LinkedListQueue {

	static LinkedList nLinkedList = new LinkedList();

	public static <DataHolder> void AddQueue (DataHolder Records){
		
		try {
			nLinkedList.AddingToLast(Records);
			
		} catch (Exception Exception) {
			Exception.printStackTrace();
			
		}//end of catch
		
	}//end of main method for AddQueue

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This portion of the code is a method to remove the first item from the queue if empty
	
	public void RemoveQueue(){
		
		if(!nLinkedList.QueueIsEmpty())
			
			nLinkedList.RemoveFirst();

	}//end of method RemoveQueue

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This portion of the code is used in a method to display the queue
	
	public void DisplayQueue(){
		
		((LinkedList) nLinkedList).DisplayLinkedList();
		System.out.println("");

	}//end of method DisplayQueue

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of the code when the portion of the queue is empty
	
	public boolean EmptyQueue(){
		
		return nLinkedList.QueueIsEmpty();

	}//end of method EmptyQueue

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}//end of class linkedListQueue

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of the code used for the linked list without the queue's involvement using a class ad private class 

class LinkedList<DataHolder> {
	
private class PrivateNode {
	
	private final DataHolder DataBeingHeld;
	private PrivateNode NextData;

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of the code where a method explains that a node is being defined as a node that holds data
	
	public PrivateNode(DataHolder Records){
		
		this.DataBeingHeld = Records;

	}//end of the method PrivateNode

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of the code where the nethod will display the node and the data it is holding
	
	public void DisplayNode(){
 
		System.out.println(DataBeingHeld + " ");   

	}//end of method DisplayNode

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the end of the private clas but two private variables are declared as the first and the last for the linked list
	
}//end of private class

	private PrivateNode FirstList;
	private PrivateNode LastList;

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
//This is the portion of the code where the metjod determines if the front of the linked list is empty
	
	public boolean QueueIsEmpty(){
		
		if(FirstList == null) {
			
			System.out.println("The Linked List Stack is Empty: True");
			return true;
			
		}else
 
			System.out.println("The The Linked List Stack is Empty: false");
			return false;

	}//end of method QueueIsEmpty

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
//This is the portion of the code for the method that adds data to the linked list and checking the data in the list and thats being added
	
	public void AddingToLast(DataHolder Records){

		PrivateNode Node = new PrivateNode(Records);
 
		if(QueueIsEmpty()) {
			FirstList = Node;

		}//end of if
		
		else {
			
			Node.NextData = Node;
			
		}//end of else
		
			LastList = Node;
			Node.NextData = null;

	}//end of method AddingToLast

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  //This is the portion of the code used by the method to remove the first from the linked list
	
	public void RemoveFirst(){
		
		if(!QueueIsEmpty())

			LastList = null;
		FirstList = FirstList.NextData;

	}//end of method RemoveFirst

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  //This is the portion of the code used in the methid to display the linked list
	
	public void DisplayLinkedList() {
		
		PrivateNode PredifnedVariable = FirstList;
		
		while(PredifnedVariable != null){
			
			PredifnedVariable.DisplayNode();
			PredifnedVariable = PredifnedVariable.NextData;

		}//end of while loop

	}//end of method DisplayLinkedList

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}//end of the class


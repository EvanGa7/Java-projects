
//This portion of the code allows for user imput througgout the program

import java.util.*;

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the main java class that doesn't really have any use other than to hold the name of the file for this program

public class Module5_Gardner_Assignment {

	public static void main(String[] args) {

	}//end of method main

}//end of class Module5_Gardner_Assignment

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This portion of the code declares the class TheLinkedList and the method that creates the linked list as well as a constructor for the list

class TheLinkedList {

    static LinkedList <String> object = new LinkedList <String>();

    public TheLinkedList(String ElementArray[]) {

        for(String Names : ElementArray) {

            object.add(Names);
            
        }//end of for loop
        
    }//end of method MyLinkedList
    
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This portion of the code is used to add elements to the linked list whether that be the first middle tail or another position
    
    public static void AddElements() {
    	
        System.out.println("\n\nWhat Position Would You Like To Add The Element At?");
        System.out.println("\n1. First");
        System.out.println("\n2. Middle");
        System.out.println("\n3. Tail");
        System.out.println("\nPlease Enter Choice For The Position");

        Scanner keyboard = new Scanner(System.in);
        int UserChoice = keyboard.nextInt();

        String Elements = keyboard.nextLine();

        switch(UserChoice) {
            case 1: 
            	
            	System.out.println("\nEnter The String Value That You Wish To Be Added ");
            	Elements = keyboard.nextLine();
            	
            	keyboard.close();
                object.addFirst(Elements);
                
                System.out.println("\nThe First Element " + Elements + " Was Added To The Linked List ");
                
                break;

            case 2: 
            	
            	int IntegerLocation;
            
                System.out.println("\nEnter The Integer Location You Would Like It To Be At ");
                IntegerLocation = keyboard.nextInt();
                
                String Element = keyboard.nextLine();

                System.out.println("\nEnter The String Value That You Wish To Be Added ");
                Element = keyboard.nextLine();
                object.add(IntegerLocation, Element);
                
                keyboard.close();
                System.out.println("\nThe Element In Location " +IntegerLocation+ " Has Been Added With The Name " + Element + " To The Linked List ");
                
                break;

            case 3: 
            	
            	System.out.println("\nEnter The String Value That You Wish To Be Added ");
            
            	Elements = keyboard.nextLine();
                object.addLast(Elements);
               
                keyboard.close();
                System.out.println("\nThe Last Element " + Elements + " Was Added To The Linked List ");
             
                break;

        }//end of switch
        
    }//end of method AddElements
    
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  //This portion of the code is used to remove elements to the linked list whether that be the first middle tail or another position
   
    public static void RemoveElements() {
    	
    	System.out.println("\n\nWhat Position Would You Like To Remove The Element From?");
        System.out.println("\n1. First");
        System.out.println("\n2. Middle");
        System.out.println("\n3. Tail");
        System.out.println("\nPlease Enter Choice For The Position");

        Scanner keyboard = new Scanner(System.in);
        int UserChoice = keyboard.nextInt();

        String Elements;

        switch(UserChoice) {
            case 1:
            	
                object.removeFirst();
                System.out.println("\nThe First Element Was Removed From The Linked List ");
                break;

            case 2: 
            	
            	int IntegerLocation;
            
                System.out.println("\nEnter The Integer Location You Would Like It To Be At ");
                IntegerLocation = keyboard.nextInt();

                object.remove(IntegerLocation);
                System.out.println("\nThe Element In Spot " +IntegerLocation+ " Was Removed From The Linked List ");
                break;

            case 3:
            	
                object.removeLast();
                System.out.println("\nThe last Element Was Removed From The Linked List ");
                break;
                
        }//end of switch
        
    }//end of the method RemoveElements 
    
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This Portion of the code is the command used to print out the size of the linked list if asked by the user to do so
    
    public static void GetSizeOfLinkedList() {
    	
        System.out.println("\n\nThe Linked List Size Is: " + object.size());
        
    }//end of method GetSizeOfLinkedList
    
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This portion of the code is a method in which you can search for a specific element in the array
    
    public static void SearchForElement() {
    	
        Scanner keyboard = new Scanner(System.in);
        String Elements;

        System.out.println("\nEnter The String Value You Wish To Search: ");
        Elements = keyboard.nextLine();

        boolean StatusOfElement = object.contains(Elements);

        if(StatusOfElement)
            System.out.println("\nThe Linked List Contains The Element That Was Searched: " + Elements);
        else
            System.out.println("\nThe Linked List Does Not Contains The Element That Was Searched: " + Elements);
        
    }//end of method SearchForElements
    
}//end of class TheLinkedList

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This portion of the code is a test class that was made to test the linked list and to implement the names and everything that should be in the linked list

class TestingClass {

    static String ElementArray[] = {"James", "John", "Michael", "Peter", "Allison", "Daniel", "George", "Simon", "Jason", "Mark"};

    public static void main(String args[]) {
    	
        TheLinkedList LinkedListObject = new TheLinkedList(ElementArray);

        System.out.println("\nMenu For Linked List Operations ");
        System.out.println("\n1. Add An Element To The Linked List ");
        System.out.println("\n2. Remove An Element From The Linked List ");
        System.out.println("\n3. Retrieve The Size Of The Linked List ");
        System.out.println("\n4. Search For An Element Of The Linked List ");

        Scanner keyboard = new Scanner(System.in);
        int UserChoice = keyboard.nextInt();

        switch(UserChoice) {
        
            case 1:
            	
            	LinkedListObject.AddElements();
                break;
                
            case 2:
         
            	LinkedListObject.RemoveElements();
                break;

            case 3:    
            	
                LinkedListObject.GetSizeOfLinkedList();
                break;

            case 4:    
            	
            	LinkedListObject.SearchForElement();
                break;
                        
        }//end of switch
        
    }//end of method Main
    
}//end of the class TestingClass

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


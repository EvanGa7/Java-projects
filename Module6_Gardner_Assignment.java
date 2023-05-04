
//This is the portion of the main code that prints out each portion of the binary tree as well as declares the main variables and array needed

import java.util.*;

public class Module6_Gardner_Assignment {
	
	public static void main(String args[]) {

         Scanner keyboard = new Scanner(System.in);

         String SenderNames[]={"Daniel", "George", "Adam", "Peter", "Michael", "Jones", "Tom", "Allison", "James","Brian"};

         BinaryStringTree BinaryStringTree =new BinaryStringTree();

         //insert the elements

         for(int CountingVariable = 0; CountingVariable < SenderNames.length; CountingVariable++) {

        	 BinaryStringTree.InsertIntoRoot(SenderNames[CountingVariable]);

         }//end of the for loop
         
         
         //Start of Data In The Binary Tree
         
         System.out.println("\nThe Binary Tree Data Held Within The Tree ");
         
         

         //The preorder of the binary tree

         System.out.println("\n\nThe list of names in preorder are: \n");

         BinaryStringTree.PreOrderSeperation();

       

         //The inorder of the binary tree

         System.out.println("\n\n\nThe list of names in inorder are: \n");

         BinaryStringTree.InOrderSeperation();

       

         //The postorder of the binary tree

         System.out.println("\n\n\nThe list of names in postorder are: \n");

         BinaryStringTree.PostOrderSeperation();

         
         
         //Start of Data After Removing Peter and Brian
         
         System.out.println("\n\n\n\n\nThe Binary Tree Data Held Within The Tree After removing Peter and Brian ");
         
         

         //The delete statement for Peter and Brian to be removed from the binary tree
         
         System.out.println("\n");
      
         BinaryStringTree.DeleteFromRoot("Peter");
         
         BinaryStringTree.DeleteFromRoot("Brian");

       

         //The preorder after removing Peter and Brian

         System.out.println("\n\nThe list of names in postorder after removing Peter and Brian are: \n");

         BinaryStringTree.PreOrderSeperation();
         
         
         
         //The inorder after removing Peter and Brian

         System.out.println("\n\n\nThe list of names in inorder after removing Peter and Brian are: \n");

         BinaryStringTree.InOrderSeperation();

       

         //The postorder after removing Peter and Brian

         System.out.println("\n\n\nThe list of names in postorder after removing Peter and Brian are: \n");

         BinaryStringTree.PostOrderSeperation();

	}//end of the method main

}//end of the class Module6_Gardner_Assignment

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of the code is used to begin the creation of the nodes and other portions of the binary tree as well as declaring a constructor

class BinaryStringTreeNode {

	BinaryStringTreeNode LeftNode, RightNode;

     	String DataNode;
     	

     public BinaryStringTreeNode() {

          LeftNode = null;

          RightNode = null;

          DataNode = null;

     }//end of the method BinaryStringTreeNode
     
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is another portion of the code used to delcare another constructor for the main Binary tree

     public BinaryStringTreeNode(String Node) {

          LeftNode = null;

          RightNode = null;

          DataNode = Node;

     }//end of the method BinaryStringTreeNode
     
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of the code used to set the left node within the binary tree

     public void SetNodeLeft(BinaryStringTreeNode Node1) {

          LeftNode = Node1;

     }//end of the method SetNodeLeft
     
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of the code used to set the right node within the binary tree

     public void SetNodeRight(BinaryStringTreeNode Node2) {

          RightNode = Node2;

     }//end of the method SetNodeRight
     
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of the code used to set the data within the binary tree

     public void SetTheDataWithin(String Node3) {

    	 DataNode = Node3;

     }//end of the method SetTheDataWithin
     
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of the code that retrieves the Left Node from the nodes within the binary tree

     public BinaryStringTreeNode GetNodeLeft() {

          return LeftNode;

     }//end of the method GetNodeLeft
     
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of the code that retrieves the Right Node from the nodes within the binary tree

     public BinaryStringTreeNode GetNodeRight() {

          return RightNode;

     }//end of the method GetNodeRight
     
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of the code that retrieves the data from the nodes within the binary tree

     public String GetTheDataWithin() {

          return DataNode;

     }//end of the method GetTheDataWithin

}//end of the class

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of the code that declares the binary tree as well as creates the constructor for the binary tree

class BinaryStringTree {

     private BinaryStringTreeNode RootNode;

     public BinaryStringTree() {

          RootNode = null;

     }//end of the method BinaryStringTree
     
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of the code to declare the root as empty 

     public boolean RootIsEmpty() {

          return RootNode == null;

     }//end of the method RootIsEmpty
    
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of the code for which data is inserted into the root of the binary tree

     public void InsertIntoRoot(String DataNode) {

          RootNode = InsertIntoNode(RootNode, DataNode);

     }//end of the method InsertIntoRoot
     
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of the code for a reccursively used insert fuction for inputting data in nodes

     private BinaryStringTreeNode InsertIntoNode(BinaryStringTreeNode Node4, String DataNode) {

          if (Node4 == null)

        	  Node4 = new BinaryStringTreeNode(DataNode);

          else {

              if (DataNode.compareTo(Node4.GetTheDataWithin())>0)

            	  Node4.LeftNode = InsertIntoNode(Node4.LeftNode, DataNode);

              else

            	  Node4.RightNode = InsertIntoNode(Node4.RightNode, DataNode);

          }//end of else

          return Node4;

     }//end of the method InsertIntoNode
     
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of the code used to delete data from inside the root of the binary tree

     public void DeleteFromRoot(String Node5) {

          if (RootIsEmpty())

              System.out.println("The Binary Tree Root Is Empty");

          else if (SearchWithin(Node5) == false)

              System.out.println("Sorry for the inconvience "+ Node5 +" is not present within the binary tree at this momemt ");

          else {

              RootNode = DeleteFromNode(RootNode, Node5);

              System.out.println(Node5 + " has been deleted from the tree");

          }//end of else 

     }//end of the method DeleteFromRoot
     
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of the code used to delete data from inside the node of the binary tree for recurrsive purposes
     
     private BinaryStringTreeNode DeleteFromNode(BinaryStringTreeNode RootNode, String Node6) {

    	 BinaryStringTreeNode WorkingNode, WorkingNode2, WorkingNode3;

          if (RootNode.GetTheDataWithin().equalsIgnoreCase( Node6)) {

        	  BinaryStringTreeNode LeftNode, RightNode;

              LeftNode = RootNode.GetNodeLeft();

              RightNode = RootNode.GetNodeRight();

              if (LeftNode == null && RightNode == null)

                   return null;

              else if (LeftNode == null) {

                   WorkingNode = RightNode;

                   return WorkingNode;

              }//end of else if

              else if (RightNode == null) {

                   WorkingNode = LeftNode;

                   return WorkingNode;

              }//end of else if

              else {

                   WorkingNode2 = RightNode;

                   WorkingNode = RightNode;

                   while (WorkingNode.GetNodeLeft() != null)

                        WorkingNode = WorkingNode.GetNodeLeft();

                   WorkingNode.SetNodeLeft(LeftNode);

                   return WorkingNode2;

              }//end of else

          }//end of if
          
          

          if (Node6.compareTo( RootNode.GetTheDataWithin())>0) {

              WorkingNode3 = DeleteFromNode(RootNode.GetNodeLeft(), Node6);

              RootNode.SetNodeLeft(WorkingNode3);

          }//end of if

          else {

        	  WorkingNode3 = DeleteFromNode(RootNode.GetNodeRight(), Node6);

        	  RootNode.SetNodeRight(WorkingNode3);           

          }//end of else

          return RootNode;

     }//end of the method DeleteFromNode
     
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of the code used to count nodes within the binary tree

     public int CountingNodes() {

          return CountingNodesRoot(RootNode);

     }//end of the method CountingNodes
     
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of the code that counts the nodes as they pass over the root of the binary tree

     private int CountingNodesRoot(BinaryStringTreeNode Node7) {

          if (Node7 == null)

              return 0;

          else {

              int CountingVariable2 = 1;

              CountingVariable2 += CountingNodesRoot(Node7.GetNodeLeft());

              CountingVariable2 += CountingNodesRoot(Node7.GetNodeRight());

              return CountingVariable2;

          }//end of else

     }//end of the method CountingNodesRoot
     
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of the code that allows o search within the binary tree

     public boolean SearchWithin(String Node8) {

          return SearchWithinNodes(RootNode, Node8);

     }//end of the nethod SearchWithin
     
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of the code used to search for a element reccursively through the binary tree

     private boolean SearchWithinNodes(BinaryStringTreeNode RootNode, String Node9) {

          boolean FoundElement = false;

          while ((RootNode != null) && !FoundElement) {

              String RootNode9 = RootNode.GetTheDataWithin();

              if (Node9.compareTo(RootNode9) > 0)

                   RootNode = RootNode.GetNodeLeft();

              else if (Node9.compareTo(RootNode9) < 0)

                   RootNode = RootNode.GetNodeRight();

              else {

                   FoundElement = true;

                   break;

              }//end of else

              FoundElement = SearchWithinNodes(RootNode, Node9);

          }//end of while

          return FoundElement;

     }//end of the method SearchWithinNodes
     
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of the code that will allow for the seperation of the array into the order within the binary tree

     public void InOrderSeperation() {

          InOrderSeperation(RootNode);

     }//end of the method InOrderSeperation
     
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of the code that will allow for the seperation of the array into the order within the binary tree reccursively

     private void InOrderSeperation (BinaryStringTreeNode Node10) {

          if (Node10 != null) {

        	  InOrderSeperation(Node10.GetNodeLeft());

              System.out.print(Node10.GetTheDataWithin() +"\t");

              InOrderSeperation(Node10.GetNodeRight());

          }//end of if

     }//end of the method InOrderSeperation
     
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of the code that will allow for the seperation of the array into preorder within the binary tree

     public void PreOrderSeperation() {

    	 PreOrderSeperation(RootNode);

     }//end of the method PreOrderSeperation
     
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of the code that will allow for the seperation of the array into preorder within the binary tree reccursively

     private void PreOrderSeperation(BinaryStringTreeNode Node11) {

          if (Node11 != null) {

              System.out.print(Node11.GetTheDataWithin() +"\t");

              PreOrderSeperation(Node11.GetNodeLeft());           

              PreOrderSeperation(Node11.GetNodeRight());

          }//end of if

     }//end of the method PreOrderSeperation
    
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of the code that will allow for the seperation of the array into postorder within the binary tree

     public void PostOrderSeperation() {

    	 PostOrderSeperation(RootNode);

     }//end of the method PostOrderSeperation
     
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of the code that will allow for the seperation of the array into postorder within the binary tree reccursively

     private void PostOrderSeperation(BinaryStringTreeNode Node12) {

          if (Node12 != null) {

        	  PostOrderSeperation(Node12.GetNodeLeft());           

        	  PostOrderSeperation(Node12.GetNodeRight());

              System.out.print(Node12.GetTheDataWithin() +"\t");

          }//end of if

     }//end of the method PostOrderSeperation

}//end of the class

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


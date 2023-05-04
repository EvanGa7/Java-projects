//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the delcarations of all the imports within JDBC and SQL and where the connection path nto SQL is made with the username and password

package com.sqlsamples;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.DriverManager;

public class JDBCProgramEvanGardner {

	public static void main(String[] args) {
	
		System.out.println("Connect To SQL Server & Preform The Select Operation\n");
        
		//This is the connection to the SQL Server in which the username to login is EvanGardnerSecurity and Password is EvanGardnerPassword
		
        String ConnectionToDatabaseSQL = "jdbc:sqlserver://localhost:1433;databaseName=Grades Database;user=EvanGardnerSecurity;password=EvanGardnerPassword";

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
//This is the portion of the code that loads the SQL Server and establishes connection to the JDBC Server
//This is also the portion of code that reads creates the select statement within java using the try and catch method if there is an exception
        
        try {
        	
            System.out.print("Connecting to The SQL Server... ");
            
            try (Connection JDBCConnection = DriverManager.getConnection(ConnectionToDatabaseSQL)) {
            	
            	System.out.println("Connection Successful \n");
                
                if(args.length >= 1) {
                	
                	String SQLStringBuilderVariable = new StringBuilder().append("SELECT ID, Last, First, Gender, Class FROM [Student Data] " + "WHERE ID = ?;").toString();

                	try (PreparedStatement SQLStatementQuery = JDBCConnection.prepareStatement(SQLStringBuilderVariable)) {
                		
                		SQLStatementQuery.setString(1, args[0]);
                		
                		//This is a portion of the code is to get the metdata from the dataset from the results of the SQL Query
                		
                		ResultSet ResultSetForSQLQuery = SQLStatementQuery.executeQuery();ResultSetMetaData ReadResultsdataSet = ResultSetForSQLQuery.getMetaData();

                    	int NumberOfColumns = ReadResultsdataSet.getColumnCount();
                    	
                    	while (ResultSetForSQLQuery.next()) {
                    		
                    		for (int CountingVariable = 1; CountingVariable <= NumberOfColumns; CountingVariable++) {
                    	    	
                    			System.out.println(ReadResultsdataSet.getColumnName(CountingVariable) + ": " + ResultSetForSQLQuery.getString(CountingVariable));
                    	    	
                    	    }//End of The For Loop
                    		
                    	}//End of the while statement
                    	
                    }//End of the try Statement 3
                	
                }//End of the if statement
                
            }//End of the try statement 2
            
        }//End of the try statement

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
//This is the portion of the code that is the catch statement for the try statement incase the try statement fails so that the query can be processed
        
        catch (Exception ExceptionCase) {
        	
        	System.out.println();
        	
        	ExceptionCase.printStackTrace();
        	
        }//End of the catch statement

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of the code that ends the class and that ends the main method of the program
        
	}//End of the method main

}//end of the class JDBCProgramEvanGardner

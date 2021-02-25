package com.know.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Create_Table {

	public static void main(String[] args) throws Exception {
		final String url = "jdbc:mysql:///ash";
	      final String user = "root";
	      final String password = "ashfaaq1997";
	      // connection
	      Connection con = DriverManager.getConnection(url, user, password);
	      Statement stm = con.createStatement();
	     
	      Scanner sc = new Scanner(System.in);
	      System.out.print("Enter the table name you want to create: ");
	      String tablename = sc.next();
	      System.out.println("enter no of columns");
	      int no=sc.nextInt();
	      System.out.println("Enter first column name");
	      String col1 = sc.next();
	      System.out.println("Enter col1 type");
	      String col1t = sc.next();
	      
	      if(col1t.equalsIgnoreCase("int")) {
	      
	      String qur1 = "CREATE TABLE "+tablename+"("+col1+" "+col1t+")";
	      stm.execute(qur1);
	      }
	      if(col1t.equalsIgnoreCase("varchar")) {
	    	  System.out.println("Enter range");
	    	  int ran = sc.nextInt();
	    	  String qur1 = "CREATE TABLE "+tablename+"("+col1+" "+col1t+"("+ran+")"+")";
		      stm.execute(qur1);
	      }
	    for (int i = 0; i < no-1; i++) {
	    	System.out.println("enter "+(i+2) + " column name");
    		String kk=sc.next();
	    	System.out.println("enter "+(i+2) + " type");
	    	String type=sc.next();
	    	
	    	if(type.equalsIgnoreCase("varchar")) {
	    		System.out.println("enter range");
	    		int range=sc.nextInt();
	    		
	    		String qur2 = "ALTER TABLE "+tablename+" ADD "+kk+" "+type+"("+range+")";
	    		stm.execute(qur2);
	
	    	}
	    	if(type.equalsIgnoreCase("int")) {
	    		String qur2 = "ALTER TABLE "+tablename+" ADD "+kk+" "+type;
	    		stm.execute(qur2);
	    	}	
		}	
		}
	    	      
	}
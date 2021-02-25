package com.know.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class Insert {

	public static void main(String[] args) throws Exception {
		SelectTest obj = new SelectTest();
		obj.main(args);
		
		final String url = "jdbc:mysql:///ash";
	      final String user = "root";
	      final String password = "ashfaaq1997";

	      // connection
	      Connection con = DriverManager.getConnection(url, user, password);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many records you want to add: ");
		int num = sc.nextInt();
		
		for(int i = 1; i <=num ; i++) {
		System.out.println("Enter sno.");
		int Sno = sc.nextInt();
		System.out.println("Enter User name");
		String Uname = sc.next();
		System.out.println("Enter Password");
		String pass = sc.next();
		
		 Statement st1 = con.createStatement();
		 
		String q1 = "INSERT INTO LOGIN (sno,uname,password) VALUES(" + Sno +",'"+Uname+"'," + "'"+pass+"')";
	
		st1.executeUpdate(q1);
		
		
	
		}	
		
	}

}

package com.know.jdbc;
import java.sql.*;
import java.util.*;

public class Full_Table {

	public static void main(String[] args) throws Exception {
		Connection con = DriverManager.getConnection("jdbc:mysql:///ash", "root", "ashfaaq1997");
		Statement stmt = con.createStatement();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the option below\n1: Alter table\n2: Insert\n3: Upadte\n4: DELETE\n5: Serach");
		int select = sc.nextInt();
		
		
		
		switch(select) {
		
		//Alter
		case 1 :
			System.out.println("This are the tables in your database");
			String q1 = "SHOW TABLES";
			ResultSet rs12 = stmt.executeQuery(q1);
			while(rs12.next()) {
				System.out.println(rs12.getString(1));
				
			}
			System.out.println("Enter the table name you want to work with");
			String table = sc.next();
			String q2 = "SELECT * FROM "+table;
			stmt.execute(q2);
			System.out.println("Enter the colum name you want to alter");
			String colname = sc.next();
			System.out.println("Enter column type: ");
			String type = sc.next();
			
			if(type.equalsIgnoreCase("int")) {
			String q3 = "ALTER TABLE "+table+" ADD "+colname+" "+type;
			stmt.execute(q3);
			}
			else if(type.equalsIgnoreCase("varchar")) {
				System.out.println("Enter the range of varchar: ");
				int range = sc.nextInt();
				String q4 = "ALTER TABLE "+table+" ADD "+colname+" "+type+"("+range+")";
				stmt.execute(q4);
			}
			break;
			
		case 2:
			System.out.println("Insert data into 'login' table");
			
			
			System.out.println("How many records you want to add: ");
			int num = sc.nextInt();
			for(int i = 1; i <=num ; i++) {
			System.out.println("Enter sno.");
			int Sno = sc.nextInt();
			System.out.println("Enter User name");
			String Uname = sc.next();
			System.out.println("Enter Password");
			String pass = sc.next();
			 
			String q6 = "INSERT INTO LOGIN (sno,uname,password) VALUES(" + Sno +",'"+Uname+"'," + "'"+pass+"')";
		
			stmt.executeUpdate(q6);
			}
			String q5 = "SELECT * FROM login";
			ResultSet rs11 = stmt.executeQuery(q5);
			while(rs11.next()) {
			System.out.println(rs11.getInt(1) + "\t " + rs11.getString(2) + 
	                  "   \t " + rs11.getString(3));
			}
			System.out.println("Updated successfully");
			break;
		case 3:
			System.out.println("Below is 'login' table");
			
			String qur2 = "SELECT * FROM login";
			ResultSet rs15 = stmt.executeQuery(qur2);
			while(rs15.next()) {
			System.out.println(rs15.getInt(1) + "\t " + rs15.getString(2) + 
	                  "   \t " + rs15.getString(3));
			}
			System.out.println("Below are the columns of 'login' table");
			String qur3 = "SHOW COLUMNS FROM login";
			ResultSet rs16 = stmt.executeQuery(qur3);
			while(rs16.next()) {
				System.out.println(rs16.getString(1));
			}
					
			System.out.println("Update 'login' table");
			System.out.println("Enter the column name were you want to update");
			String cname = sc.next();
			System.out.println("Enter the values you want to update(Enter in single quotes if it is varchar");
			String val = sc.next();
			System.out.println("Enter the referd column name");
			String col = sc.next();
			System.out.println("Enter the reference value");
			String val3 = sc.next();
			String q7 = "UPDATE login SET "+cname+" = "+val+" WHERE "+col+" = "+val3;
			stmt.execute(q7);
			
            System.out.println("Below is upadted table");
			
			String qur4 = "SELECT * FROM login";
			ResultSet rs17 = stmt.executeQuery(qur4);
			while(rs17.next()) {
			System.out.println(rs17.getInt(1) + "\t " + rs17.getString(2) + 
	                  "   \t " + rs17.getString(3));
			}
			
			break;
		
			 //delete
		case 4:
			System.out.println("Delete record from 'login' table");
			System.out.println("Enter the column name were you want to delete");
			String cname1 = sc.next();
			System.out.println("Enter the values you want to delete");
			String val1 = sc.next();
			String q8 = "DELETE FROM login WHERE "+cname1+" = "+val1;
			stmt.execute(q8);
			String qur = "SELECT * FROM login";
			ResultSet rs4 = stmt.executeQuery(qur);
			while(rs4.next()) {
			System.out.println(rs4.getInt(1) + "\t " + rs4.getString(2) + 
	                  "   \t " + rs4.getString(3));
			}
			break;
			
		case 5:
			System.out.println("Search records from 'login' table");
			System.out.println("Enter the value you want to search");
			String val2 = sc.next();
			String q9 = "SELECT * FROM login";
			ResultSet rs5 = stmt.executeQuery(q9);
			while(rs5.next()) {
				if(val2.equalsIgnoreCase(rs5.getString(1)) || val2.equalsIgnoreCase(rs5.getString(2)) || val2.equalsIgnoreCase(rs5.getString(3))) {
					 System.out.println(rs5.getInt(1) + "\t " + rs5.getString(2) + 
			                  "   \t " + rs5.getString(3));
				}
			}
			break;	
		}

	}

}
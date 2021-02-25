package com.know.jdbc;
import java.sql.*;
import java.util.*;

public class Login_Through_db {

	public static void main(String[] args) throws Exception {
		Connection con = DriverManager.getConnection("jdbc:mysql:///ash", "root", "ashfaaq1997");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter username");
		String uname= sc.next();
		System.out.println("Enter password");
		String pass = sc.next();
		
		Statement stmt = con.createStatement();
		String qur = "SELECT * FROM login";
		
		ResultSet rs = stmt.executeQuery(qur);
		
		int count=0;
		while(rs.next()) {
			if(rs.getString(2).equalsIgnoreCase(uname) && rs.getString(3).equals(pass)) {
				System.out.println("Login Successfull");
				count++;
			}			
		}
		if(count == 0) {
			System.out.println("Incorrect credentials..");
		}
		con.close();
		stmt.close();
	}
}
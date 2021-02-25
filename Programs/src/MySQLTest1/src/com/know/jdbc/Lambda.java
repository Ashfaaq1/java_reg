package com.know.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Lambda {

	public static void main(String[] args) throws Exception {
		Connection con = DriverManager.getConnection("jdbc:mysql:///ash", "root", "ashfaaq1997");
		Scanner sc = new Scanner(System.in);
		
		Thread tt = Thread.currentThread();
		System.out.println(tt.getName());
		
		System.out.println("Enter username");
		String uname= sc.next();
		System.out.println("Enter password");
		String pass = sc.next();
		
		Statement stmt = con.createStatement();
		String qur = "SELECT * FROM login";
		
		ResultSet rs = stmt.executeQuery(qur);
		
		Thread t1 = new Thread(() -> {
			System.out.println(tt.isAlive());
			
			int count=0;
			Thread t = Thread.currentThread();
			t.setName("Lol");
			try {
				while(rs.next()) {
					if(rs.getString(2).equalsIgnoreCase(uname) && rs.getString(3).equals(pass)) {
						System.out.println("Login Successfull");
						count++;
					}			
				}
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
			if(count == 0) {
				System.out.println("Incorrect credentials..");
			}
			
			System.out.println(t.getName());
		});
		
		
		
		t1.start();
		System.out.println(t1.isAlive());
		//con.close();
		

	}
	
}

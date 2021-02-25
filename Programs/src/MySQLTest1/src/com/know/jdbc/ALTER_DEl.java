package com.know.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ALTER_DEl {

	public static void main(String[] args) throws Exception {
		final String url = "jdbc:mysql:///ash";
	      final String user = "root";
	      final String password = "ashfaaq1997";

	      // connection
	      Connection con = DriverManager.getConnection(url, user, password);
	      
	      Statement stm = con.createStatement();
	      
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter column name to del: ");
	      String cname = sc.next();
	      
	      String qu = "ALTER TABLE login DROP COLUMN "+ cname;
	      
	      stm.execute(qu);
	      con.close();
	      stm.close();
	}

}

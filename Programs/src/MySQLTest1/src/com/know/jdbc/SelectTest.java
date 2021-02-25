package com.know.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectTest {

   public static void main(String[] args) throws Exception {

      // variables
      final String url = "jdbc:mysql:///ash";
      final String user = "root";
      final String password = "ashfaaq1997";

      // connection
      Connection con = DriverManager.getConnection(url, user, password);

      //statement
      Statement st = con.createStatement();

      //SQL query
      String query = "SELECT * FROM LOGIN";

      // send  SQL query in Database software
      ResultSet rs = st.executeQuery(query);

      
      boolean flag = false;
      System.out.println("Sno."+ "\tUname"+ "\tPassword");
      System.out.println("---------------------------------");
      while (rs.next()) {
         flag = true;
         
         
         System.out.println(rs.getInt(1) + "\t " + rs.getString(2) + 
                  "   \t " + rs.getString(3));
      }

      if (flag == true) {
         System.out.println("\nRecords retrieved and displayed");
      } else {
         System.out.println("Record not found");
      }

      
      rs.close();
      st.close();
      con.close();
}
}
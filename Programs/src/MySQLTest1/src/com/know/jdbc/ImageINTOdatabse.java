package com.know.jdbc;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;

public class ImageINTOdatabse {

	public static void main(String[] args) throws Exception {
		Connection con = DriverManager.getConnection("jdbc:mysql:///ash", "root", "ashfaaq1997");
		String qur = "INSERT INTO pewd VALUES(?,?)";
		PreparedStatement pstmt = con.prepareStatement(qur);
		pstmt.setInt(1, 69420);
		InputStream inp = new FileInputStream("D:/pew.gif");
		pstmt.setBlob(2,inp);
		pstmt.execute();
		con.close();
		pstmt.close();

	}

}

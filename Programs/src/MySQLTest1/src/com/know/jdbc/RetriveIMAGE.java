package com.know.jdbc;

import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RetriveIMAGE {

	public static void main(String[] args) throws Exception {
		Connection con = DriverManager.getConnection("jdbc:mysql:///ash", "root", "ashfaaq1997");
		FileOutputStream fos = new FileOutputStream("D:\\aaaa.jpg");
		
		String qur = "SELECT * FROM pictures";
		PreparedStatement pst = con.prepareStatement(qur);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			Blob blob = rs.getBlob("Image");
			byte b[] =  blob.getBytes(1, (int)blob.length());
			fos.write(b);
			
			System.out.println(rs.getInt(1) + "\t" + rs.getBlob(2));
		}
		System.out.println("Extracted");
		con.close();
		pst.close();
		fos.close();

	}

}

package InputOutputStream;

import java.io.*;
import java.awt.color.*;
public class WriteTXT {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileOutputStream fout = new FileOutputStream("E:\\nothing1234.csv");
		BufferedOutputStream bout = new BufferedOutputStream(fout,1000);
		System.out.println("Write about yourself");
		char ch;
		while((ch = (char) br.read())!= '`') {
			bout.write(ch);
			
		}
		bout.close();
		System.out.println("End");

	}

}

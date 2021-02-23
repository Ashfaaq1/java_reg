package InputOutputStream;

import java.io.*;

public class ReadTXT{
	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("D:\\ashfaaq.jpeg");
		BufferedInputStream bin = new BufferedInputStream(fin);
		int ch;
		while((ch = bin.read()) != -1) {
			System.out.print((char)ch);
		}
		bin.close();
	}
	
}

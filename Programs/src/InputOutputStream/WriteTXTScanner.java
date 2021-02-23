package InputOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteTXTScanner {

	public static void main(String[] args) throws IOException {
		FileOutputStream fout = new FileOutputStream("D:\\Writeing text Scanner.txt");
		Scanner sc = new Scanner(System.in);
		System.out.println("Tell me about your dog");
		String data = sc.nextLine();
		byte[] b = data.getBytes();
		//while {
		
		fout.write(b);
		//}
		fout.close();
		
		

	}

}

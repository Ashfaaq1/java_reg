package InputOutputStream;

import java.io.*;
import java.util.zip.DeflaterOutputStream;

public class zip {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileOutputStream fo = new FileOutputStream("D:\\ash.txt");
		
		BufferedOutputStream bout = new BufferedOutputStream(fo, 1000);
		DeflaterOutputStream de = new DeflaterOutputStream(bout);
		
		char ch;
		while((ch = (char)br.read()) != '`') {
			de.write(ch);
		}
		de.close();
		System.out.println("Zipped");
		}
		

	}


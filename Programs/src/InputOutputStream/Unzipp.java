package InputOutputStream;

import java.io.*;
import java.util.zip.InflaterInputStream;
public class Unzipp {

	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("D:\\ash.txt");
		InflaterInputStream iff = new InflaterInputStream(fin);
		FileOutputStream fout = new FileOutputStream("D:\\ashunzipcsv.txt");
		int ch;
		while((ch = iff.read()) != -1) {
			fout.write((char)ch);
		}
		fout.close();
		System.out.println("unzipped");
		}

	}



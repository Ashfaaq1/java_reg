package Serialization_De;

import java.io.*;
import java.util.Scanner;
public class Serialization {

public static void main(String[] args) throws IOException, ClassNotFoundException {
// InputStreamReader obj1 = new InputStreamReader(System.in);
// BufferedReader br = new BufferedReader(obj1);
// String name = br.readLine();
	
	//Demo223 obj = new Demo223();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	FileOutputStream fout = new FileOutputStream("D:\\nothing1.java");
	@SuppressWarnings("resource")
	BufferedOutputStream bout = new BufferedOutputStream(fout,1000);
	ObjectOutputStream out = new ObjectOutputStream(bout);
	Demo223 obj = new Demo223();
	out.writeObject(obj);
	System.out.println("Write");
	String some = "";
	
	
	char ch;
	while((ch = (char) br.read())!= '`') {
		bout.write(ch);
		some = some+ch;
	}
	out.close();
	bout.close();
	System.out.println("End");
	System.out.println(some);
	
	
	


//FileOutputStream f = new FileOutputStream("D://A.java");
//BufferedOutputStream D = new BufferedOutputStream(f,1024);
//ObjectOutputStream out = new ObjectOutputStream(D);
//out.writeObject(obj);
//out.close();
//System.out.println("Success");

}

}

class Demo223 implements Serializable{

//Demo223(BufferedOutputStream bout){
//
//}
void display(BufferedOutputStream bout) {
System.out.println(bout);
}
}
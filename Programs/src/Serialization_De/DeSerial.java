package Serialization_De;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerial {

public static void main(String[] args) throws IOException, ClassNotFoundException {
FileInputStream fin =new FileInputStream("D://A.java");
ObjectInputStream ob = new ObjectInputStream(fin);
Demo223 obj =(Demo223) ob.readObject();
//obj.display();
ob.close();
System.out.println(ob.read());

}

}


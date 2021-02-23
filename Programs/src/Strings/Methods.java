package Strings;
import java.util.Scanner;
import java.lang.*;
public class Methods {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter details");
	String dt = sc.nextLine();
	
	// Length method
	System.out.println("Total number of character are " + dt.length());
	char[] ch = dt.toCharArray();
	System.out.println(ch.length);
	
	//boolean method
	boolean x = dt.startsWith("H");
	boolean y = dt.endsWith("g");
	System.out.println("Doe's the sentence starts with--- " + "H "  + x);
	System.out.println("Doe's the sentence ends with--- " + "g " + y);
	
	//Index of method
	int n = dt.indexOf("vij");
	int s = dt.lastIndexOf("vij");
	System.out.println(n);
	System.out.println(s);
	
	//Replace method
	String ab = dt.replace('a', 'e');
	System.out.println(ab);
	
	// SubString
	String a1 = dt.substring(1,12);
	System.out.println("This are the characters in between 1 to 12 with respect to index number " + a1);
	
	// changing the Case
	String a2 = dt.toUpperCase();
	System.out.println("Given sentence in captial letters " + a2);
	String a3 = dt.toLowerCase();
	System.out.println("Given sentence in small letters " + a3);
	
	// Trim 
	String a4 = dt.trim();
	System.out.println("Sentence without white space " + a4);
	
	// Concat strings
	String A1 = "make the days count";
	String a5 = dt.concat(A1);
	System.out.println(a5);
	
	//Split method
	String[] a6 = dt.split(",");
	System.out.println(a6);
		
	//GetChars
	char[] a7 = new char[24];
	dt.getChars(2,9,a7,0);
	System.out.println(a7);
	
	//equals 
	boolean a8 = A1.equals(dt);
	if(A1.equals(dt)) {
	 System.out.println("Strings are same");
	}
	 else {System.out.println("Strings are not same");}
	
	
	}
		
}

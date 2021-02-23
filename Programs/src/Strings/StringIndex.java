package Strings;
import java.lang.*;
import java.util.Scanner;

public class StringIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String sen = sc.nextLine();
		
		for(int i = 0; i <= sen.length() - 1; i ++) {
			char ch = sen.charAt(i);
		int n = sen.indexOf(ch);
		System.out.println("Given char repeated for " + n);
		}
		
	   

	}

}

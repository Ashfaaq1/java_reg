package Strings;
import java.lang.*;
import java.util.Scanner;

public class Palindrome {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text");
		String s = sc.nextLine();
		String ch1 = "";
		for(int i = s.length() - 1; i >= 0; i --) {
		ch1 = ch1+s.charAt(i);
			
	}if(s.equals(ch1)) {	
		System.out.println("Is palindrome");
	}
	else {
		System.out.println("Not a palindrome");
	}

}
}
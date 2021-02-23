package Strings;
import java.util.Scanner;
import java.lang.*;

public class StringCount {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter employees names");
	String names = sc.nextLine();
	char[] ch1 = names.toCharArray();
	
	System.out.println("Enter the letter ");
	String letter = sc.nextLine();
	char ch = letter.charAt(0);
	
	int count = 0;
	for(int i = 0;i < ch1.length-1; i++) {
		if(ch1[i] == ch) {
			count++;
			}
	}
	
	System.out.println("Given letter have repeated " + count + " times.");

	}

}

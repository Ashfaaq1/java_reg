package Strings;
import java.util.Scanner;
import java.lang.*;
public class StringCharRemove {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter sentence");
    String sen = sc.nextLine();
    System.out.println("Enter the char you want to remove");
    String letter = sc.nextLine();
    char[] sen2ch  = sen.toCharArray();
    char ch = letter.charAt(0);
    
    for(int i = 0; i <= sen2ch.length - 1; i ++){
    	if(sen2ch[i]!= ch) {
    		System.out.print(sen2ch[i]);
    	}
         
    }
	}
}



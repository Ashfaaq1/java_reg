package Strings;
import java.util.*;
public class Rev {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of elements:");
	int num = sc.nextInt();
	String rev[] = new String[num];
	System.out.println("Enter the string to reverse");
	for (int i = rev.length; i >= 0; i --) {
		rev[i] = sc.nextLine();
	}System.out.println(rev);
	
}
}

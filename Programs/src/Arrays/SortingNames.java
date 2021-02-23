package Arrays;
import java.util.*;

public class SortingNames {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter how many names you want to input: ");
	int num = sc.nextInt();
	String names[] = new String[num];
	System.out.println("Enter names");
	//int s1 = 'a';
	for(int i = 0; i < names.length; i ++) {
		names[i] = sc.next();
		
	}
	for(int i = 97; i < 123; i ++) {
		for(int j = 0;j < names.length;j ++) {
			int ch = names[j].charAt(0);
			if(ch == i) {
				System.out.println( names[j]);
			}
		}
	}
	
	}
	

	}



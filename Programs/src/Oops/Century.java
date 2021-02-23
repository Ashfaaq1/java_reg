package Oops;
import java.util.*;

class Which{
	private int a;
	public Which(int j) {
		a = j;
		
	}
	void method() {
			if(a % 100 == 0) {
				System.out.println(a/100 + " Century.");
			}else {
				System.out.println((a/100 + 1) + " Century.");
			}
	}
	
}

public class Century {

	public static void main(String[] args) {
		System.out.print("Enter year to know which century it is: ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		Which obj = new Which(year);
		obj.method();
	
	}

}

package Oops;
import java.util.*;

class sum{
	private long a;
	
	sum(long j){
		a = j;
	}
	public void method() {
		long count = 0;
		for(long i = 1; i <= a; i ++) {
			count = count + i;
		}
		System.out.println("Sum of first " + "'"+a+"'" +" natural numbers is: " + count);
	}	
}

public class Counting {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a natural number: ");
		long num = sc.nextLong();
		sum obj = new sum(num);
		obj.method();
	}
}
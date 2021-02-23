package Oops;
import java.util.*;

class z{
	private int a;
	private int b;
	
	public void method(int i, int j) {
		a = i;
		b = j;
	System.out.println(a + b);
	}
}

public class Prac {
	static int MyPrac(int x, int y){
		return x + y;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int num = sc.nextInt();
		System.out.println("Enter another value");
		int num1 = sc.nextInt();
		System.out.println(MyPrac(num, num1));	
		
		System.out.println("1st value");
		int n1 = sc.nextInt();
		System.out.println("2nd value");
		int n2 = sc.nextInt();
		z abc = new z();
		abc.method(n1, n2);
	}
}

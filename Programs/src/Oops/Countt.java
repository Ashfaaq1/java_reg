package Oops;
import java.util.*;

class sum1{
	private int a;
	private int b;
	
	sum1(int j, int k){
		a = j;
		b = k;
	}
	public void method() {
		int count = 0;
		for(int i = a; i <= b; i ++) {
			count = count + i;
		}
		System.out.println("Sum from " + "'"+a+"'" +" to " + "'"+b+"'" + " is: " + count);
	}	
}

public class Countt {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a natural number from where you want to add: ");
		int num1 = sc.nextInt();
		System.out.print("Enter the number till where you want to add: ");
		int num2 = sc.nextInt();
		sum1 obj = new sum1(num1,num2);
		obj.method();
	}
}
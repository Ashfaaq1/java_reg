package Oops;
import java.util.*;

class Arithmetic {
	private int a;
	private int b;
	private int c;
	private float e;
	private float f;
	
	Arithmetic(int i, int j){
		a = i;
		b = j;
	
	}
	Arithmetic(int i, int j, int k){
		a = i;
		b = j;
		c = k;
	}
	
	Arithmetic(float i, float j) {
		e = i;
		f = j;
		
	}
	
	public void ad1() {
		System.out.println ("Ans: " + (a + b));
	}
	public void ad2() {
		System.out.println("Ans: " + (a + b + c));
	}
	public void subs1() {
		System.out.println("Ans: " + (a - b));
	}
	public void subs2() {
		System.out.println("Ans: " + (a - b - c));
	}
	public void div1() {
		System.out.println("Ans: " + (a / b));
	}
	public void per1() {
		System.out.println("Ans: " + (e % f));
	}
	}
	
class Add{
	public static void main(String[] args) {
		
		System.out.println("Enter two values for addition: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b =sc.nextInt();
		Arithmetic add = new Arithmetic(a, b);
		add.ad1();
		
		System.out.println("\nEnter three values for addition: ");
		int a1 = sc.nextInt();
		int b1 =sc.nextInt();
		int c = sc.nextInt();
		Arithmetic add1 = new Arithmetic(a1,b1,c);
		add1.ad2();
		
		System.out.println("\nEnter two values for Sub");
		int a2 = sc.nextInt();
		int b2 =sc.nextInt();
		Arithmetic sub1 = new Arithmetic(a2, b2);
		sub1.subs1();
		
		System.out.println("\nEnter 3 values sub");
		int a3 = sc.nextInt();
		int b3 = sc.nextInt();
		int c3 = sc.nextInt();
		Arithmetic sub2 = new Arithmetic(a3,b3,c3);
		sub2.subs2();
		
		System.out.println("\nEnter two values for division");
		int a4 = sc.nextInt();
		int b4 = sc.nextInt();
		Arithmetic div = new Arithmetic(a4, b4);
		div.div1();
		
		System.out.println("\nEneter two values for percentail");
		float a6 = sc.nextFloat();
		float b6 = sc.nextFloat();
		Arithmetic per = new Arithmetic(a6, b6);
		per.per1();
		
	}
	}
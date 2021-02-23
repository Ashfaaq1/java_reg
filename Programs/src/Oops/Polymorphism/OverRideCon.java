package Oops.Polymorphism;
import java.util.*;

class one{
	int num1;
	int num2;
	one(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	void dis1() {
		System.out.println(num1 + num2);
	}
}

class two extends one {
	two(int num1, int num2){
		super(num1, num2);
	}
	void dis2() {
		super.dis1();
		System.out.println(num1 - num2);
	}
}
class three extends two{
	three(int num1, int num2) {
		super(num1, num2);
	}
	void dis1() {
		super.dis2();
		System.out.println(num1 * num2);
	}
	
}
public class OverRideCon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two values: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		three obj3 = new three(num1, num2);
		obj3.dis1();	
	}
}
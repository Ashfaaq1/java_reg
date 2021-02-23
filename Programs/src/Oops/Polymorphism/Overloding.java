package Oops.Polymorphism;
import java.util.*;

class first{
	int num;
	int num1;
	String name;
	
	public void setfirst(int num, int num1) {
		this.num = num;
		this.num1 = num1;
	}
	public int getnum() {
		return num;
	}
	public int getnum1() {
		return num1;	
	}
	
	public void setfirst(String name, int num) {
		this.name = name;
		this.num = num;
	}
	public String getname() {
		return name;
	}
	public int getnum2() {
		return num;
	}
	
	public void display() {
		System.out.println(num + "+" + num1 + " = " + (getnum() + getnum1())); 
		}
	public void dis2() {
		System.out.println("\nName: " + getname() + "\nAge: " + getnum2());
	}
}
class class1{
	
	public void method(int num1, int num2) {
		System.out.println(num1 + num2);
		
	}
	
	public void method(int num1, float num2) {
	    System.out.println(num1 - num2);
	}
}
public class Overloding {

	public static void main(String[] args) {
		System.out.println("Using Setter and getter");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int val1 = sc.nextInt();
		System.out.println("Enter another value: ");
		int val2 = sc.nextInt();
		first obj = new first();
		obj.setfirst(val1, val2);
		obj.display();
		
		System.out.println("Enter name: ");
		String nam = sc.next();
		System.out.println("Enter age: ");
		int ag = sc.nextInt();
		obj.setfirst(nam, ag);
		obj.dis2();
		
		System.out.println("Using methods");
		System.out.println("\nEnter two values addition: ");
		int value1 = sc.nextInt();
		int value2 = sc.nextInt();
		class1 obj1 = new class1();
		obj1.method(value1, value2);
		
		System.out.println("Now Enter values for sub: ");
		int value3 = sc.nextInt();
		float value4 = sc.nextInt();
		obj1.method(value3, value4);
		}
}
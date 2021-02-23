package Oops.Inheritance;
import java.util.*;

class Iphone{
	String com;
	String model;
	String os;
			
	void display() {
		System.out.println("\nCompany: "+ com + "\nmodel : " + model + "\nos: " + os);
	}
}

class version extends Iphone{
	int price;
	version(String com,String model, String os, int price){
		this.price = price;
		super.model = model;
		super.os = os;
		super.com = com;
	}
	void display1() {
		super.display();
		System.out.println("Cost is: " + price);
	}
}
public class Inheritance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter company: ");
		String com = sc.next();
		System.out.println("Enter model: ");
		String model = sc.next();
		System.out.println("Enter os: ");
		String os = sc.next();
		System.out.println("Enter price: ");
		int cost = sc.nextInt();
		version obj = new version(com,model, os, cost);
		obj.display1();
		
		System.out.println("\nEnter company: ");
		String com1 = sc.next();
		System.out.println("Enter model: ");
		String model1 = sc.next();
		System.out.println("Enter os: ");
		String os1 = sc.next();
		System.out.println("Enter price: ");
		int cost1 = sc.nextInt();
		version obj1 = new version(com1,model1, os1, cost1);
		obj1.display1();
		
	}
}
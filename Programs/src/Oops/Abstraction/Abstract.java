package Oops.Abstraction;
import java.util.Scanner;

abstract class cars{
	String regno;
	String fuel;
	public cars(String regno, String fuel) {
		this.regno = regno;
		this.fuel = fuel;
	}
	  void wheels() {
		  System.out.println("Four Wheel drive." + "\nRegistraction number: " + regno + "."
				  + "\nFuel type: " + fuel + ".");
	  }
	abstract void milage();
	abstract void Engine_cc();
}

class Hexa extends cars{
	
	public Hexa(String regno, String fuel) {
		super(regno, fuel);
	}
	 
	void milage() {
		System.out.println("Car name: " + "Tata Hexa");
		super.wheels();
		System.out.println("Milage: " + "17.6 Kmpl");
		this.Engine_cc();
	}
	void Engine_cc() {
		System.out.println("Engine CC: " + "2179 CC");
	}
}

class Xuv500 extends cars {
	public Xuv500(String regno, String fuel) {
		super(regno,fuel);
	}
	void milage() {
	
		System.out.println("\nCar Name: " + "Mahindra Xuv500");
		super.wheels();
		System.out.println("Milage: " + "16.5 Kmpl");
		this.Engine_cc();
	}
	void Engine_cc() {
		System.out.println("Engine CC: " + "2179 CC");
	}	
}

public class Abstract {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter vehicle registraction number: ");
		String rnum = sc.nextLine();
		System.out.print("Enter engine type: ");
		String etype = sc.nextLine();
		Hexa objh = new Hexa(rnum , etype);
		objh.milage();	
		
		System.out.println("\n***************************");
		System.out.print("\nEnter vehicle registraction number: ");
		String rnum1 = sc.nextLine();
		System.out.print("Enter engine type: ");
		String etype1 = sc.nextLine();
		Xuv500 objx = new Xuv500(rnum1, etype1);
		objx.milage();	
	}
}
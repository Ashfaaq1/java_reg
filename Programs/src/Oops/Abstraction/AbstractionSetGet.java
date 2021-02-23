package Oops.Abstraction;
import java.util.*;

abstract class Computer{
	String name;
	public void setName(String name) {
		
	}
	public String getName() {
		return name;
	}
	void headLine() {
		System.out.println("Computer details.");
		System.out.println("Company: " + getName());
	}
	abstract void details();
}

class Lappy extends Computer{
	
	public void setLappy(String name) {
		super.name = name;
		
	}
	public String getName() {
		return name;
	}
	
	void details() {
		if(getName().equalsIgnoreCase("hp")) {
			super.headLine();
			System.out.println("Operating system: " + "Windows 10");
			System.out.println("Pice: " + "50000");		
		}
		else if(getName().equalsIgnoreCase("macbook air")) {
			super.headLine();
			System.out.println("Operating system: " + "Macos 11.1");
			System.out.println("Price: " + "90000");
			
		}else {
			System.out.println("Not in records.");
		}
		
		}
		
	}


public class AbstractionSetGet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter PC name to get details: ");
		String name = sc.nextLine();
		Lappy objl = new Lappy();
		objl.setLappy(name);
		objl.details();

	}

}

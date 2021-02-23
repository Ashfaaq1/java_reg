package Oops.Polymorphism;
import java.util.*;

class God{
	String pro;
	
	void result1(String pro){
		this.pro = pro;
		System.out.println("\nProphets are sent on earth to spread the message of " + pro);
	}
}
class Prophets extends God {
	String name;
	String year;
	@Override
	void result1(String name) {
		this.name = name;
		super.result1("God.");
		System.out.println("Name: " + name + ".");
	}
}
class Birth extends Prophets{
	@Override
	void result1(String year) {
		super.year = year;
		System.out.println("Year of birth: " + year + ".");
	}
	
}

public class OverRiding {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter name of the Prophet : ");
		String name = sc.nextLine();
		Prophets pobj = new Prophets();
		
		
		System.out.println("Enter the year of birth: ");
		String year = sc.nextLine();
		
		Birth bobj  = new Birth();
		pobj.result1(name);
		bobj.result1(year);
		
		System.out.println("\nEnter name of the Prophet : ");
		String name1 = sc.nextLine();
		System.out.println("Enter the year of birth: ");
		String year1 = sc.nextLine();
		pobj.result1(name1);
		bobj.result1(year1);
	}
}
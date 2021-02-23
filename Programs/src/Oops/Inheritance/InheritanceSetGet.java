package Oops.Inheritance;
import java.util.*;

class Phones{
	String com;
	
	public void setPhones() {
		
	}
    public String getPhones() {
		return com;
	}
    public void dis() {
    	System.out.println("\nCompany : " + getPhones());
    	
    }
}

class Details extends Phones{
	String model;
	String ios;
	String price;
	
	public void setdetails(String com, String model, String ios, String price) {
		super.com = com;
		
		this.model = model;
		this.ios = ios;
		this.price = price;
	}
	public String getmodel() {
		return model;
	}
	public String getios() {
		return ios;
	}
	public String getprice() {
		return price;
	}
		
		
	public void dis() {
		super.dis();
		System.out.println("Model: " + getmodel() + "\nios: " + getios() + "\nPrice: " + getprice());
	}
}
public class InheritanceSetGet {

	public static void main(String[] args) {
		System.out.println("Enter the details of Iphone");
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter model: ");
		String model = sc.next();
		System.out.print("Enter ios: ");
		String ios = sc.next();
		System.out.print("Enter Price: ");
		String price = sc.next();
		
		Details obj = new Details();
		obj.setdetails("Apple", model, ios, price);
		obj.dis();
		
		System.out.print("\nEnter model: ");
		String model1 = sc.next();
		System.out.print("Enter ios: ");
		String ios1 = sc.next();
		System.out.print("Enter Price: ");
		String price1 = sc.next();
		
		Details obj1 = new Details();
		obj1.setdetails("Apple", model1, ios1, price1);
		obj1.dis();
		
		System.out.print("\nEnter model: ");
		String model2 = sc.next();
		System.out.print("Enter ios: ");
		String ios2 = sc.next();
		System.out.print("Enter Price: ");
		String price2 = sc.next();
		
		Details obj2 = new Details();
		obj2.setdetails("Apple", model2, ios2, price2);
		obj2.dis();
	}
}
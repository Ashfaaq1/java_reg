package Oops.Interface;

import java.util.Scanner;

interface Ione{
	String pin1 = "1234";
	String pin2 = "4567";
	public void n();
	
}

abstract class Itwo implements Ione{
	
	public abstract void m1();
	String name;
	void m2(String name) {
		this.name = name;
	}
}

class Ithree extends Itwo{
	public void n() {
		if(super.name.equals(pin1)) {
			System.out.println("Welcome Sitaram. " + "\nAccount number: " + "123456. " + "\nBalance: " + "5000000.");	
	}
		else if(super.name.equals(pin2)) {
			System.out.println("Welcome Ashfaaq " + "\nAccount number: " + "567890 " + "\nBalance: " + "78000");			
		}else {
		System.out.println("You have entered wrong pin.");
		}
	}
	
	@Override
	public void m1() {
		System.out.println("Welcome to SBI Atm" );		
	}
}

public class AtmDetails {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Ithree obj = new Ithree();
		obj.m1();
		System.out.print("Enter your pin: ");
		String pin = sc.next();
		obj.m2(pin);
		obj.n();
	}
}
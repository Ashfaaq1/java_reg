package Oops;
import java.util.*;
import java.math.*;

class Einstein{
	private double v;
	private double c;
	//private double lam;
	
	Einstein(double i, double j) {
		v = i;
		c = j;
		//lam = k;
	}
	void method() {
		double formula = Math.sqrt(1-(v * v / c * c));
		System.out.println("Relativistic factor (lamda) is: " + (1/formula));
	}
}

public class Relativity {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Velocity of an electron(v): ");
		double vel = sc.nextDouble();
		System.out.println("By taking Speed constant as 3*10^8");
		//System.out.print(" relativistic factor: ");
		double con = (3 * (Math.pow(10, 8)));
		Einstein obj = new Einstein(vel, con);
		obj.method();
	}
}
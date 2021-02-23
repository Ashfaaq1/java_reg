package Oops;
import java.util.*;

public class Adding {
	
		Scanner sc = new Scanner(System.in);
		float num1 =  sc.nextInt();
		float num2 = sc.nextInt();
		float num3 = sc.nextInt();
		float num4 = sc.nextInt();
		
		// Parameterized constructor
		public Adding(float num1,float num2){
		}
		
		// Default constructor
		public Adding() {
			
			System.out.println("Multiplication: " + num1 * num2);
		}
		
		// Method
		public void main() {
			
			System.out.println("Division: " + (num3 / num4));
		}
	
	public static void main(String[] args) {
		System.out.println("Enter values for Multiplication and then Division: ");
		
		// Calling Default constructor
		Adding ad1 = new Adding();
		
		// Calling method
		ad1.main();
		
		// Calling  Parameterized constructor
		System.out.println("Enter values for Addition");
		Adding ad = new Adding(ad1.num1, ad1.num2);
			
		System.out.println("Addition: " + (ad.num1 + ad.num2));
		}
	}

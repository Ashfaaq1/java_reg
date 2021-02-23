package Oops.Exception;
import java.util.InputMismatchException;
import java.util.Scanner;

class TryDemo {

	int x;
	int y;
	int z;

	public void setxy(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getx() {
		return x;
	}

	public int gety() {
		return y;
	}

	void method() {
		try{
			System.out.println((getx()/gety()));
		}
		catch(ArithmeticException e) {
			System.out.println("Demoninator can't be zero");
		}
		catch(InputMismatchException f) {
			System.out.println("Index missmatch");
		}
	}
}

public class Handlingg {

	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(System.in);
		System.out.println("Numerator");
		int num1 = sc.nextInt();
		System.out.println("Demoninator");
		int num2 = sc.nextInt();
		TryDemo obj = new TryDemo();
		obj.setxy(num1, num2);
		
		obj.method();
		}
		catch(Exception e) {
			System.out.println("Enter only natural numbers");
		}
		

	}

}

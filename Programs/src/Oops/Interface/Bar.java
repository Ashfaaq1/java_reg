package Oops.Interface;
import java.util.*;

interface Iteams{
	float bp = 1295;
	float kfLite = 110;
	float blackLable = 2110;
}
abstract class quantity implements Iteams {
	int quantity;
	int brand;
	void m(int brand, int quantity) {
		this.brand = brand;
		this.quantity = quantity;
	}

	abstract void price();
}

class price extends quantity{

	@Override
	void price() {
		switch(this.brand){
		case 1 :
			System.out.println("price per bottle: " + bp);
			System.out.println("-------------------------\n");
			if(this.quantity > 1) {
				float a = bp *0.05f;
				System.out.println("After discount the price is:  " + ((bp - a) * this.quantity));
			}else {
				System.out.println("Your total is: " + bp);
			}
			break;
		
		case 2:
			System.out.println("price per bottle: " + kfLite);
			System.out.println("------------------------\n");
			if(this.quantity > 1) {
				float b = kfLite * 0.03f;
				System.out.println("After discount the price is: " + ((kfLite - b) * this.quantity));
			}else {
				System.out.println("Your total is: " + kfLite);
			}
			break;
		
		case 3:
			System.out.println("Actual price is: " + blackLable);
			System.out.println("----------------------------\n");
			if(this.quantity > 1) {
				float c = blackLable * 0.05f;
				System.out.println("After discount the price is: " + ((blackLable - c) * this.quantity));
			}else {
				System.out.println("Your total is: " + blackLable);
			}
		
		
		}
		
	}
	
}


public class Bar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Available brands: \n1. BP\t2. KF lite\t3. Black Lable");
		System.out.println("Which brand you want(Enter brand number)..");
		int brand = sc.nextInt();
		System.out.println("How many bottles you want..");
		int quan = sc.nextInt();
		price objq = new price();
		objq.m(brand, quan);
	
		
		objq.price();

	}

}

package Projects;

import java.util.Scanner;

public class Don {
static float fina;
	public static void main(String[] args) {
		int k=0;
		int bp=1800;
		int kfLite=110;
		int blackLable=2800;
		float a1 = 0, b1 = 0, c1 = 0;
		float fin=0;
		
		Scanner sc=new Scanner(System.in);
		while(k==0) {
			System.out.println("Available brands..");
			System.out.println("1:BP 2:kf lite 3:black lable");
			int o=sc.nextInt();
			switch(o){
	 	case 1 :System.out.println("How many bottles you want..");
	 		int quantity =sc.nextInt();
	 		
			System.out.println("price per bottle: " + bp);
			System.out.println("-------------------------\n");
			
			if(quantity > 1) {
				float a = bp *0.05f;
				a1 = ((bp - a) * quantity);
				
				System.out.println("After 5% off:  " + a1);
			}else {
				a1 = bp;
				System.out.println("Your total is: " + a1);
			}
			break;
		
		case 2:System.out.println("How many bottles you want..");
			int quantity1 =sc.nextInt();
			
			System.out.println("price per bottle: " + kfLite);
			System.out.println("------------------------\n");
			if(quantity1 > 1) {
				float b = kfLite * 0.03f;
				b1 = ((kfLite - b) * quantity1);
				System.out.println("After 3% off: " + b1);
			}else {
				b1 = kfLite;
				
				System.out.println("Your total is: " + b1);
			}
			break;
		
		case 3:
			System.out.println("How many bottles you want..");
			int quantity2 =sc.nextInt();
			
			System.out.println("price per bottle: " + blackLable);
			System.out.println("----------------------------\n");
			if(quantity2 > 1) {
				float c = blackLable * 0.05f;
				c1 = ((blackLable - c) * quantity2);
				System.out.println("After 5% off: " + c1);
			}else {
				c1 = blackLable;
				System.out.println("Your total is: " + c1);
			}break;
			}	
			System.out.println("\nenter 1 to continue");
			System.out.println("enter 2 to end shopping");
			int d=sc.nextInt();
			
			fin +=(a1 + b1 + c1);
			
			if(d==2) {
				k++;
				fina=fin;
				System.out.println("Net total: " + fina );
			}
		}
		
	}
}

package Projects;

import java.util.Scanner;

public class PanShop {
static float ptotal;
	public static void main(String[] args) {
		int k=0;
		int Lites = 17;
		int Kings = 17;
		int Dunhill = 18;
		int sweetPan = 20;
		float a1 = 0, b1 = 0, c1 = 0, d1 = 0;
		float fin = 0;
		
		Scanner sc=new Scanner(System.in);
		while(k==0) {
			System.out.println("Available iteams..");
			System.out.println("1:Lites 2:Kings 3:Dunhill 4:Sweet Pan");
			
			int o=sc.nextInt();
			switch(o){
	 	case 1 : System.out.println("How many lites you want..");
	 		int quantity =sc.nextInt();
			
				a1 = ((Lites) * quantity);
				
				System.out.println("your total for " + quantity + " lites is: " + a1);
	        break;
		
		case 2:System.out.println("How many Kings you want..");
			int quantity1 =sc.nextInt();
			
			b1 = ((Dunhill) * quantity1);
			System.out.println("your total for " + quantity1 + " kings is: " + a1);
			break;
			
		
		case 3:
			System.out.println("How many dunhills you want..");
			int quantity2 =sc.nextInt();
			
			c1 = ((Kings) * quantity2);
			System.out.println("your total for " + quantity2 + " dunhills is: " + c1);
			break;
			
			
		case 4:
			System.out.println("How many sweet pans you want..");
			int quantity3 =sc.nextInt();
			
			d1 = ((sweetPan) * quantity3);
			System.out.println("your total for " + quantity3 + " Sweet pans is: " + d1);
			break;
		}
			System.out.println("\nenter 1 to continue");
			System.out.println("enter 2 to end shopping");
			int d=sc.nextInt();
			
			fin=fin+(a1 + b1 + c1);
			
			if(d==2) {
				k++;
				ptotal = fin;
				System.out.println("Net total: " + ptotal );
			}
		}
		
	}
}
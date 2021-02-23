package Projects;

import java.util.Scanner;



interface Ione1{
	int sitaaccno = 7890123;
	int ashaccno = 123456;
	int amountsita = 100000;
	int amountash = 20000;
	String pin1 = "1234";
	String pin2 = "4567";
	public void coustomer();
	
}

abstract class Itwo1 implements Ione1{
	
	
	String pin;
	static int amount1;
	void pin(String pin) {
		this.pin = pin;
	}
	public void am(int amount1) {
		this.amount1 = amount1;
	}
	public abstract void welcome();
	public abstract void cash();
}

class Ithree1 extends Itwo1{
	@Override
	public void welcome() {
		System.out.println("                 WELCOME TO SBI ATM." );
		System.out.println("************************************************************");
	}
	
	public void coustomer() {
		if(super.pin.equals(pin1)) {
			System.out.println("\nWelcome Ganesh. ");	
			 try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			System.out.println( "\nAccount number: " + sitaaccno + "\nBalance: " + amountsita);
			
	}
		else if(super.pin.equals(pin2)) {
			System.out.println("\nWelcome Ashfaaq. " );
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					} 
					System.out.println("\nAccount number: " + ashaccno+ "\nBalance: " + amountash);
		}
		else {
		System.out.println("You have entered wrong pin.");
		}
	}
	
	@Override
	public void cash() {
		if(super.amount1 % 100 == 0) {
	    
		//Ganesh
		int amm = amountsita - super.amount1;
		if(super.pin.equals(pin1)) {
		if(amm < 0) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("You have insuffient funds.");
		}
		else {
			System.out.print("Transaction processing..");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print("..");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print("...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print("...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("\nCollect your cash..");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("\n\n******************");
			System.out.println("Available bal: " + amm);
		}
		}
		
		//Ashfaaq
		int amm1 = amountash - super.amount1;
	    if(super.pin.equals(pin2)) {	
		if(amm1 < 0) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("You have insuffient funds.");
		}
		else {
			System.out.print("Transaction processing..");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print("..");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print("...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print("...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("\nCollect your cash..");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("\n\n*************");
			System.out.println("Available bal: " + amm1);
		}	
		}
	}else {
		System.out.println("Enter amount which are multiples of 100.");
	}
}
}
public class BankAtm {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Ithree1 obj = new Ithree1();
		obj.welcome();
		System.out.print("\nEnter your pin: ");
		String pin = sc.next();
		obj.pin(pin);
		obj.coustomer();
		
		
		if(pin.equals(Ione1.pin1) || pin.equals(Ione1.pin2)){
		System.out.println("\nEnter withdraw amount: ");
		int amount = sc.nextInt();
		obj.am(amount);
		obj.cash();
	}
}
}
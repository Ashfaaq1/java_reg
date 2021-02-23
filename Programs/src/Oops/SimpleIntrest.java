package Oops;
import java.util.*;

class Pra1{
    int principle;
	int time;
	float rate;
	
	Pra1(int p, int t, float r){
		
		principle = p;
		time = t;
		rate = r;
	}
	
}
public class SimpleIntrest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principle amount: ");
		int pri = sc.nextInt();
		System.out.println("Enter Time period (in months): ");
		int time = sc.nextInt();
		System.out.println("Enter Rate of intrest ");
		float rate = sc.nextFloat();
				
		SimpleIntrest obj2 = new SimpleIntrest();
		Pra1 obj = new Pra1(pri, time, rate);
		obj2.demo1(obj);
		
	}
	void demo1(Pra1 x){
		float formula = ((x.principle * x.time * x.rate) / 100);
		System.out.println("\nPrinciple amount: " + x.principle + "\nTime period: " +x.time + "\nRate of intrest " + x.rate);
		System.out.println("\nSimple intrest: " + formula);
		float mon = (formula / x.time);
	    System.out.println("Intrest per month: " + mon );
		
	}
		
}

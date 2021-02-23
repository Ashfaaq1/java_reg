package Oops;
import java.util.*;

class Ashfaaq{
	private vinni xyz;
	Ashfaaq(vinni xyz){
		this.xyz = xyz;
	}
	void display() {
		switch(xyz.abc) {
		case "Chotu" :{
			System.out.println("Panda of our batch..");
			break;
		}
		case "Pari" :{
			System.out.println("Cutest smile..");
			break;
		}
		case "Vinnu" :{
			System.out.println("Buttery <3..");
			break;
		}
		case "Karan":{
			System.out.println("Brotha from another mum..");
		}
		}	
	}
}
	class vinni{
		String abc;
		vinni(String abc){
			this.abc = abc;
		}	
	}

public class HasAconstructor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name: ");
		String name = sc.next();
		vinni obj1 = new vinni(name);
		Ashfaaq obj2 = new Ashfaaq(obj1);
		obj2.display();
	}
}
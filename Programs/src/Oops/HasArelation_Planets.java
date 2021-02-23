package Oops;
import java.util.*;

class Planets1{
	public void earth_r() {
		System.out.println("Radius of Earth is 6,371 Km.");	
	}
	
	public void mars_r() {
		System.out.println("Radius of Mars is 3,389.5 Km");
	}
	}


class Earth1{
	private Planets1 plan;
	
	public void setEarth(Planets1 plan) {
		this.plan = plan;
	}
	public Planets1 getEarth() {
		return plan;
	}
	
	public void radius(String name) {
		if(name.equalsIgnoreCase("earth")) {
		plan.earth_r();
			
		}else {
			System.out.println("Not in records.");
		}
			
		}
	}
class Mars1{
	private Planets1 plan2;
	
	public void setMars(Planets1 plan2) {
		this.plan2 = plan2;	
	}
	public Planets1 getMars() {
		return plan2;
	}
	public void radius(String mars) {
		if(mars.equalsIgnoreCase("mars")) {
			plan2.mars_r();
		}else {
			System.out.println("Not in records.");
		}
	}
}

public class HasArelation_Planets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter planet : ");
		String planet = sc.next();
		Planets1 pobj = new Planets1();
		Earth1 eobj = new Earth1();
        eobj.setEarth(pobj);
        eobj.radius(planet);
        
        System.out.println("Enter planet: ");
        String planet1 = sc.next();
        Mars1 mobj = new Mars1();
        mobj.setMars(pobj);
        mobj.radius(planet1); 
	}
}
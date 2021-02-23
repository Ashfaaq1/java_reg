package Oops;

class Earth{
	private Planets planet1;
	
	public void setEarth(Planets planet1) {
		this.planet1 = planet1;
	}
	
	public Planets getEarth(Planets planet1) {
		return planet1;
	}
	public void radius() {
		planet1.earth_r();
	}
}

class Mars{
	Planets planet2;
	
	public void setMars(Planets planet2) {
		this.planet2 = planet2;	
	}
	public Planets getMars(Planets planet2) {
		return planet2;	
	}
	public void radius() {
		planet2.mars_r();
	}
}
class Planets{
	public void earth_r() {
		System.out.println("Radius of Earth is 6,371 Km.");
	}
	public void mars_r() {
		System.out.println("Radius of Mars is 3,389.5 Km.");
	}
}

public class HasArelation {

	public static void main(String[] args) {
		Planets pobj = new Planets();
		
		Earth eobj = new Earth();
		eobj.setEarth(pobj);
		eobj.radius();
		
		System.out.print("\n");
		Mars mobj = new Mars();
		mobj.setMars(pobj);
		mobj.radius();
	}

}

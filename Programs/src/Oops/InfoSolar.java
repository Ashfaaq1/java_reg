package Oops;
import java.util.*;

class SolarSys{
	private String name;
	
	public void setname(String name) {
		this.name = name;
	}
	public String getname() {
		return name;
	}
	public void result() {
		switch(getname()) {
		case "mercury":{
			System.out.println("Mercury have zero moons."
					+ "\nIt's Distance from the sun is 57.91 million Km.");
			break;
			}
		case "venus" :{
			System.out.println("Venus have zero moons."
					+ "\nIt's Distance from the sun is 108.2 million Km.");
			break;
		}
		case "earth" :{
			System.out.println("Earth have one moon."
					+  "\nIt's Distance from the sun is 149.6 million Km.");
			break;
		}
		case "mars" :{
			System.out.println("Mars have two moons. "
					+ "\nIt's Distance from the sun is 227.9 million Km.");
			break;
		}
		case "jupiter" :{
			System.out.println("Jupiter have 79 moons. "
					+ "\nIt's Distance from the sun is 778.5 million Km.");
			break;
		}
		case "saturn" :{
			System.out.println("Saturn have 82 moons."
					+ "\nIt's Distance from the sun is 1.434 billion Km.");
			break;
		}
		case "uranus" :{
			System.out.println("Uranus have 27 moons."
					+ "\nIt's Distance from the sun is 2.871 billion Km.");
			break;
		}
		case "neptune" :{
			System.out.println("Neptune have 14 moons."
					+ "\nIt's Distance from the sun is 4.495 billion Km.");
			break;
		}
		default :{
			System.out.println("Thats not a name of the Planet!!");
		}
		}
	}
}

public class InfoSolar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter planet name : ");
		String name = sc.next();
		
		SolarSys obj = new SolarSys();
		obj.setname(name);
		obj.result();
	}
}
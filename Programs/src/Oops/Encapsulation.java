package Oops;


public class Encapsulation {

	public static void main(String[] args) {
	
		class Ford{
			String model = "Mustang";
			int speed = 230;
			int fuca = 50;
		}
		
		class cadillac{
			String model = "Escalade";
			int speed = 180;
			int fuca = 100;
			
		}
	    Ford f = new Ford();
	    cadillac c = new cadillac();
		
		System.out.println(f.model);
		System.out.println(f.fuca);
		System.out.println(f.speed + "\n");
		
		System.out.println(c.model);
		System.out.println(c.speed);
		System.out.println(c.fuca);			
		}
		
		}
	


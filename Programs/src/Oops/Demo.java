package Oops;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
	
		
	class ash {
		int age = 23;
		int w = 85;
		float h = 5.10f;
		String name = "Mohammad";
		
	
	}
	
	class sree {
		int age = 23;
		int w = 50;
		float h = 5.3f;
		String name = "987654321";
		int lol = 420;
		
		
	}
	ash a = new ash();
	sree s = new sree();
	
	System.out.println(a.h);
	
	System.out.println(a.w);
	
	System.out.println(a.age);
	
	System.out.println(s.age);
	
	System.out.println(s.h);
	
	System.out.println(s.w);
	
	boolean z = a.name.equalsIgnoreCase(s.name);
	
	char x[] = a.name.toCharArray();
	
	char y[] = s.name.toCharArray();
	
	Arrays.sort(y);
	
	if(y.equals(s.name)) {
		System.out.println("pal");
	} else {
		System.out.println("Not pal");
	}
	
	System.out.println(y);
	
	System.out.println(s.name);

	}
}
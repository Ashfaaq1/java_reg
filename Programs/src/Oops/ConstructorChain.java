package Oops;

class Abc{
	long num2;
	int num;
	String name;
	String name1;
	float num3;
	
	public Abc(){
		this("Ashfaaq");
		System.out.println("1");
	}
	
//	public Abc(int num) {
//	 this.num = num; 
//	 System.out.println(num);
//	 System.out.println("2");
//	}
	public Abc(Float num3) {
		this.num3 = num3;
		System.out.println(num3);
		
	}
	
	public Abc(long num2) {
		this.num2 = num2;
		System.out.println(num2);
	}
	public Abc(String name) {
		this(123.67f);
		this.name = name;
		
		System.out.println("3");
		System.out.println(name);
		
		
	}
	public Abc(String name, String name1){
		this(786865466);
		this.name = name;
		this.name1 = name1;
		System.out.println(name + name1 );
		
		
	}
	
}

public class ConstructorChain {

	public static void main(String[] args) {
		Abc obj = new Abc("Ashfaaq");
		//Abc obj1 = new Abc(456);
		Abc obj3 = new Abc("Ram", "Hari");
		
		

	}

}

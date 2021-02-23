package Oops;

class EmpDemo{
	public int id;//Initializing instance variables
	private String name;
	
  public EmpDemo(String name){
	  this(321);
	  System.out.println("Two");
	  this.name=name;
	}
  
  public EmpDemo(int id){
		System.out.println("one");
	  this.id=id;
	}
  
	public EmpDemo(){ //Default Constructor
		this("Srikanth");//calling a cons
		 display();
	}
	public void display()
	{
		System.out.println("Im in Method");
		System.out.println(this.id);
		 showName();
	}
	void showName() {
		System.out.println(this.name);
	}
}


public class Vinnu {
	public static void main(String[] args) {
		EmpDemo obj = new EmpDemo();
		obj.display();
		

	}

}

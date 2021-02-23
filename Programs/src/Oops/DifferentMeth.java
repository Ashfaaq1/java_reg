package Oops;


class Demo123{
	int id=10;
	static int max_val=10;//static variable or class level
	static{
		System.out.println("SB in Demo123");
		max_val=20;
	}
	{
		System.out.println("IIB");
		id=20;//IIB
	}
	Demo123(){
		//id=20;
		id=30;
	}
	
	void show() {
		System.out.println(id);
		System.out.println(max_val);
	}
	
	static void display() {
		System.out.println(max_val);//method area
		//System.out.println(id);//heap
	}
}


public class DifferentMeth {

	static {
		System.out.println("SB in DifferentMeth ");
	}
	
	public static void main(String[] args) {
		System.out.println("Im in Static method");
		
		Demo123 d1=new Demo123();
		++d1.id;
		++d1.max_val;
		Demo123 d2=new Demo123();
		d1.show();
		d2.show();
		Demo123 d3=new Demo123();
		d3.show();//10,11
		
		Demo123.display();		
	}
}
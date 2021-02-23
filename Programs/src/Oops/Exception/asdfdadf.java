package Oops.Exception;

class on1 extends Exception{
	on1(String msg){
		super(msg);
	}
	
}
class onetwo{
	void m() throws on1{
		on1 obj = new on1("Hello world");
		throw obj;
	}
}


public class asdfdadf {
	public static void main(String[] args) {
		onetwo obj1= new onetwo();
		try {
			obj1.m();
		}
		catch(on1 a) {
			System.out.println(a.getMessage());
		}

	}
}

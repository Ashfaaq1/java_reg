package TypeCasting;


interface IDm{
	int num = 100;
	short num1 = 20;
	double num2 = 45.6;
	
}
interface IDmOne{
	char ch= 'g';
	
	void method();
}

class pmsuper implements IDm, IDmOne{

	@Override
	public void method() {
		int widca = num1; // Widening casting
		int widca1 = ch;  // Widening casting
		
		short naca = (int)num ; //Narrowing casting
		char naca1 = (int)num;  //Narrowing casting
		
		System.out.println("Convering lower to higher data type: " + widca + "\t" + widca1);
		System.out.println("Convering higher to lower data type: " +naca + " " + naca1);
		System.out.println(widca + widca1);
		System.out.println(naca + naca1);
	}
	
	public  void method1() {
		System.out.println("Widening Casting. This is super class method.");
	}
}

class pmsub extends pmsuper{
	public void method2() {
		System.out.println("Method in sub-class. Narrowing casting.");
	}	
}

public class TypeCasting {

	public static void main(String[] args) {
		pmsuper obj = new pmsuper();
		obj.method();
		
		
		//Widening casting
		pmsub objsub = new pmsub();
		pmsuper objsup = (pmsuper)objsub;
		objsup.method1();
		
		System.out.println("Another method");
		pmsuper obsup = new pmsub();
		obsup.method();
		obsup.method1();
		
		//Narrowing casting
		pmsuper supobj = new pmsub();
		pmsub subobj = (pmsub)supobj;
		subobj.method2();
	}
}
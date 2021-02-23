package Oops;

class Ram{
	int a = 123;
	    void method() {
		
		Ash obj = new Ash();
    	obj.name();
	}
	 private class Ash{
		void name() {
			System.out.println(a);
		}	
	}
}

public class InnerClass {

	public static void main(String[] args) {
//		Ram.Ash a = new Ram().new Ash();
//		a.name();
		Ram r = new Ram();
		r.method();
	
	}

}

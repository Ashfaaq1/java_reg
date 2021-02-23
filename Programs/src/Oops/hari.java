package Oops;

public class hari {

	// Static block
	static {
	int x=10;
	System.out.println(x + " Static block!!");
}

// Static method
static void d1() {
	int z =20;
	System.out.println(z+" static method!!");
}

{
	// Instance block
	int y = 30;
	System.out.println(y + " Instance block!!");
}
// Instance method
public void d2() {
	int a = 40;
	System.out.println(a + " instance method!!");
			
}

	public static void main(String[] args) {
		hari.d1();
		hari s = new hari();
		s.d2();	
	}

}

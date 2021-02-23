package Oops;
import java.util.*;

class Tab{
	 private int a;
	 
	 Tab(int j){
		 a = j;
	 }
	 
	public void method() {
		int i = 1;
		for(; i < 11; i ++) {
		int formula = a*i;
		System.out.println(a + " * " + i + " = " + formula);
	}
	}
}

public class Tables {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		Tab obj = new Tab(n);
		obj.method();
	}
}
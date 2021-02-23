package Oops;
import java.util.*;

class Pra{
    int num;
	int age;
	String name;
	
	Pra(String nam, int num1, int age1){
		
		num = num1;
		age = age1;
		name = nam;
	}
	
}
public class Demo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Name: ");
		String name1 = sc.next();
		System.out.println("Id");
		int num1 = sc.nextInt();
		System.out.println("Age: ");
		int age1 = sc.nextInt();
				
		Demo1 obj2 = new Demo1();
		Pra obj = new Pra(name1, num1, age1);
		obj2.demo1(obj);
		
	}
	void demo1(Pra x){
		System.out.println("Name: " + x.name + "\nId: " + x.num + "\nage: " + x.age);	
	}
		
}



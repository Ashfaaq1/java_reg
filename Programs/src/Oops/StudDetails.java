package Oops;
import java.util.*;

class Info{
	private String a;
	private String b;
	private int c;
	private String d;
	private String e;
	
	Info(String name, String laname, String id, int age, String sex){
		a = name;
		b = id;
		c = age;
		d = laname;
		e = sex;
	}
	Info(){
		
	}
	
	public void details() {
		System.out.println("\nName: " + a + " " + d + "\nID No. : " + b + "\nAge: " + c
				+ "\nSex: " + e);
	}
	
	public void sum() {
		int count = 0;
		for(int i = 1; i <= 10; i ++) {
			count = count + i;
		}
		System.out.println(count);
	}
}

public class StudDetails {
	public static void main(String[] args) {
		
		System.out.println("Student 1 details ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String name1 = sc.next();
		System.out.println("Enter last name: ");
		String laName1 = sc.next();
		System.out.println("Enter ID: ");
		String id1 = sc.next();
		System.out.println("Enter Age: ");
		int age1 = sc.nextInt();
		System.out.println("Sex: ");
		String sex1 = sc.next();
		Info stud1 = new Info(name1, laName1, id1, age1, sex1);
		stud1.details();
		
		System.out.println("\n" + "Student 2 details ");
		System.out.println("Enter first name: ");
		String name2 = sc.next();
		System.out.println("Enter last name: ");
		String laName2 = sc.next();
		System.out.println("Enter ID: ");
		String id2 = sc.next();
		System.out.println("Enter Age: ");
		int age2 = sc.nextInt();
		System.out.println("Sex: ");
		String sex2 = sc.next();
		Info stud2 = new Info(name2, laName2, id2, age2, sex2);
		stud2.details();
		
		Info stud3 = new Info("Ganesh", "Yadav", "12345", 25, "M");
		stud3.details();
		
		
		System.out.println("\nSum of fisrt ten numbers: ");
		Info lol = new Info();
		lol.sum();
	}

}
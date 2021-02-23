package Oops;
import java.util.*;

class GetSet{
	private String name;
	private int age;
	private String id;
	private int num;
	
	//Setters 
	public void setname(String name) {
		this.name = name;	
	}
	public void setage(int age) {
		this.age = age;
	}
	public void setid(String id) {
		this.id = id;
	}
	public void setnum(int num) {
		this.num = num;
	}
	public void setnum1(int num) {
		this.num = num;
	}
	public void setnum2(int num) {
		this.num = num;
	}
	public void setnum3(int num) {
		this.num = num;
	}
	
	//Getters
	public String getname() {
		return name;
	}
	public int getage() {
		return age;
	}
	public String getid() {
		return id;
	}
	public int getnum() {
		return num;
		
	}
	public int getnum1() {
		return num;
	}
	public int getnum2() {
		return num;
	}
	public void result() {
		System.out.println("\nName: " + getname());
		System.out.println("Age: " + getage());
		System.out.println("ID: " + getid());
		System.out.println("Total: " + (getnum() + getnum1() + getnum2()));
	}	
}

public class GetAndSet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.next();
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		System.out.println("Eneter id: ");
		String id = sc.next();
		System.out.println("Sem 1: ");
		int num = sc.nextInt();
		System.out.println("sem 2: ");
		int num1 = sc.nextInt();
		System.out.println("Sem 3: ");
		int num2 = sc.nextInt();
		
		
		GetSet obj = new GetSet();
		obj.setname(name);
		obj.setage(age);
		obj.setid(id);
		obj.setnum(num);
		obj.setnum1(num1);
		obj.setnum2(num2);
		obj.result();
	}
}
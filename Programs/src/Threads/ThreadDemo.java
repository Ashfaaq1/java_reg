package Threads;

class PraThread implements Runnable{

	@Override
	public void run() {
		System.out.println("Vinnu");
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
	}
	
}

class PraThread1 extends Thread{
	PraThread1(String name) {
		super(name);
	}
	public void run() {
		for(int i = 0; i <= 5; i ++) {
			System.out.print(2+i);
		}
		
		System.out.println("\n"+getName());
		
	}
}

class praThread2 extends PraThread1{
	String name;
	int n;

	praThread2(String name, int n) {
		//this.name = name;
		super(name);
		this.n = n;
		
	}
	public void run() {
		System.out.println("LOL " + n);
		System.out.println(getName());
	}	
	}
	
public class ThreadDemo {

	public static void main(String[] args) {
		
		System.out.println("Ashfaaq");
		PraThread obj = new PraThread();
		Thread tr = new Thread(obj);
		tr.start();
		tr.setName("VinAsh");
		tr.setPriority(10);
		
		PraThread1 obj1 = new PraThread1("AshVinn");
		obj1.start();
		obj1.setPriority(5);
		
		praThread2 obj2 = new praThread2("ash", 200);
		obj2.start();	
	}
}
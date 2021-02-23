package Threads;
import java.io.IOException;
import java.lang.*;

class Termination implements Runnable{
	boolean ter = false;
	
	public void run() {
		
			for(int i = 0; i <= 10; i ++) {
//				try {
//					Thread.sleep(2000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
			System.out.println(i);
			if(ter) return;
		}
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Thread t =  Thread.currentThread();
			System.out.println(t .getName());
	}
	
}

public class TerminateThread {

	public static void main(String[] args) throws IOException {
		Termination obj = new Termination();
		Thread td = new Thread(obj);
		td.setName("Termination_thread");
		td.start();
		System.in.read();
		System.out.println("LOL");
		
		//System.out.println(td.getName());
		obj.ter = true;
	}
	
}

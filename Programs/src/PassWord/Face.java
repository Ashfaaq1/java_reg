package PassWord;
import java.util.*;


class Signin{
	String uname;
	String pass;
	int otp;
	String mnum;
	void method(String uname, String pass, String mnum) {
		this.uname = uname;
		this.pass = pass;
		this.mnum = mnum;
	
	}
	
	void method() {
		Scanner s = new Scanner(System.in);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Signup sucessful");
		
		System.out.println("The only website where you can find a perfect fam <3");
		System.out.println("\n\t\tLogin");
		for(int k = 0; k <= 3; k ++) {
		System.out.println("Enter User name or Mobile number to login");
		String user = s.next();
		System.out.println("Enter password");
		String password = s.next();
		
		if(password.equals(pass) && (user.equals(uname) || user.equals(mnum))){
			System.out.println("Login Sucess.");
			break;
		}
		else {
			System.out.println("You have enterd wrong user details");
		}
		}
		}
		}	



public class Face {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\t<3 Welcome to Squard Fam <3\n\nSignin and be the epic member of our fam <3 ");

		System.out.println("User Name: ");
		String name = sc.next();
		for(int t = 0; t <= 3; t ++) {
		System.out.println("Password(Should be atleast 8 characters with atleast "
				          + "one upeer case letter and one special character.): ");
		
		String pass = sc.next();
		
		if(pass.length() >= 8) {
		
		for(int x = 0; x < 1; x --) {
		System.out.print("Conform password: ");
		String rpass = sc.next();
		
		if(pass.equals(rpass)) {
			//x=2;
			for(int y = 0; y < 3; y ++) {
		System.out.print("Mobile number: ");
		String mnum = sc.next();
		Signin obj = new Signin();
		obj.method(name, pass, mnum);
		
		if(mnum.length() == 10) {
			System.out.println("OTP has sent to your registed mobile number: ");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			int ran = getRandomInteger(9999, 1000);
			System.out.println("Your otp: " + ran);
			
			for(int i = 0; i < 3;i ++) {
			System.out.print("Enter OTP: ");
			int otp1 = sc.nextInt();
			if(otp1 == ran) {
			obj.method();
			break;
			}
			else {
				System.out.println("Entered otp is wrong please check");
			}
			}break;
			
		}else {
			System.out.println("Check your number.");
		}
		}break;
		}
		}break;
		}
		else {
			System.out.println("Atleast 8 didgits");
		}
		}
	}

	private static int getRandomInteger(int i, int j) {
		return((int) (Math.random() * (i - j))) + j;
	}

}

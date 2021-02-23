package Arrays;
import java.util.*;
public class MarksOfStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of subjects");
		int num = sc.nextInt();
		int marks[] = new int[num];
		float per = 0;
		int total = 0;
		System.out.println("Enter the marks");
		for(int i = 0; i < marks.length; i++) {
			marks[i] = sc.nextInt();
			total = total + marks[i];
			per = ((total/num*100)*1/100);
		}if(per < 30) {
			System.out.println("Total marks: " + total + ". Percentage: " + per + ". You got 'F' grade.");
		}else if(per >= 30 && per < 40) {
			System.out.println("Total marks: " + total + ". Percentage: " + per + ". You got 'D' grade.");

		}else if(per >= 40 && per < 50) {
			System.out.println("Total marks: " + total + ". Percentage: " + per + ". You got 'C' grade.");
	    }else if(per >= 50 && per < 60) {
			System.out.println("Total marks: " + total + ". Percentage: " + per + ". You got 'B' grade.");
	    }else if(per >= 60 && per <= 100) {
			System.out.println("Total marks: " + total + ". Percentage: " + per + ". You got 'A' grade.");
		
	}
}
	}

package Arrays;
import java.util.*;
import java.lang.*;
public class ArrayAddition {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of elements:");
	int num = sc.nextInt();
	float add[] = new float[num];
	float total = 0f;
	System.out.println("Enter the elements which you want to add:");
	for(int i = 0; i < add.length; i++) {
	add[i] = sc.nextInt();
	total = add[i] + total;
	}System.out.println("The sum of given elements is: " + (total));

	}

}

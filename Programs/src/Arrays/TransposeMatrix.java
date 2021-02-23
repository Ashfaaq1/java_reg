package Arrays;
import java.util.*;

public class TransposeMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. rows");
		int r = sc.nextInt();
		System.out.println("Enter no. Columns");
		int c = sc.nextInt();
		
		//array creation
		int m[][] = new int[r][c];
		
		//matrix values
		System.out.println("Enter the matrix elements");
		
		//Rows
		for (int i = 0; i < r; i ++)
		//Columns
		for (int j = 0; j < c; j ++)
		m[i][j] = sc.nextInt();	
		
		System.out.println("Transpose of give matrix: ");
		for(int i = 0; i < c; i++) {
		    for(int j = 0; j < r; j++) {
			     System.out.print(m[j][i] + " ");
		}System.out.println();
		}
						
	}
}
		

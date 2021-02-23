package Arrays;
import java.util.*;

public class MatrixAddition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Rows, Cloumns: ");
		
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		int m1[][] = new int[r][c];
		int m2[][] = new int[r][c];
		int m3[][] = new int[r][c];
		
		System.out.println("Enter elements of m1: ");
		
		for(int i = 0; i < r; i ++)
		for(int j = 0; j < c; j ++)
		m1[i][j] = sc.nextInt();
		
		System.out.println("Enter the elements of m2: ");
		for(int k = 0; k < r; k ++)
		for(int l = 0; l < c; l ++)
		m2[k][l] = sc.nextInt();
				
		//Martix form
		System.out.println("Addition of two matrix");
		for (int m = 0; m < r; m++) {
			for(int n = 0; n < c; n ++){
				
				m3[m][n] = m1[m][n] + m2[m][n];
			}	
		}
		for (int m = 0; m < r; m++) {
			for(int n = 0; n < c; n ++) {
				System.out.print(m3[m][n]+ " ");
				
			} System.out.println();	
		}			
			}
	}
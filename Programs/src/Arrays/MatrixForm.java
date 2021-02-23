package Arrays;

public class MatrixForm {

	public static void main(String[] args) {
		int x[][] = {{1,2,3,4},
				{4,5,6,5},
				{7,8,9,10}};
//		
//		int y[] = {1,3,4,5};
//		//int y[] = new int[1];
//		y[0] = 3;
		
		System.out.println("Matrix: ");
		try{for(int i = 0; i < 3; i ++) { //for rows
			for (int j = 0; j < 4; j ++) { //for columns
				System.out.print(x[i][j] + " " );
			}
			System.out.println();	
		}}
		catch(Exception e) {
			System.out.println(e);
			
		}
	}
}

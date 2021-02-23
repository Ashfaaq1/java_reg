package Arrays;

public class Trans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a[][] = {{1,2},{4,5}};
		
		float b[][] = new float[2][2];
		for(int i = 0; i < 2; i ++) {
			for (int j = 0; j < 2; j++) {
				
			//System.out.print(a[j][i] + " ");
				
			b[i][j] = a[i][j] / a[j][i];
			
		    System.out.print(b[i][j] + "\t");
			}System.out.println();
			}System.out.println();

	}

}

package Arrays;

public class AscendingOrder {

	public static void main(String[] args) {
    int marks[] = {10,80,89,7,1,2};
    int count = 0;
    for(int i = 0; i < marks.length; i ++) {
    for(int j = i + 1; j < marks.length; j ++) {
    	if(marks[i] > marks[j]) {
    		count = marks[i];
    		marks[i] = marks[j];
    		marks[j] = count;
    	}
    	
    }
    	
    
    }int i =0;
    for(; i < marks.length; i++) {
    	System.out.print(marks[i] + " ");
    }
	
	}
	

}

package InputOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ReadTXTScanner {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner((new File("D:\\95_match.csv")));
		sc.useDelimiter(",");
		while(sc.hasNext()) {
			System.out.print(sc.next());
		}
		sc.close();

	}

}
